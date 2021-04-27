

create database store;

create table store(
    storekey int AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(20),
    ctnt VARCHAR(50),
    ftype varchar(10)
);

create table review(
    storekey int,
    id varchar(10),
    pw varchar(10),
    star int(1),
    ctnt VARCHAR(50),
    foreign key(storekey) REFERENCES store(storekey)
);