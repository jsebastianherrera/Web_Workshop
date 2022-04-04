create or replace table books
(
    title         varchar(255) not null,
    authorName    varchar(255) not null,
    authorSurname varchar(255) not null,
    description   varchar(255) not null,
    pages         int          not null,
    price         int          not null,
    year          int          not null,
    constraint books_pk
        primary key (title)
);
