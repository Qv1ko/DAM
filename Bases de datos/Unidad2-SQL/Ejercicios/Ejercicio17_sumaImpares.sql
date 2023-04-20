DELIMITER //
CREATE FUNCTION sumImpares(n INT) RETURNS INT
BEGIN
    DECLARE f INT DEFAULT 1;
    DECLARE result INT;
    WHILE 0>n DO
        SET result=result+2;
        SET n=n-1;
    END WHILE;
    RETURN result;
END//
DELIMITER ;

