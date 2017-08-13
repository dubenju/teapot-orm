分类表

drop table if exists tbl_test;

CREATE TABLE tbl_test
(
    test_id VARCHAR (3) NOT NULL,
    test_name VARCHAR (60) NOT NULL,
    test_bit  BIT,
    test_blob BLOB,
    test_double DOUBLE,
    test_float FLOAT,
    test_tinyint TINYINT(3),
    test_int INTEGER,
    test_decimal DECIMAL,
    test_bigint BIGINT,
    test_datetime DATETIME,
    test_order VARCHAR (3),
    create_date DATE NOT NULL,
    create_time TIME NOT NULL,
    update_date DATE NOT NULL,
    update_time TIME NOT NULL,
    update_user_id VARCHAR (20) NOT NULL,
    update_screen_id VARCHAR (20) NOT NULL,
    PRIMARY KEY(test_id)
) default charset utf8;


insert into tbl_test value (
'999', 
'系统管理', 
1, 
'', 
1.2, 
2.3, 
100, 
200, 
300.0, 
400, 
20160607202020, 
'', 
'20160607', '202020', '20160607', '202020', 'admin', 'init');
