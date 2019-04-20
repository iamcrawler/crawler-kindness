

create table pg_order(
  id BIGSERIAL PRIMARY KEY,
  item_name varchar(50),
  amount REAL,
  created_date timestamp DEFAULT LOCALTIMESTAMP,
  update_date timestamp DEFAULT LOCALTIMESTAMP,
  version INT4 not null default 1,
  deleted int4 not null default 0
);