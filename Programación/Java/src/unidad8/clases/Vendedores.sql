CREATE DATABASE `base`;

CREATE TABLE `base`.`vendedores` (
    `dni` VARCHAR(20) NOT NULL,
    `nombre` VARCHAR(100) NULL,
    `telefono` INT NULL,
    `email` VARCHAR(45) NULL,
    `ventas` DECIMAL(20,2) NULL,
    PRIMARY KEY (`dni`));

INSERT INTO `base`.`vendedores` VALUES ('483441158M', 'Maria Porras Zuloaga', '661243103', 'mporras@eterprise.com', '2476.33');
INSERT INTO `base`.`vendedores` VALUES ('762063462W', 'David Alvarez Medina', '655203142', 'dalavarez@eterprise.com', '1945.45');
INSERT INTO `base`.`vendedores` VALUES ('762458462W', 'Jesus Lopez Fernandez', '654043767', 'jlopez@eterprise.com', '2131.87');
INSERT INTO `base`.`vendedores` VALUES ('330443913Y', 'Maria Zuluaga Montoya', '664140435', 'mzuluaga@eterprise.com', '2288.90');
INSERT INTO `base`.`vendedores` VALUES ('762028463W', 'Jose Alvarez Sanchez', '661356838', 'jalvarez@eterprise.com', '2000.22');
INSERT INTO `base`.`vendedores` VALUES ('483444358M', 'Leticia Garcia Lopez', '630127764', 'lgarcia@eterprise.com', '1944.50');
INSERT INTO `base`.`vendedores` VALUES ('765066462W', 'Alberto Rodriguez Sierra', '665522063', 'arodriguez@eterprise.com', '1602.10');
INSERT INTO `base`.`vendedores` VALUES ('762066462W', 'Carlos Alvarado Gomez', '615449248', 'calavarado@eterprise.com', '2395.33');
INSERT INTO `base`.`vendedores` VALUES ('762028462W', 'David Alvarez Medina', '622138501', 'dalaverz@eterprise.com', '1794.99');
INSERT INTO `base`.`vendedores` VALUES ('762498462W', 'Ana Morante Rincon', '659677951', 'amorante@eterprise.com', '1875.12');
INSERT INTO `base`.`vendedores` VALUES ('762448462W', 'Ines Lastra Jimenez', '645328990', 'ilastra@eterprise.com', '1869.34');
INSERT INTO `base`.`vendedores` VALUES ('202686033L', 'Norelis Correa Rios', '612628405', 'ncorrea@eterprise.com', '2234.66');