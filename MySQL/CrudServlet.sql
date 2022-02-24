create database crudsdb;
use crudsdb;
create table user905(id int auto_increment primary key,name varchar(50),password char(60),email varchar(80),country char(59));
select *from user905;
insert into user905(id,name,password,email,country)values
(id,'Sam','abcd','xyz@gmail.com','India'),
(id,'Annie','abcd','xyz@gmail.com','UK'),
(id,'Paul','abcd','xyz@gmail.com','UK'),
(id,'Peter','abcd','xyz@gmail.com','USA');