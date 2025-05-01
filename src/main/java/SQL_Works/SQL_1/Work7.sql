SELECT rating, COUNT(*)  FROM film
GROUP BY rating
ORDER BY rating ASC;
-----------------------------------
SELECT replacement_cost, COUNT(*) AS film_sayısı FROM film
GROUP BY replacement_cost
HAVING COUNT(*) > 50
ORDER BY film_count DESC;
-----------------------------------
SELECT store_id, COUNT(*) FROM customer
GROUP BY store_id
ORDER BY customer_count DESC;
-----------------------------------
SELECT country_id, COUNT(*)  FROM city
GROUP BY country_id
ORDER BY city_count DESC
LIMIT 1;
-----------------------------------
