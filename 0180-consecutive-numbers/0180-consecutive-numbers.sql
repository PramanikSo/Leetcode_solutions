/* Write your PL/SQL query statement below */
SELECT DISTINCT Num AS ConsecutiveNums
FROM (
    SELECT Num,
           LAG(Num,1) OVER (ORDER BY Id) prev1,
           LAG(Num,2) OVER (ORDER BY Id) prev2
    FROM Logs
) t
WHERE Num = prev1 AND Num = prev2;
