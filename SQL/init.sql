drop database if exists db;
create database db;
use db;

create table STUDENTS (
	id int auto_increment,
    first_name nvarchar(256) not null,
    last_name nvarchar(256) not null,
    faculty nvarchar(256) not null,
    current_year int not null,
    
    primary key (id)
);

create table TEACHERS (
	id int auto_increment,
    first_name nvarchar(256) not null,
    last_name nvarchar(256) not null,
    
    primary key(id)
);

create table ASSIGNMENTS (
	id int auto_increment,
    title nvarchar(512) not null,
    content nvarchar(8192) not null,
    attachment blob,
    
    primary key(id)
);

create table SOLUTIONS (
	id int auto_increment,
    student_id int,
    content text not null,
    grade int,
    
    primary key(id),
    foreign key(student_id) references STUDENTS(id)
);

create table ASSIGNMENTS_SOLUTIONS (
	assignment_id int,
    solution_id int,
    
    foreign key (assignment_id) references ASSIGNMENTS(id),
    foreign key (solution_id) references SOLUTIONS(id)
); 
/* Many to many -> student can have many 
* solutions to the same problem e.g 
* after changing sth we want old versions to be available
*/
create table COURSES (
	id int auto_increment,
    title nvarchar(512) not null,
    ects int not null,
    
    primary key(id)
);

create table COURSES_TEACHERS (
	course_id int,
    teacher_id int,
    
    foreign key(course_id) references COURSES(id),
    foreign key(teacher_id) references TEACHERS(id)
);