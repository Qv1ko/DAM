DELIMITER //
CREATE FUNCTION sumImpares(n INT) RETURNS INT
BEGIN
    DECLARE result INT DEFAULT 0;
    DECLARE impar INT DEFAULT 1;
    WHILE n>0 DO
        SET result=result+impar;
        SET impar=impar+2;
        SET n=n-1;
    END WHILE;
    RETURN result;
END//
DELIMITER ;
