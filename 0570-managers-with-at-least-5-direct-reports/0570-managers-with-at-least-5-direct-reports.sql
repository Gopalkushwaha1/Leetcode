-- Select e2.name 
-- from Employee as e1 
-- join Employee as e2
-- on e1.managerId = e1.id 
-- Group by e2.managerId , e2.name 
-- Having Count(e1.name) >= 5 ; 

SELECT 
    m.name AS name
FROM Employee e
JOIN Employee m
    ON e.managerId = m.id
GROUP BY m.id, m.name
HAVING COUNT(e.id) >= 5;
