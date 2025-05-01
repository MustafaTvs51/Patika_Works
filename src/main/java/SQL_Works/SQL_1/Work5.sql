SELECT title ,length FROM film
WHERE title ILIKE '%n'
ORDER BY length DESC
LIMIT 5;
------------------------------------
SELECT title ,length FROM film
WHERE title ILIKE '%n'
ORDER BY length ASC
OFFSET 5
LIMIT 5;
-------------------------------------
SELECT  last_name FROM costumer
WHERE store_id = 1
ORDER BY last_name DESC
LIMIT 4;
--------------------------------------
