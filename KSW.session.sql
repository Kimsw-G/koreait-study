-- 데이터 베이스 생성
CREATE DATABASE java;
-- 테이블 생성
CREATE TABLE t_exam(
	i_exam INT PRIMARY KEY,
	title VARCHAR(100),
	jumin CHAR(13),
	age INT(3) NOT NULL
);
-- DB조회
SHOW DATABASES;
-- DB사용
USE java;
-- 테이블 조회
SELECT * FROM t_exam;

-- Data 넣기
INSERT INTO t_exam
(i_exam,title,jumin,age)
VALUES
(1,'안녕하세요','9002121876543',25);

INSERT INTo t_exam
(i_exam,title,jumin,age)
VALUES
(2,'zzzz','9002121876544',26),
(3,'bgdd','9204121876544',31);

-- Data 수정
UPDATE t_exam set age=30 WHERE i_exam=1;
-- Data 삭제
DELETE from t_exam where i_exam=3;

-- PRIMARY KEY 특징
-- UNIQUE, NOT NULL 옵션 가짐 
-- 

CREATE TABLE productTBL(
	productName char(4) PRIMARY KEY,
	cost int not NULL,
	makeDate DATE,
	company char(5),
	amount int NOT NULL
);

desc productTBL;
select * from productTBL;

-- dddd