-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 10-03-2023 a las 12:52:48
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
-- Base de datos: `bd1`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `biologia`
--

CREATE TABLE `biologia` (
  `nal` int(3) UNSIGNED ZEROFILL NOT NULL COMMENT 'Clave principal',
  `nombre` varchar(30) COLLATE latin1_spanish_ci NOT NULL,
  `apellidos` varchar(30) COLLATE latin1_spanish_ci NOT NULL,
  `localidad` varchar(20) COLLATE latin1_spanish_ci NOT NULL DEFAULT 'Santander',
  `telefono` char(9) COLLATE latin1_spanish_ci DEFAULT NULL,
  `nota` decimal(3,1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `biologia`
--

INSERT INTO `biologia` (`nal`, `nombre`, `apellidos`, `localidad`, `telefono`, `nota`) VALUES
(001, 'Javier', 'Ramos', 'Torrelavega', '942807090', '8.5'),
(002, 'Rebeca', 'Santos', 'Santander', '650334455', '10.0'),
(003, 'Manuel', 'Arrieta', 'Santander', '942656463', '4.5');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `extras`
--

CREATE TABLE `extras` (
  `id` int(3) NOT NULL,
  `nal` int(3) UNSIGNED ZEROFILL NOT NULL,
  `actividad` varchar(10) COLLATE latin1_spanish_ci NOT NULL,
  `horas` tinyint(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `extras`
--

INSERT INTO `extras` (`id`, `nal`, `actividad`, `horas`) VALUES
(11, 002, 'Kárate', 3),
(12, 002, 'Futbol', 2),
(13, 003, 'Tenis', 4),
(14, 003, 'Ajedrez', 5);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `biologia`
--
ALTER TABLE `biologia`
  ADD PRIMARY KEY (`nal`);

--
-- Indices de la tabla `extras`
--
ALTER TABLE `extras`
  ADD PRIMARY KEY (`id`),
  ADD KEY `nal` (`nal`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `biologia`
--
ALTER TABLE `biologia`
  MODIFY `nal` int(3) UNSIGNED ZEROFILL NOT NULL AUTO_INCREMENT COMMENT 'Clave principal', AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `extras`
--
ALTER TABLE `extras`
  MODIFY `id` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `extras`
--
ALTER TABLE `extras`
  ADD CONSTRAINT `extras_ibfk_1` FOREIGN KEY (`nal`) REFERENCES `biologia` (`nal`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
