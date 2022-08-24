
create table if not exists account(
    account_id serial primary key,
    name varchar(11),
    password varchar(11)
);