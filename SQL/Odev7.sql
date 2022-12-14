--Aşağıdaki sorgu senaryolarını dvdrental örnek veri tabanı üzerinden gerçekleştiriniz.

--film tablosunda bulunan filmleri rating değerlerine göre gruplayınız.
Select rating from film Group By rating;

--film tablosunda bulunan filmleri replacement_cost sütununa göre grupladığımızda film sayısı 50 den fazla olan replacement_cost değerini ve karşılık gelen film sayısını 
--sıralayınız.
Select replacement_cost, Count(*) from film Group By replacement_cost HAVING COUNT(replacement_cost) > 50;

--3. customer tablosunda bulunan store_id değerlerine karşılık gelen müşteri sayılarını nelerdir? 4. city tablosunda bulunan şehir verilerini country_id sütununa göre 
--gruplandırdıktan sonra en fazla şehir sayısı barındıran country_id bilgisini ve şehir sayısını paylaşınız.
Select country_id, COUNT(*) from city Group By country_id Order By COUNT(*) DESC LIMIT 1;
