drop database if exists bai_lam_them;
create database if not exists bai_lam_them;
use bai_lam_them;
create table may_tinh (
ma_may int primary key auto_increment,
hang_san_xuay varchar (50) not null,
vi_tri_dat_may varchar(199) not null,
gia_tien double check(gia_tien>5000) not null
);
create table loai_khach_hang ( 
id int primary key auto_increment,
name varchar (50) 
);
create table khach_hang (
id int primary key auto_increment,
ten varchar (45) not null,
so_dien_thoai varchar (20) not null,
email varchar (50) not null,
loai_khach_hang bit not null,
id_loai_khach int not null,
foreign key (id_loai_khach) references loai_khach_hang(id)
);
create table dich_vu_di_kem(
id int primary key auto_increment,
do_uong varchar (45) not null,
gia_do_uong double check (gia_do_uong>1000) not null,
thuc_an varchar (45) not null,
gia_thuc_an double check (gia_thuc_an>1000) not null

);
create table dich_vu (
 id int primary key auto_increment,
 id_dich_vu int not null,
 foreign key (id_dich_vu) references dich_vu_di_kem(id),
 thoi_gian_bat_dau datetime ,
 thoi_gian_ket_thuc datetime,
 id_may_tinh int not null,
 foreign key (id_may_tinh) references may_tinh(ma_may),
 id_loai_khach int not null,
foreign key (id_loai_khach) references loai_khach_hang(id),
tong_tien double check (tong_tien>0)
);
create table chi_tiet_dich_vu (
id int primary key,
so_luong int,
 id_dich_vu int not null,
 foreign key (id_dich_vu) references dich_vu(id),
  id_dich_vu_di_kem int not null,
 foreign key (id_dich_vu_di_kem) references dich_vu_di_kem(id)
 );

