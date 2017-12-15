# Write your MySQL query statement below

select a.id
from weather a
    join weather b on datediff(a.date, b.date) = 1
    and a.temperature > b.temperature