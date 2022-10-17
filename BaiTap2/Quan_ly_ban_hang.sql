drop database if exists Quan_ly_ban_hang;
create database Quan_ly_ban_hang;
use Quan_ly_ban_hang;

create table Customer (
cId int primary key,
cName varchar(45),
cAge int
);

create table `Order` (
oId int primary key,
cId int,
oDate date,
oTotalPrice double,
foreign key (cId) references Customer(cId)
);

create table Produt (
pId int primary key,
pName varchar(45),
pPrice double
);

create table OrderDetail (
oId int,
pID int,
odQTY int,
primary key(oId, pId),
foreign key (oId) references `Order`(oId),
foreign key (pId) references Produt(pId)
);