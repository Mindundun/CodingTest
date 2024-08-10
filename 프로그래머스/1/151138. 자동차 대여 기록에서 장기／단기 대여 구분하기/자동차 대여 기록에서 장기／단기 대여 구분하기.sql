SELECT  history_id, 
        car_id, 
        CONVERT(start_date,CHAR) AS start_date, 
        CONVERT(end_date,CHAR) AS end_date, 
        (CASE WHEN datediff(END_DATE,START_DATE)+1 >= 30 THEN '장기 대여' ELSE '단기 대여' end) AS RENT_TYPE
  FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY 
 WHERE LEFT(START_DATE,7) = '2022-09' 
 ORDER BY HISTORY_ID DESC