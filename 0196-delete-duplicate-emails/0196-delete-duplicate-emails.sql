/* Write your PL/SQL query statement below */
DELETE FROM PERSON
WHERE ID IN 
        (SELECT i.ID FROM 
            (SELECT ID,EMAIL,ROW_NUMBER() OVER (PARTITION BY EMAIL ORDER BY ID) AS rn
             FROM PERSON) i
             WHERE i.rn>1
);
