create table users(
	username varchar(20),
	password varchar(20),
	constraint pk_user primary key (username)
)
create table email(
	email varchar(50),
	constraint pk_email primary key(email)
)
create table usersemail(
	username varchar(20),
	email varchar(50),
	constraint fk_username_usersemail foreign key(username) references users(username),
	constraint fk_email_usersemail foreign key(email) references email(email)
)


insert into users(username, password) values ('admin','admin')
insert into email(email) values ('admin@gmail.com')
insert into usersemail(username,email) values('admin','admin@gmail.com')