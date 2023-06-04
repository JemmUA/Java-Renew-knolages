CREATE TABLE car_shop.cars (
  id serial CONSTRAINT cars_pk PRIMARY KEY,
  model VARCHAR(55),
  vin_code VARCHAR(32),
  type VARCHAR(25),
  car_info_id INT UNIQUE
);