select
  base.riyo_cls,
  /*IF kijunbi != null*/
  now.riyo_cls_name
  /*END*/
  /*IF kijunbi == null*/
  nvl(nvl(now.riyo_cls_name, past.riyo_cls_name), future.riyo_cls_name) as riyo_cls_name
  /*END*/
from
  (
    select
      /*systemId*/ as riyo_cls
    from
      dual
  ) base
  left join
  (
    select
      m1.riyo_cls,
      m1.riyo_cls_name
    from
      M_RIYO_CLS m1
    where
      m1.delete_flag = 0
      /*IF kijunbi != null*/
      and /*kijunbi*/'2014-02-05' between m1.tekiyo_kaishibi and m1.tekiyo_syuryobi
      /*END*/
      /*IF kijunbi == null*/
      and /*nowDate*/'2014-02-05' between m1.tekiyo_kaishibi and m1.tekiyo_syuryobi
      /*END*/
  ) now
  on base.riyo_cls = now.riyo_cls
  /*IF kijunbi == null*/
  left join
  (
    select
      m1.riyo_cls,
      m1.riyo_cls_name
    from
      M_RIYO_CLS m1
      inner join
      (
        select
          riyo_cls,
          max(tekiyo_syuryobi) as tekiyo_syuryobi
        from
          M_RIYO_CLS
        where
          delete_flag = 0
          and /*nowDate*/'2014-02-05' > tekiyo_syuryobi
        group by
          riyo_cls
      ) m2
      on m1.riyo_cls = m2.riyo_cls
      and m1.delete_flag = 0
      and m1.tekiyo_syuryobi = m2.tekiyo_syuryobi
  ) past
  on base.riyo_cls = past.riyo_cls
  left join
  (
    select
      m1.riyo_cls,
      m1.riyo_cls_name
    from
      M_RIYO_CLS m1
      inner join
      (
        select
          riyo_cls,
          min(tekiyo_kaishibi) as tekiyo_kaishibi
        from
          M_RIYO_CLS
        where
          delete_flag = 0
          and /*nowDate*/'2014-02-05' < tekiyo_kaishibi
        group by
          riyo_cls
      ) m2
      on m1.riyo_cls = m2.riyo_cls
      and m1.delete_flag = 0
      and m1.tekiyo_kaishibi = m2.tekiyo_kaishibi
  ) future
  on base.riyo_cls = future.riyo_cls
  /*END*/