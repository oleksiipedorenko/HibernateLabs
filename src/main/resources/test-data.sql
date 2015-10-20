INSERT INTO CATEGORY (TITLE, DESCRIPTION) VALUES ('Digital', 'Digital records (aka video, audio, books etc)');
INSERT INTO CATEGORY (TITLE, DESCRIPTION) VALUES ('Movie', 'Some video content made by Hollywood people or ther guys with camera');
INSERT INTO CATEGORY (TITLE, DESCRIPTION) VALUES ('Table', 'One of the most usefull type of the furniture');

INSERT INTO ITEM (TITLE, DESCRIPTION, WEIGHT) VALUES ('Sennheiser OCX 686i Sports', 'Good sport headphones with garniture for that who know the price of good sound', 0.125);
INSERT INTO ITEM (TITLE, DESCRIPTION, WEIGHT, WIDtH, HEIGHT) VALUES ('Dinning table', 'Simple but comfortable dinner table for 6=8 persons family', 5.6, 1.46, 0.75);
INSERT INTO ITEM (TITLE, DESCRIPTION) VALUES ('Gladiator, digital copy', 'Digital copy of Riddley Scott movie');

INSERT INTO AUCTION_CLIENT (LOGIN, NAME, LAST_NAME, DELIVERY_ADDRESS, CONTACT_PHONE) VALUES ('Odin', 'John', 'Smith', 'USA, California, Los Angeles 16/45', '1234567890');
INSERT INTO AUCTION_CLIENT (LOGIN, NAME, LAST_NAME, DELIVERY_ADDRESS, CONTACT_PHONE) VALUES ('Loki', 'Ivan', 'Ivanov', 'Ukraine, Kyiv, Hreshatik 56/2a', '380951234567');

INSERT INTO LOT (ITEM_ID, OWNER_ID) VALUES (1, 1);

INSERT INTO ITEM_CATEGORY (ITEM_ID, CATEGORY_ID) VALUES (3, 1);
INSERT INTO ITEM_CATEGORY (ITEM_ID, CATEGORY_ID) VALUES (3, 2);
