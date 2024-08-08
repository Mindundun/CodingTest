-- 코드를 작성해주세요
SELECT  ID,          -- 개발자의 ID
        EMAIL,       -- 이메일
        FIRST_NAME,  -- 이름
        LAST_NAME    -- 성
  FROM DEVELOPER_INFOS
 WHERE 'Python' IN (SKILL_1, SKILL_2, SKILL_3)
 ORDER BY ID