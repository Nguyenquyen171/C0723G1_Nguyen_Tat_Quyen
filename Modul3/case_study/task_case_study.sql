use database_case_study;
-- 2. Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là
-- một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 kí tự.
select * from nhan_vien where
    SUBSTRING_INDEX(ho_ten, ' ', - 1) like 'H%'
        or SUBSTRING_INDEX(ho_ten, ' ', - 1) like 'T%'
        or SUBSTRING_INDEX(ho_ten, ' ', - 1) like 'K%'
        and LENGTH(ho_ten) <= 15;
-- 3. Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và
-- có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.
SELECT *
FROM khach_hang
WHERE   (TIMESTAMPDIFF(YEAR, ngay_sinh, CURDATE()) BETWEEN 18 AND 50)
        AND (dia_chi LIKE '%Đà Nẵng%' OR dia_chi LIKE '%Quảng Trị%');

-- 4. Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu
-- lần. Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của
-- khách hàng. Chỉ đếm những khách hàng nào có Tên loại khách hàng là
-- “Diamond”.
SELECT 
    kh.ho_ten, COUNT(ma_hop_dong) AS 'Số lần thuê dịch vụ'
FROM
    khach_hang kh
        JOIN
    hop_dong hd ON kh.ma_khach_hang = hd.ma_khach_hang
		JOIN
    loai_khach lk ON kh.ma_loai_khach = lk.ma_loai_khach
WHERE
    lk.ten_loai_khach = 'Diamond'
GROUP BY kh.ma_khach_hang
ORDER BY COUNT(ma_hop_dong) ASC;
-- 5. Hiển   thị  ma_khach_hang,   ho_ten,   ten_loai_khach,   ma_hop_dong,
-- ten_dich_vu,   ngay_lam_hop_dong,   ngay_ket_thuc,   tong_tien  (Với
-- tổng tiền được tính theo công thức như sau: Chi Phí Thuê + Số Lượng *
-- Giá,   với   Số   Lượng   và   Giá   là   từ   bảng   dich_vu_di_kem,
-- hop_dong_chi_tiet) cho tất cả các khách hàng đã từng đặt phòng. (những
-- khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra). 
SELECT 
    kh.ma_khach_hang,
    kh.ho_ten,
    lk.ten_loai_khach,
    hd.ma_hop_dong,
    dv.ten_dich_vu,
    hd.ngay_lam_hop_dong,
    hd.ngay_ket_thuc,
    (IFNULL(dv.chi_phi_thue, 0) + SUM(IFNULL(hct.so_luong, 0) * IFNULL(dvdk.gia, 0))) AS tong_tien
FROM
    khach_hang kh
        JOIN
    loai_khach lk ON kh.ma_loai_khach = lk.ma_loai_khach
        LEFT JOIN
    hop_dong hd ON kh.ma_khach_hang = hd.ma_khach_hang
        LEFT JOIN
    dich_vu dv ON hd.ma_dich_vu = dv.ma_dich_vu
        LEFT JOIN
    hop_dong_chi_tiet hct ON hd.ma_hop_dong = hct.ma_hop_dong
        LEFT JOIN
    dich_vu_di_kem dvdk ON hct.ma_dich_vu_di_kem = dvdk.ma_dich_vu_di_kem
GROUP BY hd.ma_hop_dong , kh.ma_khach_hang
ORDER BY kh.ma_khach_hang ASC , hd.ma_hop_dong DESC
;
-- 6. Hiển   thị  ma_dich_vu,   ten_dich_vu,   dien_tich,   chi_phi_thue,
-- ten_loai_dich_vu của tất cả các loại dịch vụ chưa từng được khách hàng
-- thực hiện đặt từ quý 1 của năm 2021 (Quý 1 là tháng 1, 2, 3).
select 
    dv.ma_dich_vu,
    dv.ten_dich_vu,
    dv.dien_tich,
    dv.chi_phi_thue,
    ldv.ten_loai_dich_vu
from
    dich_vu dv
        join
    loai_dich_vu ldv ON dv.ma_loai_dich_vu = ldv.ma_loai_dich_vu
