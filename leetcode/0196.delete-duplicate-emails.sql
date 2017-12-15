# Write your MySQL query statement below
delete from person
where id  in (
    select * from (select a.id from person a
        inner join person b on a.email = b.email
        where a.id > b.id
    ) c
)

DELETE p1 FROM Person p1,
    Person p2
WHERE
    p1.Email = p2.Email AND p1.Id > p2.Id