# Write your MySQL query statement below
SELECT IFNULL( (
    select distinct Salary as SecondHighestSalary
    from Employee
    order by Salary desc limit 1 offset 1
), null) as SecondHighestSalary