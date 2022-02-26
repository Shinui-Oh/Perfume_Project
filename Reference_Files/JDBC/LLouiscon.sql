CREATE TABLE member (
    memId VARCHAR2(10) CONSTRAINT memId_pk PRIMARY KEY,
    memPw VARCHAR2(10),
    memMail VARCHAR2(15),
    memPurcNum NUMBER(3) DEFAULT 0 CONSTRAINT memPurNum_ck CHECK (memPurcNum < 3)
);

INSERT INTO member (memId, memPw, memMail)
values ('b', 'bb', 'bbb@gmail.com');

SELECT * FROM member;

DELETE FROM member WHERE memId = 'b';

DROP TABLE member;

commit;
