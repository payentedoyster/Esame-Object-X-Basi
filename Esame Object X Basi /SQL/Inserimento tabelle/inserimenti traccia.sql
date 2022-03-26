/* Inserimento tracce in album Dynasty*/

insert into traccia
values(PK_TRACCIA.nextval,'I Was Made For Lovin You', date '1979-3-23', 511274586,'mattina', 'inedito', 'rock', (select nome from artista where nome='Kiss'),(select codice from album where codice=1));
insert into traccia
values(PK_TRACCIA.nextval,'2000 Man', date '1979-3-23', 4551874,'mattina', 'inedito', 'rock', (select nome from artista where nome='Kiss'),(select codice from album where codice=1));
insert into traccia
values(PK_TRACCIA.nextval,'Sure Know Something', date '1979-3-23', 13429486,'mattina', 'inedito', 'rock', (select nome from artista where nome='Kiss'),(select codice from album where codice=1));
insert into traccia
values(PK_TRACCIA.nextval,'Save Your Love', date '1979-3-23', 1965084,'pomeriggio', 'inedito', 'rock', (select nome from artista where nome='Kiss'),(select codice from album where codice=1));
insert into traccia
values(PK_TRACCIA.nextval,'Dirty Livin', date '1979-3-23', 6918632,'sera', 'inedito', 'rock', (select nome from artista where nome='Kiss'),(select codice from album where codice=1));
insert into traccia
values(PK_TRACCIA.nextval,'Charisma', date '1979-3-23', 1952154,'sera', 'inedito', 'rock', (select nome from artista where nome='Kiss'),(select codice from album where codice=1));
insert into traccia
values(PK_TRACCIA.nextval,'Magic Touch', date '1979-3-23', 1414921,'sera', 'inedito', 'rock', (select nome from artista where nome='Kiss'),(select codice from album where codice=1));
insert into traccia
values(PK_TRACCIA.nextval,'Hard Times', date '1979-3-23', 1227079,'pomeriggio', 'inedito', 'rock', (select nome from artista where nome='Kiss'),(select codice from album where codice=1));
insert into traccia
values(PK_TRACCIA.nextval,'X-Ray Eyes', date '1979-3-23', 1359451,'mattina', 'inedito', 'rock', (select nome from artista where nome='Kiss'),(select codice from album where codice=1));

/*Inserimento tracce in album Blu Celeste*/

insert into traccia
values(PK_TRACCIA.nextval,'Mezz Ora Di Sole', date '2021-6-12', 17819291,'sera', 'inedito', 'pop', (select nome from artista where nome='Blanco'),(select codice from album where codice=2));
insert into traccia
values(PK_TRACCIA.nextval,'Notti in Bianco', date '2021-6-12', 102895611,'sera', 'inedito', 'pop', (select nome from artista where nome='Blanco'),(select codice from album where codice=2));
insert into traccia
values(PK_TRACCIA.nextval,'Figli Di Puttana', date '2021-6-12', 13803275,'pomeriggio', 'inedito', 'pop', (select nome from artista where nome='Blanco'),(select codice from album where codice=2));
insert into traccia
values(PK_TRACCIA.nextval,'Blu Celeste', date '2021-6-12', 42669185,'mattina', 'inedito', 'pop', (select nome from artista where nome='Blanco'),(select codice from album where codice=2));
insert into traccia
values(PK_TRACCIA.nextval,'Sai Cosa Cè', date '2021-6-12', 207085658,'mattina', 'inedito', 'pop', (select nome from artista where nome='Blanco'),(select codice from album where codice=2));
insert into traccia
values(PK_TRACCIA.nextval,'Paraocchi', date '2021-6-12', 66324796,'pomeriggio', 'inedito', 'pop', (select nome from artista where nome='Blanco'),(select codice from album where codice=2));
insert into traccia
values(PK_TRACCIA.nextval,'Lucciole', date '2021-6-12', 28143060,'pomeriggio', 'inedito', 'pop', (select nome from artista where nome='Blanco'),(select codice from album where codice=2));
insert into traccia
values(PK_TRACCIA.nextval,'Finchè Non Mi Seppelliscono', date '2021-6-12', 38531980,'sera', 'inedito', 'pop', (select nome from artista where nome='Blanco'),(select codice from album where codice=2));
insert into traccia
values(PK_TRACCIA.nextval,'Pornografia(Bianco Paradiso)', date '2021-6-12', 16142490,'sera', 'inedito', 'pop', (select nome from artista where nome='Blanco'),(select codice from album where codice=2));
insert into traccia
values(PK_TRACCIA.nextval,'David', date '2021-6-12', 9630635,'mattina', 'inedito', 'pop', (select nome from artista where nome='Blanco'),(select codice from album where codice=2));
insert into traccia
values(PK_TRACCIA.nextval,'Ladro Di Fiori', date '2021-6-12', 32203210,'mattina', 'inedito', 'pop', (select nome from artista where nome='Blanco'),(select codice from album where codice=2));
insert into traccia
values(PK_TRACCIA.nextval,'Afrodite', date '2021-6-12', 13177946,'sera', 'inedito', 'pop', (select nome from artista where nome='Blanco'),(select codice from album where codice=2));

/*Inserimento tracce in Taxi Driver*/

