# Write your MySQL query statement below

SELECT 
        T1.customer_id,
        count(*) - count(T2.transaction_id) as count_no_trans
    FROM Visits T1
    LEFT OUTER JOIN Transactions T2
    ON T1.visit_id = T2.visit_id
    WHERE T2.transaction_id is null
    GROUP BY T1.customer_id

# SELECT 
#     T2.customer_id,
#     T1.transaction_id as count_no_trans
#     FROM Transactions T1
#     LEFT OUTER JOIN Visits T2
#     ON T1.visit_id = T2.visit_id

    