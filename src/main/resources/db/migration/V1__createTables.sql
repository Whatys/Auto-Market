CREATE TABLE USERS(
    id int PRIMARY KEY AUTO_INCREMENT,
    firstName varchar(100) NOT NULL ,
    lastName varchar(100) not null,
    email varchar(50) not null,
    age int not null);

create table TRANSPORT(
      IdTransport int primary key AUTO_INCREMENT,
      userId int,
      anulProducerii int not null,
      pret numeric(8,2) not null,
      kilometraj int not null,
      marka varchar(20) not null,
      model varchar(20) not null,
      cutiaViteza varchar(20) not null);