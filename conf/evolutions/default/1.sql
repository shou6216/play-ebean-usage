# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table child (
  id                            varchar(255) not null,
  name                          varchar(255),
  constraint pk_child primary key (id)
);

create table parent (
  id                            varchar(255) not null,
  name                          varchar(255),
  child_id                      varchar(255),
  constraint pk_parent primary key (id)
);


# --- !Downs

drop table if exists child cascade;

drop table if exists parent cascade;

