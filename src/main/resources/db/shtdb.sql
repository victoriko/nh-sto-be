CREATE MEMORY TABLE LETTCCMMNCLCODE(CL_CODE CHAR(3) NOT NULL PRIMARY KEY,CL_CODE_NM VARCHAR(60),CL_CODE_DC VARCHAR(200),USE_AT CHAR(1),FRST_REGIST_PNTTM TIMESTAMP,FRST_REGISTER_ID VARCHAR(20),LAST_UPDT_PNTTM TIMESTAMP,LAST_UPDUSR_ID VARCHAR(20))
CREATE MEMORY TABLE LETTCCMMNCODE(CODE_ID VARCHAR(6) NOT NULL PRIMARY KEY,CODE_ID_NM VARCHAR(60),CODE_ID_DC VARCHAR(200),USE_AT CHAR(1),CL_CODE CHAR(3),FRST_REGIST_PNTTM TIMESTAMP,FRST_REGISTER_ID VARCHAR(20),LAST_UPDT_PNTTM TIMESTAMP,LAST_UPDUSR_ID VARCHAR(20),CONSTRAINT SYS_FK_86 FOREIGN KEY(CL_CODE) REFERENCES LETTCCMMNCLCODE(CL_CODE))
CREATE MEMORY TABLE LETTCCMMNDETAILCODE(CODE_ID VARCHAR(6) NOT NULL,CODE VARCHAR(15) NOT NULL,CODE_NM VARCHAR(60),CODE_DC VARCHAR(200),USE_AT CHAR(1),FRST_REGIST_PNTTM TIMESTAMP,FRST_REGISTER_ID VARCHAR(20),LAST_UPDT_PNTTM TIMESTAMP,LAST_UPDUSR_ID VARCHAR(20),PRIMARY KEY(CODE_ID,CODE),CONSTRAINT SYS_FK_89 FOREIGN KEY(CODE_ID) REFERENCES LETTCCMMNCODE(CODE_ID))
CREATE MEMORY TABLE LETTHEMPLYRINFOCHANGEDTLS(EMPLYR_ID VARCHAR(20) NOT NULL,CHANGE_DE CHAR(20) NOT NULL,ORGNZT_ID CHAR(20),GROUP_ID CHAR(20),EMPL_NO VARCHAR(20) NOT NULL,SEXDSTN_CODE CHAR(1),BRTHDY CHAR(20),FXNUM VARCHAR(20),HOUSE_ADRES VARCHAR(100) NOT NULL,HOUSE_END_TELNO VARCHAR(4),AREA_NO VARCHAR(4),DETAIL_ADRES VARCHAR(100) NOT NULL,ZIP VARCHAR(6) NOT NULL,OFFM_TELNO VARCHAR(20),MBTLNUM VARCHAR(20) NOT NULL,EMAIL_ADRES VARCHAR(50),HOUSE_MIDDLE_TELNO VARCHAR(4),PSTINST_CODE CHAR(8),EMPLYR_STTUS_CODE VARCHAR(15) NOT NULL,ESNTL_ID CHAR(20),PRIMARY KEY(EMPLYR_ID,CHANGE_DE))
CREATE MEMORY TABLE LETTNAUTHORGROUPINFO(GROUP_ID CHAR(20) NOT NULL PRIMARY KEY,GROUP_NM VARCHAR(60) NOT NULL,GROUP_CREAT_DE CHAR(20) NOT NULL,GROUP_DC VARCHAR(100))
CREATE MEMORY TABLE LETTNAUTHORINFO(AUTHOR_CODE VARCHAR(30) NOT NULL PRIMARY KEY,AUTHOR_NM VARCHAR(60) NOT NULL,AUTHOR_DC VARCHAR(200),AUTHOR_CREAT_DE CHAR(20) NOT NULL)
CREATE MEMORY TABLE LETTNBBS(NTT_ID NUMERIC(20) NOT NULL,BBS_ID CHAR(20) NOT NULL,NTT_NO NUMERIC(20),NTT_SJ VARCHAR(2000),NTT_CN LONGVARCHAR,ANSWER_AT CHAR(1),PARNTSCTT_NO NUMERIC(10),ANSWER_LC INTEGER,SORT_ORDR NUMERIC(8),RDCNT NUMERIC(10),USE_AT CHAR(1) NOT NULL,NTCE_BGNDE CHAR(20),NTCE_ENDDE CHAR(20),NTCR_ID VARCHAR(20),NTCR_NM VARCHAR(20),PASSWORD VARCHAR(200),ATCH_FILE_ID CHAR(20),FRST_REGIST_PNTTM TIMESTAMP NOT NULL,FRST_REGISTER_ID VARCHAR(20) NOT NULL,LAST_UPDT_PNTTM TIMESTAMP,LAST_UPDUSR_ID VARCHAR(20),PRIMARY KEY(NTT_ID,BBS_ID))
CREATE MEMORY TABLE LETTNBBSMASTER(BBS_ID CHAR(20) NOT NULL PRIMARY KEY,BBS_NM VARCHAR(255) NOT NULL,BBS_INTRCN VARCHAR(2400),BBS_TY_CODE CHAR(6) NOT NULL,BBS_ATTRB_CODE CHAR(6) NOT NULL,REPLY_POSBL_AT CHAR(1),FILE_ATCH_POSBL_AT CHAR(1) NOT NULL,ATCH_POSBL_FILE_NUMBER NUMERIC(2) NOT NULL,ATCH_POSBL_FILE_SIZE NUMERIC(8),USE_AT CHAR(1) NOT NULL,TMPLAT_ID CHAR(20),FRST_REGISTER_ID VARCHAR(20) NOT NULL,FRST_REGIST_PNTTM TIMESTAMP NOT NULL,LAST_UPDUSR_ID VARCHAR(20),LAST_UPDT_PNTTM TIMESTAMP)
CREATE MEMORY TABLE LETTNBBSMASTEROPTN(BBS_ID CHAR(20) DEFAULT '' NOT NULL PRIMARY KEY,ANSWER_AT CHAR(1) DEFAULT '' NOT NULL,STSFDG_AT CHAR(1) DEFAULT '' NOT NULL,FRST_REGIST_PNTTM TIMESTAMP DEFAULT '1970-01-01 00:00:00.0' NOT NULL,LAST_UPDT_PNTTM TIMESTAMP,FRST_REGISTER_ID VARCHAR(20) DEFAULT '' NOT NULL,LAST_UPDUSR_ID VARCHAR(20))
CREATE MEMORY TABLE LETTNEMPLYRINFO(EMPLYR_ID VARCHAR(20) NOT NULL PRIMARY KEY,ORGNZT_ID CHAR(20),USER_NM VARCHAR(60) NOT NULL,PASSWORD VARCHAR(200) NOT NULL,EMPL_NO VARCHAR(20),IHIDNUM VARCHAR(13),SEXDSTN_CODE CHAR(1),BRTHDY CHAR(20),FXNUM VARCHAR(20),HOUSE_ADRES VARCHAR(100) NOT NULL,PASSWORD_HINT VARCHAR(100) NOT NULL,PASSWORD_CNSR VARCHAR(100) NOT NULL,HOUSE_END_TELNO VARCHAR(4) NOT NULL,AREA_NO VARCHAR(4) NOT NULL,DETAIL_ADRES VARCHAR(100),ZIP VARCHAR(6) NOT NULL,OFFM_TELNO VARCHAR(20),MBTLNUM VARCHAR(20) NOT NULL,EMAIL_ADRES VARCHAR(50),OFCPS_NM VARCHAR(60),HOUSE_MIDDLE_TELNO VARCHAR(4) NOT NULL,GROUP_ID CHAR(20),PSTINST_CODE CHAR(8),EMPLYR_STTUS_CODE VARCHAR(15) NOT NULL,ESNTL_ID CHAR(20) NOT NULL,CRTFC_DN_VALUE VARCHAR(20),SBSCRB_DE TIMESTAMP,CONSTRAINT SYS_FK_101 FOREIGN KEY(GROUP_ID) REFERENCES LETTNAUTHORGROUPINFO(GROUP_ID) ON DELETE CASCADE)
CREATE MEMORY TABLE LETTNEMPLYRSCRTYESTBS(SCRTY_DTRMN_TRGET_ID VARCHAR(20) NOT NULL PRIMARY KEY,MBER_TY_CODE VARCHAR(15),AUTHOR_CODE VARCHAR(30) NOT NULL,CONSTRAINT SYS_FK_104 FOREIGN KEY(SCRTY_DTRMN_TRGET_ID) REFERENCES LETTNEMPLYRINFO(EMPLYR_ID),CONSTRAINT SYS_FK_113 FOREIGN KEY(AUTHOR_CODE) REFERENCES LETTNAUTHORINFO(AUTHOR_CODE))
CREATE MEMORY TABLE LETTNENTRPRSMBER(ENTRPRS_MBER_ID VARCHAR(20) NOT NULL PRIMARY KEY,ENTRPRS_SE_CODE CHAR(15),BIZRNO VARCHAR(10),JURIRNO VARCHAR(13),CMPNY_NM VARCHAR(60) NOT NULL,CXFC VARCHAR(50),ZIP VARCHAR(6) NOT NULL,ADRES VARCHAR(100) NOT NULL,ENTRPRS_MIDDLE_TELNO VARCHAR(4) NOT NULL,FXNUM VARCHAR(20),INDUTY_CODE CHAR(15),APPLCNT_NM VARCHAR(50) NOT NULL,APPLCNT_IHIDNUM VARCHAR(13),SBSCRB_DE TIMESTAMP,ENTRPRS_MBER_STTUS VARCHAR(15),ENTRPRS_MBER_PASSWORD VARCHAR(200),ENTRPRS_MBER_PASSWORD_HINT VARCHAR(100) NOT NULL,ENTRPRS_MBER_PASSWORD_CNSR VARCHAR(100) NOT NULL,GROUP_ID CHAR(20),DETAIL_ADRES VARCHAR(100),ENTRPRS_END_TELNO VARCHAR(4) NOT NULL,AREA_NO VARCHAR(4) NOT NULL,APPLCNT_EMAIL_ADRES VARCHAR(50) NOT NULL,ESNTL_ID CHAR(20) NOT NULL,CONSTRAINT SYS_FK_116 FOREIGN KEY(GROUP_ID) REFERENCES LETTNAUTHORGROUPINFO(GROUP_ID) ON DELETE CASCADE)
CREATE MEMORY TABLE LETTNFILE(ATCH_FILE_ID CHAR(20) NOT NULL PRIMARY KEY,CREAT_DT TIMESTAMP NOT NULL,USE_AT CHAR(1))
CREATE MEMORY TABLE LETTNFILEDETAIL(ATCH_FILE_ID CHAR(20) NOT NULL,FILE_SN NUMERIC(10) NOT NULL,FILE_STRE_COURS VARCHAR(2000) NOT NULL,STRE_FILE_NM VARCHAR(255) NOT NULL,ORIGNL_FILE_NM VARCHAR(255),FILE_EXTSN VARCHAR(20) NOT NULL,FILE_CN LONGVARCHAR,FILE_SIZE NUMERIC(8),PRIMARY KEY(ATCH_FILE_ID,FILE_SN),CONSTRAINT SYS_FK_119 FOREIGN KEY(ATCH_FILE_ID) REFERENCES LETTNFILE(ATCH_FILE_ID))
CREATE MEMORY TABLE LETTNGNRLMBER(MBER_ID VARCHAR(20) NOT NULL PRIMARY KEY,PASSWORD VARCHAR(200) NOT NULL,PASSWORD_HINT VARCHAR(100),PASSWORD_CNSR VARCHAR(100),IHIDNUM VARCHAR(13),MBER_NM VARCHAR(50) NOT NULL,ZIP VARCHAR(6) NOT NULL,ADRES VARCHAR(100) NOT NULL,AREA_NO VARCHAR(4) NOT NULL,MBER_STTUS VARCHAR(15),DETAIL_ADRES VARCHAR(100),END_TELNO VARCHAR(4) NOT NULL,MBTLNUM VARCHAR(20) NOT NULL,GROUP_ID CHAR(20),MBER_FXNUM VARCHAR(20),MBER_EMAIL_ADRES VARCHAR(50),MIDDLE_TELNO VARCHAR(4) NOT NULL,SBSCRB_DE TIMESTAMP,SEXDSTN_CODE CHAR(1),ESNTL_ID CHAR(20) NOT NULL,CONSTRAINT SYS_FK_122 FOREIGN KEY(GROUP_ID) REFERENCES LETTNAUTHORGROUPINFO(GROUP_ID) ON DELETE CASCADE)
CREATE MEMORY TABLE LETTNORGNZTINFO(ORGNZT_ID CHAR(20) NOT NULL PRIMARY KEY,ORGNZT_NM VARCHAR(20) NOT NULL,ORGNZT_DC VARCHAR(100))
CREATE MEMORY TABLE LETTNSCHDULINFO(SCHDUL_ID CHAR(20) NOT NULL PRIMARY KEY,SCHDUL_SE CHAR(1),SCHDUL_DEPT_ID VARCHAR(20),SCHDUL_KND_CODE VARCHAR(20),SCHDUL_BEGINDE TIMESTAMP,SCHDUL_ENDDE TIMESTAMP,SCHDUL_NM VARCHAR(255),SCHDUL_CN VARCHAR(2500),SCHDUL_PLACE VARCHAR(255),SCHDUL_IPCR_CODE CHAR(1),SCHDUL_CHARGER_ID VARCHAR(20),ATCH_FILE_ID CHAR(20),FRST_REGIST_PNTTM TIMESTAMP,FRST_REGISTER_ID VARCHAR(20),LAST_UPDT_PNTTM TIMESTAMP,LAST_UPDUSR_ID VARCHAR(20),REPTIT_SE_CODE CHAR(3))
CREATE MEMORY TABLE LETTNTMPLATINFO(TMPLAT_ID CHAR(20) NOT NULL PRIMARY KEY,TMPLAT_NM VARCHAR(255),TMPLAT_COURS VARCHAR(2000),USE_AT CHAR(1),TMPLAT_SE_CODE CHAR(6),FRST_REGISTER_ID VARCHAR(20),FRST_REGIST_PNTTM TIMESTAMP,LAST_UPDUSR_ID VARCHAR(20),LAST_UPDT_PNTTM TIMESTAMP)
CREATE MEMORY TABLE IDS(TABLE_NAME VARCHAR(20) DEFAULT '' NOT NULL PRIMARY KEY,NEXT_ID NUMERIC(30) DEFAULT 0 NOT NULL)
ALTER TABLE LETTHEMPLYRINFOCHANGEDTLS ADD CONSTRAINT SYS_FK_92 FOREIGN KEY(EMPLYR_ID) REFERENCES LETTNEMPLYRINFO(EMPLYR_ID)
ALTER TABLE LETTNBBS ADD CONSTRAINT SYS_FK_95 FOREIGN KEY(BBS_ID) REFERENCES LETTNBBSMASTER(BBS_ID)
ALTER TABLE LETTNEMPLYRSCRTYESTBS ADD CONSTRAINT SYS_FK_107 FOREIGN KEY(SCRTY_DTRMN_TRGET_ID) REFERENCES LETTNENTRPRSMBER(ENTRPRS_MBER_ID)
ALTER TABLE LETTNEMPLYRSCRTYESTBS ADD CONSTRAINT SYS_FK_110 FOREIGN KEY(SCRTY_DTRMN_TRGET_ID) REFERENCES LETTNGNRLMBER(MBER_ID)
SET WRITE_DELAY 20
SET SCHEMA PUBLIC
INSERT INTO LETTCCMMNCLCODE VALUES('LET','전자정부 프레임워크 경량환경 템플릿','전자정부 프레임워크 경량환경 템플릿','Y','2011-08-31 00:00:00.000000000','SYSTEM','2011-08-31 00:00:00.000000000','SYSTEM')
INSERT INTO LETTCCMMNCODE VALUES('COM001','등록구분','게시판, 커뮤니티, 동호회 등록구분코드','Y','LET','2011-08-31 00:00:00.000000000','SYSTEM','2011-08-31 00:00:00.000000000','SYSTEM')
INSERT INTO LETTCCMMNCODE VALUES('COM003','업무구분','업무구분코드','Y','LET','2011-08-31 00:00:00.000000000','SYSTEM','2011-08-31 00:00:00.000000000','SYSTEM')
INSERT INTO LETTCCMMNCODE VALUES('COM004','게시판유형','게시판유형구분코드','Y','LET','2011-08-31 00:00:00.000000000','SYSTEM','2011-08-31 00:00:00.000000000','SYSTEM')
INSERT INTO LETTCCMMNCODE VALUES('COM005','템플릿유형','템플릿유형구분코드','Y','LET','2011-08-31 00:00:00.000000000','SYSTEM','2011-08-31 00:00:00.000000000','SYSTEM')
INSERT INTO LETTCCMMNCODE VALUES('COM009','게시판속성','게시판 속성','Y','LET','2011-08-31 00:00:00.000000000','SYSTEM','2011-08-31 00:00:00.000000000','SYSTEM')
INSERT INTO LETTCCMMNCODE VALUES('COM019','일정중요도','일정중요도 낮음/보통/높음 상태구분','Y','LET','2011-08-31 00:00:00.000000000','SYSTEM','2011-08-31 00:00:00.000000000','SYSTEM')
INSERT INTO LETTCCMMNCODE VALUES('COM030','일정구분','일정구분 코드','Y','LET','2011-08-31 00:00:00.000000000','SYSTEM','2011-08-31 00:00:00.000000000','SYSTEM')
INSERT INTO LETTCCMMNCODE VALUES('COM031','반복구분','일정 반복구분 코드','Y','LET','2011-08-31 00:00:00.000000000','SYSTEM','2011-08-31 00:00:00.000000000','SYSTEM')
INSERT INTO LETTCCMMNDETAILCODE VALUES('COM001','REGC01','단일 게시판 이용등록','단일 게시판 이용등록','Y','2011-08-31 00:00:00.000000000','SYSTEM','2011-08-31 00:00:00.000000000','SYSTEM')
INSERT INTO LETTCCMMNDETAILCODE VALUES('COM001','REGC07','게시판사용자등록','게시판사용자등록','Y','2011-08-31 00:00:00.000000000','SYSTEM','2011-08-31 00:00:00.000000000','SYSTEM')
INSERT INTO LETTCCMMNDETAILCODE VALUES('COM003','BBS','게시판','게시판','Y','2011-08-31 00:00:00.000000000','SYSTEM','2011-08-31 00:00:00.000000000','SYSTEM')
INSERT INTO LETTCCMMNDETAILCODE VALUES('COM004','BBST01','일반게시판','일반게시판','Y','2011-08-31 00:00:00.000000000','SYSTEM','2011-08-31 00:00:00.000000000','SYSTEM')
INSERT INTO LETTCCMMNDETAILCODE VALUES('COM004','BBST02','익명게시판','익명게시판','Y','2011-08-31 00:00:00.000000000','SYSTEM','2011-08-31 00:00:00.000000000','SYSTEM')
INSERT INTO LETTCCMMNDETAILCODE VALUES('COM004','BBST03','공지게시판','공지게시판','Y','2011-08-31 00:00:00.000000000','SYSTEM','2011-08-31 00:00:00.000000000','SYSTEM')
INSERT INTO LETTCCMMNDETAILCODE VALUES('COM004','BBST04','방명록','방명록','Y','2011-08-31 00:00:00.000000000','SYSTEM','2011-08-31 00:00:00.000000000','SYSTEM')
INSERT INTO LETTCCMMNDETAILCODE VALUES('COM005','TMPT01','게시판템플릿','게시판템플릿','Y','2011-08-31 00:00:00.000000000','SYSTEM','2011-08-31 00:00:00.000000000','SYSTEM')
INSERT INTO LETTCCMMNDETAILCODE VALUES('COM009','BBSA01','유효게시판','유효게시판','Y','2011-08-31 00:00:00.000000000','SYSTEM','2011-08-31 00:00:00.000000000','SYSTEM')
INSERT INTO LETTCCMMNDETAILCODE VALUES('COM009','BBSA02','갤러리','갤러리','Y','2011-08-31 00:00:00.000000000','SYSTEM','2011-08-31 00:00:00.000000000','SYSTEM')
INSERT INTO LETTCCMMNDETAILCODE VALUES('COM009','BBSA03','일반게시판','일반게시판','Y','2011-08-31 00:00:00.000000000','SYSTEM','2011-08-31 00:00:00.000000000','SYSTEM')
INSERT INTO LETTCCMMNDETAILCODE VALUES('COM019','A','높음','높음','Y','2011-08-31 00:00:00.000000000','SYSTEM','2011-08-31 00:00:00.000000000','SYSTEM')
INSERT INTO LETTCCMMNDETAILCODE VALUES('COM019','B','보통','보통','Y','2011-08-31 00:00:00.000000000','SYSTEM','2011-08-31 00:00:00.000000000','SYSTEM')
INSERT INTO LETTCCMMNDETAILCODE VALUES('COM019','C','낮음','낮음','Y','2011-08-31 00:00:00.000000000','SYSTEM','2011-08-31 00:00:00.000000000','SYSTEM')
INSERT INTO LETTCCMMNDETAILCODE VALUES('COM030','1','회의','회의','Y','2011-08-31 00:00:00.000000000','SYSTEM','2011-08-31 00:00:00.000000000','SYSTEM')
INSERT INTO LETTCCMMNDETAILCODE VALUES('COM030','2','세미나','세미나','Y','2011-08-31 00:00:00.000000000','SYSTEM','2011-08-31 00:00:00.000000000','SYSTEM')
INSERT INTO LETTCCMMNDETAILCODE VALUES('COM030','3','강의','강의','Y','2011-08-31 00:00:00.000000000','SYSTEM','2011-08-31 00:00:00.000000000','SYSTEM')
INSERT INTO LETTCCMMNDETAILCODE VALUES('COM030','4','교육','교육','Y','2011-08-31 00:00:00.000000000','SYSTEM','2011-08-31 00:00:00.000000000','SYSTEM')
INSERT INTO LETTCCMMNDETAILCODE VALUES('COM030','5','기타','기타','Y','2011-08-31 00:00:00.000000000','SYSTEM','2011-08-31 00:00:00.000000000','SYSTEM')
INSERT INTO LETTCCMMNDETAILCODE VALUES('COM031','1','당일','당일','Y','2011-08-31 00:00:00.000000000','SYSTEM','2011-08-31 00:00:00.000000000','SYSTEM')
INSERT INTO LETTCCMMNDETAILCODE VALUES('COM031','2','반복','반복','Y','2011-08-31 00:00:00.000000000','SYSTEM','2011-08-31 00:00:00.000000000','SYSTEM')
INSERT INTO LETTCCMMNDETAILCODE VALUES('COM031','3','연속','연속','Y','2011-08-31 00:00:00.000000000','SYSTEM','2011-08-31 00:00:00.000000000','SYSTEM')
INSERT INTO LETTCCMMNDETAILCODE VALUES('COM031','4','요일반복','요일반복','Y','2011-08-31 00:00:00.000000000','SYSTEM','2011-08-31 00:00:00.000000000','SYSTEM')
INSERT INTO LETTNAUTHORGROUPINFO VALUES('GROUP_00000000000000','기본 그룹입니다','2011-08-31','기본 그룹')
INSERT INTO LETTNBBSMASTER VALUES('BBSMSTR_AAAAAAAAAAAA','공지사항','공지사항게시판','BBST03','BBSA03','Y','Y',2,5242880,'Y','TMPLAT_BOARD_DEFAULT','USRCNFRM_00000000000','2011-08-31 12:00:00.000000000','USRCNFRM_00000000000','2011-08-31 12:00:00.000000000')
INSERT INTO LETTNBBSMASTER VALUES('BBSMSTR_BBBBBBBBBBBB','갤러리','갤러리게시판','BBST01','BBSA02','Y','Y',2,5242880,'Y','TMPLAT_BOARD_DEFAULT','USRCNFRM_00000000000','2011-08-31 12:00:00.000000000','USRCNFRM_00000000000','2011-08-31 12:00:00.000000000')
INSERT INTO LETTNBBSUSE VALUES('BBSMSTR_AAAAAAAAAAAA','SYSTEM_DEFAULT_BOARD','Y','REGC01','2011-08-31 12:00:00.000000000','USRCNFRM_00000000000','2011-08-31 12:00:00.000000000','USRCNFRM_00000000000')
INSERT INTO LETTNBBSUSE VALUES('BBSMSTR_BBBBBBBBBBBB','SYSTEM_DEFAULT_BOARD','Y','REGC01','2011-08-31 12:00:00.000000000','USRCNFRM_00000000000','2011-08-31 12:00:00.000000000','USRCNFRM_00000000000')
INSERT INTO LETTNEMPLYRINFO VALUES('admin','ORGNZT_0000000000000','관리자','JfQ7FIatlaE5jj7rPYO8QBABX8yb7bNbQy4AKY1QIfc=','','','F','','','관리자 주소','','','','','','','','','','','','GROUP_00000000000000','00000000','P','USRCNFRM_00000000000','','2011-08-31 00:00:00.000000000')
INSERT INTO LETTNTMPLATINFO VALUES('TMPLAT_BOARD_DEFAULT','게시판 기본템플릿','/css/egovframework/cop/bbs/egovbbsTemplate.css','Y','TMPT01','SYSTEM','2011-08-31 00:00:00.000000000',NULL,NULL)
INSERT INTO IDS VALUES('BBS_ID',1)
INSERT INTO IDS VALUES('FILE_ID',1)
INSERT INTO IDS VALUES('SAMPLE',1)
INSERT INTO IDS VALUES('SCHDUL_ID',1)
INSERT INTO IDS VALUES('TMPLAT_ID',1)
