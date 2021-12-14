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

create table bank.accounts(
    id bigint auto_increment not null primary key,
    owner_id bigint not null,
    current_amount bigint not null,
    account_type varchar(20) not null,
    commission double,
    credit_limit bigint,
    balance_percentage double,
    accumulated_amount bigint,
    up_to_date date
)