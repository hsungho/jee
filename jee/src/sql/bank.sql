create table account
(account_no number       not null primary key,
 money      number,
 id         varchar2(20) not null,
 constraint account_member_fk foreign key(id)
         references member(id) on delete cascade
);
select * from account;
drop table account;
create view account_member as
select a.account_no
      ,m.name
      ,m.id
      ,a.money
      ,m.pw
from   account a,member m
where  a.id = m.id
;
drop view account_member;
select *
from   account_member;