delimiter //
CREATE PROCEDURE add_new_account(usn text, pw text)
begin
insert into tai_khoan (user_name, pass_word, id_loai_tai_khoan)
values (usn, pw, 1);
end //
delimiter ;

delimiter //
CREATE  PROCEDURE add_new_customer(mkh text, hoten text, em text, sdt text, dc text, gt text, idtk int)
begin
insert into khach_hang (ma_khach_hang, ho_ten, email, so_dien_thoai, dia_chi, gioi_tinh, 
id_tai_khoan, loai_khach)
values (mkh, hoten, em, sdt, dc, gt, idtk, 1);
end //
delimiter ;

delimiter //
CREATE  PROCEDURE chi_tiet_don_hang(ma_code text)
begin
with t1 as (
select  link_path, ten_san_pham, ma_san_pham, ctdh.so_luong so_luong, ctdh.gia gia_mua, ctdh.so_luong * ctdh.gia tong,
row_number() over(partition by ma_san_pham order by link_path) rn
  from 
chi_tiet_don_hang ctdh 
join don_hang dh on ctdh.id_don_hang = dh.id
join san_pham sp on ctdh.id_san_pham = sp.id
join hinh_anh ha on ha.id_san_pham = sp.id
where dh.ma_don_hang = ma_code)
select * from t1
where rn = 1
;
end //
delimiter ;

delimiter //
CREATE  PROCEDURE get_account(us text, ps text)
begin
select *
from tai_khoan
where user_name = us and pass_word = ps;
end //
delimiter ;

delimiter //
CREATE PROCEDURE display_all()
BEGIN
 SELECT ma_chat_lieu,ten,mo_ta FROM chat_lieu;
 END //
 delimiter ;
 
 delimiter //
CREATE PROCEDURE get_account_by_username(usn text)
begin
select user_name
from tai_khoan
where user_name = usn;
end //
delimiter ;

delimiter //
CREATE  PROCEDURE `get_account_type`(usn text)
begin
select id_loai_tai_khoan
from tai_khoan
where user_name = usn;
end //
delimiter ;

delimiter //
CREATE  PROCEDURE `get_id_tai_khoan`(usn text)
begin
select id
from tai_khoan
where user_name = usn;
end //
delimiter ;

delimiter //
CREATE  PROCEDURE `get_order_by_customer_id`()
begin
select dh.id id, ma_don_hang, ngay_dat_hang, trang_thai_van_chuyen, sum(gia * so_luong) total
from khach_hang kh 
join don_hang dh on kh.id_tai_khoan = dh.id_tai_khoan
join
chi_tiet_don_hang ctdh 
on ctdh.id_don_hang = dh.id
group by dh.id;
end //
delimiter ;

delimiter //
CREATE  PROCEDURE `get_order_by_username`(usn text)
begin
select dh.id id, ma_don_hang, ngay_dat_hang, trang_thai_van_chuyen, sum(gia * so_luong) total
from khach_hang kh 
join don_hang dh on kh.id_tai_khoan = dh.id_tai_khoan
join
chi_tiet_don_hang ctdh 
on ctdh.id_don_hang = dh.id
join tai_khoan tk on tk.id = kh.id_tai_khoan
where user_name = usn
group by dh.id;
end //
delimiter ;

delimiter //
CREATE PROCEDURE `get_order_by_username`(usn text)
begin
select dh.id id, ma_don_hang, ngay_dat_hang, trang_thai_van_chuyen, sum(gia * so_luong) total
from khach_hang kh 
join don_hang dh on kh.id_tai_khoan = dh.id_tai_khoan
join
chi_tiet_don_hang ctdh 
on ctdh.id_don_hang = dh.id
join tai_khoan tk on tk.id = kh.id_tai_khoan
where user_name = usn
group by dh.id;
end //
delimiter ;

delimiter //
CREATE PROCEDURE `update_all`(id_user int , ma_chat_lieu_user varchar(120) , ten_user text , mo_ta_user text)
BEGIN
update chat_lieu  set ma_chat_lieu = ma_chat_lieu_user , ten = ten_user , mo_ta = mo_ta_user where id = id_user;
 SELECT * FROM chat_lieu;
 END //
 delimiter ;
 
 delimiter //
 create procedure get_all_cart(us text)
 begin
 with t1 as( select sp.ten_san_pham, sp.ma_san_pham,ha.link_path,gh.so_luong, 
 gh.so_luong*sp.gia as tam_tinh, row_number() over(partition by sp.ma_san_pham order by ha.link_path) rn
 from gio_hang gh join san_pham sp on sp.id = gh.id_san_pham
 join tai_khoan tk on tk.id = gh.id_tai_khoan
 join hinh_anh ha on ha.id_san_pham = sp.id
 where user_name = us)
 select * from t1 where rn = 1;
 end //
 delimiter ;

DELIMITER $$
CREATE PROCEDURE update_member_all(ho_ten text , gmail text , so_dien_thoai text,dia_chi text,gioi_tinh text,id int )
BEGIN
update khach_hang  set ho_ten = ho_ten , email = gmail , so_dien_thoai = so_dien_thoai , dia_chi = dia_chi , gioi_tinh = gioi_tinh where id = id;
 SELECT * FROM khach_hang;
 END$$
DELIMITER ;
 
 