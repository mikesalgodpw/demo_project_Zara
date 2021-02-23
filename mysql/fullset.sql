
#=====R51 starts=====
create table IF NOT EXISTS user(
   username VARCHAR(20) NOT NULL,
   pwd VARCHAR(20) NOT NULL,
   PRIMARY KEY ( username )
) ENGINE=INNODB;

INSERT INTO user VALUES ('user1', 'pwd1');

select * from user;
#=====R51 ends=====

#=====R52 starts=====
create table IF NOT EXISTS laptop(
   laptop_name VARCHAR(20) NOT NULL,
   username VARCHAR(20) NOT NULL,
   PRIMARY KEY ( laptop_name),
   FOREIGN KEY (username) REFERENCES user(username)
) ENGINE=INNODB;

INSERT INTO laptop VALUES ('laptop1', 'user1');

select * from laptop;
#=====R52 ends=====
