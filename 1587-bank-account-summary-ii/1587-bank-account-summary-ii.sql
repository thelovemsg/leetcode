# Write your MySQL query statement below

# SELECT 
#     T1.name as name,
#     T2.amount as balance
# FROM Users T1
# INNER JOIN (
#     SELECT account, sum(amount) as amount
#         FROM Transactions
#         group by account
#     ) T2
#     ON T1.account = T2.account
# WHERE T2.amount >10000

SELECT name, 
    SUM(t.amount) AS balance
FROM Users AS u
JOIN Transactions AS t
USING (account)
GROUP BY u.account
HAVING balance > 10000
    