drop database if exists test_case_study;
create database if not exists test_case_study;
use test_case_study;
create table vi_tri(
ma_vi_tri int primary key auto_increment not null,
ten_vi_tri varchar(45) not null
);
create table trinh_do(
ma_trinh_do int primary key auto_increment not null,
ten_trinh_do varchar(45) not null
);
create table bo_phan(
ma_bo_phan int primary key auto_increment not null,
ten_bo_phan varchar(45) not null
);
create table nhan_vien(
ma_nhan_vien int primary key auto_increment ,
ho_ten varchar (45) not null,
ngay_sinh date not null,
so_cmnd varchar(45)not null,
luong double not null,
so_dien_thoai varchar (45) not null,
email varchar(45) not null,
dia_chi varchar(45) not null,
ma_vi_tri int not null,
ma_trinh_do int not null,
ma_bo_phan int not null,
foreign key (ma_vi_tri) references vi_tri(ma_vi_tri),
foreign key (ma_trinh_do) references trinh_do(ma_trinh_do),
foreign key (ma_bo_phan) references bo_phan(ma_bo_phan)
);
create table loai_khach(
ma_loai_khach int primary key auto_increment not null,
ten_loai_khach varchar (45) not null
);
create table khach_hang(
ma_khach_hang int primary key auto_increment not null,
ma_loai_khach int not null,
foreign key (ma_loai_khach) references loai_khach(ma_loai_khach),
ho_ten varchar(45),
ngay_sinh date not null, 
gioi_tinh bit(1) not null,
so_cmnd varchar(45) not null,
so_dien_thoai varchar(45) not null,
email varchar(45) not null,
dia_chi varchar(45) not null
);
create table loai_dich_vu(
ma_loai_dich_vu int primary key auto_increment not null,
ten_loai_dich_vu varchar(45) not null 
);
create table kieu_thue(
ma_kieu_thue int primary key auto_increment not null,
ten_kieu_thue varchar(45) not null
);
create table dich_vu(
ma_dich_vu int primary key auto_increment not null,
ten_dich_vu varchar(45) not null,
dien_tich int not null,
chi_phi_thue double not null,
so_nguoi_toi_da double not null,
ma_kieu_thue int not null ,
foreign key  (ma_kieu_thue) references kieu_thue(ma_kieu_thue),
ma_loai_dich_vu int not null,
foreign key  (ma_loai_dich_vu) references loai_dich_vu(ma_loai_dich_vu),
 tieu_chuan_phong varchar(45),
    mo_ta_tien_nghi_khac varchar(45),
    dien_tich_ho_boi double,
    so_tang int,
    dich_vu_mien_phi_di_kem text not null
);
CREATE TABLE hop_dong (
    ma_hop_dong INT PRIMARY KEY AUTO_INCREMENT,
    ngay_lam_hop_dong DATETIME NOT NULL,
    ngay_ket_thuc DATETIME NOT NULL,
    tien_dat_coc DOUBLE,
    ma_nhan_vien INT NOT NULL,
    FOREIGN KEY(ma_nhan_vien) REFERENCES nhan_vien(ma_nhan_vien),
    ma_khach_hang INT NOT NULL,
    FOREIGN KEY(ma_khach_hang) REFERENCES khach_hang(ma_khach_hang),
    ma_dich_vu INT NOT NULL,
    FOREIGN KEY(ma_dich_vu) REFERENCES dich_vu(ma_dich_vu)
);

create table dich_vu_di_kem(
ma_loai_dich_vu_di_kem int primary key auto_increment not null,
ten_dich_vu_di_kem varchar(45) not null,
gia double not null,
don_vi varchar(10),
trang_thai varchar (45)
);

CREATE TABLE hop_dong_chi_tiet (
    ma_hop_dong_chi_tiet INT PRIMARY KEY AUTO_INCREMENT not null,
    ma_hop_dong INT NOT NULL,
    FOREIGN KEY(ma_hop_dong) REFERENCES hop_dong(ma_hop_dong),
    ma_loai_dich_vu_di_kem INT NOT NULL,
    FOREIGN KEY(ma_loai_dich_vu_di_kem) REFERENCES dich_vu_di_kem(ma_loai_dich_vu_di_kem),
    so_luong INT NOT NULL
);






