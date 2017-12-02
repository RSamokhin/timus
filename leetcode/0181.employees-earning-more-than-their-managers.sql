# Write your MySQL query statement below
select a.Name as Employee
from employee a inner join Employee b
on a.ManagerId = b.Id
where a.salary > b.salary
