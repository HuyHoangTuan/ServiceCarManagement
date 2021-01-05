create table users(
	username varchar(20),
	password varchar(20),
	constraint pk_user primary key (username)
)

insert into users(username, password) values ('admin','admin')