insert into traccia
values(PK_TRACCIA.nextval,'Intro', date '2021-12-4', 151918,'sera', 'inedito', 'pop', (select nome from artista where nome='Rkomi'),(select codice from album where codice=3));
insert into traccia
values(PK_TRACCIA.nextval,'Insuperabile', date '2021-12-4', 21874561,'mattina', 'inedito', 'pop', (select nome from artista where nome='Rkomi'),(select codice from album where codice=3));
insert into traccia
values(PK_TRACCIA.nextval,'La Coda Del Diavolo', date '2021-12-4', 18968164,'mattina', 'inedito', 'pop', (select nome from artista where nome='Rkomi'),(select codice from album where codice=3));
insert into traccia
values(PK_TRACCIA.nextval,'Maleducata', date '2021-12-4', 1900434,'pomeriggio', 'inedito', 'pop', (select nome from artista where nome='Rkomi'),(select codice from album where codice=3));
insert into traccia
values(PK_TRACCIA.nextval,'Ho Paura Di Te', date '2021-12-4', 566521,'pomeriggio', 'inedito', 'pop', (select nome from artista where nome='Rkomi'),(select codice from album where codice=3));
insert into traccia
values(PK_TRACCIA.nextval,'Fegato, Fegato Spappolato', date '2021-12-4', 139985,'pomeriggio', 'inedito', 'pop', (select nome from artista where nome='Rkomi'),(select codice from album where codice=3));
insert into traccia
values(PK_TRACCIA.nextval,'Autobus Di Notte', date '2021-12-4', 546870,'sera', 'inedito', 'pop', (select nome from artista where nome='Rkomi'),(select codice from album where codice=3));
insert into traccia
values(PK_TRACCIA.nextval,'Amico Dove Sei?', date '2021-12-4', 419274,'mattina', 'inedito', 'pop', (select nome from artista where nome='Rkomi'),(select codice from album where codice=3));
insert into traccia
values(PK_TRACCIA.nextval,'Cancelli di Mezza Notte', date '2022-12-4', 944301,'sera', 'unplugged', 'pop', (select nome from artista where nome='Rkomi'),(select codice from album where codice=3));
insert into traccia
values(PK_TRACCIA.nextval,'Apnea', date '2022-12-4', 1004227,'sera', 'unplugged', 'pop', (select nome from artista where nome='Rkomi'),(select codice from album where codice=3));
insert into traccia
values(PK_TRACCIA.nextval,'Partire Da Te', date '2022-12-4', 1822857,'sera', 'unplugged', 'pop', (select nome from artista where nome='Rkomi'),(select codice from album where codice=3));
insert into traccia
values(PK_TRACCIA.nextval,'10 Ragazze', date '2022-12-4', 620667,'sera', 'unplugged', 'pop', (select nome from artista where nome='Rkomi'),(select codice from album where codice=3));
insert into traccia
values(PK_TRACCIA.nextval,'Diecimilavoci', date '2022-12-4', 567751,'pomeriggio', 'unplugged', 'pop', (select nome from artista where nome='Rkomi'),(select codice from album where codice=3));
insert into traccia
values(PK_TRACCIA.nextval,'Ridere Di Te', date '2022-12-4', 1183015,'pomeriggio', 'unplugged', 'pop', (select nome from artista where nome='Rkomi'),(select codice from album where codice=3));
insert into traccia
values(PK_TRACCIA.nextval,'Luna Piena', date '2022-12-4', 611798,'mattina', 'unplugged', 'pop', (select nome from artista where nome='Rkomi'),(select codice from album where codice=3));
insert into traccia
values(PK_TRACCIA.nextval,'Mare Che Non Sei', date '2022-12-4', 425563,'mattina', 'unplugged', 'pop', (select nome from artista where nome='Rkomi'),(select codice from album where codice=3));
insert into traccia
values(PK_TRACCIA.nextval,'Paradiso VS Inferno', date '2022-12-4', 362151,'pomeriggio', 'unplugged', 'pop', (select nome from artista where nome='Rkomi'),(select codice from album where codice=3));
insert into traccia
values(PK_TRACCIA.nextval,'Nuovo Range', date '2022-12-4', 1127397,'mattina', 'unplugged', 'pop', (select nome from artista where nome='Rkomi'),(select codice from album where codice=3));
insert into traccia
values(PK_TRACCIA.nextval,'Me o Le Mie Canzoni?', date '2022-12-4', 428537,'sera', 'unplugged', 'pop', (select nome from artista where nome='Rkomi'),(select codice from album where codice=3));
insert into traccia
values(PK_TRACCIA.nextval,'Ho Spento Il Cielo', date '2022-12-4', 514593,'sera', 'unplugged', 'pop', (select nome from artista where nome='Rkomi'),(select codice from album where codice=3));
insert into traccia
values(PK_TRACCIA.nextval,'Visti Dall Alto', date '2022-12-4', 513453,'pomeriggio', 'unplugged', 'pop', (select nome from artista where nome='Rkomi'),(select codice from album where codice=3));
insert into traccia
values(PK_TRACCIA.nextval,'Mai Più', date '2022-12-4', 442093,'mattina', 'unplugged', 'pop', (select nome from artista where nome='Rkomi'),(select codice from album where codice=3));
insert into traccia
values(PK_TRACCIA.nextval,'Taxi Driver', date '2022-12-4', 439033,'mattina', 'unplugged', 'pop', (select nome from artista where nome='Rkomi'),(select codice from album where codice=3));

/*Inesrimento tracce in Vile Denaro*/

