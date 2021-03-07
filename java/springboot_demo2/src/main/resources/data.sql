CREATE TABLE `user` (
   `id` int NOT NULL,
   `password` varchar(255) DEFAULT NULL,
   `username` varchar(255) DEFAULT NULL,
   PRIMARY KEY (`id`)
 ) ENGINE=InnoDB ;

insert into User (id, username, password) values (101, 'user1', 'pwd1');
insert into User (id, username, password) values (102, 'user2', 'pwd2');
insert into User (id, username, password) values (103, 'Mike', 'pwd3');
insert into User (id, username, password) values (104, 'Alice', 'pwd4');
insert into User (id, username, password) values (105, 'Gil', 'pwd5');
insert into User (id, username, password) values (106, 'Heyman', 'pwd6');