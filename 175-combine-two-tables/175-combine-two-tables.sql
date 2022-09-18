/* Write your PL/SQL query statement below */
SELECT p.FirstName, p.LastName, addr.City, addr.State
FROM Person p
LEFT JOIN Address addr
    ON p.PersonId = addr.PersonId;