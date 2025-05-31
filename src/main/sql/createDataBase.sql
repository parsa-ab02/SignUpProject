create database usersData;

use usersData;

create table user(
    id int auto_increment primary key,
    firstName varchar(50),
    lastName varchar(50),
    age int,
    email varchar(100) UNIQUE,
    password varchar(100)
);

select * from user