insert into traccia
values(PK_TRACCIA.nextval,'Incubo Italiano', date '2008-3-2', 938182,'mattina', 'inedito', 'rap', (select nome from artista where nome='Club Dogo'),(select codice from album where codice=4));
insert into traccia
values(PK_TRACCIA.nextval,'Mi Hanno Detto Che', date '2008-3-2', 1078825,'sera', 'inedito', 'rap', (select nome from artista where nome='Club Dogo'),(select codice from album where codice=4));
insert into traccia
values(PK_TRACCIA.nextval,'La Verità', date '2008-3-2', 537097,'pomeriggio', 'inedito', 'rap', (select nome from artista where nome='Club Dogo'),(select codice from album where codice=4));
insert into traccia
values(PK_TRACCIA.nextval,'M-I Bastard', date '2008-3-2', 976698,'pomeriggio', 'inedito', 'rap', (select nome from artista where nome='Club Dogo'),(select codice from album where codice=4));
insert into traccia
values(PK_TRACCIA.nextval,'C.D.', date '2008-3-2', 551957,'mattina', 'inedito', 'rap', (select nome from artista where nome='Club Dogo'),(select codice from album where codice=4));
insert into traccia
values(PK_TRACCIA.nextval,'Puro Bogotà', date '2008-3-2', 10806937,'mattina', 'inedito', 'rap', (select nome from artista where nome='Club Dogo'),(select codice from album where codice=4));
insert into traccia
values(PK_TRACCIA.nextval,'Spaghetti Western', date '2008-3-2', 489037,'mattina', 'inedito', 'rap', (select nome from artista where nome='Club Dogo'),(select codice from album where codice=4));
insert into traccia
values(PK_TRACCIA.nextval,'Tornerò Da Re', date '2008-3-2', 1854852,'sera', 'inedito', 'rap', (select nome from artista where nome='Club Dogo'),(select codice from album where codice=4));
insert into traccia
values(PK_TRACCIA.nextval,'Confessioni Di Una Banconota', date '2008-3-2', 666314,'sera', 'inedito', 'rap', (select nome from artista where nome='Club Dogo'),(select codice from album where codice=4));
insert into traccia
values(PK_TRACCIA.nextval,'Ora Che Ci Penso', date '2008-3-2', 943272,'sera', 'inedito', 'rap', (select nome from artista where nome='Club Dogo'),(select codice from album where codice=4));
insert into traccia
values(PK_TRACCIA.nextval,'Dogozilla', date '2008-3-2', 589595,'pomeriggio', 'inedito', 'rap', (select nome from artista where nome='Club Dogo'),(select codice from album where codice=4));
insert into traccia
values(PK_TRACCIA.nextval,'Giovane e Pazzo', date '2008-3-2', 576112,'pomeriggio', 'inedito', 'rap', (select nome from artista where nome='Club Dogo'),(select codice from album where codice=4));
insert into traccia
values(PK_TRACCIA.nextval,'Dolce Paranoia', date '2008-3-2', 1028614,'pomeriggio', 'inedito', 'rap', (select nome from artista where nome='Club Dogo'),(select codice from album where codice=4));
insert into traccia
values(PK_TRACCIA.nextval,'La Chiave', date '2008-3-2', 418226,'mattina', 'inedito', 'rap', (select nome from artista where nome='Club Dogo'),(select codice from album where codice=4));

/*Inserimento tracce in The Marshall Mathers */

insert into traccia
values(PK_TRACCIA.nextval,'Bad Guy', date '2013-8-7', 96655305,'mattina', 'inedito', 'rap', (select nome from artista where nome='Eminem'),(select codice from album where codice=5));
insert into traccia
values(PK_TRACCIA.nextval,'Parking Lot - Skit', date '2013-8-7', 25797447,'mattina', 'inedito', 'rap', (select nome from artista where nome='Eminem'),(select codice from album where codice=5));
insert into traccia
values(PK_TRACCIA.nextval,'Rhyme of Reason', date '2013-8-7', 54996166,'sera', 'inedito', 'rap', (select nome from artista where nome='Eminem'),(select codice from album where codice=5));
insert into traccia
values(PK_TRACCIA.nextval,'Survival', date '2013-8-7', 211666210,'pomeriggio', 'inedito', 'rap', (select nome from artista where nome='Eminem'),(select codice from album where codice=5));
insert into traccia
values(PK_TRACCIA.nextval,'Legacy', date '2013-8-7', 124984662,'pomeriggio', 'inedito', 'rap', (select nome from artista where nome='Eminem'),(select codice from album where codice=5));
insert into traccia
values(PK_TRACCIA.nextval,'Asshole', date '2013-8-7', 51333931,'pomeriggio', 'inedito', 'rap', (select nome from artista where nome='Eminem'),(select codice from album where codice=5));
insert into traccia
values(PK_TRACCIA.nextval,'Berzerk', date '2013-8-7', 248203248,'mattina', 'inedito', 'rap', (select nome from artista where nome='Eminem'),(select codice from album where codice=5));
insert into traccia
values(PK_TRACCIA.nextval,'Rap God', date '2013-8-7', 803637871,'mattina', 'inedito', 'rap', (select nome from artista where nome='Eminem'),(select codice from album where codice=5));
insert into traccia
values(PK_TRACCIA.nextval,'Brainless', date '2013-8-7', 46137816,'sera', 'inedito', 'rap', (select nome from artista where nome='Eminem'),(select codice from album where codice=5));
insert into traccia
values(PK_TRACCIA.nextval,'Stronger Than I Was', date '2013-8-7', 56028035,'mattina', 'inedito', 'rap', (select nome from artista where nome='Eminem'),(select codice from album where codice=5));
insert into traccia
values(PK_TRACCIA.nextval,'The Monster', date '2013-8-7', 706329069,'mattina', 'inedito', 'rap', (select nome from artista where nome='Eminem'),(select codice from album where codice=5));
insert into traccia
values(PK_TRACCIA.nextval,'So Far...', date '2013-8-7', 46896571,'mattina', 'inedito', 'rap', (select nome from artista where nome='Eminem'),(select codice from album where codice=5));

