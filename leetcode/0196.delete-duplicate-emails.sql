# Write your MySQL query statement below
delete from person
where id  in (
    select * from (select a.id from person a
        inner join person b on a.email = b.email
        where a.id > b.id
    ) c
)