# Write your MySQL query statement below
select tmp.Email from (
    select Email, count(*) as cnt from Person group by email
) as tmp where cnt > 1