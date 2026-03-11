use testdb;
create table users(
id int primary key auto_increment,
name varchar(50),
age int
);
create table orders(
id int primary key auto_increment,
user_id int,
amount int,
created_at datetime default current_timestamp,
foreign key(user_id) references users(id)
);



