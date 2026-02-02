# 문자열 연결을 위한 CONCAT 사용
SELECT CONCAT(
        '/home/grep/src/',
        A.BOARD_ID, '/',
        A.FILE_ID,
        A.FILE_NAME,
        A.FILE_EXT
    ) AS FILE_PATH
  FROM USED_GOODS_FILE AS A 
    LEFT OUTER JOIN USED_GOODS_BOARD AS B ON B.BOARD_ID = A.BOARD_ID
 WHERE B.VIEWS = (SELECT MAX(VIEWS) 
                    FROM USED_GOODS_BOARD) # 가장 많이 나온 VIEWS
 ORDER BY A.FILE_ID DESC;
 