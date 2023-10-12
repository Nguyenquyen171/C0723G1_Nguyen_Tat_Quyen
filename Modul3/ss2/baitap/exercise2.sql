drop database if exists manager;
create database if not exists manager;

use manager;

CREATE TABLE Product(
	product_id INT PRIMARY KEY AUTO_INCREMENT,
    product_name VARCHAR(100) not null,
    product_price FLOAT not null
);

CREATE TABLE Customer(
	customer_id INT PRIMARY KEY AUTO_INCREMENT,
    customer_name VARCHAR(100)not null,
    customer_age INT not null
);

CREATE TABLE `Order`(
	order_id INT PRIMARY KEY AUTO_INCREMENT,
    customer_id INT not null,
    FOREIGN KEY(customer_id) REFERENCES Customer(customer_id),
    order_date date not null,
    order_total_price FLOAT not null
);

CREATE TABLE order_detail (
    order_id INT NOT NULL,
    product_id INT NOT NULL,
    order_qty INT CHECK (order_qty > 0),
    FOREIGN KEY (order_id)
        REFERENCES `Order` (order_id),
    FOREIGN KEY (product_id)
        REFERENCES Product (product_id),
    PRIMARY KEY (order_id , product_id)
);