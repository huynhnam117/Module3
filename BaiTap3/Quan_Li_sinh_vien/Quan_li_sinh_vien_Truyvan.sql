USE Quan_li_sinh_vien;

-- 1 Hiển thị tất cả các sinh viên có tên bắt đầu bảng ký tự ‘h’
select * from student where  StudentName like 'h%';
-- 2 Hiển thị các thông tin lớp học có thời gian bắt đầu vào tháng 12.
select * from class where month(StartDate)=12;
-- 3 Hiển thị tất cả các thông tin môn học có credit trong khoảng từ 3-5.
select * from Subject where Credit between 3 and 5;
-- 4 Thay đổi mã lớp(ClassID) của sinh viên có tên ‘Hung’ là 2.
set SQL_SAFE_UPDATES=0;
update student 
set ClassID = 2
where StudentName = "Hung";
-- 5 Hiển thị các thông tin: StudentName, SubName, Mark. Dữ liệu sắp xếp theo điểm thi (mark) giảm dần. nếu trùng sắp theo tên tăng dần.
select student.studentname,subject.subname,mark.mark
		 from mark join student on student.studentid = mark.studentid
		 join subject on subject.subid = mark.subid
		 order by mark.mark desc,
		 student.studentname asc;