/*
Data Manipulation Language (DML) 
The Data Manipulation Language is the sublanguage responsible for adding, 
editing or deleting data from a database. In SQL, this corresponds to the INSERT, UPDATE, and DELETE
*/

--Changing the values for a row after it's already been inserted 

UPDATE PAYMENT
SET AMOUNT = 5.99
WHERE PAMENT_ID = 5;

--Removing a row from the Rental table 

DELETE FROM RENTAL WHERE RENTAL_ID = 1; --We have to becarefull while using where clause or it might delete entire table
--SOMETIMES IF WE DELETE SOMETIHNG WRONG WE CAN GET IT BACK BY USING
ROLLBACK;
--BUT IF IT IS COMMITED ALREADY IT CAN NOT COME BACK 
COMMIT;

--Creating a rows in the Actor city table 
INSERT INTO ACTOR VALUES (201, 'CHUCK', 'NORRIS', '1997-02-24'); --WITH PRIMARY KEY
INSERT INTO ACTOR(FIRST_NAME, LAST_NAME) VALUES ('BRUCE', 'LEE'); --NO PRIMARY KEY(primary key is auto incremented)
INSERT INTO CITY(CITY, COUNTRY_ID) VALUES ('CHARLOTTE', 103); --COUNTRY_ID IS FOREIGN ID

--SOME USEFUL LINKS 
--INSERT: https://dev.mysql.com/doc/refman/8.0/en/insert.html 
--UPDATE: https://dev.mysql.com/doc/refman/8.0/en/update.html
