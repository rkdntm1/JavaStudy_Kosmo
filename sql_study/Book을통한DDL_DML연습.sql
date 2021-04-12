-- 주석처리방법1
/* 주석처리방법2*/

/* DDL. = Class coding, Class 정의 */
--    id, title, publisher, publisher_year, price,


create table t_book (
    id              int, --주석은 가독성! 
    title           varchar2(500), 
    publisher       varchar2(500),
    publisher_year  char(4),
    price           int,
    poriso          long,
    primary key(id) -- 중복될 수 없다.
);

/* DML - create.  = new Book*/
insert into t_book(id, title, publisher, publisher_year, price)
    values(1, '봄날의 봄바람 나기', '준', '2000', 4500);
insert into t_book(id, title, publisher, publisher_year, price)
    values(2, '여름날의 봄바람 나기', '수', '2010', 5500);
insert into t_book(id, title, publisher, publisher_year, price)
    values(3, '가을날의 봄바람 나기', '수', '2000', 8500);
insert into t_book(id, title, publisher, publisher_year, price)
    values(4, '겨울날의 봄바람 나기', '준', '2030', 13500);   
commit; -- 하드디스크에 쓰기. DBMS에게 정보를 확실하게 저장하라는 의미. 안햏주면 java 에서 없는 것임.

/* DML - select */
-- t_book에서 모든 정보를 조회한다. 
select *
  from t_book;
  
-- t_book에서 출판년도가 2000인 모든 정보를 조회한다. 
select *
  from t_book
 where publisher_year = '2000';
 
 -- t_book에서 출판년도가 2000이면서 가격이 5000이상인 것 중에 제목을 조회한다. 
select title
  from t_book
 where publisher_year = '2000'
   and price >= 5000;
   
update t_book
   set price = 13500
 where id = 5;

   