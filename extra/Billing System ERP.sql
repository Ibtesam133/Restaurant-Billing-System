create database SK_bill

create table SK_dish(
r_id int identity(1,1) not null primary key,
ds_nm varchar(20),
ds_pr int,
)


create table SK_log(
r_id int primary key identity(1,1) not null,
log_cat varchar(10),
log_us varchar(20),
log_ps varchaR(10)
)

create table SK_recipt(
r_id int identity(1,1),
bil_nm varchar(8),
)

create table SK_esti(
r_id int identity(1,1) primary key not null,
bil_nm varchar(8),
bil_dte_tym DATE,
ds_nm int foreign Key references SK_dish(r_id),
dh_qt float,
log_pr int foreign Key references SK_dish(r_id),
)

create table SK_info(
r_id int identity(1,1) primary key not null,
res_nm varchar(50),
res_ph numeric(11,0),
res_ph2 numeric(11,0),
res_adr varchar(80)
)

create table SK_tot(
r_id int identity(1,1),
bil_nm varchar(8),
tot int 
)

insert into SK_esti values('SK-0004',CONVERT(datetime,'10/08/2017 03:22:55',120),11,5,2)
select count(bil_nm) as cnt from SK_recipt
delete SK_recipt from SK_recipt where bil_nm = 'SK_0005'
select * from SK_recipt
DELETE SK_recipt FROM SK_recipt
select * from SK_tot
delete SK_tot from SK_tot
select * from SK_log
select * from SK_esti
select * from SK_dish
select ds_nm from SK_dish

update SK_dish set ds_pr=200 where ds_nm='Beef Biryani'

select i.res_nm as [Resturant Name],i.res_ph as [Resturant Cell #],i.res_ph2 as [Resturant Phone #],
i.res_adr as [Resturant Adress],
e.bil_nm as [Bill Number], d.ds_nm as Dish,e.dh_qt as Quantity,d.ds_pr as Price,(e.dh_qt*d.ds_pr) 
as Amount, t.tot as Total
from SK_esti e 
inner join SK_dish d
on e.ds_nm=d.r_id
left join SK_info i 
on i.r_id = 1
left join SK_tot t
on 
e.bil_nm = t.bil_nm
where e.bil_nm='SK00025'
order by d.ds_nm



select * from sk_tot






select
d.ds_nm as Dish,e.dh_qt as Quantity,d.ds_pr as Price,(e.dh_qt*d.ds_pr) 
as Amount
from SK_esti e 
inner join SK_dish d
on e.ds_nm=d.r_id
where e.bil_nm='SK00015'
order by d.ds_nm



select
sum (e.dh_qt*d.ds_pr) as Amount
from SK_esti e 
inner join SK_dish d
on e.ds_nm=d.r_id
where e.bil_nm='SK_0002'


select * from SK_esti
update SK_esti set dh_qt=2 where bil_nm ='SK_0002' and ds_nm = 1




select
CONVERT(varchar(25), e.bil_dte_tym,103) as [Date] , e.bil_nm as [Bill Number],
d.ds_nm as Dish,e.dh_qt as Quantity,
(e.dh_qt*d.ds_pr) as Amount 
from SK_esti e 
inner join SK_dish d
on e.ds_nm=d.r_id
left join SK_tot t
on 
e.bil_nm = t.bil_nm
where (e.bil_dte_tym between '2017-10-14' and '2017-10-16')  and e.bil_nm!='null'
AND E.ds_nm=1
order by e.bil_dte_tym





select
count (d.ds_nm) as qunatity
from SK_esti e 
inner join SK_dish d
on e.ds_nm=d.r_id
left join SK_tot t
on 
e.bil_nm = t.bil_nm
where (e.bil_dte_tym between '2017-10-14' and '2017-10-16')
AND E.ds_nm=1





select

sum (e.dh_qt*d.ds_pr) as Amount 
from SK_esti e 
inner join SK_dish d
on e.ds_nm=d.r_id
left join SK_tot t
on 
e.bil_nm = t.bil_nm
where (e.bil_dte_tym between '2017-10-14' and '2017-10-16')
AND E.ds_nm=1




select * from SK_info
update SK_info set res_nm='Owaise Pakwan Center',res_adr='11/2 Orangi Town Karachi',res_ph='03339911878'
,res_ph2='03335566412' where r_id='1'



select sum(e.dh_qt*d.ds_pr) as Amount
from SK_esti e 
inner join SK_dish d
on e.ds_nm=d.r_id
left join SK_tot t
on 
e.bil_nm = t.bil_nm
where e.bil_nm='SK00015'


select * from SK_tot
insert into SK_tot values ('SK00015','5800')



























select 
i.res_nm as [Resturant Name],i.res_ph as [Resturant Cell #],i.res_ph2 as [Resturant Phone #],
i.res_adr as [Resturant Adress],

CONVERT(varchar(25), e.bil_dte_tym,103) as [Date] , e.bil_nm as [Bill Number],
d.ds_nm as Dish,e.dh_qt as Quantity,
(e.dh_qt*d.ds_pr) as Amount 
from SK_esti e 
inner join SK_dish d
on e.ds_nm=d.r_id
left join SK_tot t
on 
e.bil_nm = t.bil_nm
left join SK_info i 
on i.r_id = 1
where (e.bil_dte_tym between '2017-10-14' and '2017-10-16')  and e.bil_nm!='null'
AND E.ds_nm=1
order by e.bil_dte_tym






<-- history report -->
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
where (e.bil_dte_tym between '2017-10-16' and '2017-10-16') and e.bil_nm!='null' AND E.ds_nm=2
)
as qu
on d.r_id=2
LEFT OUTER JOIN 
(
select sum(e.dh_qt) as [qun]
from SK_esti e 
inner join SK_dish d
on e.ds_nm=d.r_id
where (e.bil_dte_tym between '2017-10-16' and '2017-10-16') and e.bil_nm!='null' AND E.ds_nm=2
)
as qu2
on d.r_id=2

where (e.bil_dte_tym between '2017-10-16' and '2017-10-16')  and e.bil_nm!='null'
AND E.ds_nm=2
