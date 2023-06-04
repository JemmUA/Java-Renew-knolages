CREATE TABLE car_shop.owners (
    id serial CONSTRAINT owners_pk PRIMARY KEY,
    name VARCHAR(55),
    surname VARCHAR (55),
    gender VARCHAR (55),
    car_id INT,
    city VARCHAR(55),
    country VARCHAR(55),
    date TIMESTAMP,
    about TEXT
)