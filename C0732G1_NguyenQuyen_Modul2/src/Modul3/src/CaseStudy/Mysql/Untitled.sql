drop database if exists product;
create database if not exists product;

use product;
create table loai_san_pham(
id int auto_increment primary key not null,
ma_san_pham varchar(10) not null,
ten_loai varchar(30) not null,
mo_ta text not null
);
insert into loai_san_pham(ma_san_pham,ten_loai,mo_ta) values('AB1234','Vàng','Đơn giản nhưng tinh tế');
insert into loai_san_pham(ma_san_pham,ten_loai,mo_ta) values('AB1234','Vàng','Đơn giản nhưng tinh tế');
insert into loai_san_pham(ma_san_pham,ten_loai,mo_ta) values('AB1234','Vàng','Đơn giản nhưng tinh tế');