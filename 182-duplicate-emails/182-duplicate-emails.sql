/* Write your PL/SQL query statement below */
select  email as Email from Person GROUP BY Email having count(id) > 1