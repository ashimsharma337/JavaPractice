--Quering and Filtering 

/*
Select Statement 
       The select statement is  the most commonly used data manipulation language command.
       It returns a result of records form one or more tables.

       SELECT columnname FROM table;
       SELECT * FROM table;  * select all 
WHERE clause 
       A where clause specifies that SQL Data Manipulation Language statement should only affect rows that meet 
       specified criteria. The where clause is used to extract only those result form a SQL statement such as 
       SELECT, INSERT, UPDATE, DELETE  statement

       SELECT * 
       FROM COUNTRY 
       WHERE country_id="2";  

Comparison operator 
       Comparison(or relational) operators are mathematical symbols used to compare two values. 
       They are used in conditions that compare one expression with another. The result of a 
       comparision can be TRUE, FALSE or UNKNOWN
       
       SELECT * 
       FROM FILM
       WHERE RENTAL_RATE < 1.00;

       WE CAN ALSO USE >, =>, >=, =, != 

BETWEEN OPERATOR 
      The BETWEEN operator allows you to select values within a specified range. These values can be numbers, text
      or dates. The BETWEEN operator is **inclusive** begining and end values are included. 
                 We can use where clause and comparison operator for the value in specific range. But SQL gave us 
                 BETWEEN Operator 

      SELECT * 
      FROM PAYMENT 
      WHERE AMOUNT BETWEEN 0.99 AND 2.99;
            FOR DATE YEAR/MONTH/DAY
LIKE Operator
     The LIKE operator determines if a character string matches a specified pattern. The pattern may include regular
     characters and wildcard characters. Use the LIKE operator in the where clause of the SELECT, UPDATE, AND DELETE
     statement to filter rows based on pattern matching.

     SELECT *
     FROM CUSTOMER 
     WHERE FIRST_NAME 
     LIKE 'A%';   
     ('A%') WILD CARD FOR NAME BEGINING WITH A
     ('%Z%') CONTAINS Z 
     'MAR_' ; START WITH MAR HAS 4 CHARACTER 
*/

--Retrieve all actor's first name and last name 
SELECT FIRST_NAME, LAST_NAME 
FROM ACTOR;

--Find customers whose first name begins with the letter A 
SELECT *
FROM CUSTOMER 
WHERE FIRST_NAME LIKE 'A%';

--Contains the letter z 
SELECT *
FROM CUSTOMER 
WHERE FIRST_NAME LIKE '%Z%';

--Begins with MAR and is 4 letters 
SELECT *
FROM CUSTOMER 
WHERE FIRST_NAME LIKE 'MAR_';

--Payments made from Feb 15, 2005 to Feb 15, 2006 
SELECT * 
FROM PAYMENT 
WHERE PAYMENT_DATE 
BETWEEN '2005-02-15' AND '2006-02-15'

--Some useful Links 
-- SELECT: https://dev.mysql.com/doc/refman/8.0/en/select.html
-- COMPARISON-OPERATOR: https://dev.mysql.com/doc/refman/8.0/en/comparison-operators.html
