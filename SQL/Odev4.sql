--Aşağıdaki sorgu senaryolarını dvdrental örnek veri tabanı üzerinden gerçekleştiriniz.

--film tablosunda bulunan replacement_cost sütununda bulunan birbirinden farklı değerleri sıralayınız.
Select DISTINCT replacement_cost from film;

--film tablosunda bulunan replacement_cost sütununda birbirinden farklı kaç tane veri vardır?
Select COUNT (DISTINCT replacement_cost) from film;

--film tablosunda bulunan film isimlerinde (title) kaç tanesini T karakteri ile başlar ve aynı zamanda rating 'G' ye eşittir?
Select Count(*) from film Where title LIKE 'T%' and rating = 'G';

--country tablosunda bulunan ülke isimlerinden (country) kaç tanesi 5 karakterden oluşmaktadır?
Select COUNT (*) From Country where country LIKE '_____' ;

--city tablosundaki şehir isimlerinin kaç tanesi 'R' veya r karakteri ile biter?
Select COUNT (*) from city where city LIKE '%R' or '%r';
