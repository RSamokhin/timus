# Write your MySQL query statement below
select (
    case
        when mod(id, 2) = 1
            then (
                case
                    when id = (select count(*) from seat)
                        then id
                        else id + 1
                end
            )
            else id - 1
    end
) as id, student from seat
order by id asc
