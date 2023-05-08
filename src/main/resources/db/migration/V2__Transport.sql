create table TRANSPORT(
    IdTransport int primary key AUTO_INCREMENT,
    userId int,
    anulProducerii int not null,
    pret numeric(8,2) not null,
    kilometraj int not null,
    marka varchar(20) not null,
    model varchar(20) not null,
    cutiaViteza varchar(20) not null,
    combustibil varchar(15) not null,
    FOREIGN KEY (userId) REFERENCES REGISTRATION_USERS(id)
);