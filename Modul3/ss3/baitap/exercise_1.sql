drop database if exists studentmanager;
create database if not exists studentmanager;

use studentmanager;
CREATE TABLE class(

         class_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,

          class_name VARCHAR(60) NOT NULL,

          start_date DATETIME NOT NULL,

          status Bit
);
create table student(
student_id int not null unique auto_increment primary key,
student_name varchar(50) not null,
student_address varchar(50) not null,
student_phone varchar(20) not null,
   status BIT,
class_id int not null,
foreign key (class_id) references class(class_id)

);
 create table subject(
 sub_id int not null auto_increment primary key,
 sub_name varchar(50) not null,
 credit tinyint not null default 1 check (credit>=1),
 status bit default 1
 );
 create table mark(
 mark_id int not null auto_increment primary key,
sub_id int not null,
student_id int not null,
mark float default 0 check (mark between 0 and 100),
exam_times tinyint default 1,
unique (sub_id, student_id),
foreign key (sub_id) references subject(sub_id),
foreign key (student_id) references student(student_id)
 );
 insert into class
values (1, 'A3', '2008-12-20', 1),
(2, 'C2', '2002-12-21', 1),
(3, 'D3', current_date, 0);

insert into student (student_name, student_address, student_phone, status, class_id)
values ('Quyen', 'Sai Gon', '0912113113', 1, 2),
('Hoa', 'Texax ','123456789', 1, 1),
('Manh', 'Cali', '0123123123', 0, 2);

insert into `subject`
values (1, 'CF', 5, 1),
 (2, 'C', 6, 1),
 (3, 'HDJ', 5, 1),
 (4, 'RDBMS', 10, 1);
 
insert into mark (sub_id, student_id, mark, exam_times)
values (1, 1, 8, 1),
 (1, 2, 10, 2),
 (2, 1, 12, 1);
 
 -- Hiển thị tất cả các sinh viên có tên bắt đầu bảng ký tự ‘h’
SELECT 
    *
FROM
    student
WHERE
    student_name LIKE 'h%';
    -- Hiển thị các thông tin lớp học có thời gian bắt đầu vào tháng 12.
SELECT 
    *
FROM
    class
WHERE
    MONTH(start_date) = 12 ;
 
 -- Hiển thị tất cả các thông tin môn học có credit trong khoảng từ 3-5.
 select * 
 from subject
 where credit between 3 and 5;
 
 -- Thay đổi mã lớp(classID) của sinh viên có tên ‘quyen’ là 2.
 set sql_safe_updates = 0;
 update student 
 set class_id = 2 
 where student_name = 'Quyen';
 set sql_safe_updates = 1;
 
 -- Hiển thị các thông tin: StudentName, SubName, Mark. Dữ liệu sắp xếp theo điểm thi (mark) giảm dần. nếu trùng sắp theo tên tăng dần.
 select
 s.student_name, ss.sub_name, m.mark
from
student s
join
 mark m on s.student_id= m.student_id
join  
subject ss on m.sub_id= ss.sub_id
order by mark desc, student_name asc; 
