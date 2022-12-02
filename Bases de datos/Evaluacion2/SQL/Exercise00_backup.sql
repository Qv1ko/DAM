-- MySQL dump 10.16  Distrib 10.1.40-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: alquileres
-- ------------------------------------------------------
-- Server version	10.1.40-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `automoviles`
--

DROP TABLE IF EXISTS `automoviles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `automoviles` (
  `matricula` char(7) NOT NULL,
  `marca_marcas` varchar(15) NOT NULL,
  `modelo` varchar(20) NOT NULL,
  `color` varchar(15) DEFAULT NULL,
  `precio` decimal(7,2) NOT NULL,
  `kilometros` int(6) DEFAULT NULL,
  `extras` varchar(20) DEFAULT NULL,
  `alquilado` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`matricula`),
  KEY `marca_marcas` (`marca_marcas`),
  CONSTRAINT `automoviles_ibfk_1` FOREIGN KEY (`marca_marcas`) REFERENCES `marcas` (`marca`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `automoviles`
--

LOCK TABLES `automoviles` WRITE;
/*!40000 ALTER TABLE `automoviles` DISABLE KEYS */;
INSERT INTO `automoviles` VALUES ('1234BMY','Mercedes','Clase A','Azul',160.00,22561,'AA,EE,CC,CD,ABS',0),('1678CCN','Ford','Mondeo','Verde',95.00,9500,'AA,EE,CC,RC,ABS',0),('1732CBS','Seat','Leon','negro',95.00,2500,'AA, ABS, CD',0),('1978BNT','Opel','Corsa','Azul',65.00,45876,'EE,CC,RC',0),('2058CGF','Seat','Cordoba','Verde',95.00,9736,'AA,EE,CC,RC',1),('2123BTB','Renault','Megane','Amarillo',80.00,34323,'AA,EE,CC,RC',1),('3273BGH','Audi','A4','Rojo',95.00,17368,'AA,EE,CC,RC,ABS',1),('3765BSD','Seat','Alhambra','Rojo',125.00,7683,'AA,EE,CC,CD,ABS',0),('4387BDD','Citroen','Xxara','Verde',95.00,23057,'AA,EE,CC,CD',0),('4738CBJ','Audi','A3','Amarillo',80.00,8008,'AA,EE,CC,RC',0),('5031BHL','BMW','318 i','Azul',105.00,24796,'AA,EE,CC,CD,ABS',0),('5573BFS','Seat','Arosa','Azul',65.00,28500,'AA,EE,CC,CD',1),('5678BRZ','Mercedes','250 TDI','Blanco',154.00,7659,'AA,EE,CC,CD,ABS',0),('6761CYM','Renault','Clio','Blanco',65.00,25672,'EE,CC,RC',0),('7839CDR','Ford','Focus','Verde',80.00,15873,'AA,EE,CC,RC',1),('7856BLD','BMW','318 TDI','Azul',138.00,35978,'AA,EE,CC,CD,ABS',0),('8795BTK','Mercedes','500 E','Azul',138.00,46980,'AA,EE,CC,CD,ABS',1);
/*!40000 ALTER TABLE `automoviles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clientes`
--

DROP TABLE IF EXISTS `clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `clientes` (
  `dni` char(9) NOT NULL,
  `apellidos` varchar(25) NOT NULL,
  `nombre` varchar(15) NOT NULL,
  `direccion` varchar(40) DEFAULT NULL,
  `localidad` varchar(15) DEFAULT NULL,
  `carnet` char(2) NOT NULL,
  `fechaexp` date NOT NULL,
  PRIMARY KEY (`dni`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientes`
--

LOCK TABLES `clientes` WRITE;
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
INSERT INTO `clientes` VALUES ('00371569','Garcia Martin','Beatriz','Avda. Ilustraci├│n, 57','Madrid','B','1982-12-05'),('00445760','Flores Jorje','Sandra','C/ La Ca├▒ada 28','Madrid','B','1985-10-04'),('00740365','Lopez Carvajal','Carlos Javier','C/ Salmoral 28','Madrid','D','1982-08-21'),('02748375','Rodriguez','Vanessa','C/ Pinto 25','Madrid','B','1993-04-16'),('03549358','Poza Rinc├│n','Ismael','C/ Arroyo, 43','Madrid','C1','1990-04-30'),('07385709','Cepeda','Fanny','C/ Antonio Gala, 34','Toledo','B','1994-11-05'),('07834658','de la Hoz Gomez','Alicia','C/ Garc├¡a Morato, 21','Madrid','B','1994-06-17'),('08785691','Dorado','Mariano','Calle Moratalaz, 5a','Madrid','D','1999-11-14'),('09856064','Rodriguez','Anais','C/ Alpujarras, 43','Madrid','B','1989-02-12'),('11223344','Garcia Garcia','Noelia','C/ Talavera 19','Toledo','B','2001-10-30'),('12348630','Bats Corzo','Soraya','C/ Getafe, 5','Cuenca','B','1994-05-12'),('23503875','Coria Garc├¡a','Eva','C/ Felipe IV, 12','Madrid','B','2004-02-12'),('24589635','Diaz Vera','Antonio','C/ La Habana, 56','Madrid','B','2003-11-18'),('28759595','Ruiz Alonso','Ricardo','C/ Hortaleza, 56','Madrid','B','1999-10-13'),('37409800','Sanz Lopez','Reyes','C/ Valdeprado, 37','Madrid','B','1993-09-07'),('43809540','Montoya','Natalia','C/ Verona, 3','Toledo','B','2005-10-14'),('58347695','Fuentes Rojas','Ana Bel├®n','C/ Legan├®s, 79','Toledo','C1','2001-09-01');
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contratos`
--

DROP TABLE IF EXISTS `contratos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `contratos` (
  `numcontrato` int(5) NOT NULL AUTO_INCREMENT,
  `matricula_automoviles` char(7) NOT NULL,
  `dni_clientes` char(9) NOT NULL,
  `finicial` date NOT NULL,
  `ffinal` date DEFAULT NULL,
  `kinicial` int(6) NOT NULL,
  `kfinal` int(6) DEFAULT NULL,
  PRIMARY KEY (`numcontrato`),
  KEY `dni_clientes` (`dni_clientes`),
  KEY `matricula_automoviles` (`matricula_automoviles`),
  CONSTRAINT `contratos_ibfk_1` FOREIGN KEY (`dni_clientes`) REFERENCES `clientes` (`dni`),
  CONSTRAINT `contratos_ibfk_2` FOREIGN KEY (`matricula_automoviles`) REFERENCES `automoviles` (`matricula`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contratos`
--

LOCK TABLES `contratos` WRITE;
/*!40000 ALTER TABLE `contratos` DISABLE KEYS */;
INSERT INTO `contratos` VALUES (1,'1234BMY','08785691','2007-03-12','2007-03-19',22200,22561),(2,'7856BLD','07385709','2007-03-13','2007-03-16',6500,7500),(3,'5573BFS','37409800','2007-03-15','2007-03-20',26250,28500),(4,'3273BGH','03549358','2007-03-15','2007-03-22',15380,16250),(5,'3765BSD','58347695','2008-04-19','2008-04-24',6850,7683),(6,'1678CCN','24589635','2008-03-22','2008-03-30',32650,35978),(7,'6761CYM','00371569','2008-05-24','2008-05-30',21500,25672),(8,'1978BNT','12348630','2008-06-25','2008-08-26',45650,45876),(9,'2058CGF','09856064','2008-03-27','2008-04-13',8150,9736),(10,'3273BGH','07834658','2009-01-27','2009-02-02',16250,17386),(11,'4387BDD','08785691','2009-02-05','2009-02-15',17386,23057),(12,'8795BTK','00740365','2009-04-06','2009-04-17',44850,46980),(13,'5678BRZ','58347695','2009-07-14','2009-07-21',7500,7659),(14,'5031BHL','23503875','2009-09-08','2009-09-25',24050,24796),(15,'4738CBJ','02748375','2009-10-18','2009-11-01',7965,8008),(16,'1234BMY','37409800','2009-07-10',NULL,22561,NULL),(17,'2058CGF','00371569','2009-07-11',NULL,9736,NULL),(18,'3273BGH','24589635','2009-08-11',NULL,17368,NULL),(19,'5573BFS','00445760','2009-08-15',NULL,28500,NULL),(20,'7839CDR','28759595','2009-10-15',NULL,15873,NULL),(21,'8795BTK','12348630','2009-11-16',NULL,46980,NULL),(22,'2123BTB','43809540','2009-11-16',NULL,34323,NULL);
/*!40000 ALTER TABLE `contratos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contratos2`
--

DROP TABLE IF EXISTS `contratos2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `contratos2` (
  `numcontrato` int(5) NOT NULL AUTO_INCREMENT,
  `matricula_automoviles` char(7) NOT NULL,
  `dni_clientes` char(9) NOT NULL,
  `finicial` date NOT NULL,
  `ffinal` date DEFAULT NULL,
  `kinicial` int(6) NOT NULL,
  `kfinal` int(6) DEFAULT NULL,
  PRIMARY KEY (`numcontrato`),
  KEY `dni_clientes` (`dni_clientes`),
  KEY `matricula_automoviles` (`matricula_automoviles`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contratos2`
--

LOCK TABLES `contratos2` WRITE;
/*!40000 ALTER TABLE `contratos2` DISABLE KEYS */;
INSERT INTO `contratos2` VALUES (1,'5031BHL','07385709','2009-11-02','2009-11-18',7260,7500),(2,'7839CDR','00740365','2009-10-01','2007-10-13',15150,15873),(3,'1978BNT','00740365','2009-12-01','2007-12-03',18000,18905);
/*!40000 ALTER TABLE `contratos2` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contratos3`
--

DROP TABLE IF EXISTS `contratos3`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `contratos3` (
  `numcontrato` int(5) NOT NULL AUTO_INCREMENT,
  `matricula_automoviles` char(7) NOT NULL,
  `dni_clientes` char(9) NOT NULL,
  `finicial` date NOT NULL,
  `ffinal` date DEFAULT NULL,
  `kinicial` int(6) NOT NULL,
  `kfinal` int(6) DEFAULT NULL,
  PRIMARY KEY (`numcontrato`),
  KEY `dni_clientes` (`dni_clientes`),
  KEY `matricula_automoviles` (`matricula_automoviles`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contratos3`
--

LOCK TABLES `contratos3` WRITE;
/*!40000 ALTER TABLE `contratos3` DISABLE KEYS */;
INSERT INTO `contratos3` VALUES (20,'7839CDR','28759595','2009-10-15','0000-00-00',0,NULL),(21,'8795BTK','12348630','2009-11-16','0000-00-00',0,NULL),(22,'2123BTB','43809540','2009-11-16','0000-00-00',0,NULL);
/*!40000 ALTER TABLE `contratos3` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `marcas`
--

DROP TABLE IF EXISTS `marcas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `marcas` (
  `marca` varchar(15) NOT NULL,
  `numero` char(2) DEFAULT NULL,
  PRIMARY KEY (`marca`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `marcas`
--

LOCK TABLES `marcas` WRITE;
/*!40000 ALTER TABLE `marcas` DISABLE KEYS */;
INSERT INTO `marcas` VALUES ('Audi','03'),('BMW','05'),('Citroen','04'),('Ford','09'),('Mercedes','06'),('Mitsubishi','10'),('Opel','08'),('Renault','11'),('Seat','02'),('Toyota','07');
/*!40000 ALTER TABLE `marcas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-12-02  8:45:56