/*Inserimento tracce in Pat Garret*/

insert into traccia
values(PK_TRACCIA.nextval,'Main Title Theme', date '1973-9-21', 2434583,'mattina', 'inedito', 'folk', (select nome from artista where nome='Bob Dylan'),(select codice from album where codice=6));
insert into traccia
values(PK_TRACCIA.nextval,'Cantina Theme', date '1973-9-21', 1077069,'sera', 'inedito', 'folk', (select nome from artista where nome='Bob Dylan'),(select codice from album where codice=6));
insert into traccia
values(PK_TRACCIA.nextval,'Billy 1', date '1973-9-21', 9181092,'pomeriggio', 'inedito', 'folk', (select nome from artista where nome='Bob Dylan'),(select codice from album where codice=6));
insert into traccia
values(PK_TRACCIA.nextval,'Bunkhouse Theme', date '1973-9-21', 988776,'sera', 'inedito', 'folk', (select nome from artista where nome='Bob Dylan'),(select codice from album where codice=6));
insert into traccia
values(PK_TRACCIA.nextval,'River Theme', date '1973-9-21', 934933,'sera', 'inedito', 'folk', (select nome from artista where nome='Bob Dylan'),(select codice from album where codice=6));
insert into traccia
values(PK_TRACCIA.nextval,'Turkey Chase', date '1973-9-21', 930792,'pomeriggio', 'inedito', 'folk', (select nome from artista where nome='Bob Dylan'),(select codice from album where codice=6));
insert into traccia
values(PK_TRACCIA.nextval,'Knockin On Heavens Door', date '1973-9-21', 241732907,'pomeriggio', 'inedito', 'folk', (select nome from artista where nome='Bob Dylan'),(select codice from album where codice=6));
insert into traccia
values(PK_TRACCIA.nextval,'Final Theme', date '1973-9-21', 1196198,'mattina', 'inedito', 'folk', (select nome from artista where nome='Bob Dylan'),(select codice from album where codice=6));
insert into traccia
values(PK_TRACCIA.nextval,'Billy 4', date '1973-9-21', 1137897,'mattina', 'inedito', 'folk', (select nome from artista where nome='Bob Dylan'),(select codice from album where codice=6));
insert into traccia
values(PK_TRACCIA.nextval,'Billy 7', date '1973-9-21', 825170,'mattina', 'inedito', 'folk', (select nome from artista where nome='Bob Dylan'),(select codice from album where codice=6));

/* Inserimento tracce in Pat Garret */

insert into traccia
values(PK_TRACCIA.nextval,'Main Title Theme', date '1973-9-21', 2434583,'mattina', 'remastered', 'folk', (select nome from artista where nome='Bob Dylan'),(select codice from album where codice=16));
insert into traccia
values(PK_TRACCIA.nextval,'Cantina Theme', date '2000-9-21', 1077069,'sera', 'remastered', 'folk', (select nome from artista where nome='Bob Dylan'),(select codice from album where codice=16));
insert into traccia
values(PK_TRACCIA.nextval,'Billy 1', date '2000-9-21', 9181092,'pomeriggio', 'remastered', 'folk', (select nome from artista where nome='Bob Dylan'),(select codice from album where codice=16));
insert into traccia
values(PK_TRACCIA.nextval,'Bunkhouse Theme', date '2000-9-21', 988776,'sera', 'remastered', 'folk', (select nome from artista where nome='Bob Dylan'),(select codice from album where codice=16));
insert into traccia
values(PK_TRACCIA.nextval,'River Theme', date '2000-9-21', 934933,'sera', 'remastered', 'folk', (select nome from artista where nome='Bob Dylan'),(select codice from album where codice=16));
insert into traccia
values(PK_TRACCIA.nextval,'Turkey Chase', date '2000-9-21', 930792,'pomeriggio', 'remastered', 'folk', (select nome from artista where nome='Bob Dylan'),(select codice from album where codice=16));
insert into traccia
values(PK_TRACCIA.nextval,'Knockin On Heavens Door', date '2000-9-21', 241732907,'pomeriggio', 'remastered', 'folk', (select nome from artista where nome='Bob Dylan'),(select codice from album where codice=16));
insert into traccia
values(PK_TRACCIA.nextval,'Final Theme', date '2000-9-21', 1196198,'mattina', 'remastered', 'folk', (select nome from artista where nome='Bob Dylan'),(select codice from album where codice=16));
insert into traccia
values(PK_TRACCIA.nextval,'Billy 4', date '2000-9-21', 1137897,'mattina', 'remastered', 'folk', (select nome from artista where nome='Bob Dylan'),(select codice from album where codice=16));
insert into traccia
values(PK_TRACCIA.nextval,'Billy 7', date '2000-9-21', 825170,'mattina', 'remastered', 'folk', (select nome from artista where nome='Bob Dylan'),(select codice from album where codice=16));

