/* Write your PL/SQL query statement below */

select e.name as Employee
from Employee e, Employee m
where e.Salary > m.Salary
and e.ManagerId = m.Id