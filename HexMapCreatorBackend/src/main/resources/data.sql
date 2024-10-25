DROP TABLE IF EXISTS taglist;
DROP TABLE IF EXISTS tags;
DROP TABLE IF EXISTS hexNodes;
DROP TABLE IF EXISTS maps;
DROP TABLE IF EXISTS accounts;

CREATE TABLE accounts (
	ID int auto_increment,
    USERNAME varchar(32) unique not null,
    PASS varchar(128) not null,
    MAP_AMOUNT INT unsigned not null default 0,
    primary key(ID)
);

CREATE TABLE maps (
	ID int auto_increment,
    ACCOUNT_ID int not null,
    TITLE varchar(32) not null,
    DESCRIPT varchar(1028),
    primary key(ID),
    foreign key(ACCOUNT_ID) references accounts(ID) ON DELETE CASCADE
);

CREATE TABLE tags(
	ID int auto_increment,
    MAP_REFERENCE_ID INT not null,
    TITLE varchar(32) not null,
    COLOR varchar(6) not null default "000000",
    PRIMARY KEY(ID),
    FOREIGN KEY(MAP_REFERENCE_ID) REFERENCES  maps(ID)
);

CREATE TABLE hexNodes(
	ID int auto_increment,
	X_AXIS int not null,
    Y_AXIS int not null,
    MAP_REFERENCE_ID INT not null,
    TITLE varchar(32) not null,
    DESCRIPT varchar(1028),
    PRIMARY KEY(ID),
    foreign key(MAP_REFERENCE_ID) references maps(ID) ON DELETE CASCADE
);

CREATE TABLE taglist(
	ID int auto_increment,
    HEX_NODE_ID int not null,
    TAG_NODE_ID int,
    PRIMARY KEY(ID),
	FOREIGN KEY(HEX_NODE_ID) REFERENCES hexNodes(ID),
    FOREIGN KEY(TAG_NODE_ID) REFERENCES tags(ID)
);

CREATE INDEX ind_account_id on accounts(ID);
CREATE INDEX ind_hexNodes on hexNodes(X_AXIS,Y_AXIS,MAP_REFERENCE_ID);


