select
  base.system_id,
  /*IF kijunbi != null*/
  now.system_name
  /*END*/
  /*IF kijunbi == null*/
  nvl(nvl(now.system_name, past.system_name), future.system_name) as system_name
  /*END*/
from
  (
    select
      /*systemId*/ as system_id
    from
      dual
  ) base
  left join
  (
    select
      m1.system_id,
      m1.system_name
    from
      M_SYSTEM_INFO m1
    where
      m1.delete_flag = 0
      /*IF kijunbi != null*/
      and /*kijunbi*/'2014-02-05' between m1.tekiyo_kaishibi and m1.tekiyo_syuryobi
      /*END*/
      /*IF kijunbi == null*/
      and /*nowDate*/'2014-02-05' between m1.tekiyo_kaishibi and m1.tekiyo_syuryobi
      /*END*/
  ) now
  on base.system_id = now.system_id
  /*IF kijunbi == null*/
  left join
  (
    select
      m1.system_id,
      m1.system_name
    from
      M_SYSTEM_INFO m1
      inner join
      (
        select
          system_id,
          max(tekiyo_syuryobi) as tekiyo_syuryobi
        from
          M_SYSTEM_INFO
        where
          delete_flag = 0
          and /*nowDate*/'2014-02-05' > tekiyo_syuryobi
        group by
          system_id
      ) m2
      on m1.system_id = m2.system_id
      and m1.delete_flag = 0
      and m1.tekiyo_syuryobi = m2.tekiyo_syuryobi
  ) past
  on base.system_id = past.system_id
  left join
  (
    select
      m1.system_id,
      m1.system_name
    from
      M_SYSTEM_INFO m1
      inner join
      (
        select
          system_id,
          min(tekiyo_kaishibi) as tekiyo_kaishibi
        from
          M_SYSTEM_INFO
        where
          delete_flag = 0
          and /*nowDate*/'2014-02-05' < tekiyo_kaishibi
        group by
          system_id
      ) m2
      on m1.system_id = m2.system_id
      and m1.delete_flag = 0
      and m1.tekiyo_kaishibi = m2.tekiyo_kaishibi
  ) future
  on base.system_id = future.system_id
  /*END*/
