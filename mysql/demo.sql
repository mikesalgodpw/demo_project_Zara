
CREATE DATABASE zaradb;

use zaradb;

create table IF NOT EXISTS user(
	   username VARCHAR(20) NOT NULL,
	   pwd VARCHAR(20) NOT NULL,
	   PRIMARY KEY ( username )
	) ENGINE=INNODB;

	INSERT INTO user VALUES ('user1', 'pwd1');

	select * from user;

