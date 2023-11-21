use Qadbt
/*create database Qadbt;
*/

create table Employeeinfo
(
name varchar(20),
id int,
location varchar(20),
age int);


delete  from Employeeinfo where name='dbo';

sp_columns 'Employeeinfo';


Select * from Employeeinfo;

insert into Employeeinfo values('Sam',1,'newjersy',32);
insert into Employeeinfo values('man',2,'alx',31);
insert into Employeeinfo values('saka',3,'newyouk',11);
insert into Employeeinfo values('kown',4,'paris',34);
