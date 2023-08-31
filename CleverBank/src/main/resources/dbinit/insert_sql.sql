INSERT INTO banks (title, bic)
VALUES ('CleverBank', 'CLEVER'),
       ('VTB', 'VTBRRUMM'),
       ('GazPromBank', 'GAZPRUMM'),
       ('RosSelBank', 'RUAGRUMM'),
       ('BankWindow', 'RUDLRUMM');

INSERT INTO users (name, email, password)
VALUES ('Anna Petrova', 'petrova@mail.ru', 'qwerty'),
       ('Sergej Smirnov', 'smirnov@mail.ru', 'asdfgh'),
       ('Maria Sidorova', 'sidorova@mail.ru', 'zxcvbn'),
       ('Alex Kuznetsov', 'kuznetsov@mail.ru', 'iloveyou'),
       ('Helen Popova', 'popova@mail.ru', 'letmein'),
       ('Den Socolov', 'sokolov@mail.ru', 'password'),
       ('Olga Novikova', 'novikova@mail.ru', 'trustno1'),
       ('Andrej Morozov', 'morozov@mail.ru', 'dragon'),
       ('Irina Volkova', 'volkova@mail.ru', 'baseball'),
       ('Nikolaj Pavlov', 'pavlov@mail.ru', 'football'),
       ('Jes Zaytseva', 'zaytseva@mail.ru', 'monkey'),
       ('Mihail Fedorov', 'fedorov@mail.ru', 'shadow'),
       ('Vera Belova', 'belova@mail.ru', 'master'),
       ('Kiril Egorov', 'egorov@mail.ru', 'superman'),
       ('Ludmila Orlova', 'orlova@mail.ru', 'qazwsx'),
       ('Vladimir Gusev', 'gusev@mail.ru', 'michael'),
       ('Nat Makarova', 'makarova@mail.ru', 'jennifer'),
       ('Artiem Lebedev', 'lebedev@mail.ru', 'hunter'),
       ('Galina Romanova', 'romanova@mail.ru', 'harley'),
       ('Pavel Kozlov', 'kozlov@mail.ru', 'ranger');

INSERT INTO accounts (number, balance, bank_id, user_id)
VALUES ('00001', '100', '1', '1'),
       ('00002', '200', '2', '2'),
       ('00003', '300', '3', '3'),
       ('00004', '400', '4', '4'),
       ('00005', '500', '5', '5'),
       ('00006', '600', '1', '6'),
       ('00007', '700', '2', '7'),
       ('00008', '800', '3', '8'),
       ('00009', '900', '4', '9'),
       ('00010', '1000', '5', '10'),
       ('00011', '1100', '1', '11'),
       ('00012', '1200', '2', '12'),
       ('00013', '1300', '3', '13'),
       ('00014', '1400', '4', '14'),
       ('00015', '1500', '5', '15'),
       ('00016', '1600', '1', '16'),
       ('00017', '1700', '2', '17'),
       ('00018', '1800', '3', '18'),
       ('00019', '1900', '4', '19'),
       ('00020', '2000', '5', '20'),
       ('00021', '2100', '3', '1'),
       ('00022', '2200', '5', '2'),
       ('00023', '2300', '2', '3'),
       ('00024', '2400', '1', '4'),
       ('00025', '2500', '4', '5'),
       ('00026', '2600', '3', '6'),
       ('00027', '2700', '5', '7'),
       ('00028', '2800', '2', '8'),
       ('00029', '2900', '1', '9'),
       ('00030', '3000', '4', '10'),
       ('00031', '3100', '3', '11'),
       ('00032', '3200', '5', '12'),
       ('00033', '3300', '2', '13'),
       ('00034', '3400', '1', '14'),
       ('00035', '3500', '4', '15'),
       ('00036', '3600', '3', '16'),
       ('00037', '3700', '5', '17'),
       ('00038', '3800', '2', '18'),
       ('00039', '3900', '1', '19'),
       ('00040', '4000', '4', '20');