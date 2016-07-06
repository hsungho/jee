create table account
(account_no number       not null primary key,
 teller_date varchar2(20),
 deposit    number,
 withdraw   number,
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
      ,a.teller_date
      ,a.deposit
      ,a.withdraw
      ,m.pw
      ,sum(NVL(a.deposit,0) - NVL(a.withdraw,0)) over(PARTITION BY a.account_no,m.name,m.id ORDER BY teller_date) money
from   account a,member m
where  a.id = m.id
;
drop view account_member;
select *
from   account_member;