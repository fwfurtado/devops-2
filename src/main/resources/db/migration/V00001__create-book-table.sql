CREATE TABLE books (
    id BIGSERIAL,
    title varchar(100) NOT NULL,
    author varchar(100) NOT NULL,
    release_date DATE,

    CONSTRAINT pk_books PRIMARY KEY (id)
);