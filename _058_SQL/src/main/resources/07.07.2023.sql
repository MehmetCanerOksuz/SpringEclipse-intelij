-- SQL  ( INNER JOIN, LEFT JOIN

SELECT * FROM customers;

SELECT * FROM orders;

SELECT * FROM shippings;


-- SELECT kolonlar
-- FROM tablo1_A
-- join tablo2_B
-- on sart

--  JOIN ==>> butun kolonlari dahil etti..
SELECT * FROM customers JOIN orders ON customers.customer_id = orders.customer_id;

-- join ile inner join ayni...
SELECT * FROM customers
INNER JOIN orders
ON customers.customer_id = orders.customer_id;


SELECT customers.customer_id, customers.first_name,customers.last_name, orders.item,orders.amount,orders.customer_id
FROM customers
INNER JOIN orders
ON customers.customer_id = orders.customer_id;

--LAKAP verip kodu kisalttik..
SELECT c.customer_id, c.first_name,c.last_name, o.item,o.amount,o.customer_id
FROM customers AS c
INNER JOIN orders AS o
ON c.customer_id = o.customer_id;

-- BU da AS siz yazımı..
SELECT c.customer_id, c.first_name,c.last_name, o.item,o.amount,o.customer_id
FROM customers c
INNER JOIN orders o
 ON c.customer_id = o.customer_id;

--LEFT JOIN sol tarafin tamamini dahil ediyor..
SELECT c.customer_id, c.first_name,c.last_name, o.item,o.amount,o.customer_id
FROM customers c
LEFT JOIN orders o
ON c.customer_id = o.customer_id;

--RIGHT JOIN sol tarafin tamamini dahil ediyor..
SELECT c.customer_id, c.first_name,c.last_name, o.item,o.amount,o.customer_id
FROM customers c
RIGHT JOIN orders o
ON c.customer_id = o.customer_id;


SELECT c.customer_id, c.first_name,c.last_name, o.item,o.amount,o.customer_id
FROM customers c
RIGHT JOIN orders o
ON c.customer_id = o.customer_id
WHERE o.amount >300;


SELECT c.customer_id, c.first_name,c.last_name, o.item,o.amount,o.customer_id
FROM customers c
LEFT JOIN orders o
ON c.customer_id = o.customer_id
WHERE o.amount >300;


SELECT c.customer_id, c.first_name,c.last_name, o.item,o.amount,o.customer_id
FROM customers c
FULL OUTER JOIN orders o
ON c.customer_id = o.customer_id


