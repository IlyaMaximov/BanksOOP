create database if not exists bank;

create table bank.clients
(
    id            bigint auto_increment not null primary key,
    first_name    text,
    second_name   text,
    address       text,
    passport_data text,
    verified      boolean not null
);