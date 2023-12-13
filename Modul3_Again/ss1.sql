drop database if exists book_manager;
create database if not exists book_manager;
use  book_manager;

create table books(
id int primary key auto_increment not null,
name varchar(50 )not null,
page_size int,
author varchar (50)not null
);
insert into books(name,page_size,author) value
('Toán',45,'Nguyễn Thái Học'),('Văn',34,'Trần Mình Hoàng'),('Sử',56,'Dương Trung Quốc'),('Hoá',32,'Hà Văn Minh'),('Địa',76,'Lê Văn Hiến');
	-- - Cập nhật số trang page_size=50 với sách có title = "Sử"	
    
update books
set  page_size = 50
where name = 'Sử';
-- 		- Xoá sách có id =5	
delete from books
where id = 5;
-- - Xoá bảng books	
drop table books;
-- - Xoá cơ sở dữ liệu book_management		
drop database book_manager;												
						
                        