where
    dv.ma_dich_vu not in (select ma_dich_vu
from hop_dong
where (quarter(ngay_lam_hop_dong)=1)
);
-- 7. Hiển   thị   thông   tin  ma_dich_vu,   ten_dich_vu,   dien_tich,
-- so_nguoi_toi_da,   chi_phi_thue,   ten_loai_dich_vu  của tất cả các loại
-- dịch vụ đã từng được khách hàng đặt phòng  trong   năm   2020  nhưng
-- chưa từng được khách hàng đặt phòng trong năm 2021.
select 
    dv.ma_dich_vu,
    ten_dich_vu,
    dien_tich,
    chi_phi_thue,
    so_nguoi_toi_da,
    ten_loai_dich_vu
from
    dich_vu dv
        join
    loai_dich_vu ldv on dv.ma_loai_dich_vu = ldv.ma_loai_dich_vu
    join 
     hop_dong hd ON dv.ma_dich_vu = hd.ma_dich_vu
where
  year(hd.ngay_lam_hop_dong) = 2020
        and dv.ma_dich_vu not in (select 
            ma_dich_vu
        from
            hop_dong
        where
            year(ngay_lam_hop_dong) = 2021)
;
-- 8. Hiển thị thông tin  ho_ten  khách hàng  có trong hệ thống, với yêu cầu
-- ho_ten không trùng nhau.
-- Học viên sử dụng theo 3 cách khác nhau để thực hiện yêu cầu trên.
-- Cach 1
select distinct
    ho_ten
from
    khach_hang;
-- Cach 2
select 
    ho_ten
from
    khach_hang 
group by 
	ho_ten;
   -- Cach 3
select 
    ho_ten
from
    khach_hang 
union select 
    ho_ten
from
    khach_hang; 

-- 9. Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi
-- tháng trong năm 2021 thì sẽ có bao nhiêu khách hàng thực hiện đặt
-- phòng.
-- select month(ngay_lam_hop_dong) as 'Tháng',
-- count(con.ma_khach_hang) as 'SL'
-- from hop_dong con
-- WHERE YEAR(ngay_lam_hop_dong) = 2021
-- GROUP BY MONTH(ngay_lam_hop_dong);
select month(ngay_lam_hop_dong) AS 'Tháng',
count(con.ma_khach_hang) AS 'So luong dat phong'
from hop_dong con
where year(ngay_lam_hop_dong) = 2021
group by month(ngay_lam_hop_dong);
-- 10. Hiển thị thông tin tương ứng với từng hợp đồng thì đã sử dụng bao nhiêu
-- dịch   vụ   đi   kèm.   Kết   quả   hiển   thị   bao   gồm  ma_hop_dong,
-- ngay_lam_hop_dong,   ngay_ket_thuc,   tien_dat_coc,
-- so_luong_dich_vu_di_kem  (được tính dựa trên việc sum so_luong ở
-- dich_vu_di_kem).
select  hd.ma_hop_dong,
ngay_lam_hop_dong,ngay_ket_thuc,tien_dat_coc, so_luong_dich_vu_di_kem,
sum(so_luong) as 'So luong dich vu'
from
hop_dong hd 
left join
hop_dong_chi_tiet hdct on hd.ma_hop_dong=hdct.ma_hop_dong
group by hd.dich_vu_di_kem;
-- 11. Hiển thị thông tin các dịch vụ đi kèm đã được sử dụng bởi những khách
-- hàng có ten_loai_khach  là  “Diamond”  và có dia_chi ở “Vinh” hoặc
-- “Quảng Ngãi”.
select 
ten_dich_vu_di_kem, ho_ten
from 
dich_vu_di_kem dk 
join 
hop_dong_chi_tiet hc on hc.ma_dich_vu_di_kem = dk.ma_dich_vu_di_kem
join 
hop_dong h on h.ma_hop_dong = hc.ma_hop_dong
join 
khach_hang k on (h.ma_khach_hang = k.ma_khach_hang and (dia_chi like '%Vinh%' or dia_chi like '%Quảng Ngãi%'))
join 
loai_khach lk on (k.ma_loai_khach = lk.ma_loai_khach and (ten_loai_khach = 'Diamond'));

