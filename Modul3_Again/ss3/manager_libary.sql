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

