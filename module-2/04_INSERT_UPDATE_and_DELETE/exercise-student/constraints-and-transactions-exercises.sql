-- Write queries to return the following:
-- The following changes are applied to the "dvdstore" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.
SELECT * FROM actor;

INSERT INTO actor(first_name, last_name)
VALUES ('HAMPTON','AVENUE'), ('LISA','BYWAY');

-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in
-- ancient Greece", to the film table. The movie was released in 2008 in English.
-- Since its an epic, the run length is 3hrs and 18mins. There are no special
-- features, the film speaks for itself, and doesn't need any gimmicks.
SELECT * FROM film;

INSERT INTO film (title, description, release_year, language_id, length)
VALUES ('EUCLIDEAN PI', 'The epic story of Euclid as a pizza delivery boy in ancient Greece', 2008, (SELECT language_id FROM language WHERE name='English'), 198);

-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.

INSERT INTO film_actor(actor_id, film_id)
VALUES ((SELECT actor_id FROM actor WHERE first_name= 'HAMPTON' AND last_name= 'AVENUE'), (SELECT film_id FROM film WHERE title= 'EUCLIDEAN PI'));
INSERT INTO film_actor(actor_id, film_id)
VALUES ((SELECT actor_id FROM actor WHERE first_name='LISA' AND last_name='BYWAY'), (SELECT film_id FROM film WHERE title='EUCLIDEAN PI'));

-- 4. Add Mathmagical to the category table.
INSERT INTO category(name)
VALUES ('Mathmagical');

-- 5. Assign the Mathmagical category to the following films, "Euclidean PI",
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"
UPDATE film_category SET category_id = (SELECT category_id FROM category WHERE name = 'Mathmagical')
WHERE film_id IN (SELECT film_id FROM film WHERE title IN ('Euclidean PI', 'EGG IGBY', 'KARATE MOON', 'RANDOM GO', 'YOUNG LANGUAGE'));

-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films
-- accordingly.
-- (5 rows affected)
UPDATE film
SET rating = 'G'
WHERE film_id IN
(SELECT film_id
FROM film_category
WHERE category_id = (SELECT category_id FROM category WHERE name='Mathmagical'));

-- 7. Add a copy of "Euclidean PI" to all the stores.
INSERT INTO inventory(film_id, store_id) SELECT (SELECT film_id FROM film WHERE title='EUCLIDEAN PI'), store_id FROM store;

-- 8. The Feds have stepped in and have impounded all copies of the pirated film,
-- "Euclidean PI". The film has been seized from all stores, and needs to be
-- deleted from the film table. Delete "Euclidean PI" from the film table.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>
DELETE FROM film
WHERE title='EUCLIDEAN PI';
	
	-- Fails because film_id column on film_actor is foreign key constraint

-- 9. Delete Mathmagical from the category table.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>
DELETE FROM category
WHERE category_id = (SELECT category_id FROM category WHERE name='Mathmagical');
	
	-- Fails for same reason as above, but category_id column on film_category is foreign key constraint

-- 10. Delete all links to Mathmagical in the film_category tale.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>
DELETE FROM film_category
WHERE category_id = (SELECT category_id FROM category WHERE name='Mathmagical');
	
	-- Succeeds as there are no conflicting constraints

-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI".
-- (Did either deletes succeed? Why?)
-- <YOUR ANSWER HERE>
DELETE FROM category
WHERE category_id = (SELECT category_id FROM category WHERE name='Mathmagical');
	
	-- Succeeds because category_id constraint was removed from file_category
	
DELETE FROM film
WHERE title='EUCLIDEAN PI';
	
	-- Fails because film_id is still foreign key constraint on film_actor table

-- 12. Check database metadata to determine all constraints of the film id, and
-- describe any remaining adjustments needed before the film "Euclidean PI" can
-- be removed from the film table.

DELETE FROM film_actor
WHERE film_actor.film_id = (SELECT film_id FROM film WHERE title='EUCLIDEAN PI');

DELETE FROM film_category
WHERE film_category.film_id = (SELECT film_id FROM film WHERE title='EUCLIDEAN PI');

DELETE FROM inventory
WHERE inventory.film_id = (SELECT film_id FROM film WHERE title='EUCLIDEAN PI');

DELETE FROM film
WHERE film.title = 'EUCLIDEAN PI';

-- film_actor table has foreign key constraint on film_id which prevents film from being removed
-- film_category has foreign key constraint on film_id which prevents film from being removed
-- inventory table has similar constraint as above preventing film from being deleted, so all references made to film_id must be removed from film_actor and inventory tables
