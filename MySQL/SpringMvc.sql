create database springDB;
use springDB;
create table Emp99(id int auto_increment primary key, name varchar(100),salary float,designation varchar(100));
insert into Emp99(id,name,salary,designation)values
(id,'Annie',40000,'HR Admin'),
(id,'Bob',200000,'R&D'),
(id,'Charlie',65000,'Accounts');
select *from Emp99;
