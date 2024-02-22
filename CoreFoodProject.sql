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