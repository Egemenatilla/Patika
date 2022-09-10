1-test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.
    
    Create Table emoloyee (
    id integer ,
    name VARCHAR(50),
    birthday DATE ,
    email VARCHAR(100)
    );
    
2-Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.

    insert into MOCK_DATA (id, name, birthday, email) values (1, 'Lovell', '8/17/2003', 'lkruschev0@netvibes.com');
    insert into MOCK_DATA (id, name, birthday, email) values (2, 'Brittan', '11/18/2013', 'bingon1@auda.org.au');
    insert into MOCK_DATA (id, name, birthday, email) values (3, 'Kittie', '6/10/2011', 'kwashington2@etsy.com');
    insert into MOCK_DATA (id, name, birthday, email) values (4, 'Karissa', '12/14/2019', 'khudless3@histats.com');
    insert into MOCK_DATA (id, name, birthday, email) values (5, 'Caddric', '4/16/2008', 'cattard4@geocities.com');
    insert into MOCK_DATA (id, name, birthday, email) values (6, 'Horst', '10/13/2002', 'hraden5@census.gov');
    insert into MOCK_DATA (id, name, birthday, email) values (7, 'Drusilla', '5/25/2022', 'dhewes6@homestead.com');
    insert into MOCK_DATA (id, name, birthday, email) values (8, 'Orrin', '12/19/2019', 'oseabourne7@de.vu');
    insert into MOCK_DATA (id, name, birthday, email) values (9, 'Giordano', '7/14/2022', 'gquinion8@arstechnica.com');
    insert into MOCK_DATA (id, name, birthday, email) values (10, 'August', '12/6/2020', 'aneighbour9@xrea.com');
    insert into MOCK_DATA (id, name, birthday, email) values (11, 'Guthrie', '8/22/2007', 'gfaldoa@dion.ne.jp');
    insert into MOCK_DATA (id, name, birthday, email) values (12, 'Polly', '9/2/2021', 'pempletonb@google.es');
    insert into MOCK_DATA (id, name, birthday, email) values (13, 'Brit', '5/17/2018', 'bboughtonc@vimeo.com');
    insert into MOCK_DATA (id, name, birthday, email) values (14, 'Cheryl', '3/8/2013', 'crizziellod@deliciousdays.com');
    insert into MOCK_DATA (id, name, birthday, email) values (15, 'Adrien', '8/31/2020', 'abraverye@com.com');
    insert into MOCK_DATA (id, name, birthday, email) values (16, 'Tom', '7/31/2006', 'talbistonf@hexun.com');
    insert into MOCK_DATA (id, name, birthday, email) values (17, 'Beryl', '10/17/2003', 'byabsleyg@dailymail.co.uk');
    insert into MOCK_DATA (id, name, birthday, email) values (18, 'Abagael', '1/16/2019', 'ahuchoth@sina.com.cn');
    insert into MOCK_DATA (id, name, birthday, email) values (19, 'Federico', '11/4/2004', 'fofeeneyi@engadget.com');
    insert into MOCK_DATA (id, name, birthday, email) values (20, 'Dorree', '11/12/2001', 'dhellisj@tmall.com');
    insert into MOCK_DATA (id, name, birthday, email) values (21, 'Merlina', '2/14/2005', 'mschrirenk@de.vu');
    insert into MOCK_DATA (id, name, birthday, email) values (22, 'Jesse', '1/4/2013', 'jgilliatl@utexas.edu');
    insert into MOCK_DATA (id, name, birthday, email) values (23, 'Saunder', '5/12/2016', 'swabersichm@ebay.co.uk');
    insert into MOCK_DATA (id, name, birthday, email) values (24, 'Verge', '8/23/2021', 'vgeorgeoun@networkadvertising.org');
    insert into MOCK_DATA (id, name, birthday, email) values (25, 'Dill', '10/21/2002', 'dluchellio@cargocollective.com');
    insert into MOCK_DATA (id, name, birthday, email) values (26, 'Titos', '7/7/2010', 'tgostallp@mozilla.com');
    insert into MOCK_DATA (id, name, birthday, email) values (27, 'Jacquelyn', '10/14/2019', 'jrolfiniq@twitter.com');
    insert into MOCK_DATA (id, name, birthday, email) values (28, 'Janette', '11/27/2017', 'jgresswoodr@vistaprint.com');
    insert into MOCK_DATA (id, name, birthday, email) values (29, 'Derry', '9/11/2018', 'dburdens@engadget.com');
    insert into MOCK_DATA (id, name, birthday, email) values (30, 'Jed', '8/3/2012', 'jrawkesbyt@mysql.com');
    insert into MOCK_DATA (id, name, birthday, email) values (31, 'Bart', '6/1/2020', 'bdysertu@bigcartel.com');
    insert into MOCK_DATA (id, name, birthday, email) values (32, 'Diane-marie', '3/18/2003', 'dhobsonv@archive.org');
    insert into MOCK_DATA (id, name, birthday, email) values (33, 'Kalina', '5/25/2009', 'kdabbotdoylew@howstuffworks.com');
    insert into MOCK_DATA (id, name, birthday, email) values (34, 'Guinevere', '11/11/2020', 'ggahanx@ox.ac.uk');
    insert into MOCK_DATA (id, name, birthday, email) values (35, 'Rowe', '4/3/2006', 'rhumbley@cloudflare.com');
    insert into MOCK_DATA (id, name, birthday, email) values (36, 'Oralle', '7/27/2011', 'orollasonz@google.co.jp');
    insert into MOCK_DATA (id, name, birthday, email) values (37, 'Sydel', '10/29/2010', 'snineham10@cdbaby.com');
    insert into MOCK_DATA (id, name, birthday, email) values (38, 'Babb', '12/14/2000', 'bflegg11@xrea.com');
    insert into MOCK_DATA (id, name, birthday, email) values (39, 'Harald', '8/21/2022', 'hpeltzer12@independent.co.uk');
    insert into MOCK_DATA (id, name, birthday, email) values (40, 'Bellanca', '12/22/2000', 'blamplough13@gizmodo.com');
    insert into MOCK_DATA (id, name, birthday, email) values (41, 'Bartolemo', '1/24/2018', 'btumilty14@umn.edu');
    insert into MOCK_DATA (id, name, birthday, email) values (42, 'Nevsa', '4/23/2010', 'nsirman15@cnn.com');
    insert into MOCK_DATA (id, name, birthday, email) values (43, 'Hillard', '12/11/2003', 'hsaggs16@facebook.com');
    insert into MOCK_DATA (id, name, birthday, email) values (44, 'Gibbie', '3/8/2020', 'gcusted17@pen.io');
    insert into MOCK_DATA (id, name, birthday, email) values (45, 'Byran', '5/21/2014', 'bwhifen18@odnoklassniki.ru');
    insert into MOCK_DATA (id, name, birthday, email) values (46, 'Elysha', '2/23/2018', 'ejakel19@reuters.com');
    insert into MOCK_DATA (id, name, birthday, email) values (47, 'Sergent', '10/5/2018', 'slabusquiere1a@cmu.edu');
    insert into MOCK_DATA (id, name, birthday, email) values (48, 'Krishna', '2/19/2022', 'karling1b@auda.org.au');
    insert into MOCK_DATA (id, name, birthday, email) values (49, 'Drew', '9/4/2011', 'dwitchell1c@diigo.com');
    insert into MOCK_DATA (id, name, birthday, email) values (50, 'Raff', '3/6/2002', 'rgebuhr1d@disqus.com');
    
    
3-Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.
    Update set
    name = 'Franchis',
    birthday = '4/3/2001',
    email = 'franchisgnu@hotmail.com'
    where id = 1;
    
    Update set
    name = 'Jean',
    birthday = '6/22/2008',
    email = 'jmaus0@tmall.com'
    where id = 2;
    
    Update set
    name = 'Josy',
    birthday = '2/2/2020',
    email = 'jschowenburg1@gravatar.com'
    where id = 3;
    
    Update set
    name = 'Gelya',
    birthday = '7/10/2011',
    email = 'ghollingsbee2@forbes.com'
    where id = 4;
    
    Update set
    name = 'Willyt',
    birthday = '7/12/2012',
    email = 'wkuscha3@bizjournals.com'
    where id = 5;
    
4-Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.
    
    Delete from employee 
    where id IN (1,2,3,4,5)
    returning *;
    
