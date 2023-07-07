SELECT * FROM customers
WHERE country = 'DE';
select * FROM customers

-- Ulkesi Almanya olmayanlar
SELECT * FROM customers WHERE NOT country = 'DE';

-- Ulkelerin isimlerini tek olarak listeleyelim.
SELECT DISTINCT country FROM customers;


-- yası 25 ten buyuk olanlari goster.

SELECT * FROM customers
WHERE age > 25;

-- Ulkelerin isimlerini unique tek olarak listeleyelim ve sayilarini da gosterelim
SELECT COUNT (DISTINCT country) FROM customers;

-- Alias (lakap takmak)
SELECT customer_id AS cus_id FROM customers;

-- Alias (lakap takmak)
SELECT customer_id AS c_id, first_name AS f_name FROM customers;

-- Alias (lakap takmak)
SELECT customer_id id, first_name f FROM customers;

SELECT c.customer_id , c.first_name FROM customers c;

SELECT CONCAT(first_name, ' ', last_name) AS userName FROM customers;
SELECT CONCAT(first_name, ' ', last_name) userName FROM customers;


-- tabloya yeni bir kayıt ekleyelim.
INSERT INTO customers(first_name, last_name, phone, country, age)
VALUES ('AAA', 'BBB', '111', 'TR', 25)

INSERT INTO customers(first_name, last_name, phone, country, age)
VALUES ('CCC', 'BBB', '111', 'TR', 32),
('DDD', 'BBB', '111', 'TR', 52),
('EEE', 'BBB', '111', 'TR', 25);

--SAKIN BU SEKILDE ID DEGERI BELIRTILMEYEN UPDATE YAPMAYIN..
UPDATE customers
SET age = 34;

-- gunceleme edit update once id degerini belirtmemiz lazim customer_id =6
UPDATE customers
SET age = 28
WHERE customer_id =6;

SELECT * FROM customers
WHERE customer_id =6;

UPDATE customers
SET age = 33
WHERE customer_id =1;

SELECT * FROM customers
WHERE customer_id =1;

-- id degeri 16 dan buyuk olan kisilerin ulke kodlarını Polonya PL yapalım.
UPDATE customers
SET country = 'PL'
WHERE customer_id >16;

SELECT * FROM customers;

--silme isleminde MUTLAKA SILINECEK KAYDIN ID DEGERINI SECINIZ....
-- DELETE * FROM customers; --  SAKINNN!!!!

--id degeri 16 olan kaydi silme.
DELETE FROM customers
WHERE customer_id =16;

SELECT * FROM customers;

--id degeri 17 olan kaydi silme.
DELETE FROM customers
WHERE customer_id =17;

SELECT * FROM customers;

--tabloyu sifirlar...
-- TRUNCATE TABLE customers;


-- A'dan Z'ye siralama icin -  
SELECT * FROM customers
ORDER BY first_name;

--0'dan 9'a gore sıralama..
SELECT * FROM customers
ORDER BY age;

-- birden fazla duruma gore sıralama..
SELECT * FROM customers
ORDER BY country, age  ASC; -- ASC yazmasan da oluyor...



--tersten sıralama.. DESC...

-- Z'dan A'ye siralama icin -  
SELECT * FROM customers
ORDER BY first_name DESC;

--9'dan 0'a gore sıralama..
SELECT * FROM customers
ORDER BY age DESC;

-- birden fazla duruma gore sıralama..
SELECT * FROM customers
ORDER BY country DESC, age  ASC;

-- ULKE ADI (KISI sayısı) GRUPLAMALARDA 1 KOLONU SECİNİZ...
SELECT country, COUNT(*) AS numbers FROM customers
GROUP BY country;

-- grubun sarti HAVING
SELECT country, COUNT(*) AS numbers FROM customers
WHERE age >20
GROUP BY country
HAVING country = 'TR';

SELECT * FROM customers
WHERE country = 'TR';