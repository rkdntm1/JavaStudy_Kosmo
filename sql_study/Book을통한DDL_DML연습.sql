-- �ּ�ó�����1
/* �ּ�ó�����2*/

/* DDL. = Class coding, Class ���� */
--    id, title, publisher, publisher_year, price,


create table t_book (
    id              int, --�ּ��� ������! 
    title           varchar2(500), 
    publisher       varchar2(500),
    publisher_year  char(4),
    price           int,
    poriso          long,
    primary key(id) -- �ߺ��� �� ����.
);

/* DML - create.  = new Book*/
insert into t_book(id, title, publisher, publisher_year, price)
    values(1, '������ ���ٶ� ����', '��', '2000', 4500);
insert into t_book(id, title, publisher, publisher_year, price)
    values(2, '�������� ���ٶ� ����', '��', '2010', 5500);
insert into t_book(id, title, publisher, publisher_year, price)
    values(3, '�������� ���ٶ� ����', '��', '2000', 8500);
insert into t_book(id, title, publisher, publisher_year, price)
    values(4, '�ܿﳯ�� ���ٶ� ����', '��', '2030', 13500);   
commit; -- �ϵ��ũ�� ����. DBMS���� ������ Ȯ���ϰ� �����϶�� �ǹ�. ���d�ָ� java ���� ���� ����.

/* DML - select */
-- t_book���� ��� ������ ��ȸ�Ѵ�. 
select *
  from t_book;
  
-- t_book���� ���ǳ⵵�� 2000�� ��� ������ ��ȸ�Ѵ�. 
select *
  from t_book
 where publisher_year = '2000';
 
 -- t_book���� ���ǳ⵵�� 2000�̸鼭 ������ 5000�̻��� �� �߿� ������ ��ȸ�Ѵ�. 
select title
  from t_book
 where publisher_year = '2000'
   and price >= 5000;
   
update t_book
   set price = 13500
 where id = 5;

   