-- 12. Hiển thị thông tin  ma_hop_dong,  ho_ten  (nhân viên),  ho_ten  (khách
-- hàng),  so_dien_thoai  (khách   hàng),  ten_dich_vu,
-- so_luong_dich_vu_di_kem  (được tính dựa trên việc sum so_luong ở
-- dich_vu_di_kem),  tien_dat_coc  của tất cả các dịch vụ đã từng được
-- khách hàng đặt vào  3   tháng   cuối   năm   2020   nhưng   chưa   từng   được
-- khách hàng đặt vào 6 tháng đầu năm 2021.
select 
    hd.ma_hop_dong,
    nv.ho_ten,
    kh.ho_ten,
    kh.so_dien_thoai,
    dv.ten_dich_vu,
    SUM(IFNULL(hdct.so_luong, 0)) AS 'SL'
from
    hop_dong hd
        join
    nhan_vien nv on hd.ma_nhan_vien = nv.ma_nhan_vien
        join
    khach_hang kh on hd.ma_khach_hang = kh.ma_khach_hang
        join
    dich_vu dv ON hd.ma_dich_vu = dv.ma_dich_vu
        LEFT join
    hop_dong_chi_tiet hdct on hd.ma_hop_dong = hdct.ma_hop_dong
where
    month(hd.ngay_lam_hop_dong) between 10 AND 12
        AND YEAR(hd.ngay_lam_hop_dong) = 2020
        AND MONTH(hd.ngay_lam_hop_dong) NOT IN (SELECT 
            hd.ma_dich_vu
        FROM
            hop_dong hd
        WHERE
            MONTH(hd.ngay_lam_hop_dong) BETWEEN 1 AND 6
                AND YEAR(hd.ngay_lam_hop_dong) = 2021)
GROUP BY hd.ma_hop_dong;

-- 13. Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các
-- Khách hàng đã đặt phòng. (Lưu ý là có thể có nhiều dịch vụ có số lần sử
-- dụng nhiều như nhau).
select 
    dvk.ten_dich_vu_di_kem,
    hdc.ma_dich_vu_di_kem,
    SUM(hdc.so_luong) as so_luong_su_dung
from dich_vu_di_kem    dvk
join hop_dong_chi_tiet hdc on dvk.ma_dich_vu_di_kem = hdc.ma_dich_vu_di_kem
group by hdc.ma_dich_vu_di_kem
having SUM(hdc.so_luong) in (
		select MAX(count_dvdk.sl)
		from
			(select 
				ma_dich_vu_di_kem, 
                SUM(so_luong) as sl
			 from hop_dong_chi_tiet
			 group by ma_dich_vu_di_kem) as count_dvdk);
-- 14. Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một
-- lần   duy   nhất.   Thông   tin   hiển   thị   bao   gồm  ma_hop_dong,
-- ten_loai_dich_vu,   ten_dich_vu_di_kem,   so_lan_su_dung  (được tính
-- dựa trên việc count các ma_dich_vu_di_kem)
SET 
sql_mode = 0;
SELECT
 hc.ma_hop_dong,
 ld.ten_loai_dich_vu, 
 dk.ten_dich_vu_di_kem, 
 COUNT(hc.ma_hop_dong) AS so_lan_su_dung
FROM 
hop_dong h
JOIN
 dich_vu d ON h.ma_dich_vu = d.ma_dich_vu
JOIN 
loai_dich_vu ld ON d.ma_loai_dich_vu = ld.ma_loai_dich_vu
LEFT JOIN
 hop_dong_chi_tiet hc ON hc.ma_hop_dong = h.ma_hop_dong
JOIN
 dich_vu_di_kem dk ON hc.ma_dich_vu_di_kem = dk.ma_dich_vu_di_kem
GROUP BY hc.ma_dich_vu_di_kem
HAVING COUNT(hc.ma_dich_vu_di_kem) = 1;

-- 15. Hiển thi thông tin của tất cả nhân viên bao gồm ma_nhan_vien, ho_ten,
-- ten_trinh_do, ten_bo_phan, so_dien_thoai, dia_chi mới chỉ lập được
-- tối đa 3 hợp đồng từ năm 2020 đến 2021.
SELECT h.ma_nhan_vien, ho_ten, ma_trinh_do, ma_bo_phan, so_dien_thoai, dia_chi, COUNT(h.ma_hop_dong) AS so_hop_dong_da_lap
FROM nhan_vien n 
JOIN hop_dong h ON n.ma_nhan_vien = h.ma_nhan_vien
WHERE YEAR(h.ngay_lam_hop_dong) IN ('2020', '2021')
GROUP BY h.ma_nhan_vien  
HAVING COUNT(h.ma_hop_dong) <= 3;
-- 16. Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2019
-- đến năm 2021.
SELECT 
-- 17. Cập nhật thông tin những khách hàng có ten_loai_khach từ  Platinum
-- lên  Diamond, chỉ cập nhật những khách hàng đã từng đặt phòng với
-- Tổng Tiền thanh toán trong năm 2021 là lớn hơn 10.000.000 VNĐ.
UPDATE khach_hang kh 
SET 
    ma_loai_khach = (SELECT 
            ma_loai_khach
        FROM
            loai_khach
        WHERE
            ten_loai_khach = 'Diamond')
