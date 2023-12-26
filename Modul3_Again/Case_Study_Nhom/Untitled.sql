drop database if exists thi_cuoi_ki;
create database if not exists thi_cuoi_ki;
use  thi_cuoi_ki;

create table chu_nhan(
id_chu_nhan int not null primary key auto_increment,
can_cuoc varchar(50) not null,
ten varchar(50) not null,
so_dien_thoai varchar(50) not null,
ten_tai_khoan varchar(50) not null
);
create table phan_loai(
id_phan_loai int not null primary key auto_increment,
loai varchar(10) not null
);

create table thu_cung(
id_thu_cung int not null primary key auto_increment,
mo_ta varchar(50) not null,
 id_phan_loai  int not null,
 id_chu_nhan  int not null,
 foreign key (id_phan_loai) references phan_loai(id_phan_loai),
 foreign key (id_chu_nhan) references chu_nhan(id_chu_nhan),
 ten_chu varchar(50) not null
);
create table vi_pham (
id_vi_pham int not null primary key auto_increment,
ma_vi_pham varchar(50) not null,
ten varchar(50) not null,
ma_so_dang_ki varchar(50) not null,
loi_vi_pham varchar(50) not null,
ngay_vi_pham date not null,
tien varchar(50) not null,
ghi_chu varchar(100) not null,
 id_chu_nhan  int not null,
 foreign key (id_chu_nhan) references chu_nhan(id_chu_nhan),
 id_thu_cung int not null,
 foreign key (id_thu_cung) references thu_cung(id_thu_cung)
);
insert into phan_loai values ('1','chó'),('2','mèo');