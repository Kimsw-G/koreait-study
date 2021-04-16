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
insert into producttbl values ('전자',15,'2020-02-02','소니',43);
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