use quan_ly_ban_hang;

insert into loai_tai_khoan (loai) values
("user"),
("admin");

INSERT INTO `quan_ly_ban_hang`.`loai_san_pham` (ma_loai_sp, `ten_loai`, `mo_ta`) VALUES ("ML01", 'Nhẫn', 'Nhẫn là một món trang sức được đeo ở ngón tay, thường là ngón tay giữa hoặc ngón tay áp út. Nhẫn có thể làm từ nhiều loại vật liệu như vàng, bạc, bạch kim, đá quý, kim cương và các vật liệu khác')
, ("ML02", 'Dây chuyền', 'Dây chuyền là một món trang sức được đeo xung quanh cổ hoặc cổ tay để tạo điểm nhấn cho bộ trang phục và thể hiện phong cách cá nhân. Dây chuyền thường bao gồm một chuỗi hoặc một dây dài, và có thể có các mắt hoặc móc để thắt chặt dây.');

INSERT INTO `quan_ly_ban_hang`.`chat_lieu` (`ma_chat_lieu`, `ten`, `mo_ta`) VALUES ("M01", 'Vàng', 'Vàng là một kim loại quý hiếm có màu vàng và được sử dụng từ hàng ngàn năm trước đây. Nó là một trong những chất liệu quan trọng nhất trong lĩnh vực trang sức và ngành công nghiệp'),
("M02", 'Bạc', 'Nhẫn bạc là một loại vòng tròn nhỏ thường được đeo trên ngón tay, làm từ chất liệu bạc. Nhẫn bạc có thể có nhiều kiểu dáng và thiết kế khác nhau, từ nhẫn đơn giản và tinh tế đến nhẫn phức tạp và được trang trí với đá quý, hoa văn, hoặc các họa tiết khác.');

INSERT INTO `quan_ly_ban_hang`.`size` (`ma_size`, `ten_size`, `mo_ta`) VALUES ("MS01", 'A', '15mm'),
("MS02", 'B', '16mm')
,  ("MS03", 'C', '17mm')
,  ("MS04", 'D', '18mm')
,  ("MS05", 'E', '19mm');

