select 
qu.[amount toal],qu2.qun,
i.res_nm as [Resturant Name],i.res_ph as [Resturant Cell #],i.res_ph2 as [Resturant Phone #],
i.res_adr as [Resturant Adress],

CONVERT(varchar(25), e.bil_dte_tym,103) as [Date] , e.bil_nm as [Bill Number],
d.ds_nm as Dish,e.dh_qt as Quantity,
(e.dh_qt*d.ds_pr) as Amount 
from SK_esti e 
inner join SK_dish d
on e.ds_nm=d.r_id
left join SK_info i 
on i.r_id = 1
LEFT OUTER JOIN 
(
select sum(e.dh_qt*d.ds_pr) as [amount toal]
from SK_esti e 
inner join SK_dish d
on e.ds_nm=d.r_id
where (e.bil_dte_tym between '2017-10-14' and '2017-10-16') and e.bil_nm!='null' AND E.ds_nm=4
)
as qu
on d.r_id=4
LEFT OUTER JOIN 
(
select sum(e.dh_qt) as [qun]
from SK_esti e 
inner join SK_dish d
on e.ds_nm=d.r_id
where (e.bil_dte_tym between '2017-10-14' and '2017-10-16') and e.bil_nm!='null' AND E.ds_nm=4
)
as qu2
on d.r_id=4

where (e.bil_dte_tym between '2017-10-14' and '2017-10-16')  and e.bil_nm!='null'
AND E.ds_nm=4


