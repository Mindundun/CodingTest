SELECT SUM(A.cnt)
  FROM (SELECT DISTINCT NAME, "1" AS 'cnt' -- 이름 기준으로 그룹화 후 카운트
          FROM ANIMAL_INS 
         WHERE NAME IS NOT NULL) AS A -- NAME이 NULL이 아닌 건
 