/*Inserimento tracce in Millennium Bug*/

insert into traccia
values(PK_TRACCIA.nextval,'Per Me Sei', date '2020-1-25', 5926054,'mattina', 'inedito', 'indie', (select nome from artista where nome='Psicologi'),(select codice from album where codice=7));
insert into traccia
values(PK_TRACCIA.nextval,'FCK U', date '2020-1-25', 7577426,'mattina', 'inedito', 'indie', (select nome from artista where nome='Psicologi'),(select codice from album where codice=7));
insert into traccia
values(PK_TRACCIA.nextval,'Povero', date '2020-1-25', 2121378,'mattina', 'inedito', 'indie', (select nome from artista where nome='Psicologi'),(select codice from album where codice=7));
insert into traccia
values(PK_TRACCIA.nextval,'Generazione', date '2020-1-25', 4150646,'mattina', 'inedito', 'indie', (select nome from artista where nome='Psicologi'),(select codice from album where codice=7));
insert into traccia
values(PK_TRACCIA.nextval,'Canada', date '2020-1-25', 6028633,'mattina', 'inedito', 'indie', (select nome from artista where nome='Psicologi'),(select codice from album where codice=7));
insert into traccia
values(PK_TRACCIA.nextval,'Intro', date '2020-1-25', 5263,'mattina', 'inedito', 'indie', (select nome from artista where nome='Psicologi'),(select codice from album where codice=7));
insert into traccia
values(PK_TRACCIA.nextval,'Amici', date '2020-1-25', 2882545,'mattina', 'inedito', 'indie', (select nome from artista where nome='Psicologi'),(select codice from album where codice=7));
insert into traccia
values(PK_TRACCIA.nextval,'Tristi e Soli', date '2020-1-25', 3375146,'mattina', 'inedito', 'indie', (select nome from artista where nome='Psicologi'),(select codice from album where codice=7));
insert into traccia
values(PK_TRACCIA.nextval,'Spensieratezza', date '2020-1-25', 18619852,'mattina', 'inedito', 'indie', (select nome from artista where nome='Psicologi'),(select codice from album where codice=7));
insert into traccia
values(PK_TRACCIA.nextval,'Funerale', date '2020-1-25', 3064776,'mattina', 'inedito', 'indie', (select nome from artista where nome='Psicologi'),(select codice from album where codice=7));
insert into traccia
values(PK_TRACCIA.nextval,'Sto Bene', date '2020-1-25', 13158938,'mattina', 'inedito', 'indie', (select nome from artista where nome='Psicologi'),(select codice from album where codice=7));
insert into traccia
values(PK_TRACCIA.nextval,'Vorrei', date '2020-1-25', 3074121,'mattina', 'inedito', 'indie', (select nome from artista where nome='Psicologi'),(select codice from album where codice=7));
insert into traccia
values(PK_TRACCIA.nextval,'Fanstama', date '2020-1-25', 10507059,'mattina', 'inedito', 'indie', (select nome from artista where nome='Psicologi'),(select codice from album where codice=7));
insert into traccia
values(PK_TRACCIA.nextval,'Radio', date '2020-1-25', 3428902,'mattina', 'inedito', 'indie', (select nome from artista where nome='Psicologi'),(select codice from album where codice=7));

/*Inserimenti tracce in Stanza Singola*/

insert into traccia
values(PK_TRACCIA.nextval,'San Siro', date '2019-10-5', 9959314,'mattina', 'inedito', 'indie', (select nome from artista where nome='Franco126'),(select codice from album where codice=8));
insert into traccia
values(PK_TRACCIA.nextval,'Stanza Singola', date '2019-10-5', 45018959,'mattina', 'inedito', 'indie', (select nome from artista where nome='Franco126'),(select codice from album where codice=8));
insert into traccia
values(PK_TRACCIA.nextval,'Brioschi', date '2019-10-5', 22582930,'pomeriggio', 'inedito', 'indie', (select nome from artista where nome='Franco126'),(select codice from album where codice=8));
insert into traccia
values(PK_TRACCIA.nextval,'Fa Lo Stesso', date '2019-10-5', 8128762,'pomeriggio', 'inedito', 'indie', (select nome from artista where nome='Franco126'),(select codice from album where codice=8));
insert into traccia
values(PK_TRACCIA.nextval,'Parole Crociate', date '2019-10-5', 6997512,'sera', 'inedito', 'indie', (select nome from artista where nome='Franco126'),(select codice from album where codice=8));
insert into traccia
values(PK_TRACCIA.nextval,'Nuvole Di Drago', date '2019-10-5', 10495056,'sera', 'inedito', 'indie', (select nome from artista where nome='Franco126'),(select codice from album where codice=8));
insert into traccia
values(PK_TRACCIA.nextval,'Frigobar', date '2019-10-5', 15175363,'sera', 'inedito', 'indie', (select nome from artista where nome='Franco126'),(select codice from album where codice=8));
insert into traccia
values(PK_TRACCIA.nextval,'Oi Oi', date '2019-10-5', 4191045,'mattina', 'inedito', 'indie', (select nome from artista where nome='Franco126'),(select codice from album where codice=8));
insert into traccia
values(PK_TRACCIA.nextval,'Vabbè', date '2019-10-5', 7378963,'pomeriggio', 'inedito', 'indie', (select nome from artista where nome='Franco126'),(select codice from album where codice=8));
insert into traccia
values(PK_TRACCIA.nextval,'Ierei L altro', date '2019-10-5', 22853918,'mattina', 'inedito', 'indie', (select nome from artista where nome='Franco126'),(select codice from album where codice=8));

