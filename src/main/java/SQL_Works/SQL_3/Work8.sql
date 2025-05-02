CREATE TABLE employee (
    id INTEGER PRIMARY KEY,
    name VARCHAR(50),
    birthday DATE,
    email VARCHAR(100)
);

-----------------------------------------------------------------------------------------------------------
insert into employee (name, birthday, email) values ('Carolina', '15-09-1996', 'cmonard0@scientificamerican.com');
insert into employee (name, birthday, email) values ('Gardy', '22-11-2021', 'gkerrigan1@blogspot.com');
insert into employee (name, birthday, email) values ('Darcie', '11-07-1968', 'dvanini2@soundcloud.com');
insert into employee (name, birthday, email) values ('Boyce', '20-01-1966', 'blivick3@cbsnews.com');
insert into employee (name, birthday, email) values ('Trenton', '13-11-2007', 'tputten4@gmpg.org');
insert into employee (name, birthday, email) values ('Venita', '13-10-1981', 'vtander5@ezinearticles.com');
insert into employee (name, birthday, email) values ('Mirilla', '18-11-2015', 'mbowerman6@harvard.edu');
insert into employee (name, birthday, email) values ('Vincenty', '20-11-1970', 'vdufaire7@unc.edu');
insert into employee (name, birthday, email) values ('Biddie', '02-08-2013', 'bmapston8@indiatimes.com');
insert into employee (name, birthday, email) values ('Dorris', '05-10-1955', 'dfransinelli9@rakuten.co.jp');
insert into employee (name, birthday, email) values ('Morris', '08-04-1969', 'mresdalea@nationalgeographic.com');
insert into employee (name, birthday, email) values ('Katerine', '01-03-1981', 'kmallionb@latimes.com');
insert into employee (name, birthday, email) values ('Gaven', '18-04-1962', 'gbarrellc@taobao.com');
insert into employee (name, birthday, email) values ('Hogan', '19-09-1991', 'hcuddond@harvard.edu');
insert into employee (name, birthday, email) values ('Corly', '23-12-1972', 'craesidee@dot.gov');
insert into employee (name, birthday, email) values ('Pavel', '23-11-2017', 'pstavef@cbc.ca');
insert into employee (name, birthday, email) values ('Keely', '20-09-2001', 'kpriddyg@about.me');
insert into employee (name, birthday, email) values ('Yelena', '29-06-2020', 'ybrandinoh@prlog.org');
insert into employee (name, birthday, email) values ('Spense', '28-07-2024', 'ssmallsi@java.com');
insert into employee (name, birthday, email) values ('Gianna', '09-03-1970', 'gbankerj@dmoz.org');
insert into employee (name, birthday, email) values ('Em', '19-07-1951', 'eingallk@wikipedia.org');
insert into employee (name, birthday, email) values ('Rebe', '03-10-2001', 'rcaulderl@sogou.com');
insert into employee (name, birthday, email) values ('Bernie', '26-07-1992', 'bstridem@patch.com');
insert into employee (name, birthday, email) values ('Jeromy', '28-10-1986', 'jsagen@nbcnews.com');
insert into employee (name, birthday, email) values ('Padriac', '11-06-1974', 'preddocho@friendfeed.com');
insert into employee (name, birthday, email) values ('Annamarie', '01-02-1965', 'aheaphyp@dion.ne.jp');
insert into employee (name, birthday, email) values ('Ambros', '20-02-2021', 'aceelyq@buzzfeed.com');
insert into employee (name, birthday, email) values ('Ryley', '17-03-2001', 'rbridgelandr@slideshare.net');
insert into employee (name, birthday, email) values ('Curtice', '15-03-1979', 'ccuvleys@scientificamerican.com');
insert into employee (name, birthday, email) values ('Brena', '08-05-2022', 'bstrevenst@europa.eu');
insert into employee (name, birthday, email) values ('Kiley', '20-01-1955', 'kedingtonu@squidoo.com');
insert into employee (name, birthday, email) values ('Alley', '11-01-1941', 'awedgbrowv@wordpress.org');
insert into employee (name, birthday, email) values ('Dale', '01-02-2015', 'darelesw@clickbank.net');
insert into employee (name, birthday, email) values ('Tadio', '15-10-1943', 'temmettx@harvard.edu');
insert into employee (name, birthday, email) values ('Scott', '19-10-1971', 'swaistally@scientificamerican.com');
insert into employee (name, birthday, email) values ('Kalli', '19-06-1950', 'ktomeoz@tmall.com');
insert into employee (name, birthday, email) values ('Patricio', '09-09-2018', 'pdowns10@cmu.edu');
insert into employee (name, birthday, email) values ('Taryn', '25-11-2012', 'ttetlow11@techcrunch.com');
insert into employee (name, birthday, email) values ('Doroteya', '23-11-1967', 'dyounge12@youku.com');
insert into employee (name, birthday, email) values ('Elfie', '20-01-1946', 'edarque13@gnu.org');
insert into employee (name, birthday, email) values ('Chlo', '26-12-1959', 'cchinnery14@shareasale.com');
insert into employee (name, birthday, email) values ('Annice', '17-11-2020', 'aharp15@sciencedirect.com');
insert into employee (name, birthday, email) values ('Nevsa', '12-04-1987', 'nlindeboom16@telegraph.co.uk');
insert into employee (name, birthday, email) values ('Tam', '31-03-1944', 'tbrummitt17@mac.com');
insert into employee (name, birthday, email) values ('Andee', '30-08-2023', 'amacronald18@ovh.net');
insert into employee (name, birthday, email) values ('Dalli', '20-11-1958', 'dferroli19@baidu.com');
insert into employee (name, birthday, email) values ('Somerset', '03-11-1986', 'smoss1a@usa.gov');
insert into employee (name, birthday, email) values ('Kriste', '10-02-1984', 'kfairbanks1b@1688.com');
insert into employee (name, birthday, email) values ('Luke', '08-02-1992', 'lbroadberrie1c@nature.com');
insert into employee (name, birthday, email) values ('Basilius', '06-12-2021', 'bzanelli1d@live.com');

--------------------------------------UPDATE-----------------------------------

UPDATE employee
SET name = 'Mustafa Tavusbay',
    birthday = '2004-07-02',
    email = 'mustafatvs@example.com'
WHERE id = 1;

-------------------------------------

UPDATE employee
SET email = 'update_name@exmpl.com',
    birthday = '1985-05-05'
WHERE name = 'Selcuk';

-------------------------------------

UPDATE employee
SET name = 'Changed Name'
WHERE email = 'chngedname_@example.com';

-------------------------------------

UPDATE employee
SET name = 'Birthday Match',
    email = 'bdaymatch@example.com'
WHERE birthday = '1970-12-10';

-------------------------------------

UPDATE employee
SET id = 99,
    name = 'Update ID and Name'
WHERE email = 'updated_name@example.com';

----------------------------------------DELETE-----------------------------------

DELETE FROM employee
WHERE id = 1;

-------------------------------------

DELETE FROM employee
WHERE name = 'Mustafa Tavusbay';

-------------------------------------

DELETE FROM employee
WHERE birthday = '1966-01-20';

-------------------------------------

DELETE FROM employee
WHERE email = 'kedingtonu@squidoo.com';

-------------------------------------

DELETE FROM employee
WHERE name = 'Tam' AND birthday = '1944-03-31';




