# Write your MySQL query statement below
SELECT user_id, time_stamp as last_stamp from Logins t1
where t1.time_stamp 
    = (SELECT 
            MAX(time_stamp)
         FROM Logins t2
         WHERE t2.user_id = t1.user_id
          and YEAR(t2.time_stamp) = 2020
         GROUP BY t2.user_id
        )