/*Inserimento tracce in twins*/

insert into traccia
values(PK_TRACCIA.nextval,'Caramelle', date '2017-10-24', 15058010,'mattina', 'inedito', 'trap', (select nome from artista where nome='Dark Polo Gang'),(select codice from album where codice=9));
insert into traccia
values(PK_TRACCIA.nextval,'Sexy Gang', date '2017-10-24', 3149559,'mattina', 'inedito', 'trap', (select nome from artista where nome='Dark Polo Gang'),(select codice from album where codice=9));
insert into traccia
values(PK_TRACCIA.nextval,'Marilyn Manson', date '2017-10-24', 2467817,'mattina', 'inedito', 'trap', (select nome from artista where nome='Dark Polo Gang'),(select codice from album where codice=9));
insert into traccia
values(PK_TRACCIA.nextval,'Cono Gelato', date '2017-10-24', 15058010,'mattina', 'inedito', 'trap', (select nome from artista where nome='Dark Polo Gang'),(select codice from album where codice=9));
insert into traccia
values(PK_TRACCIA.nextval,'Tic Tac', date '2017-10-24', 4990037,'mattina', 'inedito', 'trap', (select nome from artista where nome='Dark Polo Gang'),(select codice from album where codice=9));
insert into traccia
values(PK_TRACCIA.nextval,'Magazine', date '2017-10-24', 11177517,'mattina', 'inedito', 'trap', (select nome from artista where nome='Dark Polo Gang'),(select codice from album where codice=9));
insert into traccia
values(PK_TRACCIA.nextval,'El Machico', date '2017-10-24', 3754458,'mattina', 'inedito', 'trap', (select nome from artista where nome='Dark Polo Gang'),(select codice from album where codice=9));
insert into traccia
values(PK_TRACCIA.nextval,'Cobain', date '2017-10-24', 3005173,'mattina', 'inedito', 'trap', (select nome from artista where nome='Dark Polo Gang'),(select codice from album where codice=9));
insert into traccia
values(PK_TRACCIA.nextval,'Spezzacuori', date '2017-10-24', 5419267,'mattina', 'inedito', 'trap', (select nome from artista where nome='Dark Polo Gang'),(select codice from album where codice=9));
insert into traccia
values(PK_TRACCIA.nextval,'Side E Wayne', date '2017-10-24', 21360924,'mattina', 'inedito', 'trap', (select nome from artista where nome='Dark Polo Gang'),(select codice from album where codice=9));
insert into traccia
values(PK_TRACCIA.nextval,'Ti Amo', date '2017-10-24', 2286809,'mattina', 'inedito', 'trap', (select nome from artista where nome='Dark Polo Gang'),(select codice from album where codice=9));
insert into traccia
values(PK_TRACCIA.nextval,'Flex', date '2017-10-24', 4069248,'mattina', 'inedito', 'trap', (select nome from artista where nome='Dark Polo Gang'),(select codice from album where codice=9));
insert into traccia
values(PK_TRACCIA.nextval,'Diabolika', date '2017-10-24', 1828065,'mattina', 'inedito', 'trap', (select nome from artista where nome='Dark Polo Gang'),(select codice from album where codice=9));
insert into traccia
values(PK_TRACCIA.nextval,'Sku Sku', date '2017-10-24', 3112978,'mattina', 'inedito', 'trap', (select nome from artista where nome='Dark Polo Gang'),(select codice from album where codice=9));
insert into traccia
values(PK_TRACCIA.nextval,'Hypebeast', date '2017-10-24', 3416077,'mattina', 'inedito', 'trap', (select nome from artista where nome='Dark Polo Gang'),(select codice from album where codice=9));

/* Inserimento tracce in FSK Trapshit */

insert into traccia
values(PK_TRACCIA.nextval,'Up', date '2019-3-3', 9867018,'sera', 'inedito', 'trap', (select nome from artista where nome='FSK Satellite'),(select codice from album where codice=10));
insert into traccia
values(PK_TRACCIA.nextval,'No Spie', date '2019-3-3', 21748306,'pomeriggio', 'inedito', 'trap', (select nome from artista where nome='FSK Satellite'),(select codice from album where codice=10));
insert into traccia
values(PK_TRACCIA.nextval,'Catene Jesus', date '2019-3-3', 8799062,'pomeriggio', 'inedito', 'trap', (select nome from artista where nome='FSK Satellite'),(select codice from album where codice=10));
insert into traccia
values(PK_TRACCIA.nextval,'4L', date '2019-3-3', 8242985,'mattina', 'inedito', 'trap', (select nome from artista where nome='FSK Satellite'),(select codice from album where codice=10));
insert into traccia
values(PK_TRACCIA.nextval,'Ok No Play', date '2019-3-3', 3775492,'mattina', 'inedito', 'trap', (select nome from artista where nome='FSK Satellite'),(select codice from album where codice=10));
insert into traccia
values(PK_TRACCIA.nextval,'La Prova Del Cuoco', date '2019-3-3', 23426997,'mattina', 'inedito', 'trap', (select nome from artista where nome='FSK Satellite'),(select codice from album where codice=10));
insert into traccia
values(PK_TRACCIA.nextval,'Melissa P', date '2019-3-3', 20856423,'sera', 'inedito', 'trap', (select nome from artista where nome='FSK Satellite'),(select codice from album where codice=10));
insert into traccia
values(PK_TRACCIA.nextval,'Non è Mia', date '2019-3-3', 5844425,'sera', 'inedito', 'trap', (select nome from artista where nome='FSK Satellite'),(select codice from album where codice=10));
insert into traccia
values(PK_TRACCIA.nextval,'Canottiera White', date '2019-3-3', 7093537,'sera', 'inedito', 'trap', (select nome from artista where nome='FSK Satellite'),(select codice from album where codice=10));
insert into traccia
values(PK_TRACCIA.nextval,'Abbiamo', date '2019-3-3', 4404501,'mattina', 'inedito', 'trap', (select nome from artista where nome='FSK Satellite'),(select codice from album where codice=10));
insert into traccia
values(PK_TRACCIA.nextval,'Pickup', date '2019-3-3', 5483015,'mattina', 'inedito', 'trap', (select nome from artista where nome='FSK Satellite'),(select codice from album where codice=10));

