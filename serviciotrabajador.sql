-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 27-05-2022 a las 03:03:35
-- Versión del servidor: 10.4.22-MariaDB
-- Versión de PHP: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bddservijob`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `serviciotrabajador`
--

CREATE TABLE `serviciotrabajador` (
  `IDServicioTrabajador` bigint(20) NOT NULL,
  `IDServicio` bigint(20) NOT NULL,
  `IDTrabajador` bigint(20) NOT NULL,
  `Descripcion` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `serviciotrabajador`
--

INSERT INTO `serviciotrabajador` (`IDServicioTrabajador`, `IDServicio`, `IDTrabajador`, `Descripcion`) VALUES
(1, 1, 1, 'Experto en gasfiteria'),
(2, 2, 2, 'Especialista en cambio de toma corrientes'),
(3, 3, 3, 'Reparaciones de muebles'),
(4, 1, 4, 'asdasd'),
(5, 3, 5, 'wqerew');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `serviciotrabajador`
--
ALTER TABLE `serviciotrabajador`
  ADD PRIMARY KEY (`IDServicioTrabajador`),
  ADD KEY `IDServicio` (`IDServicio`),
  ADD KEY `IDTrabajador` (`IDTrabajador`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `serviciotrabajador`
--
ALTER TABLE `serviciotrabajador`
  MODIFY `IDServicioTrabajador` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `serviciotrabajador`
--
ALTER TABLE `serviciotrabajador`
  ADD CONSTRAINT `serviciotrabajador_ibfk_1` FOREIGN KEY (`IDServicio`) REFERENCES `servicio` (`IDServicio`),
  ADD CONSTRAINT `serviciotrabajador_ibfk_2` FOREIGN KEY (`IDTrabajador`) REFERENCES `trabajador` (`IDTrabajador`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
