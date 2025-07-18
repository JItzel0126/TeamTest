TRUNCATE TABLE TB_DEPT;
TRUNCATE TABLE TB_EMP;
TRUNCATE TABLE TB_FAQ;
TRUNCATE TABLE TB_FILE_DB;
TRUNCATE TABLE TB_GALLERY;

-- 샘플 데이터 입력
INSERT INTO TB_DEPT
VALUES (SQ_DEPT.nextval, 'ACCOUNTING', 'NEW YORK',TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'),NULL);
INSERT INTO TB_DEPT
VALUES (SQ_DEPT.nextval, 'RESEARCH', 'DALLAS', TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'),NULL);
INSERT INTO TB_DEPT
VALUES (SQ_DEPT.nextval, 'SALES', 'CHICAGO', TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'),NULL);
INSERT INTO TB_DEPT
VALUES (SQ_DEPT.nextval, 'OPERATIONS', 'BOSTON', TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'),NULL);

INSERT INTO TB_EMP
VALUES (SQ_EMP.nextval, 'SMITH', 'CLERK', 7902, TO_CHAR(to_date('17-12-1980', 'dd-mm-yyyy'), 'YYYY-MM-DD HH24:MI:SS'), 800, NULL,
        10, TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'),NULL);
INSERT INTO TB_EMP
VALUES (SQ_EMP.nextval, 'ALLEN', 'SALESMAN', 7698, TO_CHAR(to_date('20-2-1981', 'dd-mm-yyyy'), 'YYYY-MM-DD HH24:MI:SS'), 1600,
        300, 30, TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'),NULL);
INSERT INTO TB_EMP
VALUES (SQ_EMP.nextval, 'WARD', 'SALESMAN', 7698, TO_CHAR(to_date('22-2-1981', 'dd-mm-yyyy'), 'YYYY-MM-DD HH24:MI:SS'), 1250, 500,
        30, TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'),NULL);
INSERT INTO TB_EMP
VALUES (SQ_EMP.nextval, 'JONES', 'MANAGER', 7839, TO_CHAR(to_date('2-4-1981', 'dd-mm-yyyy'), 'YYYY-MM-DD HH24:MI:SS'), 2975, NULL,
        20, TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'),NULL);
INSERT INTO TB_EMP
VALUES (SQ_EMP.nextval, 'MARTIN', 'SALESMAN', 7698, TO_CHAR(to_date('28-9-1981', 'dd-mm-yyyy'), 'YYYY-MM-DD HH24:MI:SS'), 1250,
        1400, 30, TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'),NULL);
INSERT INTO TB_EMP
VALUES (SQ_EMP.nextval, 'BLAKE', 'MANAGER', 7839, TO_CHAR(to_date('1-5-1981', 'dd-mm-yyyy'), 'YYYY-MM-DD HH24:MI:SS'), 2850, NULL,
        30, TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'),NULL);
INSERT INTO TB_EMP
VALUES (SQ_EMP.nextval, 'CLARK', 'MANAGER', 7839, TO_CHAR(to_date('9-6-1981', 'dd-mm-yyyy'), 'YYYY-MM-DD HH24:MI:SS'), 2450, NULL,
        10, TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'),NULL);
INSERT INTO TB_EMP
VALUES (SQ_EMP.nextval, 'SCOTT', 'ANALYST', 7566, TO_CHAR(to_date('13-07-1987', 'dd-mm-yyyy'), 'YYYY-MM-DD HH24:MI:SS'), 3000,
        NULL, 20, TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'),NULL);
INSERT INTO TB_EMP
VALUES (SQ_EMP.nextval, 'KING', 'PRESIDENT', NULL, TO_CHAR(to_date('17-11-1981', 'dd-mm-yyyy'), 'YYYY-MM-DD HH24:MI:SS'), 5000,
        NULL, 10, TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'),NULL);
INSERT INTO TB_EMP
VALUES (SQ_EMP.nextval, 'TURNER', 'SALESMAN', 7698, TO_CHAR(to_date('8-9-1981', 'dd-mm-yyyy'), 'YYYY-MM-DD HH24:MI:SS'), 1500, 0,
        30, TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'),NULL);
INSERT INTO TB_EMP
VALUES (SQ_EMP.nextval, 'ADAMS', 'CLERK', 7788, TO_CHAR(to_date('13-07-1987', 'dd-mm-yyyy'), 'YYYY-MM-DD HH24:MI:SS'), 1100, NULL,
        20, TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'),NULL);
INSERT INTO TB_EMP
VALUES (SQ_EMP.nextval, 'JAMES', 'CLERK', 7698, TO_CHAR(to_date('3-12-1981', 'dd-mm-yyyy'), 'YYYY-MM-DD HH24:MI:SS'), 950, NULL,
        30, TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'),NULL);
INSERT INTO TB_EMP
VALUES (SQ_EMP.nextval, 'FORD', 'ANALYST', 7566, TO_CHAR(to_date('3-12-1981', 'dd-mm-yyyy'), 'YYYY-MM-DD HH24:MI:SS'), 3000, NULL,
        20, TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'),NULL);
INSERT INTO TB_EMP
VALUES (SQ_EMP.nextval, 'MILLER', 'CLERK', 7782, TO_CHAR(to_date('23-1-1982', 'dd-mm-yyyy'), 'YYYY-MM-DD HH24:MI:SS'), 1300, NULL,
        10, TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'),NULL);

INSERT INTO TB_FAQ
VALUES (SQ_FAQ.nextval, '제목', '해결방법', TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS') ,NULL);
INSERT INTO TB_FAQ
VALUES (SQ_FAQ.nextval, '제목2', '해결방법2', TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS') ,NULL);
INSERT INTO TB_FAQ
VALUES (SQ_FAQ.nextval, '제목3', '해결방법3', TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS') ,NULL);
INSERT INTO TB_FAQ
VALUES (SQ_FAQ.nextval, '제목4', '해결방법4', TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS') ,NULL);

INSERT INTO TB_FILE_DB(UUID, FILE_TITLE, FILE_CONTENT, FILE_DATA, FILE_URL, INSERT_TIME)
VALUES (12345671, '제목1', '내용1',NULL, 'https://placehold.co/600x400', TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO TB_FILE_DB(UUID, FILE_TITLE, FILE_CONTENT, FILE_DATA, FILE_URL, INSERT_TIME)
VALUES (12345672, '제목2', '내용2',NULL, 'https://placehold.co/600x400', TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO TB_FILE_DB(UUID, FILE_TITLE, FILE_CONTENT, FILE_DATA, FILE_URL, INSERT_TIME)
VALUES (12345673, '제목3', '내용3',NULL, 'https://placehold.co/600x400', TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO TB_FILE_DB(UUID, FILE_TITLE, FILE_CONTENT, FILE_DATA, FILE_URL, INSERT_TIME)
VALUES (12345674, '제목4', '내용4',NULL, 'https://placehold.co/600x400', TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'));

INSERT INTO TB_GALLERY(UUID, GALLERY_TITLE, GALLERY_DATA, GALLERY_FILE_URL, INSERT_TIME)
VALUES (12345671, '제목1',NULL, 'https://placehold.co/600x400', TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'));

INSERT INTO TB_GALLERY(UUID, GALLERY_TITLE, GALLERY_DATA, GALLERY_FILE_URL, INSERT_TIME)
VALUES (12345672, '제목2',NULL, 'https://placehold.co/600x400', TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'));

INSERT INTO TB_GALLERY(UUID, GALLERY_TITLE, GALLERY_DATA, GALLERY_FILE_URL, INSERT_TIME)
VALUES (12345673, '제목3',NULL, 'https://placehold.co/600x400', TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'));

INSERT INTO TB_GALLERY(UUID, GALLERY_TITLE, GALLERY_DATA, GALLERY_FILE_URL, INSERT_TIME)
VALUES (12345674, '제목4',NULL, 'https://placehold.co/600x400', TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'));

-- admin user 1명 최초 생성
-- id : forbob
-- password : 123456
-- email : forbob@naver.com
-- roles : ROLE_ADMIN
INSERT INTO TB_MEMBER VALUES('forbob@naver.com','$2a$10$TG1a5ywSrGNgf7/fFH.m0.EdTzHax8AGYNeAr8aIseF3DKyO0lDti','forbob','ROLE_ADMIN', 'N', TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'),NULL, NULL);

COMMIT;