CREATE TABLE driver
(
    id   uuid                                  NOT NULL,
    name text CHECK (char_length(name) <= 100) NOT NULL,
    mail text CHECK (char_length(mail) <= 100) NOT NULL UNIQUE,
    CONSTRAINT customer_pk PRIMARY KEY (id)
);
