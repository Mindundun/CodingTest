SELECT  A.CATEGORY,
        A.PRICE AS 'MAX_PRICE',
        A.PRODUCT_NAME
  FROM FOOD_PRODUCT AS A 
        JOIN(SELECT CATEGORY, 
                    PRODUCT_ID,
                    MAX(PRICE) AS 'MAX_PRICE',	
                    PRODUCT_NAME
              FROM  FOOD_PRODUCT 
             WHERE  CATEGORY IN ('과자', '국', '김치', '식용유')
             GROUP   BY CATEGORY) AS B ON B.CATEGORY = A.CATEGORY AND B.MAX_PRICE = A.PRICE  
WHERE A.CATEGORY IN ('과자', '국', '김치', '식용유')
ORDER BY A.PRICE DESC