INSERT INTO san_pham (id,ma_san_pham, ten_san_pham, id_loai_san_pham, id_chat_lieu, id_size, gia, so_luong, mo_ta, trang_thai)
VALUES
(1, 'SP0001', 'Nhẫn Tình Yêu Mãi Mãi', 1, 1, 1, 1000000, 50, 'Nhẫn vàng', 1),
(2, 'SP0002', 'Nhẫn Sắc Màu Hạnh Phúc', 1, 2, 2, 2000000, 50, 'Nhẫn bạc', 1),
(3, 'SP0003', 'Nhẫn Hương Nắng Mai', 1, 2, 3, 3000000, 50, 'Nhẫn bạc', 1),
(4, 'SP0004', 'Nhẫn Ngọn Lửa Nhanh Chóng', 1, 2, 4, 1500000, 50, 'Nhẫn bạc', 1),
(5, 'SP0005', 'Nhẫn Hạnh Phúc Vô Biên', 1, 1, 5, 2500000, 50, 'Nhẫn vàng', 1),
(6, 'SP0006', 'Nhẫn Ánh Sáng Ngàn Sao', 1, 2, 5, 3500000, 50, 'Nhẫn bạc', 1),
(7, 'SP0007', 'Nhẫn Nhịp Tim Dịu Dàng', 1, 2, 4, 4000000, 50, 'Nhẫn bạc', 1),
(8, 'SP0008', 'Nhẫn Vườn Hoa Hạnh Phúc', 1, 1, 3, 5000000, 50, 'Nhẫn vàng', 1),
(9, 'SP0009', 'Nhẫn Đam Mê Vô Tận', 1, 1, 2, 5500000, 50, 'Nhẫn vàng', 1),
(10, 'SP0010', 'Nhẫn Tình Yêu Vĩnh Cửu', 1, 2, 1, 6000000, 50, 'Nhẫn bạc', 1),
(11, 'SP0011', 'Nhẫn Linh Hồn Bất Tận', 1, 2, 2, 6500000, 50, 'Nhẫn bạc', 1),
(12, 'SP0012', 'Nhẫn Đồng Hành Vĩnh Viễn', 1, 1, 1, 7000000, 50, 'Nhẫn vàng', 1),
(13, 'SP0013', 'Nhẫn Tình Yêu Vạn Mỹ', 1, 2, 3, 7500000, 50, 'Nhẫn bạc', 1),
(14, 'SP0014', 'Nhẫn Tình Yêu Vĩnh Hằng', 1, 2, 4, 8000000, 50, 'Nhẫn bạc', 1),
(15, 'SP0015', 'Nhẫn Đôi Cánh Gắn Kết', 1, 1, 5, 8500000, 50, 'Nhẫn vàng', 1),
(16, 'SP0016', 'Nhẫn Tuổi Xuân Rực Rỡ', 1, 2, 4, 9000000, 50, 'Nhẫn bạc', 1),
(17, 'SP0017', 'Nhẫn Hạnh Phúc Tỏa Sáng', 1, 1, 5, 9500000, 50, 'Nhẫn vàng', 1),
(18, 'SP0018', 'Nhẫn Trái Tim Bình Yên', 1, 1, 3, 10000000, 50, 'Nhẫn  vàng',1),
(19, 'SP0019', 'Nhẫn Vầng Trăng Thủy Tinh', 1, 2, 4, 10500000, 50, 'Nhẫn bạc', 1),
(20, 'SP0020', 'Nhẫn Đôi Mãi Mãi', 1, 1, 5, 11000000, 50, 'Nhẫn vàng', 1),
(21, 'SP0021', 'Nhẫn Hạnh Phúc Vô Biên', 1, 2, 3, 11500000, 50, 'Nhẫn bạc', 1),
(22, 'SP0022', 'Nhẫn Ánh Sáng Ngàn Sao', 1, 1, 2, 12000000, 50, 'Nhẫn vàng', 1),
(23, 'SP0023', 'Nhẫn Nhịp Tim Dịu Dàng', 1, 1, 1, 12500000, 50, 'Nhẫn vàng', 1),
(24, 'SP0024', 'Nhẫn Vườn Hoa Hạnh Phúc', 1, 2, 5, 13000000, 50, 'Nhẫn bạc', 1),
(25, 'SP0025', 'Nhẫn Đam Mê Vô Tận', 1, 2, 4, 13500000, 50, 'Nhẫn bạc', 1),
(26, 'SP0026', 'Nhẫn Tình Yêu Vĩnh Cửu', 1, 1, 3, 14000000, 50, 'Nhẫn vàng', 1),
(27, 'SP0027', 'Nhẫn Linh Hồn Bất Tận', 1, 1, 2, 14500000, 50, 'Nhẫn vàng', 1),
(28, 'SP0028', 'Nhẫn Đồng Hành Vĩnh Viễn', 1, 2, 1, 15000000, 50, 'Nhẫn bạc', 1),
(29, 'SP0029', 'Nhẫn Tình Yêu Vạn Mỹ', 1, 1, 5, 15500000, 50, 'Nhẫn vàng', 1),
(30, 'SP0030', 'Nhẫn Tình Yêu Vĩnh Hằng', 1, 2, 4, 16000000, 50, 'Nhẫn bạc', 1),
(31, 'SP0031', 'Nhẫn Đôi Cánh Gắn Kết', 1, 1, 3, 16500000, 50, 'Nhẫn vàng', 1),
(32, 'SP0032', 'Nhẫn Tuổi Xuân Rực Rỡ', 1, 2, 2, 17000000, 50, 'Nhẫn bạc', 1),
(33, 'SP0033', 'Nhẫn Hạnh Phúc Tỏa Sáng', 1, 1, 1, 17500000, 50, 'Nhẫn vàng', 1),
(34, 'SP0034', 'Nhẫn Trái Tim Bình Yên', 1, 1, 5, 18000000, 50, 'Nhẫn vàng', 1),
(35, 'SP0035', 'Nhẫn Vầng Trăng Thủy Tinh', 1, 2, 4, 18500000, 50, 'Nhẫn bạc', 1),
(36, 'SP0036', 'Dây chuyền Đại Dương Bình Yên', 2, 1, 1, 19000000, 50, 'Dây chuyền vàng', 1),
(37, 'SP0037', 'Dây chuyền Hoàng Hôn Tà Dương', 2, 2, 2, 19500000, 50, 'Dây chuyền bạc', 1),
(38, 'SP0038', 'Dây chuyền Vườn Hoa Dịu Dàng', 2, 1, 3, 20000000, 50, 'Dây chuyền vàng', 1),
(39, 'SP0039', 'Dây chuyền Linh Hồn Tuyệt Vời', 2, 2, 4, 20500000, 50, 'Dây chuyền bạc', 1),
(40, 'SP0040', 'Dây chuyền Đường Cong Bên Hoa', 2, 1, 5, 21000000, 50, 'Dây chuyền vàng', 1),
(41, 'SP0041', 'Dây chuyền Bướm Mùa Hạ Lứa', 2, 2, 2, 21500000, 50, 'Dây chuyền bạc', 1),
(42, 'SP0042', 'Dây chuyền Nét Đẹp Tinh Tế', 2, 1, 1, 22000000, 50, 'Dây chuyền vàng', 1),
(43, 'SP0043', 'Dây chuyền Trái Tim Sắc Nét', 2, 2, 2, 22500000, 50, 'Dây chuyền bạc', 1),
(44, 'SP0044', 'Dây chuyền Đại Dương Huyền Bí', 2, 1, 3, 23000000, 50, 'Dây chuyền vàng', 1),
(45, 'SP0045', 'Dây chuyền Vầng Trăng Quyến Rũ', 2, 1, 4, 23500000, 50, 'Dây chuyền vàng', 1),
(46, 'SP0046', 'Dây chuyền Ánh Sáng Tự Do', 2, 2, 3, 24000000, 50, 'Dây chuyền bạc', 1),
(47, 'SP0047', 'Dây chuyền Hương Hoa Mê Đắm', 2, 2, 2, 24500000, 50, 'Dây chuyền bạc', 1),
(48, 'SP0048', 'Dây chuyền Bắt Mắt Hào Quang', 2, 2, 1, 25000000, 50, 'Dây chuyền bạc', 1),
(49, 'SP0049', 'Dây chuyền Mãng Xà Khắc Sâu', 2, 1, 2, 25500000, 50, 'Dây chuyền vàng', 1),
(50, 'SP0050', 'Dây chuyền Thần Vũ Điệp Khúc', 2, 1, 3, 26000000, 50, 'Dây chuyền vàng', 1);

INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES (1, 'https://imgur.com/HJ9aQMu', 1);
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES (2, 'https://imgur.com/ZLSuOdb', 1);
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES (3, 'https://imgur.com/4XnDWiq', 1);
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES (4, 'https://imgur.com/zSfveTl', 2);
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('5', 'https://imgur.com/TVPbRbP', 2);
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('6', 'https://imgur.com/TBJzDhA', 2);
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('7', 'https://imgur.com/RcDrI2f', 3);
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('8', 'https://imgur.com/CfLpTr9', 3);
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('9', 'https://imgur.com/ItYRvuw', 3);
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('10', 'https://imgur.com/tOZ03lb', 4);
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('11', 'https://imgur.com/wKMhy82', 4);
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('12', 'https://imgur.com/uUwk2wb', '5');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('13', 'https://imgur.com/hNWU3qN', '5');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('14', 'https://imgur.com/rpej8o3', '5');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('15', 'https://imgur.com/d6AOAy5', '6');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('16', 'https://imgur.com/BnTdODb', '6');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('17', 'https://imgur.com/pzW5Bhk', '6');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('18', 'https://imgur.com/2vYULeg', '7');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('19', 'https://imgur.com/BaU6qGL', '7');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('20', 'https://imgur.com/2lgC6Ok', '8');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('21', 'https://imgur.com/gmaIKav', '8');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('22', 'https://imgur.com/wYF1xsI', '9');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('23', 'https://imgur.com/48qECuZ', '9');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('24', 'https://imgur.com/FCT0x0f', '9');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('25', 'https://imgur.com/3JnuN8a', '10');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('26', 'https://imgur.com/rpLRyW4', '10');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('27', 'https://imgur.com/Drjqgcl', '10');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('28', 'https://imgur.com/a4umsVQ', '11');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('29', 'https://imgur.com/C8CVVBm', '11');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('30', 'https://imgur.com/U5gpbkB', '12');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('31', 'https://imgur.com/2VamVtr', '12');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('32', 'https://imgur.com/Nkh4btk', '12');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('33', 'https://imgur.com/lpdsVFt', '13');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('34', 'https://imgur.com/CoGRFYn', '13');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('35', 'https://imgur.com/OfTuNpw', '13');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('36', 'https://imgur.com/tV9yTUJ', '14');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('37', 'https://imgur.com/pelMxud', '14');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('38', 'https://imgur.com/IetBFJk', '15');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('39', 'https://imgur.com/41lRmWh', '15');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('40', 'https://imgur.com/rVe26Ft', '15');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('41', 'https://imgur.com/VyPadTw', '16');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('42', 'https://imgur.com/7jqJHbc', '16');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('43', 'https://imgur.com/9GDUMIb', '16');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('44', 'https://imgur.com/sTxZqyv', '17');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('45', 'https://imgur.com/PXKAfEb', '17');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('46', 'https://imgur.com/6lhSx5l', '18');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('47', 'https://imgur.com/ATTaNzI', '18');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('48', 'https://imgur.com/U0w6f8S', '18');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('49', 'https://imgur.com/GF5dPXM', '19');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('50', 'https://imgur.com/QVt2hjy', '19');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('51', 'https://imgur.com/u8NDhBi', '20');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('52', 'https://imgur.com/ZjhwyR0', '20');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('53', 'https://imgur.com/ffyn4G0', '21');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('54', 'https://imgur.com/cPJbOPz', '21');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('55', 'https://imgur.com/indTq9s', '22');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('56', 'https://imgur.com/cRGWI9K', '22');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('57', 'https://imgur.com/945YyMT', '23');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('58', 'https://imgur.com/5zqGkIK', '23');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('59', 'https://imgur.com/4Ttrvmf', '24');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('60', 'https://imgur.com/mKmNwV7', '24');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('61', 'https://imgur.com/11S4ydH', '25');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('62', 'https://imgur.com/qNfV8gB', '25');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('63', 'https://imgur.com/VhgCVVK', '26');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('64', 'https://imgur.com/WcVnEQn', '26');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('65', 'https://imgur.com/0MqJBFy', '27');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('66', 'https://imgur.com/wYP2s0A', '27');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('67', 'https://imgur.com/ZyALcye', '28');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('68', 'https://imgur.com/RJuQXrr', '28');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('69', 'https://imgur.com/1wG67RE', '29');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('70', 'https://imgur.com/tlFI9E1', '29');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('71', 'https://imgur.com/JzhxS66', '30');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('72', 'https://imgur.com/Ny7mtdn', '30');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('73', 'https://imgur.com/Kx0vQlk', '31');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('74', 'https://imgur.com/OE2vhrW', '31');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('75', 'https://imgur.com/Zi7C1Oh', '32');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('76', 'https://imgur.com/8nlFJsz', '32');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('77', 'https://imgur.com/otj77Xb', '33');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('78', 'https://imgur.com/nGpdEjY', '33');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('79', 'https://imgur.com/y0iql4C', '34');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('80', 'https://imgur.com/sT1dpLY', '34');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('81', 'https://imgur.com/8FOJBt0', '35');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('82', 'https://imgur.com/saqSsxC', '35');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('83', 'https://imgur.com/w62omoG', '36');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('84', 'https://imgur.com/cDyrgim', '36');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('85', 'https://imgur.com/9GbCzeN', '37');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('86', 'https://imgur.com/FxCzvHu', '37');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('87', 'https://imgur.com/GHMDQAw', '38');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('88', 'https://imgur.com/3Ce1eMF', '38');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('89', 'https://imgur.com/dAca4HE', '39');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('90', 'https://imgur.com/aAGLTil', '39');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('91', 'https://imgur.com/nGHf6CG', '40');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('92', 'https://imgur.com/HypR9lX', '40');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('93', 'https://imgur.com/ZbjVpkG', '41');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('94', 'https://imgur.com/d6Lugti', '41');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('95', 'https://imgur.com/vC9HQQN', '42');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('96', 'https://imgur.com/qYRSxUn', '42');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('97', 'https://imgur.com/NCQFJwF', '43');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('98', 'https://imgur.com/AbiGBdm', '43');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('99', 'https://imgur.com/1Klf2GJ', '44');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('100', 'https://imgur.com/seosz40', '44');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('101', 'https://imgur.com/zREyhLV', '45');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('102', 'https://imgur.com/Q4iOPUw', '45');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('103', 'https://imgur.com/lHfNNEw', '47');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('104', 'https://imgur.com/gL9v97H', '47');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('105', 'https://imgur.com/UBWb1qy', '46');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('106', 'https://imgur.com/dmUblyE', '46');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('107', 'https://imgur.com/LI1jWZA', '48');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('108', 'https://imgur.com/bNUvuwQ', '49');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('109', 'https://imgur.com/A2MTCv9', '48');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('110', 'https://imgur.com/cfAdhjE', '49');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('111', 'https://imgur.com/9rp4jMd', '50');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('112', 'https://imgur.com/fucVxyN', '50');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('113', 'https://imgur.com/H1wophL', '50');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('114', 'https://imgur.com/tGRh3Tn', '40');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('115', 'https://imgur.com/oPCznme', '49');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('116', 'https://imgur.com/NwV8icn', '48');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('117', 'https://imgur.com/0M9uh3i', '47');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('118', 'https://imgur.com/ciRs7Bb', '46');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('119', 'https://imgur.com/Z5zht0d', '45');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('120', 'https://imgur.com/dnJ3LYE', '44');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('121', 'https://imgur.com/g9SrqpR', '43');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('122', 'https://imgur.com/IfoKL4k', '42');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('123', 'https://imgur.com/LpXmkD5', '41');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('124', 'https://imgur.com/Hb0Fscp', '39');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('125', 'https://imgur.com/MXVkwnE', '38');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('126', 'https://imgur.com/CUrSvZz', '37');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('127', 'https://imgur.com/VNu8evl', '36');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('128', 'https://imgur.com/VMCLi8K', '35');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('129', 'https://imgur.com/oi2j4VA', '34');
INSERT INTO `quan_ly_ban_hang`.`hinh_anh` (`id`, `link_path`, `id_san_pham`) VALUES ('130', 'https://imgur.com/giPGGyq', '33');

