use db;

insert into STUDENTS (first_name, last_name, faculty, current_year) values
	('Jan', 'Kowalski', "Fizyka", 1),
	('Ewa', 'Kowalska', 'Astronomia', 2),
    ('Krystian', 'Brodaty', 'Informatyka', 1),
    ('Agata', 'Herbata', 'Fizyka', 1),
    ('Tomasz', 'Plecak', 'Fizyka', 2),
    ('Ewelina', 'Lina', 'Informatyka', 1),
    ('Eustachy', 'Rzeka', 'Fizyka', 2);
    
insert into TEACHERS (first_name, last_name) values
	('Marian', 'Jezioro'),
	("Joanna", 'Talerz'),
	('Edmund', 'Gruszka');
    
insert into ASSIGNMENTS (title, content, attachment) values
	('Wstęp do sortowania', 'Zaimplementuj 3 dowolne metody sortowania', null),
	('Title', 'Content', null);
    
insert into SOLUTIONS (student_id, content) values
	(1, 'Jan solution 1'),
	(1, 'Jan solution 2'),
	(1, 'Jan solution2 1'),
	(1, 'Jan solution2 2'),
	(2, 'Ewa solution 1');
    
insert into ASSIGNMENTS_SOLUTIONS (assignment_id, solution_id) values
	(1, 1), (1, 2), (1, 5), (2, 3), (2, 4);
    
insert into COURSES (title, ects) values
	('Analiza matematyczna 1', 5),
	('Podstawy programowania', 3),
    ('Matematyka dyskretna', 4);
    
insert into GROUPS (course_id, teacher_id) values
	(1, 1), (1, 2), (2, 1), (2, 2), (3, 2);
    
insert into GROUPS_STUDENTS (group_id, student_id) values
	(1, 1), (1, 2), (1, 3), (1, 4), (1, 5), (1, 6), (1, 7),
    (2, 1), (2, 4), (2, 6),
	(3, 1), (3,2 ), (3, 3);
    
select * from STUDENTS;
select * from ASSIGNMENTS;
select * from SOLUTIONS;
select * from COURSES;
select * from GROUPS;

select * from GROUPS_STUDENTS as gs
	join GROUPS as g on gs.group_id = g.id
    join STUDENTS as s on gs.student_id = s.id;

select * from ASSIGNMENTS_SOLUTIONS as a_s
	join ASSIGNMENTS as a on a_s.assignment_id = a.id
	join SOLUTIONS as s on a_s.solution_id = s.id
	order by assignment_id;
    