/* Inserimento tracce in Meet The Woo  */

insert into traccia
values(PK_TRACCIA.nextval,'Meet the Woo', date '2019-8-15', 41332256,'mattina', 'inedito', 'drill', (select nome from artista where nome='Pop Smoke'),(select codice from album where codice=11));
insert into traccia
values(PK_TRACCIA.nextval,'Welcome to The Party', date '2019-8-15', 160916799,'mattina', 'inedito', 'drill', (select nome from artista where nome='Pop Smoke'),(select codice from album where codice=11));
insert into traccia
values(PK_TRACCIA.nextval,'Hawk Em', date '2019-8-15', 34904600,'mattina', 'inedito', 'drill', (select nome from artista where nome='Pop Smoke'),(select codice from album where codice=11));
insert into traccia
values(PK_TRACCIA.nextval,'Better Have Your Gun', date '2019-8-15', 17728483,'mattina', 'inedito', 'drill', (select nome from artista where nome='Pop Smoke'),(select codice from album where codice=11));
insert into traccia
values(PK_TRACCIA.nextval,'Scenario', date '2019-8-15', 38569740,'mattina', 'inedito', 'drill', (select nome from artista where nome='Pop Smoke'),(select codice from album where codice=11));
insert into traccia
values(PK_TRACCIA.nextval,'Dior', date '2019-8-15', 613957875,'mattina', 'inedito', 'drill', (select nome from artista where nome='Pop Smoke'),(select codice from album where codice=11));
insert into traccia
values(PK_TRACCIA.nextval,'Feeling', date '2019-8-15', 13203733,'mattina', 'inedito', 'drill', (select nome from artista where nome='Pop Smoke'),(select codice from album where codice=11));
insert into traccia
values(PK_TRACCIA.nextval,'PTSD', date '2019-8-15', 76029231,'mattina', 'inedito', 'drill', (select nome from artista where nome='Pop Smoke'),(select codice from album where codice=11));
insert into traccia
values(PK_TRACCIA.nextval,'Brother Man', date '2019-8-15', 16189638,'mattina', 'inedito', 'drill', (select nome from artista where nome='Pop Smoke'),(select codice from album where codice=11));

/*Inserimento tracce in X2*/

insert into traccia
values(PK_TRACCIA.nextval,'Notte Scura', date '2022-1-27', 4495329,'mattina', 'inedito', 'drill', (select nome from artista where nome='Sick Luke'),(select codice from album where codice=12));
insert into traccia
values(PK_TRACCIA.nextval,'Il Giorno Piu Triste Del Mondo', date '2022-1-27', 5478235,'sera', 'inedito', 'drill', (select nome from artista where nome='Sick Luke'),(select codice from album where codice=12));
insert into traccia
values(PK_TRACCIA.nextval,'Solite Pare', date '2022-1-27', 18500318,'sera', 'inedito', 'drill', (select nome from artista where nome='Sick Luke'),(select codice from album where codice=12));
insert into traccia
values(PK_TRACCIA.nextval,'Falena', date '2022-1-27', 6921069,'sera', 'inedito', 'drill', (select nome from artista where nome='Sick Luke'),(select codice from album where codice=12));
insert into traccia
values(PK_TRACCIA.nextval,'Sogni Matti', date '2022-1-27', 5386132,'mattina', 'inedito', 'drill', (select nome from artista where nome='Sick Luke'),(select codice from album where codice=12));
insert into traccia
values(PK_TRACCIA.nextval,'Temporale', date '2022-1-27', 4220526,'mattina', 'inedito', 'drill', (select nome from artista where nome='Sick Luke'),(select codice from album where codice=12));
insert into traccia
values(PK_TRACCIA.nextval,'Camel e Malinconia', date '2022-1-27', 2534961,'mattina', 'inedito', 'drill', (select nome from artista where nome='Sick Luke'),(select codice from album where codice=12));

/*Inserimento tracce in Odisea*/

