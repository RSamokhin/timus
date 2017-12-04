# Write your MySQL query statement below
select c.depName as Department, d.name as Employee, c.empSalary as Salary  from (
    select a.departmentId as depId, department.name as depName, max(a.salary) as empSalary
    from employee as a
        inner join department on a.departmentId = department.id
    group by a.departmentId
) as c
    inner join employee d on (c.depId = d.departmentId and c.empSalary = d.salary)