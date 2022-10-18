drop database if exists Quan_li_ban_hang;
create database Quan_li_ban_hang;
use Quan_li_ban_hang;

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
pId int,
odQTY int,
primary key(oId, pId),
foreign key (oId) references `Order`(oId),
foreign key (pId) references Produt(pId)
);

insert into Customer (cId, cName, cAge)
values
	('1', 'Minh Quan', '10'),
	('2', 'Ngoc Oanh', '20'),
	('3', 'Hong Ha', '50');

insert into `Order` (oId, cId, oDate, oTotalPrice)
values
	('1', '1', '2006/2/23', null),
	('2', '2', '2006/2/23', null),
	('3', '1', '2006/2/23', null);

insert into Produt (pId, pName, pPrice)
values
('1', 'May Giac', '3'),
('2', 'Tu Lanh', '5'),
('3', 'Dieu Hoa', '7'),
('4', 'Quat', '1'),
('5', 'Bep Dien', '2');

insert into OrderDetail(oId, pId, odQTY)
values
('1', '1', '3'),
('1', '3', '7'),
('1', '4', '2'),
('2', '1', '1'),
('3', '1', '8'),
('2', '5', '4'),
('2', '3', '3');

-- 	Hiển thị các thông tin  gồm oID, oDate, oPrice của tất cả các hóa đơn trong bảng Order
select oID,oDate,oTotalPrice
from `order`;
-- Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách
select Customer.cName, Produt.pName from customer
inner join `order` on customer.cId = `order`.cId
inner join orderDetail on `order`.oId = orderDetail.oId
inner join produt on orderDetail.pId = produt.pId;
-- Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào
select * from customer where customer.cID not in (select cId from `order`);
-- Hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn (giá một hóa đơn được tính bằng tổng giá bán của từng loại mặt hàng xuất hiện trong hóa đơn.
-- Giá bán của từng loại được tính = odQTY*pPrice)
select `order`.oId,`order`.oDate,SUM(OrderDetail.odQTY * Produt.pPrice) as oTotalPrice
from `order`
inner join OrderDetail on `order`.oId = OrderDetail.oId
inner join Produt on OrderDetail.pId = Produt.pId
group by `order`.oId;