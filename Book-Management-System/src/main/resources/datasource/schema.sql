CREATE TABLE BOOK (
    id SERIAL
    ,bookName TEXT NOT NULL
    ,authorName TEXT NOT NULL
    ,publisher TEXT NOT NULL
    ,category TEXT NOT NULL
    ,publishedDate DATE NOT NULL
    ,bookAbstract TEXT
    ,PRIMARY KEY (id)
);