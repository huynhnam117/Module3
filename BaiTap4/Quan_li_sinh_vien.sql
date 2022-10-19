	drop database if existS Quan_li_sinh_vien;
    CREATE DATABASE Quan_li_sinh_vien;
    USE Quan_li_sinh_vien;
    
CREATE TABLE Class(
	ClassID   INT AUTO_INCREMENT PRIMARY KEY,
	ClassName VARCHAR(60),
	StartDate DATETIME,
	`Status`    BIT
 );
CREATE TABLE Student(
    StudentId   INT AUTO_INCREMENT PRIMARY KEY,
    StudentName VARCHAR(30),
    Address     VARCHAR(50),
    Phone       VARCHAR(20),
    `Status`       BIT,
    ClassId     INT ,
    FOREIGN KEY (ClassId) REFERENCES Class (ClassID)
);
CREATE TABLE Subject(
    SubId   INT AUTO_INCREMENT PRIMARY KEY,
    SubName VARCHAR(30),
    Credit  TINYINT DEFAULT 1 CHECK ( Credit >= 1 ),
    `Status`   BIT DEFAULT 1
);

CREATE TABLE Mark(
    MarkId    INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    SubId     INT NOT NULL,
    StudentId INT NOT NULL,
    Mark      FLOAT   DEFAULT 0 CHECK ( Mark BETWEEN 0 AND 100),
    ExamTimes TINYINT DEFAULT 1,
    UNIQUE (SubId, StudentId),
    FOREIGN KEY (SubId) REFERENCES Subject (SubId),
    FOREIGN KEY (StudentId) REFERENCES Student (StudentId)
);

INSERT INTO Class (ClassID, ClassName, StartDate, `Status`)
VALUES 
     (1, 'A1', '2008-12-20', 1),
	 (2, 'A2', '2008-12-22', 1),
	 (3, 'B3', current_date, 0);

INSERT INTO Student (StudentName, Address, Phone, `Status`, ClassId)
VALUES 
	 ('Hung', 'Ha Noi', '0912113113', 1, 1),
	 ('Hoa', 'Hai phong','097654553', 1, 1),
	 ('Manh', 'HCM', '0123123123', 0, 2);
     
INSERT INTO Subject (SubId, SubName, Credit, `Status`)
VALUES (1, 'CF', 5, 1),
       (2, 'C', 6, 1),
       (3, 'HDJ', 5, 1),
       (4, 'RDBMS', 10, 1);

INSERT INTO Mark (SubId, StudentId, Mark, ExamTimes)
VALUES (1, 1, 8, 1),
       (1, 2, 10, 2),
       (2, 1, 12, 1);


    