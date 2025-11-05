# Write your MySQL query statement below

select distinct l.num as ConsecutiveNums from logs  l
join logs  l2 on l.id=l2.id+1
join logs  l3 on l.id=l3.id+2
where l.num=l2.num and l2.num=l3.num