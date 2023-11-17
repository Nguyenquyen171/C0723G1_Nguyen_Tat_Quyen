drop database if exists ss2;
create database if not exists ss2;
use  ss2;

create table student(
id int primary key auto_increment not null,
name varchar (50) not null,
class_name varchar (50) not null,
birthday datetime not null
);

create table authors(
id int primary key auto_increment not null,
name varchar (50) not null
);
create table category(
id int primary key auto_increment not null,
name varchar (50) not null
);
create table book(
id int primary key auto_increment not null,
title varchar (50) not null,
page_size int not null,
id_authors int not null,
id_category int not null,
foreign key (id_authors) references authors(id),
foreign key (id_category) references category(id)
);
create table borrow (
id int primary key auto_increment not null,
borrow_date datetime not null,
return_date datetime not null,
id_book int not null,
id_student int not null,
foreign key (id_book) references book(id),
foreign key (id_student) references student(id)
);
