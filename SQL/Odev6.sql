--Aşağıdaki sorgu senaryolarını dvdrental örnek veri tabanı üzerinden gerçekleştiriniz.

--film tablosunda bulunan rental_rate sütunundaki değerlerin ortalaması nedir?
Select AVG(rental_rate) from film;

--film tablosunda bulunan filmlerden kaç tanesi 'C' karakteri ile başlar?
Select COUNT(title) from film WHERE title LIKE 'C%';

--film tablosunda bulunan filmlerden rental_rate değeri 0.99 a eşit olan en uzun (length) film kaç dakikadır?
Select MAX(length) from film Where rental_rate = 0.99 ;

--film tablosunda bulunan filmlerin uzunluğu 150 dakikadan büyük olanlarına ait kaç farklı replacement_cost değeri vardır?
Select COUNT(DISTINCT replacement_cost) FROM film Where Length > 150;
