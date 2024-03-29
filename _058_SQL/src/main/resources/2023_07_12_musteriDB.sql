SELECT * FROM tblmusteri;

SELECT * FROM tblurun;

SELECT * FROM tbliletisim;

SELECT * FROM tblsatis;

SELECT * FROM tblsepet;

SELECT * FROM tblmusteri
WHERE ad = 'Tommy';

SELECT * FROM tblsatis
WHERE musteriid = 150;

SELECT * FROM tblsatis
WHERE musteriid IN(200, 250, 300, 350);

SELECT * FROM tblsepet
WHERE satisid =648;

SELECT * FROM tblsepet
WHERE satisid =649;

SELECT * FROM tblsepet
WHERE satisid IN(50,100,150,200,250,300,350,400,450,500);

SELECT * FROM tblurun
WHERE id =100;

SELECT * FROM tblurun
WHERE id IN(100,150,200,250);

SELECT * FROM tblmusteri
JOIN tblsatis
ON tblmusteri.id = tblsatis.musteriid;

SELECT mus.ad, mus.soyadi, sts.satistarihi FROM tblmusteri mus
JOIN tblsatis sts
ON mus.id = sts.musteriid;

SELECT mus.ad, mus.soyadi, sts.satistarihi, spt.adet FROM tblmusteri mus
JOIN tblsatis sts ON mus.id = sts.musteriid
JOIN tblsepet spt ON sts.id=spt.satisid;

SELECT mus.ad, mus.soyadi, sts.satistarihi, spt.adet, urn.ad
FROM tblmusteri mus
JOIN tblsatis sts ON mus.id = sts.musteriid
JOIN tblsepet spt ON sts.id=spt.satisid
JOIN tblurun urn ON spt.urunid=urn.id;

SELECT mus.ad, mus.soyadi, sts.satistarihi, spt.adet, urn.ad
FROM tblmusteri mus
JOIN tblsatis sts ON mus.id = sts.musteriid
JOIN tblsepet spt ON sts.id=spt.satisid
JOIN tblurun urn ON spt.urunid=urn.id
WHERE mus.ad ='Tamara';

SELECT mus.ad, count(*)
FROM tblmusteri mus
JOIN tblsatis sts ON mus.id = sts.musteriid
JOIN tblsepet spt ON sts.id=spt.satisid
JOIN tblurun urn ON spt.urunid=urn.id
GROUP BY mus.ad
HAVING mus.ad = 'Tamara';

SELECT mus.ad, count(*)
FROM tblmusteri mus
JOIN tblsatis sts ON mus.id = sts.musteriid
JOIN tblsepet spt ON sts.id=spt.satisid
JOIN tblurun urn ON spt.urunid=urn.id
GROUP BY mus.ad;

SELECT urn.ad,count(urn.ad) ,sum(spt.adet)
FROM tblmusteri mus
JOIN tblsatis sts ON mus.id = sts.musteriid
JOIN tblsepet spt ON sts.id=spt.satisid
JOIN tblurun urn ON spt.urunid=urn.id
WHERE mus.ad ='Kendal'
group by urn.ad;

SELECT urn.ad,count(urn.ad)
FROM tblmusteri mus
JOIN tblsatis sts ON mus.id = sts.musteriid
JOIN tblsepet spt ON sts.id=spt.satisid
JOIN tblurun urn ON spt.urunid=urn.id
group by urn.ad
HAVING count(urn.ad) >10;

SELECT urn.ad,count(urn.ad)
FROM tblmusteri mus
JOIN tblsatis sts ON mus.id = sts.musteriid
JOIN tblsepet spt ON sts.id=spt.satisid
JOIN tblurun urn ON spt.urunid=urn.id
group by urn.ad
HAVING count(urn.ad) >10
order by count(urn.ad) DESC;

SELECT urn.ad,count(urn.ad)
FROM tblmusteri mus
JOIN tblsatis sts ON mus.id = sts.musteriid
JOIN tblsepet spt ON sts.id=spt.satisid
JOIN tblurun urn ON spt.urunid=urn.id
group by urn.ad
HAVING count(urn.ad) >10
order by urn.ad;

SELECT urn.ad,count(urn.ad)
FROM tblmusteri mus
JOIN tblsatis sts ON mus.id = sts.musteriid
JOIN tblsepet spt ON sts.id=spt.satisid
JOIN tblurun urn ON spt.urunid=urn.id
group by urn.ad
HAVING count(urn.ad) >10
order by urn.ad
LIMIT 3;

SELECT *
FROM tblmusteri mus
LEFT JOIN tblsatis sts ON mus.id = sts.musteriid
RIGHT JOIN tblsepet spt ON sts.id=spt.satisid
LEFT JOIN tblurun urn ON spt.urunid=urn.id;

SELECT mus.id, mus.ad, urn.id, urn.ad, sts.id,sts.odemesekli
FROM tblmusteri mus
LEFT JOIN tblsatis sts ON mus.id = sts.musteriid
RIGHT JOIN tblsepet spt ON sts.id=spt.satisid
LEFT JOIN tblurun urn ON spt.urunid=urn.id;

CREATE VIEW musteriurunsatis2 AS
SELECT mus.id as mus_id, mus.ad as mus_ad, urn.id as urn_id, urn.ad as urn_ad, sts.id as sts_id,sts.odemesekli
FROM tblmusteri mus
LEFT JOIN tblsatis sts ON mus.id = sts.musteriid
RIGHT JOIN tblsepet spt ON sts.id=spt.satisid
LEFT JOIN tblurun urn ON spt.urunid=urn.id;

SELECT * FROM musteriurunsatis2;

SELECT * FROM musteriurunsatis2
WHERE mus_ad ='Lyndel';





SELECT 10+3;
SELECT NOW();


DO $$
    BEGIN

        FOR sayac in 1..10 LOOP
                RAISE NOTICE 'Sonuc : %', sayac;
            END LOOP;
    END $$;


-- mimar hoca ile beraber musteriDB için yapıldı..
DO $$
    BEGIN

        FOR sayac in 1..10 LOOP
                RAISE NOTICE 'Sonuc : %', sayac;
                --INSERT INTO tblurun (ad, fiyat) VALUES (CONCAT('deneme',sayac),500);
            END LOOP;
    END $$;


SELECT * FROM tblmusteri WHERE aciklama = 'fbibeyrr@cnbc.com';

CREATE INDEX index_tblmusteri_aciklama ON tblmusteri(aciklama);

SELECT * FROM tblmusteri WHERE aciklama = 'fbibeyrr@cnbc.com';

DROP INDEX index_tblmusteri_aciklama;

EXPLAIN SELECT * FROM tblmusteri WHERE aciklama = 'fbibeyrr@cnbc.com';

