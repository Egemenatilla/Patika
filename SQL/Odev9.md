
1)city tablosu ile country tablosunda bulunan şehir (city) ve ülke (country) isimlerini birlikte görebileceğimiz INNER JOIN sorgusunu yazınız.
  
  Select country,city from city
  inner join on country city.country_id = country.country_id

2)customer tablosu ile payment tablosunda bulunan payment_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz INNER JOIN sorgusunu yazınız.
  
  select payment.payment_id, customer.first_name, customer.last_name from customer
  inner join on payment customer.customer_id = payment.customer_id

3)customer tablosu ile rental tablosunda bulunan rental_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz INNER JOIN sorgusunu yazınız.
  
  select customer.first_name, customer.last_name, rental.rental_id from customer
  inner join rental on rental.customer_id = customer.customer_id;
