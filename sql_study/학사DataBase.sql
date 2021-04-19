drop table t_takes; 
drop table t_class;
drop table t_course;
drop table t_student;
drop table t_professor;
drop table t_dept;

create table t_dept (
	id		integer			primary key,
	name	varchar2(500)	not null,
	office  varchar2(500)	not null
);

create table t_professor (
	id			integer			primary key,
	dept_id		integer			references t_dept (id),
	ssn 		char(14)		not null,
	name		varchar2(500)	not null,
	position	varchar2(10),
	year_emp  	integer			not null
);

create table t_student (
	id			integer			primary key,
	dept_id		integer			references t_dept (id),
	ssn 		char(14)		not null,
	name		varchar2(500)	not null,
	year  		integer			not null
);

create table t_course (
	id		char(4)			primary key,
	title	varchar2(500)	not null,
	credit  integer			not null
);

create table t_class (
	id			integer			primary key,
	prof_id		integer			references t_professor (id),
	course_id	char(4)			references t_course (id),
	year 		integer,
	semester	integer,
	division	char(1),
	class_room  varchar2(500),
	enroll		integer			
);

create table t_takes(
	class_id	integer		references t_class (id),
	student_id	integer		references t_student (id),
	grade		varchar2(2),
	primary key(student_id, class_id)			
	-- 어떤 순서로 인덱스를 만들어야 할까?
	-- create : 시험치고 평가하고 등록할때.
	-- update : 
	-- delete : 
	-- select : 학생			
);

create index idx_takes_cls on t_takes(class_id, grade);

insert into t_dept (id, name, office)
	values(920, '컴퓨터공학과', '201호');
insert into t_dept (id, name, office)
	values(923, '산업공학과', '207호');
insert into t_dept (id, name, office)
	values(925, '전자공학과', '308호');
    
insert into t_student (id, dept_id, ssn, name, year)
	values(1292001, 920, '900424-1825409', '김광식', 2);
insert into t_sudent (id, dept_id, ssn, name, year)
	values(1292002, 921, '900305-1730021', '김정현', 2);
insert into t_student (id, dept_id, ssn, name, year)
	values(1292003, 920, '891021-2308302', '김현정', 2);
insert into t_student (id, dept_id, ssn, name, year)
	values(1292301, 923, '890902-2704012', '김현정', 2);
insert into t_student (id, dept_id, ssn, name, year)
	values(1292303, 923, '910715-1524390', '박광수', 1);
insert into t_student (id, dept_id, ssn, name, year)
	values(1292305, 923, '921011-1809003', '김우주', 2);
insert into t_student(id, dept_id, ssn, name, year)
	values(1292501,925, '900825-1506390','박철수','1');
insert into t_student (id, dept_id, ssn, name, year)
	values(1292502, 925, '911011-1809003', '백태성', 2);
    
insert into t_professor (id, dept_id, ssn, name, position, year_emp)
	values(92001, 920, '590327-1839240', '이태규', '교수', 1997);
insert into t_professor (id, dept_id, ssn, name, position, year_emp)
	values(92002, 920, '690702-1350026', '고희석', '부교수', 2003);
insert into t_professor (id, dept_id, ssn, name, position, year_emp)
	values(92301, 923, '741011-2765501', '최성희', '부교수', 2005);
insert into t_professor (id, dept_id, ssn, name, position, year_emp)
	values(92302, 923, '750728-1102458', '김태석', '교수', 1999);
insert into t_professor (id, dept_id, ssn, name, position, year_emp)
	values(92501, 925, '620505-1200546', '박철재', '조교수', 2007);
insert into t_professor (id, dept_id, ssn, name, position, year_emp)
	values(92502, 925, '740101-1830264', '장민석', '부교수', 2005);
    
insert into t_course(id, title, credit)
	values('C101', '전산개론', 3);
insert into t_course(id, title, credit)
	values('C102', '자료구조', 3);
insert into t_course(id, title, credit)
	values('C103', '데이터베이스', 4);
insert into t_course(id, title, credit)
	values('C301', '운영체제', 3);
insert into t_course(id, title, credit)
	values('C302', '컴퓨터구조', 3);
insert into t_course(id, title, credit)
	values('C303', '이산수학', 4);
insert into t_course(id, title, credit)
	values('C304', '객체지향언어', 4);
insert into t_course(id, title, credit)
	values('C501', '인공지능', 3);
insert into t_course(id, title, credit)
	values('C502', '알고리즘', 2);

select * from t_course;