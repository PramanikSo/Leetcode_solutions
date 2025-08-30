/* Write your PL/SQL query statement below */
-- SELECT MAX(SALARY) AS SecondHighestSalary FROM EMPLOYEE WHERE SALARY < (SELECT MAX(SALARY) FROM EMPLOYEE);
SELECT MAX(salary)
AS SecondHighestSalary
FROM Employee
WHERE salary
NOT IN (
SELECT MAX(salary)
FROM Employee);