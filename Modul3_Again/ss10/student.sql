drop database if exists ss10;
create database if not exists ss10;
use  ss10;
create table hoc_vien(
id int primary key auto_increment,
name varchar(50) not null,
gender varchar(50) not null,
point int not null
);