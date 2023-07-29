insert into client(name) values ('Yura'),('Max'),
                                ('Andrii'), ('Nina'),
                                ('Maria'), ('Mukola'),
                                ('Oleg'), ('Ira'),
                                ('Nikita'), ('Ctepan');

insert into planet(id, name) values('MARS', 'Mars'),('VEN', 'Venus'),
                                   ('MER', 'Mercury'), ('EARTH', 'Earth'),
                                   ('JUP', 'Jupiter');

INSERT INTO ticket(CREATED_AT, CLIENT_ID , FROM_PLANET_ID ,TO_PLANET_ID ) VALUES ('1990-01-01 00:00:00', 1, 'MARS', 'EARTH'),
                                                                                   ('2000-01-01 00:00:00', 2, 'VEN', 'EARTH'),
                                                                                   ('2010-01-01 00:00:00', 3, 'MER', 'EARTH'),
                                                                                   ('2015-01-01 00:00:00', 4, 'JUP', 'EARTH'),
                                                                                   ('2020-01-01 00:00:00', 5, 'EARTH', 'MARS');
