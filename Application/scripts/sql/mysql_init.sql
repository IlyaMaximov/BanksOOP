create
database if not exists bank;

create table bank.clients
(
    id            bigint auto_increment not null primary key,
    bank_id       bigint  not null,
    first_name    text,
    second_name   text,
    address       text,
    passport_data text,
    verified      boolean not null default false
);

create table bank.transactions
(
    id                   bigint auto_increment not null primary key,
    creator_client_id    bigint      not null,
    source_account_id    bigint      not null,
    target_account_id    bigint      not null,
    amount               bigint      not null,
    currency             varchar(16) not null,
    completion_timestamp timestamp
);

create table bank.accounts
(
    id                 bigint auto_increment not null primary key,
    bank_id            bigint      not null,
    owner_id           bigint      not null,
    current_amount     bigint      not null,
    account_type       varchar(20) not null,
    commission         double,
    credit_limit       bigint,
    balance_percentage double,
    accumulated_amount bigint,
    up_to_date         date
);

create table bank.banks
(
    id                                  bigint auto_increment primary key,
    debit_percentage                    double not null,
    credit_commission                   double not null,
    unverified_transaction_amount_limit bigint not null
);