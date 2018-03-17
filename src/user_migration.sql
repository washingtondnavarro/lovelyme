USE lovelyme_db;


DROP TABLE if EXISTS users;


 CREATE TABLE IF NOT EXISTS users(
 id int UNSIGNED  NOT NULL auto_increment,
 email VARCHAR (50) NOT NULL ,
name CHAR (50) NOT NULL ,
last_name CHAR (50) NOT NULL,
password CHAR (50) NOT NULL,
street CHAR (150) NOT NULL,
city CHAR (50) NOT NULL,
zip_code INT UNSIGNED NOT NULL,
phone INT UNSIGNED NOT NULL,
sizetop NOT NULL,
sizebottom NOT NULL,
bithday DATE not NULL,
PRIMARY KEY (id)
 );