insert into thanh_toan (hinh_thuc_thanh_toan, trang_thai) values 
("COD", 0), ("CK",1);

insert into loai_khach (ma_loai_khach_hang, ten_loai_khach, phan_tram_uu_dai)
values
("LK01", "Member", 0),
("LK02", "Gold", 3),
("LK03", "Platinum", 6),
("LK04", "Diamond", 10);

insert into tai_khoan (user_name, pass_word, id_loai_tai_khoan) 
values 
('admin01', '123456', 2),
 ('admin02', '123456', 2),
 ('user01', '123456', 1),
 ('user02', '123456', 1),
 ('user03', '123456', 1),
 ('user04', '123456', 1),
 ('user05', '123456', 1),
 ('user06', '123456', 1),
 ('user07', '123456', 1),
 ('user8', '123456', 1),
 ('user9', '123456', 1),
 ('user10', '123456', 1),
 ('user11', '123456', 1),
 ('user12', '123456', 1),
 ('user13', '123456', 1),
 ('user14', '123456', 1),
 ('user15', '123456', 1),
 ('user16', '123456', 2),
 ('user17', '123456', 1),
 ('user18', '123456', 1),
 ('user19', '123456', 1),
 ('user20', '123456', 1),
 ('user21', '123456', 1),
 ('user22', '123456', 1),
 ('user23', '123456', 1),
 ('user24', '123456', 1),
 ('user25', '123456', 1),
 ('user26', '123456', 1),
 ('user27', '123456', 1),
 ('user28', '123456', 1),
 ('user29', '123456', 1),
 ('user30', '123456', 1),
 ('user31', '123456', 1),
 ('user32', '123456', 1),
 ('user33', '123456', 1),
 ('user34', '123456', 1),
 ('user35', '123456', 1),
 ('user36', '123456', 1),
 ('user37', '123456', 1),
 ('user38', '123456', 1),
 ('user39', '123456', 1),
 ('user40', '123456', 1),
 ('user41', '123456', 1),
 ('user42', '123456', 1),
 ('user43', '123456', 1),
 ('user44', '123456', 1),
 ('user45', '123456', 1),
 ('user46', '123456', 1),
 ('user47', '123456', 1),
 ('user48', '123456', 1),
 ('user49', '123456', 1),
 ('user50', '123456', 1),
 ('user51', '123456', 1);
 
 insert into khach_hang (ma_khach_hang, ho_ten, email, so_dien_thoai, dia_chi, gioi_tinh, id_tai_khoan, loai_khach)
 values 
