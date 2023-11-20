use ss2;
INSERT INTO category(name)
VALUES ('Tự nhiên'),
('Xã Hội'),
('Truyện'),
('Tiểu Thuyết'),
('Khác');


INSERT INTO authors(name)
VALUES ('Nguyễn Thái Học'),
('Trần Mình Hoàng'),
('Dương Trung Quốc'),
('Lê Văn Hiến'),
('Hà Văn Minh');

INSERT INTO book(id_category,id_authors,title,page_size)
VALUES (1,1,'Toán',45),
(2,2,'Văn',34),
(2,3,'Sử',56),
(2,4,'Địa',76),
(1,5,'Hóa',32);

INSERT INTO student(name, birthday, class_name)
VALUES ('Nguyễn Văn A', '1999-12-12', 'C0822G1'),
        ('Nguyễn Văn B', '1999-12-13', 'C0822G1'),
        ('Nguyễn Văn C', '1999-12-14', 'C0822G1'),
        ('Nguyễn Văn D', '1999-12-15', 'C0922G1'),
        ('Nguyễn Văn E', '1999-12-16', 'C1022G1');
INSERT INTO borrow(id_book,id_student,borrow_date,return_date)
VALUES (1,1,'2022-12-12','2022-12-13'),
(2,2,'2022-12-12','2022-12-15'),
(3,3,'2022-12-12','2022-12-15'),
(4,4,'2022-12-15','2022-12-12'),
(5,1,'2022-12-13','2022-12-15'),
(5,1,'2022-12-14','2022-12-14'),
(4,3,'2022-12-15','2022-12-29'),
(3,3,'2022-12-8','2022-12-14'),
(2,1,'2022-12-6','2022-12-30');

-- 	 Lấy ra toàn bộ sách có trong thư viện, cùng với tên thể loại và tác giả			
SELECT 
    b.id, b.title, c.name, a.name
FROM
    book b
        JOIN
    category c ON c.id = b.id
        JOIN
    authors a ON a.id = b.id;

-- + Lấy ra danh sách các học viên đã từng mượn sách và sắp xếp danh sách theo theo tên từ a->z
SELECT 
    s.name, title
FROM
    student s
        JOIN
    borrow b ON b.id = s.id
        JOIN
    book ON book.id = b.id
ORDER BY s.name;


-- + Lấy ra  2 quyển sách được mượn nhiều nhất
select book.title, count(borrow.id) as quanity
from borrow
join book on borrow.id_book=book.id
group by book.id
order by quanity desc
limit 2;

-- ss4
-- - Thông kê các đầu sách được mượn nhiều nhất	
select book.title, count(borrow.id) as quanity
from borrow
join book on borrow.id_book=book.id
group by book.id
order by quanity desc;
-- - Lấy ra các học viên mượn sách nhiều nhất của thư viện
SELECT 
    s.name, title, count(borrow.id) as quanity
FROM
    student s
        JOIN
    borrow b ON b.id = s.id
        JOIN
    book ON book.id = borrow.id
 group by book.id 
order by quanity desc;

-- - Thông kê các đầu sách chưa được mượn		
-- - Lấy ra danh sách các học viên đã từng mượn sách và sắp xếp  theo số lượng mượn sách từ lớn đến nhỏ
			