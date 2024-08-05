drop table tree;

create table if not exists tree(id int,name varchar(255),primary key (id));

insert into tree(id, name) values ( 1,'Apple' );
insert into tree(id, name) values ( 2,'Banana' );
insert into tree(id, name) values ( 3,'Banana' );