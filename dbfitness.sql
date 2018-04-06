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


INSERT INTO hurling 
    (hurling_id, hurling_ex) 
VALUES 
    (1,"Press Ups, 4 sets of 10"),
    (2,"Sit ups, 5 sets of 10"),
    (3,"Box Jumps, 5 sets of 5"),
	(4,"Burpees, 4 sets of 10"),
	(5,"Lunges, 5 sets of 5"),
	(6,"Plank, Hold for 60 seconds");

	
CREATE TABLE football (
  football_id INT NOT NULL,
  football_ex VARCHAR(200) NOT NULL,
  PRIMARY KEY (football_id),
  UNIQUE (football_ex)
);



INSERT INTO football 
    (football_id, football_ex) 
VALUES 
    (1,"Press Ups, 4 sets of 10"),
    (2,"Sit ups, 5 sets of 10"),
    (3,"Ten Metre Sprints, 5 sets of 5"),
	(4,"Burpees, 4 sets of 10"),
	(5,"Spiderman Crawl, 5 sets of 5"),
	(6,"Russian Twist, Hold for 60 seconds");
	
	
	CREATE TABLE rugby (
  rugby_id INT NOT NULL,
  rugby_ex VARCHAR(200) NOT NULL,
  PRIMARY KEY (rugby_id),
  UNIQUE (rugby_ex)
);


INSERT INTO rugby 
    (rugby_id, rugby_ex) 
VALUES 
    (1,"Press Ups, 4 sets of 10"),
    (2,"Chin Ups, 5 sets of 10"),
    (3,"Dumbbell Split Squats, 5 sets of 5"),
	(4,"Burpees, 4 sets of 10"),
	(5,"Prone Leg Curl, 5 sets of 5"),
	(6,"Russian Twist, 4 sets of 4");