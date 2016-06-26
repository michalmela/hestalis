CREATE TABLE tblplayer(
   id SERIAL PRIMARY KEY,
   username TEXT NOT NULL UNIQUE,
   password TEXT NOT NULL,
   last_login TIMESTAMP
);