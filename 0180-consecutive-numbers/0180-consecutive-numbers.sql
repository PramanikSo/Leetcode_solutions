# Write your MySQL query statement below
-- SELECT DISTINCT(L1.NUM) AS ConsecutiveNums  
-- FROM LOGS L1, LOGS L2, LOGS L3
-- WHERE
-- L1.ID = L2.ID - 1
-- AND L2.ID = L3.ID - 1
-- AND L1.NUM = L2.NUM
-- AND L2.NUM = L3.NUM;

-- Alternative

SELECT DISTINCT Num AS ConsecutiveNums
FROM (
    SELECT Num,
           LAG(Num,1) OVER (ORDER BY Id) prev1,
           LAG(Num,2) OVER (ORDER BY Id) prev2
    FROM Logs
) t
WHERE Num = prev1 AND Num = prev2;

