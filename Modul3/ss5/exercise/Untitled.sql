drop database if exists product_manager;
create database if not exists product_manager;
use product_manager;
create table product (
 id int primary key auto_increment not null,
 product_code varchar(50) not null unique,
 product_name varchar(45) not null,
 product_price float  check(product_price>0),
 product_amounts int check (product_amounts >0),
 product_description varchar(300) not null,
 product_status bit
 );
insert into product (id,product_code,product_name,product_price,product_amounts,product_description,product_status)
values(1,'123','Notebook', 3500, 2, 'comic', 1),
		(2,'124','Pen', 2000, 4, 'red', 0),
		(3,'125','Tee', 6000, 5, 'black', 1),
		(4,'126','GongCha', 200000, 6, 'black', 0);
	-- Tạo Unique Index trên bảng Products (sử dụng cột productCode để tạo chỉ mục)
    create unique index product_index
    on product(product_code);
    show indexes from product;
    
 --    Tạo Composite Index trên bảng Products (sử dụng 2 cột productName và productPrice)-- 
 alter table product add index index_product_code(product_code);
alter table product  add index  index_name_price(product_name, product_price);
-- Sử dụng câu lệnh EXPLAIN để biết được câu lệnh SQL của bạn thực thi như nào
explain select * from product where product_code = '124';
-- Tạo view lấy về các thông tin: productCode, productName, productPrice, productStatus từ bảng products.
create view product_view as 
select product_code, product_name, product_price, product_status
from product;
select * from product_view;                
-- Tiến hành sửa đổi view
update product_view
set product_name= 'Macbook',
product_price= 10000000
where product_code='125';
select product_name,product_price from product_view;
-- Tiến hành xoá view
drop view product_view;

-- Tạo store procedure lấy tất cả thông tin của tất cả các sản phẩm trong bảng product
delimiter //
create procedure get_product()
begin
	select * from product;
end //
delimiter ;
call get_product();
-- Tạo store procedure thêm một sản phẩm mới
delimiter //
create procedure add_new_product(
    id int,
	product_code varchar(50),
    product_name varchar(45),
    product_price float,
    product_amount int,
    product_description varchar(300),
    product_status bit)
begin
insert into product(id,product_code,product_name,product_price,product_amounts,product_description,product_status)
values(id,product_code,product_name,product_price,product_amount,product_description,product_status);
end //
delimiter ;

CALL add_new_product(5,'P004','Vay dạo phố','250000',20,'Vay dạo phố thời trang và thoải mái',0);
select * from product;
-- Tạo store procedure sửa thông tin sản phẩm theo id
delimiter // 
create procedure 
update_product(
     search_code varchar(50),
    new_name varchar(45))
    begin
    update product
    set product_name=new_name
    where search_code = product_code;
    end // 
    delimiter ; 
    call update_product( '126', 'stabuck');
-- Tạo store procedure xoá sản phẩm theo id
delimiter // 
create procedure 
delete_product(search_id int)
    begin
    delete from product
    where id = search_id;
    end // 
    delimiter ; 
    call delete_product(1);



