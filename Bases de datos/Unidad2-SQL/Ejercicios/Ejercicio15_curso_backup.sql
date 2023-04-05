-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 05-04-2023 a las 16:35:52
-- Versión del servidor: 10.1.40-MariaDB
-- Versión de PHP: 7.3.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `curso`
--

CREATE DATABASE curso;
USE curso;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumnos`
--

CREATE TABLE `alumnos` (
  `numalumno` tinyint(3) UNSIGNED ZEROFILL NOT NULL,
  `nombre` varchar(20) COLLATE latin1_spanish_ci NOT NULL,
  `apellidos` varchar(25) COLLATE latin1_spanish_ci NOT NULL,
  `dni` char(9) COLLATE latin1_spanish_ci NOT NULL,
  `direccion` varchar(40) COLLATE latin1_spanish_ci DEFAULT NULL,
  `localidad` varchar(20) COLLATE latin1_spanish_ci NOT NULL DEFAULT 'Santander'
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `alumnos`
--

INSERT INTO `alumnos` (`numalumno`, `nombre`, `apellidos`, `dni`, `direccion`, `localidad`) VALUES
(001, 'Javier', 'Rodriguez Sanz', '13702189G', 'Amos de Escalante 6, 1º C', 'Santander'),
(002, 'Marta', 'Herrera Alonso', '20786540S', 'Floranes 17, 5º A', 'Santander'),
(003, 'Pedro', 'Diaz Menchaca', '72158028D', 'Lasaga Larreta 2, 4º D', 'Torrelavega'),
(004, 'Miguel', 'Zurita Benitez', '20368911B', 'Marqués de Santillana 13, 1º B', 'Santander'),
(005, 'Sonia', 'Artigas Oria', '20216183B', 'La Habana 7, 2º B', 'Santander'),
(006, 'Susana', 'Gomez de la Fuente', '72636612F', 'Lealtad 7, 4º D', 'Santander'),
(007, 'Ruben', 'Cuesta Garcia', '20452287T', 'Canalejas 32, 3º B', 'Santander'),
(008, 'Raquel', 'Bueno Garcia', '20316733Z', 'Jimenez Diaz 6, 4º C', 'Santander'),
(009, 'Luis', 'Garcia Jimenez', '20429971C', 'Alonso 3, 2º A', 'Santander'),
(010, 'Igor', 'Ortuella Molina', '20776190D', 'Moctezuma 9, 2º B', 'Santander'),
(011, 'Jorge', 'Garcia Posadas', '20564420C', 'Floranes 48, 4º E', 'Santander'),
(016, 'Pedro', 'Álvarez Campos', '72147891', 'Julian Ceballos 35, 3º B', 'Torrelavega');

-- --------------------------------------------------------

--
-- Estructura Stand-in para la vista `aprobados_des_eva1`
-- (Véase abajo para la vista actual)
--
CREATE TABLE `aprobados_des_eva1` (
`Nombre` varchar(20)
,`Apellidos` varchar(25)
,`Nota` tinyint(2)
);

-- --------------------------------------------------------

--
-- Estructura Stand-in para la vista `clasificaciones_alumno4_eva1`
-- (Véase abajo para la vista actual)
--
CREATE TABLE `clasificaciones_alumno4_eva1` (
`Modulo` char(3)
,`Nombre` varchar(20)
,`Apellido` varchar(25)
,`Nota` tinyint(2)
);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `contratos`
--

CREATE TABLE `contratos` (
  `cifempresa` char(9) COLLATE latin1_spanish_ci NOT NULL,
  `dnialumno` char(9) COLLATE latin1_spanish_ci NOT NULL,
  `numalumno` tinyint(3) UNSIGNED ZEROFILL NOT NULL,
  `fechainicio` date NOT NULL,
  `fechafin` date NOT NULL,
  `horainicial` time NOT NULL,
  `horafinal` time NOT NULL,
  `apto` tinyint(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cursadas`
--

