CREATE TABLE Users( 
uid int(20) NOT NULL AUTO_INCREMENT, 
uname VARCHAR(60) NOT NULL, 
password VARCHAR(60) NOT NULL, 
PRIMARY KEY(uid));


CREATE TABLE hurling (
  hurling_id INT NOT NULL,
  hurling_ex VARCHAR(200) NOT NULL,
  PRIMARY KEY (hurling_id),
  UNIQUE (hurling_ex)
);