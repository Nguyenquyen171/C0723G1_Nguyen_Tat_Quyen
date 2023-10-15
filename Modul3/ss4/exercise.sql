use studentmanager;
SELECT * 
FROM subject 
WHERE credit  
 = (SELECT max(credit) FROM subject );

-- Hiển thị các thông tin môn học có điểm thi lớn nhất.
SELECT 
    s.sub_name, MAX(mark)
FROM
    mark m
        JOIN
    subject s ON m.sub_id = s.sub_id
GROUP BY s.sub_id;
-- Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần
SELECT s.student_name, avg(mark) AS average_mark
FROM student s
JOIN mark m ON s.student_id = m.student_id
GROUP BY s.student_id
ORDER BY average_mark desc;