/* Write your PL/SQL query statement below */

SELECT Name AS Customers FROM Customers
LEFT JOIN Orders ON Customers.Id = Orders.CustomerId
WHERE Orders.CustomerId IS NULL;