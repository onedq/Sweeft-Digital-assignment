create table teachers(
id          number
constraint  teachers_id_pk primary key,
first_name  varchar2(1024),
last_name   varchar2(1024),
gender      varchar2(32),
age         number);

create table students(
id          number
constraint  students_id_pk primary key,
first_name  varchar2(1024),
last_name   varchar2(1024),
gender      varchar2(32),
class       number);

create table teachers_to_students_links(
id          number
constraint  link_id_pk primary key,
teacher_id  number,
student_id  number,
constraint  teachers_id_fk foreign key (teacher_id) REFERENCES teachers(id),
constraint  students_id_fk foreign key (student_id) REFERENCES students(id));


select t.*
from    students s,
        teachers t,
        teachers_to_students_links l
where   s.first_name = 'giorgi'
and     s.id = l.student_id
and     t.id = l.teacher_id