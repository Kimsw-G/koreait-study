show tables;
use java;
select * from membertbl;
desc membertbl;

insert into membertbl
VALUES
('kang','강성헌','대구 달서구 용산동');

create table testtbl2(
    id int AUTO_INCREMENT,
    userName char(3),
    age int,
    primary key(id)
);

insert into testtbl3
(username,age)
VALUES
('지민',25),
('유나',22),
('유경',21);
select * from testtbl2;
-- 내용 바꾸기
update testtbl3 set userName='성욱',age=26 where id=3;

show databases;

delete from testtbl2 where id=10;

create table testtbl3 as select * from testtbl2;


create table testtbl4(select * from testtbl3);


-- 테이블 삭제, 데이터 제거
drop table testtbl2;
delete from testtbl3;
truncate testtbl4;

show tables;

insert ignore into testtbl2 values (1,'지민',25);
insert ignore into testtbl2 values (1,'유나',22);
insert ignore into testtbl2 values (2,'유경',21);

select * from testtbl2;


select now();

select cast('2020-10-19 21:35:29' as date) as d_date;
select cast('2020-10-19 21:35:29' as datetime) as d_date;

select cast('10' as int), 'a10'+'10',concat('10','10','hello'),'aaa'+'bbb';

desc producttbl;
insert into producttbl values ('/안녕/',15,'2020-02-02','소니',43);
show TABLES;
select * from productTbl;
select 
    *,
    case company
        when '대우' then '탱크대우'
        when '엘지' then '사랑해요 엘지'
        when '삼성' then '또 하나의 가족'
        else '바보'
    end as c_case
from producttbl;


create table testtbl2(
    id int AUTO_INCREMENT,
    name varchar(10),
    birth date,
    addr varchar(10),
    tel varchar(15)
);

create table customer(
    CustomerID int primary key,
    firstName varchar(10),
    surName varchar(10)
);

create table tel(
    telId int primary key,
    telephoneNum varchar(20),
    CustomerID int
);


insert into customer
values
(123,'pooja','singh'),
(456,'san','zhang'),
(789,'jhon','doe');

insert into tel
VALUES
(1,'555-861-2025',123),
(2,'192-122-1111',123),
(3,'(555)403-1659 Ext.53',456),
(4,'182-929-2929',456),
(5,'555-808-9633',789);

select * from customer;
select * from tel;


create table manufactur(
    Manufacturer varchar(20) primary key,
    country varchar(20)
);

create table model(
    modelpk int AUTO_INCREMENT PRIMARY key,
    model varchar(20) ,
    model_full_name VARCHAR(40),
    manufacturer VARCHAR(20)
);


insert into manufactur
VALUES
('forte','Italy'),
('Dent-o-Fresh','USA'),
('Kobayashi','Japan'),
('Hoch','Germany');

insert into model
(model,model_full_name,manufacturer)
values
('X-Prime','Forte X-Prime','forte'),
('Ultraclean','Forte UltraClean','forte'),
('EZbrush','Dent-o-Fresh EZbrush','Dent-o-Fresh'),
('ST-60','Kobayashi ST-60','Kobayashi'),
('Toothmaster','Hoch Toothmaster','Hoch'),
('X-Prime','Hoch X-Prime','Hoch');

select * from manufactur;
select * from model;

create table winners(
    pk int AUTO_INCREMENT primary key,
    winner varchar(20),
    birth date
);

create table t_winner(
    tournament varchar(20),
    year int(4),
    winner_pk int
);

insert into winners
(winner, birth)
values
('Al Fredrickson','1976-07-21'),
('Bob Albertson','1968-09-28'),
('Chip Masterson','1977-03-14');

insert into t_winner
(tournament,year,winner_pk)
values
('Indiana',1998,1),
('Cleveland',1999,2),
('DesMoinesMasters',1999,1),
('Indiana',1999,3);




create table student(
    S_ID int(3) PRIMARY KEY,
    S_Name varchar(10),
    S_Address varchar(10)
);

create table subject(
    sub_id int(2) AUTO_INCREMENT PRIMARY key,
    sub_name varchar(10)
);
create table stu_sub(
    S_ID int(3),
    sub_id int(2)
);

insert into student
values
(401,'Adam','Noida'),
(402,'Alex','Panipat'),
(403,'Stuart','Jammu');

insert into subject
(sub_name)
values
('bio'),('Maths'),('Physics');

insert into stu_sub
values
(401,1),(401,3),(402,2),(403,2);

select * from student;
select * from subject;
select * from stu_sub;


show tables;

create table t_student(
    s_id int(4) primary key,
    name varchar(3) not null,
    ph varchar(13)
);

desc t_student;

insert into t_student(s_id,name)
values(1111,'값');
insert into t_student(s_id,name,ph)
VALUES
(1112,'을','010-1111-1111'),
(1113,'병','010-2222-2222');

select * from t_student;


create table t_class(
    c_id int UNSIGNED primary key AUTO_INCREMENT,
    cls varchar(5) not null,
    teacher varchar(5) not null
);

insert into t_class
(cls,teacher)
values
('수학','김하나'),
('과학','판테온'),
('국어','오징어');

select * from t_class;

create table t_score(
    s_id int,
    c_id int,
    score int,
    primary key(s_id,c_id)
);

insert into t_score
(s_id,c_id,score)
values
(1111,2,10);

select * from t_score;

drop table t_score;

create table t_score(
    s_id int(4),
    c_id int unsigned,
    score int,
    primary key(s_id,c_id),
    FOREIGN key (s_id) REFERENCES t_student(s_id),
    foreign key (c_id) references t_class(c_id)
);

insert into t_score
values
(1111,1,80),
(1111,3,80),
(1113,1,80),
(1112,2,80);

select B.name, A.c_id, A.score, C.*
from t_score A
inner join t_student B
on A.s_id = B.s_id
inner join t_class C
on A.c_id = C.c_id;

select A.s_id, A.score, A.c_id
from t_score A
inner join t_student B
on A.s_id = B.s_id;

use java;

create table t_board(
	iboard int UNSIGNED PRIMARY KEY AUTO_INCREMENT,
	title VARCHAR(100) not NULL,
	ctnt VARCHAR(500) not NULL,
	r_dt DATETIME DEFAULT now()
);
DROP table t_cmt;
desc t_board;

create table t_cmt(
	icmt int UNSIGNED PRIMARY KEY auto_increment,
	iboard INT UNSIGNED,
	ctnt VARCHAR(100) NOT NULL,
	r_dt DATETIME DEFAULT NOW()
);

insert into t_board
(title,ctnt)
values
('hello','nice to meet you'),
('스타벅스','tmxkqjrtm'),
('이디야','dleldi'),
('컴포즈','zjavhwm');



insert into t_cmt
(iboard,ctnt)
VALUES
('1','ntmy too'),
('2','스벅 자바칩푸라푸치노'),
('1','hello');

select * from t_cmt;

select A.*, B.*
from t_board A
left join t_cmt B
on A.iboard = B.iboard;

select A.*, B.*
from t_board A
left join t_cmt B
on B.iboard is null;