CREATE TABLE `cursadas` (
  `numalumno` tinyint(3) UNSIGNED ZEROFILL NOT NULL,
  `cmodulo` char(3) COLLATE latin1_spanish_ci NOT NULL,
  `nota1` tinyint(2) NOT NULL DEFAULT '0',
  `nota2` tinyint(2) NOT NULL DEFAULT '0',
  `nota3` tinyint(2) NOT NULL DEFAULT '0',
  `notafinal` tinyint(2) NOT NULL DEFAULT '0',
  `notarecu` tinyint(2) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `cursadas`
--

INSERT INTO `cursadas` (`numalumno`, `cmodulo`, `nota1`, `nota2`, `nota3`, `notafinal`, `notarecu`) VALUES
(001, 'DES', 6, 0, 0, 0, 0),
(001, 'DIS', 7, 0, 0, 0, 0),
(001, 'FCT', 6, 0, 0, 0, 0),
(001, 'FOL', 6, 0, 0, 0, 0),
(001, 'RET', 8, 0, 0, 0, 0),
(002, 'DES', 6, 0, 0, 0, 0),
(002, 'DIS', 7, 0, 0, 0, 0),
(002, 'FCT', 6, 0, 0, 0, 0),
(002, 'FOL', 6, 0, 0, 0, 0),
(002, 'RET', 5, 0, 0, 0, 0),
(003, 'DES', 6, 0, 0, 0, 0),
(003, 'DIS', 7, 0, 0, 0, 0),
(003, 'FCT', 6, 0, 0, 0, 0),
(003, 'FOL', 3, 0, 0, 0, 0),
(003, 'RET', 7, 0, 0, 0, 0),
(004, 'DES', 5, 0, 0, 0, 0),
(004, 'DIS', 7, 0, 0, 0, 0),
(004, 'FCT', 6, 0, 0, 0, 0),
(004, 'FOL', 8, 0, 0, 0, 0),
(004, 'RET', 5, 0, 0, 0, 0),
(005, 'DES', 6, 0, 0, 0, 0),
(005, 'DIS', 7, 0, 0, 0, 0),
(005, 'FCT', 6, 0, 0, 0, 0),
(005, 'FOL', 8, 0, 0, 0, 0),
(005, 'RET', 6, 0, 0, 0, 0),
(006, 'DES', 6, 0, 0, 0, 0),
(006, 'DIS', 7, 0, 0, 0, 0),
(006, 'FCT', 6, 0, 0, 0, 0),
(006, 'FOL', 4, 0, 0, 0, 0),
(006, 'RET', 9, 0, 0, 0, 0),
(007, 'DES', 6, 0, 0, 0, 0),
(007, 'DIS', 7, 0, 0, 0, 0),
(007, 'FCT', 6, 0, 0, 0, 0),
(007, 'FOL', 0, 0, 0, 0, 0),
(007, 'RET', 6, 0, 0, 0, 0),
(008, 'DES', 6, 0, 0, 0, 0),
(008, 'DIS', 7, 0, 0, 0, 0),
(008, 'FOL', 7, 0, 0, 0, 0),
(008, 'RET', 8, 0, 0, 0, 0),
(009, 'DES', 6, 0, 0, 0, 0),
(009, 'DIS', 7, 0, 0, 0, 0),
(009, 'FOL', 6, 0, 0, 0, 0),
(009, 'RET', 8, 0, 0, 0, 0),
(010, 'DES', 6, 0, 0, 0, 0),
(010, 'DIS', 7, 0, 0, 0, 0),
(010, 'FCT', 6, 0, 0, 0, 0),
(010, 'FOL', 7, 0, 0, 0, 0),
(010, 'RET', 10, 0, 0, 0, 0),
(011, 'DES', 6, 0, 0, 0, 0),
(011, 'DIS', 7, 0, 0, 0, 0),
(011, 'FCT', 6, 0, 0, 0, 0),
(011, 'FOL', 6, 0, 0, 0, 0),
(011, 'RET', 9, 0, 0, 0, 0),
(016, 'DES', 6, 0, 0, 0, 0),
(016, 'DIS', 7, 0, 0, 0, 0),
(016, 'FCT', 6, 0, 0, 0, 0),
(016, 'FOL', 1, 0, 0, 0, 0),
(016, 'RET', 9, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empresas`
--

CREATE TABLE `empresas` (
  `cif` char(9) COLLATE latin1_spanish_ci NOT NULL,
  `nombre` varchar(20) COLLATE latin1_spanish_ci NOT NULL,
  `actividad` varchar(20) COLLATE latin1_spanish_ci NOT NULL,
  `direccion` varchar(35) COLLATE latin1_spanish_ci NOT NULL,
  `localidad` varchar(20) COLLATE latin1_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `horario`
--

CREATE TABLE `horario` (
  `diasemana` enum('Lunes','Martes','Miércoles','Jueves','Viernes') COLLATE latin1_spanish_ci NOT NULL,
  `numhora` tinyint(4) NOT NULL,
  `cmodulo` char(3) COLLATE latin1_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `horario`
--

INSERT INTO `horario` (`diasemana`, `numhora`, `cmodulo`) VALUES
('Lunes', 6, 'DES'),
('Martes', 1, 'DES'),
('Martes', 2, 'DES'),
('Miércoles', 6, 'DES'),
('Jueves', 1, 'DES'),
('Jueves', 2, 'DES'),
('Viernes', 1, 'DES'),
('Viernes', 2, 'DES'),
('Lunes', 4, 'DIS'),
('Lunes', 5, 'DIS'),
('Martes', 6, 'DIS'),
('Miércoles', 3, 'DIS'),
('Miércoles', 4, 'DIS'),
('Miércoles', 5, 'DIS'),
('Jueves', 3, 'DIS'),
('Jueves', 4, 'DIS'),
('Viernes', 3, 'DIS'),
('Lunes', 3, 'FOL'),
('Martes', 5, 'FOL'),
('Lunes', 1, 'RET'),
('Lunes', 2, 'RET'),
('Martes', 3, 'RET'),
('Martes', 4, 'RET'),
('Miércoles', 1, 'RET'),
('Miércoles', 2, 'RET'),
('Jueves', 5, 'RET'),
('Jueves', 6, 'RET'),
('Viernes', 4, 'RET'),
('Viernes', 5, 'RET');

-- --------------------------------------------------------

--
-- Estructura Stand-in para la vista `horario_des`
-- (Véase abajo para la vista actual)
--
CREATE TABLE `horario_des` (
`diasemana` enum('Lunes','Martes','Miércoles','Jueves','Viernes')
,`numhora` tinyint(4)
);

-- --------------------------------------------------------

--
-- Estructura Stand-in para la vista `horario_lunes`
-- (Véase abajo para la vista actual)
--
CREATE TABLE `horario_lunes` (
`numhora` tinyint(4)
,`nombreModulo` varchar(80)
,`nombreProfesor` varchar(20)
);

-- --------------------------------------------------------

--
-- Estructura Stand-in para la vista `horario_semanal`
-- (Véase abajo para la vista actual)
--
CREATE TABLE `horario_semanal` (
`diasemana` enum('Lunes','Martes','Miércoles','Jueves','Viernes')
,`numhora` tinyint(4)
,`nombreModulo` varchar(80)
,`nombreProferos` varchar(20)
);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `horasimpartidas`
--

CREATE TABLE `horasimpartidas` (
  `cprofesor` char(2) COLLATE latin1_spanish_ci NOT NULL,
  `dia` enum('Lunes','Martes','Miércoles','Jueves','Viernes') COLLATE latin1_spanish_ci NOT NULL,
  `hora` enum('1','2','3','4','5','6') COLLATE latin1_spanish_ci NOT NULL,
  `cmodulo` char(3) COLLATE latin1_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `horasimpartidas`
--

INSERT INTO `horasimpartidas` (`cprofesor`, `dia`, `hora`, `cmodulo`) VALUES
('A3', 'Lunes', '1', 'DES'),
('A3', 'Lunes', '2', 'DES'),
('A3', 'Lunes', '3', 'DES'),
('A3', 'Miércoles', '1', 'DES'),
('A3', 'Miércoles', '2', 'DES'),
('A3', 'Miércoles', '3', 'DES');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `impartir`
--

CREATE TABLE `impartir` (
  `cprofesor` char(2) COLLATE latin1_spanish_ci NOT NULL,
  `cmodulo` char(3) COLLATE latin1_spanish_ci NOT NULL,
  `titular` tinyint(1) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `impartir`
--

INSERT INTO `impartir` (`cprofesor`, `cmodulo`, `titular`) VALUES
('A1', 'DIS', 1),
('A2', 'DES', 1),
('A3', 'DES', 0),
('B1', 'RET', 1),
('B2', 'FCT', 1),
('B2', 'FOL', 1);

-- --------------------------------------------------------

--
-- Estructura Stand-in para la vista `media_eva1`
-- (Véase abajo para la vista actual)
--
CREATE TABLE `media_eva1` (
`Modulo` char(3)
,`Nota` decimal(7,4)
);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `modulos`
--

CREATE TABLE `modulos` (
  `cmodulo` char(3) COLLATE latin1_spanish_ci NOT NULL,
  `nombre` varchar(80) COLLATE latin1_spanish_ci NOT NULL,
  `horas` int(4) NOT NULL,
  `transversal` tinyint(1) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `modulos`
--

INSERT INTO `modulos` (`cmodulo`, `nombre`, `horas`, `transversal`) VALUES
('DES', 'Desarrollo de Aplicaciones en Entornos de Cuarta Generación y con Herramientas C', 350, 0),
('DIS', 'Diseño y Realización de Presentaciones en Entornos Gráficos', 260, 0),
('FCT', 'Formación en Centros de Trabajo', 380, 1),
('FOL', 'Formación y Orientación Laboral', 75, 1),
('RET', 'Relaciones en el Entorno de Trabajo', 75, 1);

-- --------------------------------------------------------

--
-- Estructura Stand-in para la vista `modulos_aprobados_eva1`
-- (Véase abajo para la vista actual)
--
CREATE TABLE `modulos_aprobados_eva1` (
`Nombre` varchar(20)
,`Apellidos` varchar(25)
,`Modulo` varchar(80)
);

-- --------------------------------------------------------

--
-- Estructura Stand-in para la vista `modulos_suspensos_eva1`
-- (Véase abajo para la vista actual)
--
CREATE TABLE `modulos_suspensos_eva1` (
`Modulo` char(3)
,`Suspensos` bigint(21)
);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `profesores`
--

CREATE TABLE `profesores` (
  `cprofesor` char(2) COLLATE latin1_spanish_ci NOT NULL,
  `nombre` varchar(20) COLLATE latin1_spanish_ci NOT NULL,
  `apellidos` varchar(30) COLLATE latin1_spanish_ci NOT NULL,
  `antiguedad` date NOT NULL,
  `dni` char(9) COLLATE latin1_spanish_ci NOT NULL,
  `direccion` varchar(35) COLLATE latin1_spanish_ci NOT NULL,
  `loc` varchar(20) COLLATE latin1_spanish_ci NOT NULL DEFAULT 'Santander'
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `profesores`
--

INSERT INTO `profesores` (`cprofesor`, `nombre`, `apellidos`, `antiguedad`, `dni`, `direccion`, `loc`) VALUES
('A1', 'Manuel', 'Gomez Uria', '2003-09-01', '13754040S', 'Cuatro Caminos 4, 3º B', 'Torrelavega'),
('A2', 'Nuria', 'Balbin Antunez', '2020-09-01', '13445361P', 'Vargas 44, 6º C', 'Santander'),
('A3', 'Santiago', 'Martinez Casuso', '1998-09-10', '13132976D', 'San Fernando 30, 6º C', 'Santander'),
('B1', 'Maria', 'Contreras Gonzalez', '2021-10-05', '13518900C', 'Marques de Santillana 20, 5º A', 'Santander'),
('B2', 'Mercedes', 'Campo Suárez', '1998-09-01', '20862091F', 'Ganeral Davila 82, 4º D', 'Santander');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `prueba`
--

CREATE TABLE `prueba` (
  `num` int(3) UNSIGNED NOT NULL,
  `d` enum('Lunes','Martes','Miércoles','Jueves','Viernes') COLLATE latin1_spanish_ci NOT NULL,
  `e` set('azul','rojo','verde','blanco','negro','amarillo') COLLATE latin1_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `prueba`
--

INSERT INTO `prueba` (`num`, `d`, `e`) VALUES
(1, 'Jueves', ''),
(2, 'Miércoles', ''),
(3, 'Lunes', ''),
(4, '', ''),
(5, '', ''),
(6, 'Lunes', 'azul'),
(7, 'Lunes', 'azul,rojo,negro'),
(8, 'Lunes', 'azul,rojo,negro'),
(9, 'Lunes', 'negro'),
(10, 'Lunes', 'azul,blanco,negro'),
(11, 'Lunes', ''),
(12, 'Miércoles', 'azul'),
(13, 'Miércoles', 'rojo'),
(14, 'Miércoles', 'azul,rojo'),
(15, 'Miércoles', 'verde'),
(16, 'Miércoles', 'azul,verde'),
(17, 'Miércoles', 'rojo,verde'),
(18, 'Miércoles', 'azul,rojo,verde'),
(19, 'Miércoles', 'blanco'),
(20, 'Miércoles', 'azul,blanco'),
(21, 'Miércoles', 'rojo,blanco'),
(22, 'Miércoles', 'azul,rojo,blanco'),
(23, 'Miércoles', 'azul,rojo,verde,blanco,negro,amarillo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `titulaciones`
--

CREATE TABLE `titulaciones` (
  `cprofesor` char(2) COLLATE latin1_spanish_ci NOT NULL,
  `numtitulo` int(3) NOT NULL,
  `tipo` enum('Técnico superior','Licenciado','Diplomado','Doctor') COLLATE latin1_spanish_ci NOT NULL,
  `nombre` varchar(20) COLLATE latin1_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `titulaciones`
--

INSERT INTO `titulaciones` (`cprofesor`, `numtitulo`, `tipo`, `nombre`) VALUES
('A1', 1, 'Licenciado', 'Informática'),
('A1', 2, 'Licenciado', 'Físicas'),
('A2', 1, 'Licenciado', 'Informática'),
('A3', 1, 'Licenciado', 'Físicas'),
('B1', 1, 'Diplomado', 'Empresariales'),
('B2', 1, 'Diplomado', 'Relaciones Laborales'),
('B2', 2, 'Licenciado', 'Economía');

-- --------------------------------------------------------

--
-- Estructura para la vista `aprobados_des_eva1`
--
DROP TABLE IF EXISTS `aprobados_des_eva1`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `aprobados_des_eva1`  AS  select `alumnos`.`nombre` AS `Nombre`,`alumnos`.`apellidos` AS `Apellidos`,`cursadas`.`nota1` AS `Nota` from (`alumnos` join `cursadas` on((`alumnos`.`numalumno` = `cursadas`.`numalumno`))) where ((`cursadas`.`nota1` >= 5) and (`cursadas`.`cmodulo` = 'DES')) ;

-- --------------------------------------------------------

--
-- Estructura para la vista `clasificaciones_alumno4_eva1`
--
DROP TABLE IF EXISTS `clasificaciones_alumno4_eva1`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `clasificaciones_alumno4_eva1`  AS  select `cursadas`.`cmodulo` AS `Modulo`,`alumnos`.`nombre` AS `Nombre`,`alumnos`.`apellidos` AS `Apellido`,`cursadas`.`nota1` AS `Nota` from (`alumnos` join `cursadas` on((`alumnos`.`numalumno` = `cursadas`.`numalumno`))) where (`alumnos`.`numalumno` = 4) ;

-- --------------------------------------------------------

--
-- Estructura para la vista `horario_des`
--
DROP TABLE IF EXISTS `horario_des`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `horario_des`  AS  select `horario`.`diasemana` AS `diasemana`,`horario`.`numhora` AS `numhora` from `horario` where (`horario`.`cmodulo` = 'DES') ;

-- --------------------------------------------------------

--
-- Estructura para la vista `horario_lunes`
--
DROP TABLE IF EXISTS `horario_lunes`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `horario_lunes`  AS  select `horario`.`numhora` AS `numhora`,`modulos`.`nombre` AS `nombreModulo`,`profesores`.`nombre` AS `nombreProfesor` from (((`horario` join `modulos` on((`horario`.`cmodulo` = `modulos`.`cmodulo`))) join `impartir` on((`modulos`.`cmodulo` = `impartir`.`cmodulo`))) join `profesores` on((`impartir`.`cprofesor` = `profesores`.`cprofesor`))) where ((`horario`.`diasemana` = 'Lunes') and (`impartir`.`titular` = 1)) ;

-- --------------------------------------------------------

--
-- Estructura para la vista `horario_semanal`
--
DROP TABLE IF EXISTS `horario_semanal`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `horario_semanal`  AS  select `horario`.`diasemana` AS `diasemana`,`horario`.`numhora` AS `numhora`,`modulos`.`nombre` AS `nombreModulo`,`profesores`.`nombre` AS `nombreProferos` from (((`horario` join `modulos` on((`horario`.`cmodulo` = `modulos`.`cmodulo`))) join `impartir` on((`modulos`.`cmodulo` = `impartir`.`cmodulo`))) join `profesores` on((`impartir`.`cprofesor` = `profesores`.`cprofesor`))) group by `horario`.`diasemana`,`horario`.`numhora` ;

-- --------------------------------------------------------

--
-- Estructura para la vista `media_eva1`
--
DROP TABLE IF EXISTS `media_eva1`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `media_eva1`  AS  select `cursadas`.`cmodulo` AS `Modulo`,avg(`cursadas`.`nota1`) AS `Nota` from `cursadas` group by `cursadas`.`cmodulo` ;

-- --------------------------------------------------------

--
-- Estructura para la vista `modulos_aprobados_eva1`
--
DROP TABLE IF EXISTS `modulos_aprobados_eva1`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `modulos_aprobados_eva1`  AS  select `alumnos`.`nombre` AS `Nombre`,`alumnos`.`apellidos` AS `Apellidos`,`modulos`.`nombre` AS `Modulo` from ((`alumnos` join `cursadas` on((`alumnos`.`numalumno` = `cursadas`.`numalumno`))) join `modulos` on((`cursadas`.`cmodulo` = `modulos`.`cmodulo`))) where (`cursadas`.`nota1` >= 5) ;

-- --------------------------------------------------------

--
-- Estructura para la vista `modulos_suspensos_eva1`
--
DROP TABLE IF EXISTS `modulos_suspensos_eva1`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `modulos_suspensos_eva1`  AS  select `cursadas`.`cmodulo` AS `Modulo`,count(`cursadas`.`nota1`) AS `Suspensos` from `cursadas` where (`cursadas`.`nota1` < 5) group by `cursadas`.`cmodulo` ;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alumnos`
--
ALTER TABLE `alumnos`
  ADD PRIMARY KEY (`numalumno`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- Indices de la tabla `contratos`
--
ALTER TABLE `contratos`
  ADD PRIMARY KEY (`cifempresa`,`dnialumno`),
  ADD KEY `cifempresa` (`cifempresa`,`numalumno`),
  ADD KEY `numalumno` (`numalumno`);

--
-- Indices de la tabla `cursadas`
--
ALTER TABLE `cursadas`
  ADD PRIMARY KEY (`numalumno`,`cmodulo`),
  ADD KEY `numalumno` (`numalumno`),
  ADD KEY `cmodulo` (`cmodulo`);

--
-- Indices de la tabla `empresas`
--
ALTER TABLE `empresas`
  ADD PRIMARY KEY (`cif`);

--
-- Indices de la tabla `horario`
--
ALTER TABLE `horario`
  ADD PRIMARY KEY (`diasemana`,`numhora`),
  ADD KEY `cmodulo` (`cmodulo`);

--
-- Indices de la tabla `horasimpartidas`
--
ALTER TABLE `horasimpartidas`
  ADD PRIMARY KEY (`dia`,`hora`),
  ADD KEY `cprofesor` (`cprofesor`,`cmodulo`),
  ADD KEY `cmodulo` (`cmodulo`);

--
-- Indices de la tabla `impartir`
--
ALTER TABLE `impartir`
  ADD PRIMARY KEY (`cprofesor`,`cmodulo`),
  ADD KEY `cprofesor` (`cprofesor`,`cmodulo`);

--
-- Indices de la tabla `modulos`
--
ALTER TABLE `modulos`
  ADD PRIMARY KEY (`cmodulo`),
  ADD UNIQUE KEY `nombre` (`nombre`);

--
-- Indices de la tabla `profesores`
--
ALTER TABLE `profesores`
  ADD PRIMARY KEY (`cprofesor`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- Indices de la tabla `prueba`
--
ALTER TABLE `prueba`
  ADD PRIMARY KEY (`num`);

--
-- Indices de la tabla `titulaciones`
--
ALTER TABLE `titulaciones`
  ADD PRIMARY KEY (`cprofesor`,`numtitulo`),
  ADD KEY `cprofesor` (`cprofesor`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `alumnos`
--
ALTER TABLE `alumnos`
  MODIFY `numalumno` tinyint(3) UNSIGNED ZEROFILL NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT de la tabla `cursadas`
--
ALTER TABLE `cursadas`
  MODIFY `numalumno` tinyint(3) UNSIGNED ZEROFILL NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT de la tabla `prueba`
--
ALTER TABLE `prueba`
  MODIFY `num` int(3) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `contratos`
--
ALTER TABLE `contratos`
  ADD CONSTRAINT `contratos_ibfk_1` FOREIGN KEY (`cifempresa`) REFERENCES `empresas` (`cif`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `contratos_ibfk_2` FOREIGN KEY (`numalumno`) REFERENCES `alumnos` (`numalumno`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `cursadas`
--
ALTER TABLE `cursadas`
  ADD CONSTRAINT `cursadas_ibfk_1` FOREIGN KEY (`cmodulo`) REFERENCES `modulos` (`cmodulo`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `cursadas_ibfk_2` FOREIGN KEY (`numalumno`) REFERENCES `alumnos` (`numalumno`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `horario`
--
ALTER TABLE `horario`
  ADD CONSTRAINT `horario_ibfk_1` FOREIGN KEY (`cmodulo`) REFERENCES `modulos` (`cmodulo`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `horasimpartidas`
--
ALTER TABLE `horasimpartidas`
  ADD CONSTRAINT `horasimpartidas_ibfk_1` FOREIGN KEY (`cmodulo`) REFERENCES `modulos` (`cmodulo`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `horasimpartidas_ibfk_2` FOREIGN KEY (`cprofesor`) REFERENCES `profesores` (`cprofesor`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `titulaciones`
--
ALTER TABLE `titulaciones`
  ADD CONSTRAINT `titulaciones_ibfk_1` FOREIGN KEY (`cprofesor`) REFERENCES `profesores` (`cprofesor`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
