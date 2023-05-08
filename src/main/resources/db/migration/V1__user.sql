CREATE TABLE REGISTRATION_USERS(
    id int PRIMARY KEY AUTO_INCREMENT,
    username varchar(25),
    first_name varchar(100) NOT NULL ,
    last_name varchar(100) not null,
    email varchar(50) not null,
    age int not null
    );