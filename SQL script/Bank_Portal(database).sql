create database Bank_Portal;
use Bank_Portal;

create table customer(
	name varchar(100),
    userName varchar(100) unique,
    loginPass varchar(100),
    ID int primary key auto_increment,
    pin int,
    balance float default 0.0
);

insert into customer (name,userName,loginPass,ID,pin,balance) values("manager","BankManaher@bank.com","pass",100000000,1000,3423.56); 