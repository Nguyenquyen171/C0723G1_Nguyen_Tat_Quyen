create database quan_ly_ban_hang;

use quan_ly_ban_hang;
create table loai_khach (
id int primary key auto_increment,
ma_loai_khach_hang varchar(10) unique not null,
ten_loai_khach varchar(30) not null,
phan_tram_uu_dai int not null);
create table loai_tai_khoan (
id int primary key auto_increment,
loai varchar(15) not null unique );

create table tai_khoan (
id int primary key auto_increment,
user_name varchar(30) not null unique,
pass_word varchar(30) not null default 123456,
id_loai_tai_khoan int not null,
foreign key (id_loai_tai_khoan) references loai_tai_khoan(id));

create table khach_hang (
id int primary key auto_increment,
ma_khach_hang varchar(20) unique not null,
ho_ten varchar(100) not null,
email varchar(50) not null,
so_dien_thoai varchar(15) not null,
dia_chi varchar(200) not null,
gioi_tinh varchar(15) not null,
id_tai_khoan int not null,
loai_khach int not null,
foreign key (loai_khach) references loai_khach(id),
foreign key (id_tai_khoan) references tai_khoan(id) );

create table thanh_toan (
id int primary key auto_increment,
hinh_thuc_thanh_toan varchar(20) not null,
trang_thai bit(1) not null );

create table don_hang (
id int primary key auto_increment,
ma_don_hang varchar(15) unique not null,
id_tai_khoan int,
ten_nguoi_nhan varchar(100) not null,
dia_chi_nhan varchar(200) not null,
so_dien_thoai varchar(20) not null,
email varchar(100),
ngay_dat_hang datetime not null,
ngay_giao_hang datetime not null,
trang_thai_van_chuyen varchar(30) not null,
ma_thanh_toan int,
foreign key (id_tai_khoan) references tai_khoan(id),
foreign key (ma_thanh_toan) references thanh_toan(id));

create table loai_san_pham (
id int primary key auto_increment,
ma_loai_sp varchar(50) not null,
ten_loai varchar(50) not null,
mo_ta text not null);

create table size (
id int primary key auto_increment,
ma_size varchar(50) not null,
ten_size varchar(50) not null,
mo_ta text );
create table chat_lieu (
id int primary key auto_increment,
ma_chat_lieu varchar(50) not null,
ten varchar(50) not null,
mo_ta text );
create table san_pham (
id int primary key auto_increment,
ma_san_pham varchar(15) unique not null,
ten_san_pham text not null,
id_loai_san_pham int,
id_chat_lieu int,
id_size int,
gia float not null check (gia>0),
so_luong int not null check (so_luong>0),
mo_ta text,
trang_thai bit(1),
foreign key (id_loai_san_pham) references loai_san_pham(id),
foreign key (id_chat_lieu) references chat_lieu(id),
foreign key (id_size) references size(id)
 );
create table chi_tiet_don_hang (
id int primary key auto_increment,
ma_ctdh varchar(15) unique not null,
id_don_hang int,
id_san_pham int,
gia float not null check (gia>0),
so_luong int not null check (so_luong>0),
foreign key (id_don_hang) references don_hang(id),
foreign key (id_san_pham) references san_pham(id)
);
create table hinh_anh(
id int primary key auto_increment,
link_path text not null,
id_san_pham int not null,
foreign key(id_san_pham) references san_pham(id)
);




