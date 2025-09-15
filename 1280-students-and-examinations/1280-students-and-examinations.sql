Select s.student_id , s.student_name , sub.subject_name , Count(e.subject_name) as attended_exams  
from Students as s 
cross join Subjects as sub 
left join Examinations as e 
on s.student_id = e.student_id and sub.subject_name = e.subject_name 
Group by s.student_id , s.student_name , sub.subject_name 
Order by s.student_id , sub.subject_name ; 


-- SELECT s.student_id, s.student_name, sub.subject_name,
--        COUNT(e.subject_name) AS attended_exams
-- FROM Students s
-- CROSS JOIN Subjects sub
-- LEFT JOIN Examinations e 
--     ON s.student_id = e.student_id 
--    AND sub.subject_name = e.subject_name
-- GROUP BY s.student_id, s.student_name, sub.subject_name
-- ORDER BY s.student_id, sub.subject_name;
