CREATE TABLE miTabla(
    id INT PRIMARY KEY,
    nombre CHAR(10)
);
CREATE TABLE control(
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_reg INT,
    nom_viejo CHAR(10),
    nom_nuevo CHAR(10),
    usuario VARCHAR(30),
    fecha DATE
);

INSERT INTO miTabla VALUES(1,"Ana"),(2,"Pedro"),(3,"Ramona");

DELIMITER //
CREATE TRIGGER miTabla_au AFTER UPDATE ON miTabla FOR EACH ROW
BEGIN
    INSERT INTO control VALUES(null,old.id,old.nombre,new.nombre,CURRENT_USER(),NOW());
END//
DELIMITER ;

UPDATE miTabla SET nombre="Ramon Jose" WHERE nombre="Ramona";

DELIMITER //
CREATE TRIGGER miTabla_ai AFTER INSERT ON miTabla FOR EACH ROW
BEGIN
    INSERT INTO control VALUES(null,new.id,null,new.nombre,CURRENT_USER(),NOW());
END//
DELIMITER ;

DELIMITER //
CREATE TRIGGER miTabla_ad AFTER DELETE ON miTabla FOR EACH ROW
BEGIN
    INSERT INTO control VALUES(null,old.id,old.nombre,null,CURRENT_USER(),NOW());
END//
DELIMITER ;
