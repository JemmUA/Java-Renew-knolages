CREATE TABLE car_infos (
        id serial CONSTRAINT cars_pk PRIMARY KEY;
        name VARCHAR(255),
        surname VARCHAR (255),
        gender VARCHAR (12),
        car_id INT,
        city VARCHAR(55),
        country VARCHAR(55),
        date TIMESTAMP;
        about TEXT
);
