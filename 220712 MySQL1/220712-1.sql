use madang;

-- select all distinct
-- from
-- where
-- group by
-- having
-- order by asc, desc

select 10 + 20 as hap;
select concat("hello" , " " , "bye") as test;

-- 3-8
select bookname, publisher from book where bookname like '%축구%';
-- 3-9
select * from book where bookname like '_구%';
-- 3-10
select * from book where bookname like '%축구%' and price >= 20000;
-- 정렬
select * from book order by bookname desc;
-- 3-11

-- 연습문제 1 - 1번 부터 1- 7 번까지
select bookname from book where bookid = 1;
select bookname from book where price >= 20000;
select name, sum(saleprice) from customer, orders where name = '박지성';
select count(*) from customer, orders where name = '박지성';
select count(distinct publisher) from book, customer where name = '박지성';

select  from book, customer where name = '박지성';

-- 연습문제 2 - 1번 부터 2 - 13 까지












