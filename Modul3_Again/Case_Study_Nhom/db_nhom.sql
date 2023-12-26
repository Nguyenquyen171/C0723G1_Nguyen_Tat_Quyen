drop database if exists case_study_team;
create database if not exists case_study_team;
use case_study_team;

create table loai_khach(
id_loai_khach int primary key auto_increment,
ma_khach_hang varchar(50),
ten_loai_khach varchar(50)
);
create table loai_tai_khoan(
id_loai_tai_khoan int primary key auto_increment,
loai varchar(50)
);
create table tai_khoan(
id_tai_khoan int primary key auto_increment,
tai_khoan varchar(50),
mat_khau varchar(50),
id_loai_tai_khoan int,
foreign key (id_loai_tai_khoan) references loai_tai_khoan(id_loai_tai_khoan),
id_khach_hang int,
foreign key (id_khach_hang) references khach_hang(id_khach_hang)
);

create table khach_hang(

id_khach_hang int primary key auto_increment,
ma_khach_hang varchar(50),
ho_ten varchar(50),
so_dien_thoai varchar(50),
gmail varchar(50),
gioi_tinh varchar(50),
id_loai_khach int,
foreign key (id_loai_khach) references loai_khach(id_loai_khach)
);
create table the_loai(
id_the_loai int primary key auto_increment,
ten_the_loai varchar(100),
mo_ta text
);
create table tac_gia(
id_tac_gia int primary key auto_increment,
ten_tac_gia varchar(100),
mo_ta text
);

create table sach(
id_sach int primary key auto_increment,
ma_san_pham varchar(100),
gia double,
so_luong int,
hinh_anh text,
mo_ta text,
id_the_loai int,
id_tac_gia int,
foreign key (id_the_loai) references the_loai(id_the_loai),
foreign key (id_tac_gia) references tac_gia(id_tac_gia)
);
create table thanh_toan(
id_thanh_toan int primary key auto_increment,
hinh_thuc_thanh_toan varchar(100),
trang_thai bit(1)
);

create table don_hang(
id_don_hang int primary key auto_increment,
ma_don_hang varchar(50),
ten_nguoi_nhan varchar(100),
dia_chi varchar(200),
so_dien_thoai varchar(30),
email varchar(100),
ngay_dat_hang datetime,
ngay_giao_hang datetime,
trang_thai_don_hang varchar(50),
ma_thanh_toan int,
id_tai_khoan int,
foreign key (id_tai_khoan) references tai_khoan(id_tai_khoan),
id_thanh_toan int,
foreign key (id_thanh_toan) references thanh_toan(id_thanh_toan)
);

create table chi_tiet_don_hang(
id_ctdh int primary key auto_increment,
ma_ctdh varchar(50),
gia double,
so_luong int,
id_don_hang int,
foreign key (id_don_hang) references don_hang(id_don_hang),
id_sach int,
foreign key (id_sach) references sach(id_sach)
);
