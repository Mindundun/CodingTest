-- 코드를 작성해주세요
SELECT SUM(B.Score) AS SCORE,
       B.EMP_NO,	
       A.EMP_NAME,	
       A.POSITION,
       A.EMAIL
  FROM HR_EMPLOYEES AS A 
    LEFT OUTER JOIN HR_GRADE        AS B ON B.EMP_NO    = A.EMP_NO
    LEFT OUTER JOIN HR_DEPARTMENT   AS C ON C.DEPT_ID   = A.DEPT_ID
 -- WHERE B.SCORE = (SELECT SUM(SCORE) FROM HR_GRADE GROUP BY EMP_NO)
GROUP BY B.EMP_NO,	
       A.EMP_NAME,	
       A.POSITION,
       A.EMAIL
ORDER BY SCORE DESC LIMIT 1;