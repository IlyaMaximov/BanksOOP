create database if not exists bank;

create table bank.clients
(
    id            bigint auto_increment not null primary key,
    first_name    text,
    second_name   text,
    address       text,
    passport_data text,
    verified      boolean not null default false
);

create table bank.transactions(
    id bigint auto_increment not null primary key,
    creator_client_id bigint not null,
    source_account_id bigint not null,
    target_account_id bigint not null,
    amount bigint not null,
    currency varchar(16) not null,
    completion_timestamp timestamp
);