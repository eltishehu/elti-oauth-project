insert into user(name, password) values ('john','password');
insert into user(name,  password) values ('elti','password');

insert into role(name) values ('ROLE_USER');
insert into role(name) values ('ROLE_ADMIN');

insert into user_role(user_id, role_id) values (1,1);
insert into user_role(user_id, role_id) values (2,1);
insert into user_role(user_id, role_id) values (2,2);

