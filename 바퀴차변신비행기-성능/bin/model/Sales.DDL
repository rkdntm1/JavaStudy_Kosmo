--행위자(party)
drop table t_detail;
drop table t_trade;
drop table t_product;
drop table t_party;

create table t_party(
	id			integer			primary key,
	name		varchar2(500),
	balance		integer
);

--상품(product)
create table t_product(
	id			integer			primary key,
	seller		integer			references t_party(id),
	name		varchar2(500),
	unitprice	integer,
	stock		integer
);

--거래
create table t_trade(
	id			integer,	
	buyer_id	integer			references t_party(id),		
	when		timestamp 		default sysdate,
	primary key (id)
);

--거래 상세
create table t_detail(
	trade_id		integer,
	product_id		integer,
	count			integer,
	primary key(trade_id, product_id)
);