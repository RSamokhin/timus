# Write your MySQL query statement below
select name as Customers from customers
where id not in (
    select Customers.id
    from Customers
        right JOIN Orders on Customers.id = Orders.CustomerId
)
