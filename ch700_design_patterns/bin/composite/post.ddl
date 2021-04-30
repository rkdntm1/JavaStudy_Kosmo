drop table tb_reply;
drop table tb_post;
drop table tt_reply;
drop table te_post;
drop table te_reply;

/* 각자 만들기 Each-Strategy*/
create table te_reply(
	id			number(19)		primary key,
	master_id	number(19)		references te_reply(id),
	contents	varchar2(4000),
	writer_id	number(19)
);

create table te_post(
	id			number(19)		primary key references te_reply(id),
	title		varchar2(500)
);

/* 상위로 만들기 Top_strategy */
create table tt_reply(
	id 			number(19)		`primary key,
	decrim		char(1),								--구분자 - decriminator{reply, post}
	-- 원천이 지워질 때 따라서 지울 것. (on delete cascade) - 느림(인덱스를 다시타고 다시타고해서 즉 여러번 타고 들어가서)
	-- 성능에 막심한 피해가 올 수 있음. 
	master_id	number(19)		references tt_reply(id), 
	contents	varchar2(4000),
	writer_id	number(19),
	title		varchar2(500)
);

/* 하위 만들기 Bottom_strategy*/
create table tb_post(
	id			number(19)		primary key,
	contents	varchar2(4000),
	writer_id	number(19),
	title		varchar2(500)
);

create table tb_reply(
	id			number(19)		primary key,
	post_id		number(19)		references tb_post(id),
	master_id	number(19)		references tb_reply(id),
	contents	varchar2(4000),
	writer_id	number(19)
);


/* 성능을 고려한 테이블 */
create table t_reply(
	id 			varchar2(4000)		primary key,
	descrim		char(1),								--구분자 - decriminator{reply, post}
	title		varchar2(500),
	contents	varchar2(4000)
);