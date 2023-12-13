drop database if exists quan_ly_tai_khoan;
create database if not exists quan_ly_tai_khoan;
use  quan_ly_tai_khoan;

create table tai_khoan (
id int primary key auto_increment,
user_name varchar(30) not null unique,
pass_word varchar(30) not null);
