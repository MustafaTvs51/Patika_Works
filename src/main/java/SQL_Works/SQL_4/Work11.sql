------------------------------------------------------WORK 11-----------------------------------------------------------
(
SELECT first_name FROM actor
)
UNION
(
SELECT first_name FROM customer
ORDER BY first_name;
)
--------------------------------------------------
(
SELECT first_name FROM actor
)
INTERSECT
(
SELECT first_name FROM customer
ORDER BY first_name;
)
--------------------------------------------------
(
SELECT first_name
FROM actor
)
EXCEPT
(
SELECT first_name
FROM customer
ORDER BY first_name;
)
--------------------------------------------------
--1. Kesişen veriler (İki tabloda da bulunan first_name verileri)
(
SELECT first_name FROM actor
)
INTERSECT
(
SELECT first_name
FROM customer
ORDER BY first_name;
)
--------------------------------------------------
--İlk tabloda bulunan ancak ikinci tabloda bulunmayan veriler (Sadece actor tablosunda bulunan first_name verileri)
(
SELECT first_name FROM actor
)
EXCEPT
(
SELECT first_name
FROM customer
ORDER BY first_name;
)
--------------------------------------------------
--İlk tabloda bulunan ancak ikinci tabloda bulunmayan veriler, tekrar eden verilerle (Sadece actor tablosunda bulunan, tekrarlayan first_name değerleri)
SELECT a.first_name FROM actor a
LEFT JOIN customer c ON a.first_name = c.first_name
WHERE c.first_name IS NULL
ORDER BY a.first_name;
