/*
An SQL JOIN clause is used to combine rows from two or more tables, based on a common field between them.
OR, A JOIN Clause is used to combine rows form two or more tables, based on a related column between them.

CARTESIAN JOIN: 
returns the Cartesian product of the sets of records from the two or more joined tables.
        Also known as CROSS JOIN-- when there is no realtionship defined between the two tables, 
        use the cartesian product to return all the rows in all the tables listed in the query.
        Each row in the first table is paired with all the rows in the second table. 
        query: 
        SELECT * FROM FILM CROSS JOIN ACTOR;
        SELECT * FROM FILM, ACTOR;

        COUNT TELLS US THAT HOW MANY ROWS ARE RETURNED FORM A QUERY 
        SELECT COUNT(*) FROM FILM;
        SELECT COUNT(*) FORM ACTOR;

        NUMBER OF RECORDS IN ONE TABLE TIMES NUMBER OF RECORDS ON ANOTHER TABLE 
        SELECT COUNT(*) FROM FILM, ACTOR;
        SELECT COUNT(*) FROM FILM CROSS JOIN ACTOR;

INNER JOIN: 
returns rows when there is a match in both tables.
        The INNERJOIN is a keyword that selects all rows from both the tables as long as the condition satisfies.
        This keyword will create the result set by combining all rows from both the tables where the condition 
        satisfies, i.e value of the common field will be same.

        Syntax:
        SELECT * FROM CITY 
        INNER JOIN COUNTRY 
        ON CITY.COUNTRY_ID = COUNTRY.COUNTRY_ID;

        SELECT * 
        FROM TABLE1 
        INNER JOIN TABLE2 
        ON TABLE1.<primanry-key> = TABLE2.<foreign-key>;
       
        ON clause is used to specify primary key and foreign key relation.
        Primary key is matched with foreign key 

        SELECT * 
        FROM CITY 
        INNER JOIN COUNTRY 
        ON CITY.COUNTRY_ID = COUNTRY.COUNTRY_ID;

        We can use any number of join we want 
        SELECT * 
        FROM ADDRESS 
        INNER JOIN CITY 
        ON CITY.CITY_ID = ADDRESS.CITY_ID
        INNER JOIN COUNTRY 
        ON CITY.COUNTRY_ID = COUNTRY.COUNTRY_ID;



OUTER JOIN: 
Outer joins is uses LEFT and RIGHT joins for finding rows that do not have a related record in another table 
    LEFT JOIN: 
    returns all rows from the left table, even if there are no matches in the right table.
        The LEFT JOIN starts selecting data from the table and matching with rows from the right table.
        The LEFT JOIN returns a result set that includes all rows in the left table,
        whether or not they have matching rows from the right table

        Syntax: 
        SELECT * FROM CUSTOMER 
        LEFT JOIN RENTAL 
        ON CUSTOMER.CUSTOMER_ID = RENTAL.CUSTOMER_ID;

        IF THERE IS NO RENTAL NULL VALUE WILL BE ADDED 
        
        e.g 
        SELECT * 
        FROM CUSTOMER 
        LEFT JOIN RENTAL 
        ON CUSTOMER.CUSTOMER_ID = RENTAL.CUSTOMER_ID 
        WHERE CUSTOMER.FIRST_NAME = 'ROCKY';

    RIGHT JOIN: 
    returns all rows from the right table, even if there are no matches in the left table.
        The RIGHT JOIN starts selecting data from the right table.
        The RIGHT JOIN returns a result set that includes all rows in the right table,
        whether or not they have matching rows from the left table.

        SELECT * 
        FROM CUSTOMER 
        RIGHT JOIN RENTAL 
        ON CUSTOMER.CUSTOMER_ID = RENTAL.CUSTOMER_ID 
        WHERE CUSTOMER.FIRST_NAME = 'ROCKY';

    FULL JOIN: 
    combines the results of both left and right outer joins.

The joined table will contain all records from both the tables and fill in NULLs for missing matches on either side.

SELF JOIN: 
joins a table to itself as if the table were two tables, 
temporarily renaming at least one table in the SQL statement.
*/

-- Find the city records and their related country records 
SELECT *
FROM CITY 
INNER JOIN COUNTRY 
ON CITY.COUNTRY_ID = COUNTRY.COUNTRY_ID;

-- Cartesian product between Film and Actor 
SELECT * FROM FILM CROSS JOIN ACTOR;

-- Find the customer who never have rented before 
SELECT * 
FROM CUSTOMER LEFT JOIN RENTAL 
ON CUSTOMER.CUSTOMER_ID = RENTAL.CUSTOMER_ID
WHERE RENTAL.RENTAL_ID IS NULL;