-- begin MUZEY_ARCHAEOLOGIST
create table MUZEY_ARCHAEOLOGIST (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FULL_NAME text,
    AGE integer,
    UNIVERSITY_ID uuid,
    --
    primary key (ID)
)^
-- end MUZEY_ARCHAEOLOGIST
-- begin MUZEY_PLACE
create table MUZEY_PLACE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TITLE varchar(255),
    --
    primary key (ID)
)^
-- end MUZEY_PLACE
-- begin MUZEY_UNIVERSITY
create table MUZEY_UNIVERSITY (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TITLE text,
    CITY text,
    --
    primary key (ID)
)^
-- end MUZEY_UNIVERSITY
-- begin MUZEY_EX_TYPE
create table MUZEY_EX_TYPE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TITLE varchar(255),
    --
    primary key (ID)
)^
-- end MUZEY_EX_TYPE
-- begin MUZEY_EXHIBIT
create table MUZEY_EXHIBIT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TITLE text,
    PLACE_ID uuid,
    AUTHOR varchar(255),
    ERA_ID uuid,
    EXT_TYPE_ID uuid,
    --
    primary key (ID)
)^
-- end MUZEY_EXHIBIT
-- begin MUZEY_ERA
create table MUZEY_ERA (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TITLE text,
    TIME_START varchar(255),
    TIME_END varchar(255),
    KIND_ID uuid,
    --
    primary key (ID)
)^
-- end MUZEY_ERA
-- begin MUZEY_KIND_OF_ERA
create table MUZEY_KIND_OF_ERA (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TITLE varchar(255),
    --
    primary key (ID)
)^
-- end MUZEY_KIND_OF_ERA
