-- 20210414

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

-- 20210415

-- 20210415

CREATE TABLE membertbl(
	memberid char(8) PRIMARY KEY,
	memberName CHAR(5) not NULL,
	memberAddress char(20)
);

desc membertbl;
select * from membertbl;

CREATE TABLE productTBL(
	productName char(4) PRIMARY KEY,
	cost int not NULL,
	makeDate DATE,
	company char(5),
	amount int NOT NULL
);

-- insert로 값 넣기
INSERT INTO membertbl
(memberid, membername, memberaddress)
VALUES
('dang','당탕이','경기 부천시 중동'),
('hee','지운이','서울 은평구 증산동'),
('han','한주연','인천 남구 주안동'),
('sang','상길이','경기 성남구 분당구');

desc memberTBL;
select * from memberTBL;

Insert into producttbl
VALUES
('컴퓨터','10','2017-01-01','삼성','17'),
('세탁기','20','2018-09-01','엘지','3'),
('냉장고','1','2019-02-01','대우','22');

desc productTBL;
select * from productTBL;

-- select로 값 검색하기

select * from producttbl;
select company, cost from producttbl;

SELECT * FROM producttbl WHERE company='엘지';

-- membertbl에서 membername이 지운이인 레코드만 나타나도록
select * from membertbl where membername="지운이";

select * from producttbl where cost>=10 and company = '엘지';
select * from producttbl where cost>=10 or company = '엘지';

show tables;

create table indexTbl(
	first_name varchar(14),
	last_name  varchar(16),
	hire_date date
);
desc indexTbl;

select * from employees.employees limit 500;
-- 접근 방식 기술 가능
EXPLAIN select * from indextbl where first_name='mary';
-- 인덱스를 만들어서 explain 에서 속도가 빠름
create index idx_indextbl_firstname on indextbl(first_name);

-- SELECT
-- ALL | DISTINCT | DISTINCTROW
-- 컬럼명 | *
-- FROM 테이블명
-- WHERE 조건식
-- GROUP BY 컬럼명 (여러 컬럼명 가능)
-- HAVING 그룹바이의 조건식
-- ORDER BY 레코드의 순서 조정
-- LIMIT 레코드 수

use employees;

show databases;

show tables;
show table status;

-- 1. employees.titles table에서 emp_no가 10600 이상인 레코드가 나타나도록
select * from titles where emp_no>=10600;
-- 2. employees.titles table에서 emp_no가 10600 이상이며, 타이틀이 staff인 사람만
select * from titles where emp_no>=10600 and title='staff';
-- 3. employees.titeles table에서 emp_no가 10000 이상이며, 20000이하인 레코드
select * from titles where emp_no between 10000 and 20000;
-- 4. .. title값이 engineer 또는 staff
select * from titles where title='engineer' or title='staff';

select * from salaries order by salary desc;

-- 5. dept_emp 테이블에서 dept_no 컬럼 내림차순, emp_no 오름차순으로 정렬
select * from dept_emp order by dept_no desc,emp_no;

select distinct dept_no from dept_emp;

desc dept_emp;

select sum(from_date) from dept_emp;

select * from salaries order by salary desc limit 5;
select * from salaries order by salary desc;

-- 개수 반환
select count(*) from salaries;
-- 계산 함수 최대. 최소. 합. 평균.
select max(salary) from salaries;
select max(salary) from salaries;
select max(salary) from salaries;
select avg(salary) from salaries;

-- group by
desc salaries;
select emp_no,max(salary) from salaries group by emp_no;
select emp_no,count(emp_no) from salaries group by emp_no;

select emp_no,max(salary) as 최대연봉,count(emp_no) as 근속연수, avg(salary) as 평균급여
from salaries 
group by emp_no 
order by avg(salary);

-- 평균 급여순으로 정렬
select emp_no,max(salary) as 최대연봉,count(emp_no) as 근속연수, avg(salary) as 평균급여
from salaries 
group by emp_no 
order by 평균급여 desc;

-- 근속 연수순으로 정렬. 같을시 평균 급여순
select emp_no,max(salary) as 최대연봉,count(emp_no) as 근속연수, avg(salary) as 평균급여
from salaries 
group by emp_no 
order by 근속연수 desc, 평균급여 desc;

select emp_no,max(salary) as 최대연봉,count(emp_no) as 근속연수, avg(salary) as 평균급여
from salaries 
group by emp_no 
having 근속연수=10;

-- salaries table에서 emp_no가 90000이상인 경우
select emp_no,avg(salary) as 평균급여
from salaries
group by emp_no
having 평균급여>=90000
order by 평균급여;

-- 가장 많은 인원이 있는 title
desc titles;
select title, count(title)
from titles
group by title
order by count(title);

select title
from titles
group by title
order by count(title) desc
limit 1;

-- employees 테이블에서 여성이면서, 이름이 s로 시작하며, 고용일이 1980이상인 사람
desc employees;
select *
from employees
where gender='F' and hire_date>='1990-01-01' and first_name like 's%' and birth_date like '____-08-__';

-- 20210416
use employees;
select * from employees where first_name LIKE '%en%';
select * from employees where first_name LIKE '_en%';

(select gender from employees where emp_no=10110);

select * from employees
where gender =(select gender from employees where emp_no=10110);

select * from titles;

select * from titles where emp_no=110386 and title='technique leader';

select * from dept_emp limit 5;

use employees;
show tables;

select emp_no, gender, if(gender='M','남성','여성') from employees;

select salary, ifnull(salary,0), nullif(salary,70606) from salaries;

-- 조건문 사용
select
	case 11
		when 1 then '일'
		when 5 then '오'
		when 10 then '십'
		else '무엇'
	end as c_case;

select *,
	case 
		when salary >= 80000 then '최고급인력'
		when salary >= 70000 then '고급인력' 
		else '저급인력'
	end
from salaries;

-- 문자열 자르가
select 
	*,
	concat(first_name,',',last_name,',',gender),
	concat_ws(',',first_name, last_name)
from employees;

select format(51515.525235,1);

select * ,insert(dept_no,2,2,'i')
from dept_emp;

select first_name,last_name,left(first_name,2),right(last_name,3)
from employees;

-- 빈 칸 채우기
select first_name, lpad(first_name,10,'#')
from employees;

select '        안녕       ' as hello;
select trim('        안녕       ') as hello;
select replace('        안   녕       ',' ','!') as hello;

SELECT '        안녕       ',trim('        안녕       '),replace('        안   녕       ',' ','!');

select 
	birth_date,
	left(birth_date,4) as year,
	substring(birth_date,6,2) as mon,
	right(birth_date,2) as day
from employees; 

select
	ceil(10.0),
	ceil(10.1),
	round(10.4),
	round(10.5),
	floor(10.9)
;