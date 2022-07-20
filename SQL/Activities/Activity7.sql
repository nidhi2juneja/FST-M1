select SUM(purchase_amount) AS "SUM_PURCHASEAMOUNT" from orders;

select AVG(purchase_amount) AS "AVG_PURCHASEAMOUNT" from orders;

select MAX(purchase_amount) AS "MAX_PURCHASEAMOUNT" from orders;

select MIN(purchase_amount) AS "MIN_PURCHASEAMOUNT" from orders;

select COUNT(distinct salesman_id) AS "COUNT" from orders;