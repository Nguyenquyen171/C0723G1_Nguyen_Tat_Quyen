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
SELECT 
    s.*, AVG(mark) AS 'Diem thi trung binh'
FROM
    student s
        JOIN
    mark m ON s.student_Id = m.student_Id
GROUP BY s.student_Id;