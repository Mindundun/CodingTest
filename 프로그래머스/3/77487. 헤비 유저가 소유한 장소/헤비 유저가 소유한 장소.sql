-- 코드를 입력하세요
SELECT A.ID,
       A.NAME,
       A.HOST_ID
  FROM PLACES AS A 
        JOIN (SELECT HOST_ID
                FROM PLACES 
               GROUP BY HOST_ID 
              HAVING COUNT(1) >= 2) AS B ON B.HOST_ID = A.HOST_ID
 ORDER BY A.ID