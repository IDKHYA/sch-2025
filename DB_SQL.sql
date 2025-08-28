/*
	Springboot 연동 쿼리
    */
    
-- 데이터베이스 생성

create database hrdb_spring;

-- 데이터 베이스 확인
use hrdb_spring;
select database();

-- 모든 테이블 확인
-- show tables;

-- Employee table 생성
/*
	create table [테이블명] (
		컴럼명	데이터타입	제약사항,
        ...
	)
*/
drop table Employee;

create table Employee (
sno int primary key, 	-- 사원번호
name varchar(10), 		-- 이름
address varchar(30), 	-- 주소
department varchar(40),	-- 부서
edate	date 			-- 날짜
);

-- 테이블 생성 확인
desc employee;

-- 데이터 추가
-- C(creaat) : 데이터 추가
insert into employee(sno, name, address, edate)
values(1234, '홍길동', '서울시 강남구', now());

insert into employee( name, sno , address)
values('이순신', 3456, '서울시 강서구');

insert into employee
values(2345, '김유신', '여산시 강남구');

-- R(read) : 데이터 조희
select * from employee;

select sno, name, address from employee where sno = 1234;

-- U(update) : 데이터 수정
update employee set name = '홍길순' where sno = 1234;

-- update employee set name = '홍길동', adress = '부산시 해운구' where sno = 1234;

select * from employee;
-- D(delete) : 데이터 삭 제

delete from employee where sno = 1234;

select * from employee
