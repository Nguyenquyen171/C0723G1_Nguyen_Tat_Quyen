use case_study_team;
INSERT INTO `case_study_team`.`loai_khach` (`id_loai_khach`, `ma_khach_hang`, `ten_loai_khach`) VALUES ('1', 'KH--01', 'Diamond');
INSERT INTO `case_study_team`.`loai_khach` (`id_loai_khach`, `ma_khach_hang`, `ten_loai_khach`) VALUES ('2', 'KH-02', 'Planitium');
INSERT INTO `case_study_team`.`loai_khach` (`ma_khach_hang`, `ten_loai_khach`) VALUES ('KH-03', 'Gold');
INSERT INTO `case_study_team`.`loai_khach` (`ma_khach_hang`, `ten_loai_khach`) VALUES ('KH-04', 'Silver');

INSERT INTO `case_study_team`.`loai_tai_khoan` (`id_loai_tai_khoan`, `loai`) VALUES ('1', 'Admin');
INSERT INTO `case_study_team`.`loai_tai_khoan` (`loai`) VALUES ('User');

INSERT INTO `case_study_team`.`tai_khoan` (`tai_khoan`, `mat_khau`, `id_loai_tai_khoan`) VALUES ('Admin01', '123456', '1');
INSERT INTO `case_study_team`.`tai_khoan` (`tai_khoan`, `mat_khau`, `id_loai_tai_khoan`) VALUES ('User', '123456', '2');

INSERT INTO `case_study_team`.`khach_hang` (`ma_khach_hang`, `ho_ten`, `so_dien_thoai`, `dia_chi`, `gmail`, `gioi_tinh`, `id_loai_khach`, `id_tai_khoan`) VALUES ('KH-01', 'Nguyễn Quyền', '013123123', '535 Trần Hưng Đạo', 'Nguyenquyen171202@gmail.com', 'Nam', '1', '2');
INSERT INTO `case_study_team`.`khach_hang` (`ma_khach_hang`, `ho_ten`, `so_dien_thoai`, `dia_chi`, `gmail`, `gioi_tinh`, `id_loai_khach`, `id_tai_khoan`) VALUES ('AD-01', 'Quyền', '141444', '280 Trần Hưng Đạo', '180 Trần Hưng Đạo', 'Nam', '1', '1');

select t.id_tai_khoan,t.tai_khoan,t.mat_khau,l.loai from tai_khoan t 
left join loai_tai_khoan l on
t.id_tai_khoan= l.id_loai_tai_khoan;
select * from tai_khoan ;
