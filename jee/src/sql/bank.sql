create table account(account_no number       not null primary key,
					 name       varchar2(20) not null,
					 id         varchar2(20) not null,
					 pw	        varchar2(20) not null,
					 money      number
					 );
select * from account;
drop table account;