('KH-0001', 'Trần Gia Kiệt', 'giakiet@gmail.com', '0915398163', '11 Ba Đình , phường Đống Đa , Hà Nội', 'Nam', 1, 2),
    ('KH-0002', 'Nguyễn Văn A', 'nguyenvana@gmail.com', '0987654321', '123 Ngô Quyền, phường Hoàn Kiếm, Hà Nội', 'Nam', 2, 3),
    ('KH-0003', 'Lê Thị B', 'lethib@gmail.com', '0976543210', '45 Lý Thường Kiệt, phường Hai Bà Trưng, Hà Nội', 'Nữ', 3, 4),
    ('KH-0004', 'Hoàng Văn C', 'hoangvanc@gmail.com', '0909876543', '6 Tràng Thi, phường Hoàn Kiếm, Hà Nội', 'Nam', 4, 3),
    ('KH-0005', 'Phạm Thị D', 'phamd@gmail.com', '0912345678', '789 Cầu Giấy, phường Cầu Giấy, Hà Nội', 'Nữ', 5, 2),
    ('KH-0006', 'Trần Văn E', 'trane@gmail.com', '0923456789', '12 Kim Mã, phường Ba Đình, Hà Nội', 'Nam', 6, 3),
    ('KH-0007', 'Nguyễn Thị F', 'nguyenf@gmail.com', '0934567890', '34 Trần Phú, phường Ngô Quyền, Hà Nội', 'Nữ', 7, 1),
    ('KH-0008', 'Lê Văn G', 'leg@gmail.com', '0945678901', '56 Láng Hạ, phường Đống Đa, Hà Nội', 'Nam', 8, 4),
    ('KH-0009', 'Hoàng Thị H', 'hoangh@gmail.com', '0956789012', '78 Trường Chinh, phường Thanh Xuân, Hà Nội', 'Nữ', 9, 1),
    ('KH-0010', 'Phạm Văn I', 'phami@gmail.com', '0967890123', '90 Giải Phóng, phường Hoàng Mai, Hà Nội', 'Nam', 10, 2),
    ('KH-0011', 'Trần Gia J', 'giaj@gmail.com', '0978901234', '123 Minh Khai, phường Hai Bà Trưng, Hà Nội', 'Nam', 11, 1),
    ('KH-0012', 'Nguyễn Thị K', 'thik@gmail.com', '0989012345', '456 Nguyễn Trãi, phường Thanh Xuân, Hà Nội', 'Nữ', 12, 2),
    ('KH-0013', 'Lê Văn L', 'levanl@gmail.com', '0990123456', '789 Lê Duẩn, phường Hai Bà Trưng, Hà Nội', 'Nam', 13, 1),
    ('KH-0014', 'Hoàng Thị M', 'hoangm@gmail.com', '0901234567', '234 Tây Sơn, phường Đống Đa, Hà Nội', 'Nữ', 14, 2),
    ('KH-0015', 'Phạm Văn N', 'phamn@gmail.com', '0912345678', '567 Hoàng Diệu, phường Ba Đình, Hà Nội', 'Nam', 15, 3),
    ('KH-0016', 'Trần Gia O', 'giao@gmail.com', '0923456789', '890 Trần Phú, phường Thanh Xuân, Hà Nội', 'Nam', 16, 2),
    ('KH-0017', 'Nguyễn Thị P', 'nguyenp@gmail.com', '0934567890', '123 Láng Hạ, phường Đống Đa, Hà Nội', 'Nữ', 17, 4),
    ('KH-0018', 'Lê Văn Q', 'leq@gmail.com', '0945678901', '456 Trường Chinh, phường Thanh Xuân, Hà Nội', 'Nam', 18, 2),
    ('KH-0019', 'Hoàng Thị R', 'hoangr@gmail.com', '0956789012', '789 Giải Phóng, phường Hoàng Mai, Hà Nội', 'Nữ', 19, 3),
    ('KH-0020', 'Phạm Văn S', 'phams@gmail.com', '0967890123', '234 Minh Khai, phường Hai Bà Trưng, Hà Nội', 'Nam', 20, 3),
    ('KH-0021', 'Trần Gia T', 'giat@gmail.com', '0978901234', '567 Nguyễn Trãi, phường Thanh Xuân, Hà Nội', 'Nam', 21, 1),
    ('KH-0022', 'Nguyễn Thị U', 'nguyenu@gmail.com', '0989012345', '890 Lê Duẩn, phường Hai Bà Trưng, Hà Nội', 'Nữ', 22, 2),
    ('KH-0023', 'Lê Văn V', 'levanv@gmail.com', '0990123456', '123 Tây Sơn, phường Đống Đa, Hà Nội', 'Nam', 23, 1),
    ('KH-0024', 'Hoàng Thị X', 'hoangx@gmail.com', '0901234567', '456 Hoàng Diệu, phường Ba Đình, Hà Nội', 'Nữ', 24, 2),
    ('KH-0025', 'Phạm Văn Y', 'phamy@gmail.com', '0912345678', '789 Trần Phú, phường Thanh Xuân, Hà Nội', 'Nam', 25, 1),
    ('KH-0026', 'Trần Gia Z', 'giaz@gmail.com', '0923456789', '123 Láng Hạ, phường Đống Đa, Hà Nội', 'Nam', 26, 3),
    ('KH-0027', 'Nguyễn Thị AA', 'nguyena@gmail.com', '0934567890', '456 Trường Chinh, phường Thanh Xuân, Hà Nội', 'Nữ', 27, 1),
    ('KH-0028', 'Lê Văn BB', 'leb@gmail.com', '0945678901', '789 Giải Phóng, phường Hoàng Mai, Hà Nội', 'Nam', 28, 2),
    ('KH-0029', 'Hoàng Thị CC', 'hoangc@gmail.com', '0956789012', '234 Minh Khai, phường Hai Bà Trưng, Hà Nội', 'Nữ', 29, 4),
    ('KH-0030', 'Phạm Văn DD', 'phamd@gmail.com', '0967890123', '567 Nguyễn Trãi, phường Thanh Xuân, Hà Nội', 'Nam', 30, 2),
    ('KH-0031', 'Trần Gia EE', 'giae@gmail.com', '0978901234', '890 Lê Duẩn, phường Hai Bà Trưng, Hà Nội', 'Nam', 31, 1),
    ('KH-0032', 'Nguyễn Thị FF', 'thif@gmail.com', '0989012345', '123 Tây Sơn, phường Đống Đa, Hà Nội', 'Nữ', 32, 2),
    ('KH-0033', 'Lê Văn GG', 'legg@gmail.com', '0990123456', '456 Hoàng Diệu, phường Ba Đình, Hà Nội', 'Nam', 33, 4),
    ('KH-0034', 'Hoàng Thị HH', 'hoangh@gmail.com', '0901234567', '789 Trần Phú, phường Thanh Xuân, Hà Nội', 'Nữ', 34, 2),
    ('KH-0035', 'Phạm Văn II', 'phami@gmail.com', '0912345678', '123 Láng Hạ, phường Đống Đa, Hà Nội', 'Nam', 35, 1),
    ('KH-0036', 'Trần Gia JJ', 'giaj@gmail.com', '0923456789', '456 Trường Chinh, phường Thanh Xuân, Hà Nội', 'Nam', 36, 2),
    ('KH-0037', 'Nguyễn Thị KK', 'thik@gmail.com', '0934567890', '789 Giải Phóng, phường Hoàng Mai, Hà Nội', 'Nữ', 37, 1),
    ('KH-0038', 'Lê Văn LL', 'levanl@gmail.com', '0945678901', '234 Minh Khai, phường Hai Bà Trưng, Hà Nội', 'Nam', 38, 4),
    ('KH-0039', 'Hoàng Thị MM', 'hoangm@gmail.com', '0956789012', '567 Nguyễn Trãi, phường Thanh Xuân, Hà Nội', 'Nữ', 39, 1),
    ('KH-0040', 'Phạm Văn NN', 'phamn@gmail.com', '0967890123', '890 Lê Duẩn, phường Hai Bà Trưng, Hà Nội', 'Nam', 40, 2),
    ('KH-0041', 'Trần Gia OO', 'giao@gmail.com', '0978901234', '123 Tây Sơn, phường Đống Đa, Hà Nội', 'Nam', 41, 2),
    ('KH-0042', 'Nguyễn Thị PP', 'thip@gmail.com', '0989012345', '456 Hoàng Diệu, phường Ba Đình, Hà Nội', 'Nữ', 42, 3),
    ('KH-0043', 'Lê Văn QQ', 'leq@gmail.com', '0990123456', '789 Trường Chinh, phường Thanh Xuân, Hà Nội', 'Nam', 43, 1),
    ('KH-0044', 'Hoàng Thị RR', 'hoangr@gmail.com', '0901234567', '234 Giải Phóng, phường Hoàng Mai, Hà Nội', 'Nữ', 44, 4),
    ('KH-0045', 'Phạm Văn SS', 'phams@gmail.com', '0912345678', '567 Minh Khai, phường Hai Bà Trưng, Hà Nội', 'Nam', 45, 1),
    ('KH-0046', 'Trần Gia TT', 'giat@gmail.com', '0923456789', '890 Nguyễn Trãi, phường Thanh Xuân, Hà Nội', 'Nam', 46, 2),
    ('KH-0047', 'Nguyễn Thị UU', 'nguyenu@gmail.com', '0934567890', '123 Lê Duẩn, phường Hai Bà Trưng, Hà Nội', 'Nữ', 47, 1),
    ('KH-0048', 'Lê Văn VV', 'levanv@gmail.com', '0945678901', '456 Tây Sơn, phường Đống Đa, Hà Nội', 'Nam', 48, 2),
    ('KH-0049', 'Hoàng Thị XX', 'hoangx@gmail.com', '0956789012', '789 Hoàng Diệu, phường Ba Đình, Hà Nội', 'Nữ', 49, 1),
    ('KH-0050', 'Phạm Văn YY', 'phamy@gmail.com', '0967890123', '123 Trần Phú, phường Thanh Xuân, Hà Nội', 'Nam', 50, 1);
    
    insert into don_hang (ma_don_hang, id_tai_khoan, ten_nguoi_nhan, dia_chi_nhan, so_dien_thoai, 
    email, ngay_dat_hang, ngay_giao_hang, trang_thai_van_chuyen, ma_thanh_toan)
    values 
