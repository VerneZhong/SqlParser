select
  A.torihikisaki_cd,
  A.torihikisaki_name
FROM
  M_torihikisaki A
  inner join
  (
    select
      torihikisaki_cd,
      MAX(tekiyo_tsuban) as tekiyo_tsuban
    from
      M_torihikisaki
    where
      torihikisaki_cd = /*torihikisakiCd*/
    group by
      torihikisaki_cd
  ) B
  on A.torihikisaki_cd = B.torihikisaki_cd
  and A.tekiyo_tsuban = B.tekiyo_tsuban
order by
  A.torihikisaki_cd

