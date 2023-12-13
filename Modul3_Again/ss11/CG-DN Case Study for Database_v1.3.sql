drop database if exists ss11;
create database if not exists ss11;
use  ss11;
create table book (
id int primary key auto_increment,
title varchar(50),
page_size int,
author varchar(50),
category varchar(50)
);
select * from book;
insert into book(title,page_size,author,category) values ("QUYEN",12,3,5);