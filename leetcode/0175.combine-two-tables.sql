# Write your MySQL query statement below
select  person.FirstName, person.LastName, address.City, address.State
from Person LEFT join Address on Person.PersonId = Address.PersonId