DELIMITER //
CREATE FUNCTION fun_1(num int) RETURNS CHAR(5)
BEGIN
    DECLARE result CHAR(5) DEFAULT "Impar";
    IF num%2=0 THEN
        SET result="Par";
    END IF;
    RETURN result;
END//
DELIMITER ;