USE Quan_li_sinh_vien;

-- 6 Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất.
		select *
		from Subject
		where Credit = (select MAX(Credit) from Subject);

	
--  7 Hiển thị các thông tin môn học có điểm thi lớn nhất.
	select Subject.SubId,Subject.SubName,Subject.Credit,Subject.Status,Mark.Mark
	from Subject 
			join Mark on Subject.SubId = Mark.SubId
    where Mark = (select MAX(Mark) from Mark);
    
    
--  8 Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần
 select student.* ,avg(Mark) as diem_trung_binh
 from Student 
			left join Mark on Student.StudentId = Mark.StudentId
 group by Student.StudentId
 order by diem_trung_binh desc;
 
