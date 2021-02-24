DROP table board_info;
CREATE TABLE board_info(
bi_num INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
bi_title VARCHAR(100) NOT NULL,
bi_writer VARCHAR(100) NOT NULL,
bi_content TEXT,
bi_file VARCHAR(100),
credat CHAR(8),
cretim CHAR(6),
bi_cnt INT DEFAULT 0
);

 insert into board_info(bi_title, bi_writer, bi_content, bi_file, credat, cretim)
 values('test','test','haha',null,date_format(now(),'%Y%m%d'),date_format(now(),'%H%i%S'));
 COMMIT;