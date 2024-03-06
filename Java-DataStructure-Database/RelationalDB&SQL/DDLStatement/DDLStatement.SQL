/*
DDL Statement 
    Data definition language in sql for creating, altering, and dropping tables.

    CREATE TABLE Statement: 
    CREATE TABLE is a statement that is used to create tables to store data. 
    we can define integrity constraints such as primary key, unique key, and foreign key for columns while creating table 
    The integrity constraints can be defined at the column level or table level 

    Syntax: 
            CREATE TABLE HERO(
                HERO_ID SMALLINT AUTO_INCREMENT,
                HERO_NAME VARCHAR(45), -- FOR STRING 
                HIT_POINTS SMALLINT,
                ATTACK SMALLINT,
                DEFENSE SMALLINT,
                PRIMARY KEY (HERO_ID)
            );

    ALTER TABLE Statement: 
    ALTER TABLE is a statement used to add, delete, or modify columns in an existing table. 
    We can also use ALTER TABLE statement to add and drop various constraints on an existing table 

    Syntax: 
            ALTER TABLE HERO
            ADD COLUMN MAGIC_POINTS SMALLINT;

            ALTER TABLE HERO 
            RENAME COLUMN MAGIC_POINTS TO MANA_POINTS;
    
    DROP TABLE STATEMENT: 
    DROP TABLE is a statement that is used to remove a table definition and all the data, indexes, triggers
    constraints and permission specification for that table 

    Syntax: 
            DROP TABLE HERO;    -- MAINLY USED FOR TESTING PURPOSE 

CONSTRAINTS (used to apply rules to column):
Constraints are used to specify rules for the data in a table. You can use them to limit the type of data that 
goes into a table. This allows you to remove the accuracy and reliability of the data in the table.
Any violation between the constraint and the data will abort action.
Constraints that can be applied to columns when creating and altering tables are unique, not null e.t.c

e.g CREATE TABLE HERO (
       HERO_ID SMALLINT AUTO_INCREMENT,
       HERO_NAME VARCHAR(45) NOT NULL UNIQUE,
       HIT_POINTS SMALLINT CHECK (HIT_POINTS > 0),
       ATTACK SMALLINT,
       DEFENSE SMALLINT,
       CUSTOMER_ID SMALLINT UNSIGNED NOT NULL,
       PRIMARY KEY(HERO_ID),
       FOREIGN KEY (CUSTOMER_ID) REFERENCES CUSTOMER(CUSTOMER_ID)  -- ADDING FOREIGN KEY DOES NOT ADD COLUMN
);

INSERT INTO HERO(HERO_NAME, HIT_POINTS, ATTACK, DEFENSE, CUSTOMER_ID)
VALUES('DAN', 100, 200, 300, 1);

-- REFERENTIAL INTEGRITY 
DELETE FROM COUNTRY WHERE COUNTRY_ID = 1; -- CANNOT DELETE A PARENT ROW BECAUSE OTHER CITY ARE RELATED TO COUNTRY
                
*/

-- Making sure a Hero-Name is always given a value and that value can-not be duplicated.
-- Apply foreign key to cutomer_id 

CREATE TABLE HERO (
    HERO_ID  SMALLINT AUTO_INCREMENT,
    HERO_NAME VARCHAR(45) NOT NULL UNIQUE,
    HIT_POINTS SMALLINT,
    ATTACK SMALLINT,
    DEFENSE SMALLINT,
    PRIMARY KEY (HERO_ID),
    FOREIGN KEY (CUSTOMER_ID) REFERENCES CUSTOMER(CUSTOMER_ID)
);

-- Update hero table and create a new column called Mana_points 
ALTER TABLE HERO 
ADD COLUMN MANA_POINTS SMALLINT;

-- Remove the Hero table from database 
DROP TABLE HERO;

-- Some useful links: 
-- Create:      https://dev.mysql.com/doc/refman/8.0/en/create-table.html
-- Alter:       https://dev.mysql.com/doc/refman/8.0/en/alter-table.html
-- Drop:        https://dev.mysql.com/doc/refman/8.0/en/drop-table.html
-- Constraints: https://dev.mysql.com/doc/refman/8.0/en/constraints.html