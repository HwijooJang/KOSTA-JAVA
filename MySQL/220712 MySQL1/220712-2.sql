-- join(조인)

select count(*) from customer;
select * from customer, orders;
select * from customer, orders 
where customer.custid = orders.custid;
-- 3-22 고객과 고객의 주문에 관한 데이터를 고객별로 정렬
select *
from customer, orders
where customer.custid = orders.custid
order by customer.custid;
-- 3-23 고객 이름과 고객이 주문한 도서의 판매가격을 검색하시오.
select name, saleprice
from customer, orders
where customer.custid = orders.custid;

-- inner join 은 두개의 테이블에서 공통된거를 꺼내오는 join이다.
select customer.custid,name,saleprice
from customer inner join orders
on customer.custid = orders.custid
order by customer.custid;

-- 3-24 고객별로 주문한 모든 도서의 총 판매액을 구하고, 고객별로 정렬
select customer.name, sum(orders.saleprice)
from customer inner join orders
on customer.custid = orders.custid
group by customer.name
order by customer.name; 

-- 고객 이름과 고객이 주문한 도서의 이름
select customer.name, orders.bookid, book.bookname
from customer inner join orders
on customer.custid = orders.custid
inner join book on book.bookid = orders.bookid
order by customer.name;

-- 3-26 가격이 20000원 이상인 도서를 주문한 고객의 이름과 도서이름
select c.name, o.saleprice, b.bookname
from customer c inner join orders o
on c.custid = o.custid
inner join book b
on o.bookid = b.bookid
where o.saleprice >= 20000;

-- query cost 3.58
select c.name, o.saleprice, b.bookname
from customer c, orders o, book b
where c.custid = o.custid and o.bookid = b.bookid
and o.saleprice >= 20000;

-- 3-27 도서를 구매하지 않은 고객을 퐘하여 고객의 이름과 주문한 도서의 판매가격
select c.name, o.saleprice
from customer c right outer join orders o
on c.custid = o.custid;

-- 3-28 가격이 가장 비싼 도서의 이름
select max(price) from book
order by price desc;

select bookname from book
where price = (select max(price) from book);

-- 3-29 도서를 구매한 적이 있는 고객의 이름을 검색
select distinct c.name
from customer c inner join orders o
on c.custid = o.custid;

-- 3-30 대한미디어에서 출판한 도서를 구매한 고객의 이름
SELECT BOOKID 
FROM BOOK  
WHERE PUBLISHER = '대한미디어';
-- BOOKID = 3, 4
SELECT CUSTID 
FROM ORDERS 
WHERE BOOKID IN (3,4);
-- CUSTID = 1
SELECT NAME 
FROM CUSTOMER 
WHERE CUSTID IN (1);
-- 한번에 묶는 방법
SELECT NAME 
FROM CUSTOMER 
WHERE CUSTID IN (SELECT CUSTID 
FROM ORDERS 
WHERE BOOKID IN (SELECT BOOKID 
FROM BOOK  
WHERE PUBLISHER = '대한미디어'));

-- 3-31 출판사별로 출판사의 평균 도서 가격보다 비싼 도서를 구하시오.
select publisher as 출판사, avg(price) as 평균값
from book
group by publisher;

select *
from book inner join (
select publisher, avg(price) avg
from book
group by publisher)
as avgbook
on book.publisher = avgbook.publisher
where book.price > avgbook.avg
order book.publisher;

select b1.bookname
from book b1
where b1.price > (
select avg(b2.price) 
from book b2 
where b2.publisher = b1.publisher);

-- 3-32 대한민국 거주하는 고객의 이름과 도서를 주만한 고객의 이름을 보이시오.
select * from customer where address like '대한민국%'
union -- all을 붙히면은 중복데이터가 삭제되지않고 다 출력이 된다.
select * from customer where custid in (select custid from orders);






