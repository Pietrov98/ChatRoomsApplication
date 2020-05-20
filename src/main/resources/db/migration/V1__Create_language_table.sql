create table ROOMS (
    ID int unsigned primary key auto_increment,
    roomName varchar(100) not null,
    password varchar(100) not null,
    currentusersnumber int unsigned not null,
    maxusersnumber int unsigned not null
);

insert into ROOMS (roomName, password, currentusersnumber, maxusersnumber) values ('Hello', 'en', 3, 5);
insert into ROOMS (roomName, password, currentusersnumber, maxusersnumber) values ('Siema', 'pl', 2, 10);