("DH-01", 1, "Văn Toản", "Đà Nẵng", "0123445678", "h@gmail.com", "2021-10-12 12:30:00", "2021-10-15 12:30:00", "Đang vận chuyển", 1),
("DH-02", 2, "Thị Hương", "Hà Nội", "0987654321", "a@gmail.com", "2021-10-13 13:30:00", "2021-10-16 13:30:00", "Đã giao", 1),
("DH-03", 3, "Minh Tuấn", "TP.HCM", "0912345678", "b@gmail.com", "2021-10-14 14:30:00", "2021-10-17 14:30:00", "Đã giao", 1),
("DH-04", 4, "Hoàng Nam", "Đà Nẵng", "0987654321", "c@gmail.com", "2021-10-15 15:30:00", "2021-10-18 15:30:00", "Huỷ", 1),
("DH-05", 5, "Thùy Linh", "Hà Nội", "0123445678", "d@gmail.com", "2021-10-16 16:30:00", "2021-10-19 16:30:00", "Đang vận chuyển", 2),
("DH-06", 6, "Quốc Bảo", "TP.HCM", "0987654321", "e@gmail.com", "2021-10-17 17:30:00", "2021-10-20 17:30:00", "Đang vận chuyển", 2),
("DH-07", 7, "Anh Thư", "Đà Nẵng", "0912345678", "d@gmail.com", "2021-10-18 18:30:00", "2021-10-21 18:30:00", "Chờ xác nhận", 1),
("DH-08", 8, "Tùng Anh", "Hà Nội", "0123445678", "k@gmail.com", "2021-10-19 19:30:00", "2021-10-22 19:30:00", "Đang vận chuyển", 2),
("DH-09", 9, "Thu Trang", "TP.HCM", "0987654321", "j@gmail.com", "2021-10-20 20:30:00", "2021-10-23 20:30:00", "Đang vận chuyển", 1),
("DH-10", 10, "Minh Hiếu", "Đà Nẵng", "0912345678", "z@gmail.com", "2021-10-21 21:30:00", "2021-10-24 21:30:00", "Đang vận chuyển", 1),
("DH-11", 11, "Thùy Dung", "Hà Nội", "0123445678", "x@gmail.com", "2021-10-22 22:30:00", "2021-10-25 22:30:00", "Chờ xác nhận", 1),
("DH-12", 12, "Quang Huy", "TP.HCM", "0987654321", "c@gmail.com", "2021-10-23 23:30:00", "2021-10-26 23:30:00", "Đang vận chuyển", 2),
("DH-13", 13, "Linh Chi", "Đà Nẵng", "0912345678", "v@gmail.com", "2021-10-24 12:30:00", "2021-10-27 12:30:00", "Chờ xác nhận", 1),
("DH-14", 14, "Linh Chi", "Huế", "0912345679", "b@gmail.com", "2021-10-24 13:30:00", "2021-10-27 12:30:00", "Đang vận chuyển", 1),
("DH-15", 15, "Linh Chi", "Đà Nẵng", "0912345670", "n@gmail.com", "2021-10-24 13:30:00", "2021-10-27 13:30:00", "Huỷ", 2),
("DH-16", 16, "Linh Chi", "Quảng Trị", "0912345671", "m@gmail.com", "2021-10-24 14:30:00", "2021-10-27 13:30:00", "Đang vận chuyển", 1),
("DH-17", 17, "Linh Chi", "Đà Nẵng", "0912345672", "aa@gmail.com", "2021-10-24 14:30:00", "2021-10-27 14:30:00", "Đang vận chuyển", 2),
("DH-18", 18, "Linh Chi", "Huế", "0912345673", "bb@gmail.com", "2021-10-24 15:30:00", "2021-10-27 15:30:00", "Đã giao", 1),
("DH-19", 19, "Linh Chi", "Đà Nẵng", "0912345674", "cc@gmail.com", "2021-10-24 16:30:00", "2021-10-27 16:30:00", "Đang vận chuyển", 1),
("DH-20", 20, "Linh Chi", "Quảng Bình", "091234567", "nn@gmail.com", "2021-10-24 16:30:00", "2021-10-27 16:30:00", "Đã giao", 2);

insert into chi_tiet_don_hang (ma_ctdh, id_don_hang, id_san_pham, gia, so_luong) 
values 
('ABC00001', 1, 1,500000, 2),
('ABC00002',2, 2, 1750000, 3),
('ABC00003', 3, 3, 2000000, 4),
('ABC00004', 4, 4, 3000000, 1),
('ABC00005', 6, 6, 6800000,3),
('ABC00006', 7, 7,4500000, 4),
('ABC00007', 8, 8, 2500000, 2),
('ABC00008', 9, 9, 4500000, 1),
('ABC00009', 10, 10, 6000000, 2),
('ABC00010', 11, 11, 7000000, 4),
('ABC00011', 12, 12, 7500000, 2),
('ABC00012', 13, 13, 5500000, 5),
('ABC00013', 14, 14, 3750000, 2),
('ABC00014', 15, 15, 21950000, 3),
('ABC00016', 16, 16, 18000000, 1),
('ABC00017', 17, 17, 5500000, 3),
('ABC00018', 18, 18, 24000000, 5),
('ABC00019', 19, 19, 16000000, 2),
('ABC00020', 20, 20, 7500000, 4);


