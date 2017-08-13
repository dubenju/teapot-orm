CREATE TABLE TBL_SQLITE (
    test_id VARCHAR (3) PRIMARY KEY NOT NULL,
    test_name VARCHAR (60) NOT NULL,
    test_blob BLOB,
    test_double DOUBLE,
    test_float  FLOAT,
    test_tinyint TINYINT(3),
    test_int     INTEGER,
    test_decimal DECIMAL,
    test_bigint  BIGINT,
    test_datetime DATETIME,
    test_order VARCHAR (3),
    create_date DATE NOT NULL,
    create_time TIME NOT NULL,
    update_date DATE NOT NULL,
    update_time TIME NOT NULL,
    update_user_id VARCHAR (20) NOT NULL,
    update_screen_id VARCHAR (20) NOT NULL
);

INSERT INTO TBL_SQLITE VALUES  ('999', '系统管理', '', 1.2, 2.3, 100, 200, 300.0, 400, 20160607202020, '', '20160607', '202020', '20160607', '202020', 'admin', 'init');
