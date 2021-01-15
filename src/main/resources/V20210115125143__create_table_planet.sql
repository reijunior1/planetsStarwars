create table planet (
	id bigint not null unique,
	name varchar(50),
	climate varchar(50),
	ground varchar(50),
	person varchar(50),
	CONSTRAINT planet_pkey primary key (id)
);