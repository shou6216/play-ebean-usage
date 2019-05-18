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
  constraint uq_parent_child_id unique (child_id),
  constraint pk_parent primary key (id)
);

alter table parent add constraint fk_parent_child_id foreign key (child_id) references child (id) on delete restrict on update restrict;


# --- !Downs

alter table if exists parent drop constraint if exists fk_parent_child_id;

drop table if exists child cascade;

drop table if exists parent cascade;