insert into traccia
values(PK_TRACCIA.nextval,'Odisea', date '2017-2-15', 30285007,'mattina', 'inedito', 'ragge', (select nome from artista where nome='Ozuna'),(select codice from album where codice=13));
insert into traccia
values(PK_TRACCIA.nextval,'Tu Foto', date '2017-2-15', 392162766,'mattina', 'inedito', 'ragge', (select nome from artista where nome='Ozuna'),(select codice from album where codice=13));
insert into traccia
values(PK_TRACCIA.nextval,'Se Preparò', date '2017-2-15', 596851469,'mattina', 'inedito', 'ragge', (select nome from artista where nome='Ozuna'),(select codice from album where codice=13));
insert into traccia
values(PK_TRACCIA.nextval,'Cumpleanos', date '2017-2-15', 57693695,'mattina', 'inedito', 'ragge', (select nome from artista where nome='Ozuna'),(select codice from album where codice=13));
insert into traccia
values(PK_TRACCIA.nextval,'Dile Que Tu Me Quieres', date '2017-2-15', 404840219,'mattina', 'inedito', 'ragge', (select nome from artista where nome='Ozuna'),(select codice from album where codice=13));
insert into traccia
values(PK_TRACCIA.nextval,'Egoista', date '2017-2-15', 89061967,'mattina', 'inedito', 'ragge', (select nome from artista where nome='Ozuna'),(select codice from album where codice=13));
insert into traccia
values(PK_TRACCIA.nextval,'Una Flor', date '2017-2-15', 56813476,'mattina', 'inedito', 'ragge', (select nome from artista where nome='Ozuna'),(select codice from album where codice=13));

/*Inserimento Marry Me Maluma*/
insert into traccia
values(PK_TRACCIA.nextval,'Here Comes The Bride', date '2022-2-26', 212976,'pomeriggio', 'inedito', 'raggaeton', (select nome from artista where nome='Maluma'),(select codice from album where codice=14));
insert into traccia
values(PK_TRACCIA.nextval,'Marry Me', date '2022-3-11', 190345,'sera', 'inedito', 'raggaeton', (select nome from artista where nome='Maluma'),(select codice from album where codice=14));
insert into traccia
values(PK_TRACCIA.nextval,'PaTi', date '2022-5-20', 122334,'mattino', 'inedito', 'raggaeton', (select nome from artista where nome='Maluma'),(select codice from album where codice=14));
insert into traccia
values(PK_TRACCIA.nextval,'Church', date '2022-1-24', 134009,'mattino', 'inedito', 'raggaeton', (select nome from artista where nome='Maluma'),(select codice from album where codice=14));
insert into traccia
values(PK_TRACCIA.nextval,'1 en 1 Millon ', date '2022-11-11', 267098,'sera', 'inedito', 'raggaeton', (select nome from artista where nome='Maluma'),(select codice from album where codice=14));
insert into traccia
values(PK_TRACCIA.nextval,'Love of My Life ', date '2022-6-9', 345232,'sera', 'inedito', 'raggaeton', (select nome from artista where nome='Maluma'),(select codice from album where codice=14));
insert into traccia
values(PK_TRACCIA.nextval,'After Love (Parte 1) ', date '2022-12-12', 451238,'pomeriggio', 'inedito', 'raggaeton', (select nome from artista where nome='Maluma'),(select codice from album where codice=14));
insert into traccia
values(PK_TRACCIA.nextval,'Segundo ', date '2022-10-6', 98765,'pomeriggio', 'inedito', 'raggaeton', (select nome from artista where nome='Maluma'),(select codice from album where codice=14));

/*Inserimento 2001*/
insert into traccia
values(PK_TRACCIA.nextval,'Lolo', date '1999–11-15', 23758943,'mattino', 'inedito', 'rap', (select nome from artista where nome='Snoop Dogg'),(select codice from album where codice=15));
insert into traccia
values(PK_TRACCIA.nextval,'The Watcher ', date '1999–9-8', 12234543,'pomeriggio', 'inedito', 'rap', (select nome from artista where nome='Snoop Dogg'),(select codice from album where codice=15));
insert into traccia
values(PK_TRACCIA.nextval,'Fuck You ', date '1999–9-18', 23948555,'mattino', 'inedito', 'rap', (select nome from artista where nome='Snoop Dogg'),(select codice from album where codice=15));
insert into traccia
values(PK_TRACCIA.nextval,'Still DRE ', date '1999–7-16', 8239450,'sera', 'inedito', 'rap', (select nome from artista where nome='Snoop Dogg'),(select codice from album where codice=15));
insert into traccia
values(PK_TRACCIA.nextval,'Big Ego s', date '1999–8-11', 6738490,'sera', 'inedito', 'rap', (select nome from artista where nome='Snoop Dogg'),(select codice from album where codice=15));
insert into traccia
values(PK_TRACCIA.nextval,'Xxplosive ', date '1999–12-2', 93224507,'pomeriggio', 'inedito', 'rap', (select nome from artista where nome='Snoop Dogg'),(select codice from album where codice=15));
insert into traccia
values(PK_TRACCIA.nextval,'Bar One ', date '1999–3-4', 139098778,'mattino', 'inedito', 'rap', (select nome from artista where nome='Snoop Dogg'),(select codice from album where codice=15));
insert into traccia
values(PK_TRACCIA.nextval,'Light Speed ', date '1999–3-7', 20033349,'mattino', 'inedito', 'rap', (select nome from artista where nome='Snoop Dogg'),(select codice from album where codice=15));
insert into traccia
values(PK_TRACCIA.nextval,'Forgot About Dre ', date '1999–5-15', 73384990,'pomeriggio', 'inedito', 'rap', (select nome from artista where nome='Snoop Dogg'),(select codice from album where codice=15));
insert into traccia
values(PK_TRACCIA.nextval,'Bitch Niggaz', date '1999–6-7', 99212440,'pomeriggio', 'inedito', 'rap', (select nome from artista where nome='Snoop Dogg'),(select codice from album where codice=15));

 

