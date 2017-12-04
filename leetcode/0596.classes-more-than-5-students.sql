# Write your MySQL query statement below
select class
from (
    select class, count(distinct student) as cnt
    from courses
    group by class
) as a
where cnt > 4