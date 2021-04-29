create database seatapp;

use seatapp;

create table seat(
	seatkey int primary key,
	stukey int
);
-- 초기화시 테이블 데이터 삭제 후 재할당.