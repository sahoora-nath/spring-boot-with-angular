CREATE TABLE CONTACT
(
  contact_Id BIGINT PRIMARY KEY,
  address1 VARCHAR,
  address2 VARCHAR,
  city VARCHAR,
  country VARCHAR,
  postcode VARCHAR,
  LAST_UPDATED_BY BIGINT,
  LAST_UPDATED_DATE DATE
);

CREATE TABLE CUSTOMER
(
  ID BIGINT PRIMARY KEY,
  first_Name VARCHAR,
  last_Name VARCHAR,
  email VARCHAR,
  contact_Id BIGINT,
  LAST_UPDATED_BY BIGINT,
  LAST_UPDATED_DATE DATE,
  FOREIGN KEY(contact_Id) REFERENCES contact(contact_Id)
);


CREATE TABLE hibernate_sequence
(
  next_val BIGINT
);
INSERT INTO hibernate_sequence(next_val) VALUES(1);
