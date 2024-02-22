# FoodPlaza
It is a console based Project in which all data is stored in database using JDBC connection.
some CRUD operation have been performed in this project

Following is the code of table in which information is stored :-
create database foodplaza;
use foodplaza;
alter table food  modify foodId INT  AUTO_INCREMENT Primary key;
CREATE TABLE food (
    foodId INT,
    foodName VARCHAR(50),
    foodType VARCHAR(50),
    foodCategory VARCHAR(50),
    foodDesc VARCHAR(50),
    foodPrice DOUBLE(8 , 2 ),
    image BLOB
);
DESC food;
select * from food;
