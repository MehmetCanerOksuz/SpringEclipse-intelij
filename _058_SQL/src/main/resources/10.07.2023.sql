SELECT * FROM kitap;

SELECT * FROM uye;

SELECT * FROM tur;

SELECT * FROM yazar;

SELECT * FROM odunc;

SELECT *
FROM kitap
JOIN yazar
on kitap.yazar_id= yazar.yazar_id;

SELECT kitap.kitap_id, kitap.kitap_adi, yazar.kitap_yazari, yazar.yazar_id
FROM kitap
JOIN yazar
ON kitap.yazar_id= yazar.yazar_id;

-- inner join ile join aynıdır..
SELECT kitap.kitap_id, kitap.kitap_adi, yazar.kitap_yazari, yazar.yazar_id
FROM kitap
INNER  JOIN yazar
ON kitap.yazar_id= yazar.yazar_id;

--lakaplı olarak yazdırdık.. (AS)
SELECT k.kitap_id, k.kitap_adi, y.kitap_yazari, y.yazar_id
FROM kitap AS k
INNER  JOIN yazar AS y
ON k.yazar_id= y.yazar_id;

-- AS kullanmadan lakaplı yaptık.
SELECT k.kitap_id, k.kitap_adi, y.kitap_yazari, y.yazar_id
FROM kitap k
INNER JOIN yazar AS y
ON k.yazar_id= y.yazar_id;


SELECT k.kitap_id, k.kitap_adi, y.kitap_yazari, y.yazar_id
FROM kitap k
LEFT JOIN yazar AS y
ON k.yazar_id= y.yazar_id;

SELECT k.kitap_id, k.kitap_adi, y.kitap_yazari, y.yazar_id
FROM kitap k
RIGHT JOIN yazar AS y
ON k.yazar_id= y.yazar_id;


SELECT k.kitap_id, k.kitap_adi, y.kitap_yazari, y.yazar_id
FROM kitap k
FULL OUTER JOIN yazar AS y
ON k.yazar_id= y.yazar_id;


SELECT uye_isim AS "kisi ismi" FROM uye
UNION
SELECT kitap_yazari FROM yazar ;

SELECT * FROM kitap
WHERE kitap_id = 3;

SELECT * FROM yazar
WHERE yazar_id =5;

SELECT * FROM kitap
WHERE yazar_id = (
    SELECT yazar_id FROM yazar WHERE kitap_yazari='Aleksandr Puşkin'
    );

SELECT * FROM kitap
WHERE yazar_id IN (
    SELECT yazar_id FROM yazar
    WHERE kitap_yazari LIKE '%a%'
);

SELECT * FROM uye;

SELECT * FROM uye WHERE cinsiyet = true;

SELECT * FROM uye WHERE cinsiyet != true;

SELECT * FROM uye WHERE cinsiyet <>true;

SELECT * FROM uye WHERE NOT cinsiyet = true;

SELECT COUNT(*) FROM kitap;

SELECT COUNT(*) FROM uye;

SELECT kitap_id, kitap_adi, yayin_tarihi FROM kitap;

SELECT kitap_id, kitap_adi, yayin_tarihi FROM kitap
WHERE yayin_tarihi ='1925-04-04';

SELECT kitap_id, kitap_adi, yayin_tarihi FROM kitap
WHERE yayin_tarihi >'1925-04-04';

SELECT * FROM kitap
LIMIT 2;

SELECT * FROM uye
LIMIT 2;

SELECT * FROM uye
ORDER BY uye_isim;

SELECT * FROM uye
ORDER BY uye_isim DESC ;

SELECT * FROM uye;

SELECT * FROM uye
WHERE uye_isim LIKE '%r';

SELECT * FROM uye
WHERE uye_isim LIKE '%a_';

SELECT * FROM uye
WHERE uye_isim LIKE '%ra_';

SELECT * FROM uye
WHERE uye_isim LIKE '%a__';

SELECT * FROM odunc;

SELECT * FROM odunc
JOIN kitap
ON odunc.kitap_id = kitap.kitap_id;

SELECT k.kitap_adi,k.kitap_adi,o.odunc_tarihi FROM odunc o
JOIN kitap k
ON o.kitap_id = k.kitap_id;


