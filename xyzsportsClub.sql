########################################
#Author: Nathaniel Cobbinah
#Bank Database and related queries
########################################

########################################
#Create database Sports
########################################
create database xyzsportsClub;

########################################
#Use xyzsportsClub
########################################
use xyzsportsClub;


########################################
#create table Staff
########################################
create table Staff(
	staffid int auto_increment,
	SSNIT int unique,
    firstname varchar(30),
    lastname varchar(30),
    primary key (staffid)
)engine =InnoDb;

########################################
#create table Players
########################################
create table Players(
	playerid int auto_increment,
    firstname varchar(30),
    lastname varchar(30),
    location varchar(30),
    primary key(playerid)
)engine = InnoDb;

########################################
#create table Sport
########################################
create table Sport(
	sportid int auto_increment,
	sportsname varchar(50) unique,
	primary key (sportid)
)engine = InnoDB;

########################################
#create table Drinks
########################################
create table Drinks(
	drinkid int auto_increment,
	drinkname varchar(20) unique,
    drinktype varchar(30),
    drinkcost decimal(10,2),
    primary key(drinkid)
)engine = InnoDB;


########################################
#create table Sport Subscription
########################################
create table Sportsubscription(
	subscriptionid int auto_increment,
    playerid int,
    sportid int,
    foreign key(playerid) references Players(playerid),
    foreign key(sportid) references Sport(sportid),
    primary key(subscriptionid)
)engine = InnoDB;


########################################
#create table Drinksbought
########################################
create table Drinksbought(
	id int auto_increment,
    boughtdate Date,
    playerid int,
    drinkid int,
    foreign key(playerid) references Players(playerid),
    foreign key(drinkid) references Drinks(drinkid),
    primary key(id)
)engine = InnoDb;


select * from Staff;
select * from Drinks;
select * from Players;
select * from sport;
select * from Sportsubscription;
select * from Drinksbought;





