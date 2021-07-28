

use studentmanagerment;

drop table if exists college;

create table college
(
    id    int primary key,
    dname varchar(20) not null
);

drop table if exists student;

create table student
(
    id       int primary key auto_increment,
    ename    varchar(50) not null,
    email    varchar(50),
    gender   int,
    birthday datetime,
    did      int references college (id)
);

insert into college(id, dname)
values (101, '电信学院'),
       (102, '计算机学院'),
       (103, '人外学院'),
       (104, '法学院'),
       (105, '理学院');

insert into student (ename , email, gender, birthday, did)
VALUES ('AA', '1234567@qq.com', 1, now(), 101),
       ('BB', '1234567@163.com', 0, now(), 102),
       ('CC', '4234335@qq.com', 1, now(), 103),
       ('DD', '4343343@qq.com', 0, now(), 104),
       ('EE', '6768554@qq.com', 1, now(), 105);

select e.id, e.ename, e.email, e.gender, e.birthday, dname
from student e
         left join college d on d.id = e.did;

select *
from college;