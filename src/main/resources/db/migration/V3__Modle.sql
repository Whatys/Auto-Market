create table MODELE(
    IdModel int PRIMARY KEY AUTO_INCREMENT,
    IdTransport int ,
    marka varchar(20) not null,
    FOREIGN KEY (IdTransport) REFERENCES TRANSPORT(IdTransport)
);