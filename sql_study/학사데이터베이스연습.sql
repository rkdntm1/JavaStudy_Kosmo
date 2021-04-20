update t_party set balance = balance - (
	select	sum(d.count * p.unitprice)
	  from  t_trade t, t_detail d, t_product p
	 where	t.buyer_id = 4
	   and	t.id = d.trade_id
	   and  d.product_id = p.id
) where id = 4;

 
 select * from t_party