# MyBatis DB연결 세팅

### 설정방법
- MyBatisConfig 파일 필요
- resources/mapper/*.xml 파일 필요
- Users 엔티티 필요
- UsersDao 인터페이스 생성 필요

### MariaDB 사용자 생성 및 권한 주기
```sql
CREATE USER 'green'@'%' IDENTIFIED BY 'green1234';
CREATE DATABASE greendb;
GRANT ALL PRIVILEGES ON greendb.* TO 'green'@'%';
```

### 테이블 생성
```sql
USE greendb;

CREATE TABLE stadium(
	id INT AUTO_INCREMENT PRIMARY KEY,
	stadiumName VARCHAR(100) UNIQUE NOT NULL,
	createDate TIMESTAMP
	);

CREATE TABLE team(
	id INT AUTO_INCREMENT PRIMARY KEY,
	teamName VARCHAR(100) UNIQUE NOT NULL,
	stadiumId INT,
	createDate Timestamp
	);

CREATE TABLE player(
	id INT AUTO_INCREMENT PRIMARY KEY,
	playerName VARCHAR(30) UNIQUE NOT NULL,
	teamId INT,
	position VARCHAR(100) NOT null,
	createDate timestamp
	);
```

### 더미데이터 추가
```sql
SELECT * FROM stadium;
SELECT * FROM team;
SELECT * FROM player;
SELECT * FROM expulsion;

DROP TABLE stadium;
DROP TABLE team;
DROP TABLE player;
DROP TABLE expulsion;

INSERT into stadium(stadiumName,createDate)VALUES("사직구장",now());
INSERT into stadium(stadiumName,createDate)VALUES("고척스카이돔",now());
INSERT into stadium(stadiumName,createDate)VALUES("챔피언스필드",NOW());


INSERT into team(teamName,stadiumId,createDate)VALUES("롯데자이언츠","1",now());
INSERT into team(teamName,stadiumId,createDate)VALUES("키움히어로즈","2",now());
INSERT into team(teamName,stadiumId,createDate)VALUES("기아타이거즈","3",NOW());

INSERT into player(playerName,teamId,position,createDate)VALUES("이대호",1,"내야수",NOW());
INSERT into player(playerName,teamId,position,createDate)VALUES("김원중",1,"투수",NOW());
INSERT into player(playerName,teamId,position,createDate)VALUES("안중열",1,"포수",NOW());
INSERT into player(playerName,teamId,position,createDate)VALUES("이정후",2,"외야수",NOW());
INSERT into player(playerName,teamId,position,createDate)VALUES("문성현",2,"투수",NOW());
INSERT into player(playerName,teamId,position,createDate)VALUES("이지형",2,"포수",NOW());
INSERT into player(playerName,teamId,position,createDate)VALUES("나지완",3,"외야수",NOW());
INSERT into player(playerName,teamId,position,createDate)VALUES("양현종",3,"투수",NOW());
INSERT into player(playerName,teamId,position,createDate)VALUES("박동원",3,"포수",NOW());
```