WHERE
    kh.ma_khach_hang IN (SELECT 
            custom.ma_khach_hang
        FROM
            (SELECT 
                kh.ma_khach_hang,
                    kh.ho_ten,
                    lk.ten_loai_khach,
                    (IFNULL(dv.chi_phi_thue, 0) + SUM(IFNULL(hdct.so_luong, 0) * IFNULL(dvdk.gia, 0))) AS tong_tien
            FROM
                khach_hang kh
            JOIN loai_khach lk ON kh.ma_loai_khach = lk.ma_loai_khach
            JOIN hop_dong hd ON kh.ma_khach_hang = hd.ma_khach_hang
            JOIN dich_vu dv ON hd.ma_dich_vu = dv.ma_dich_vu
            JOIN hop_dong_chi_tiet hdct ON hd.ma_hop_dong = hdct.ma_hop_dong
            JOIN dich_vu_di_kem dvdk ON hdct.ma_dich_vu_di_kem = dvdk.ma_dich_vu_di_kem
            WHERE
                lk.ten_loai_khach = 'Platinium'
                    AND YEAR(hd.ngay_lam_hop_dong) = 2021
            GROUP BY kh.ma_khach_hang) AS custom
        WHERE
            custom.tong_tien > 1000000);
            
-- 18. Xóa những khách hàng có hợp đồng trước năm 2021 (chú ý ràng buộc
-- giữa các bảng).
SET SQL_SAFE_UPDATES = 0;
SET FOREIGN_KEY_CHECKS = 1;

DELETE FROM hop_dong
WHERE ma_khach_hang IN (
    SELECT kh.ma_khach_hang
    FROM (
        SELECT hd.ma_khach_hang
        FROM hop_dong hd
        WHERE YEAR(hd.ngay_lam_hop_dong) < 2021
    ) AS kh
);

DELETE FROM khach_hang
WHERE ma_khach_hang IN (
    SELECT kh.ma_khach_hang
    FROM (
        SELECT hd.ma_khach_hang
        FROM hop_dong hd
        WHERE YEAR(hd.ngay_lam_hop_dong) < 2021
    ) AS kh
);

-- 19. Cập nhật giá cho các dịch vụ đi kèm được sử dụng trên 10 lần trong
-- năm 2020 lên gấp đôi.
UPDATE dich_vu_di_kem 
SET 
    gia = gia * 2
WHERE
    ma_dich_vu_di_kem IN (SELECT 
            ma_dich_vu_di_kem
        FROM
            (SELECT 
                dk.ma_dich_vu_di_kem, SUM(so_luong) AS 'so_lan_su_dung'
            FROM
                hop_dong_chi_tiet hc
            JOIN dich_vu_di_kem dk ON hc.ma_dich_vu_di_kem = dk.ma_dich_vu_di_kem
            LEFT JOIN hop_dong h ON hc.ma_hop_dong = h.ma_hop_dong
            WHERE
                YEAR(ngay_lam_hop_dong) = '2020'
            GROUP BY hc.ma_dich_vu_di_kem
            HAVING SUM(so_luong) > 10) AS temp);
SET sql_safe_updates = 1; 
-- 20. Hiển thị thông tin của tất cả các nhân viên và khách hàng có trong hệ
-- thống, thông tin hiển thị bao gồm id (ma_nhan_vien, ma_khach_hang),
-- ho_ten, email, so_dien_thoai, ngay_sinh, dia_chi.
SELECT 
    ma_nhan_vien,
    ho_ten,
    email,
    so_dien_thoai,
    ngay_sinh,
    dia_chi
FROM
    nhan_vien 
UNION SELECT 
    ma_khach_hang,
    ho_ten,
    email,
    so_dien_thoai,
    ngay_sinh,
    dia_chi
FROM
    khach_hang;