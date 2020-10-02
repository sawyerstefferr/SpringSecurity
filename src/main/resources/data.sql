insert into users(username, password, enabled)
values('sread', '$2a$10$Ldif28nrQcVgboBmbvbCSuonraARlKYEuYyg8Y9IEfky9Sq2c/KH.', 'T');

insert into users(username, password, enabled)
values('mgreen', '$2a$10$.fFbK9O.UYUgQyaecjx2re/5VdmCw0BOsopU.nzQfk45WnA0.NHq2', 'T');

insert into users(username, password, enabled)
values('csandals', '$2a$10$1oLC1wYqKMQMo0B9/gR9DOFy8AqdCZEifrNYkJfF6fj6c9/S.PIG.', 'T');

insert into authorities(username, authority)
values ('sread', 'employee');

insert into authorities(username, authority)
values ('mgreen', 'employee');

insert into authorities(username, authority)
values ('csandals', 'major');