CREATE TABLE car_shop.car_infos (
    id serial CONSTRAINT cars_infos_pk PRIMARY KEY,
    colour varchar(25),
    city varchar(255),
    country varchar(255),
    date TIMESTAMP,
    about TEXT
);
