-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         10.1.28-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win32
-- HeidiSQL Versión:             9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Volcando estructura de base de datos para tpdds2017
DROP DATABASE IF EXISTS `tpdds2017`;
CREATE DATABASE IF NOT EXISTS `tpdds2017` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `tpdds2017`;

-- Volcando estructura para tabla tpdds2017.administrador
DROP TABLE IF EXISTS `administrador`;
CREATE TABLE IF NOT EXISTS `administrador` (
  `id_usuario` int(11) NOT NULL,
  PRIMARY KEY (`id_usuario`),
  KEY `FOREIGN KEY` (`id_usuario`),
  CONSTRAINT `FK_ADMINISTRADOR_USUARIO` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id_usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla tpdds2017.administrador: ~0 rows (aproximadamente)
DELETE FROM `administrador`;
/*!40000 ALTER TABLE `administrador` DISABLE KEYS */;
INSERT INTO `administrador` (`id_usuario`) VALUES
	(1);
/*!40000 ALTER TABLE `administrador` ENABLE KEYS */;

-- Volcando estructura para tabla tpdds2017.aula
DROP TABLE IF EXISTS `aula`;
CREATE TABLE IF NOT EXISTS `aula` (
  `id_aula` int(11) NOT NULL AUTO_INCREMENT,
  `ubicacion` int(11) DEFAULT NULL,
  `capacidad` int(11) DEFAULT NULL,
  `estado` varchar(13) DEFAULT NULL,
  `tipo_pizarron` varchar(8) DEFAULT NULL,
  `aire_acondicionado` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`id_aula`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla tpdds2017.aula: ~7 rows (aproximadamente)
DELETE FROM `aula`;
/*!40000 ALTER TABLE `aula` DISABLE KEYS */;
INSERT INTO `aula` (`id_aula`, `ubicacion`, `capacidad`, `estado`, `tipo_pizarron`, `aire_acondicionado`) VALUES
	(1, 23, 20, 'd', 'AR23', 'si'),
	(2, 23, 40, 'd', 'AR23', 'no'),
	(3, 50, 25, 'd', 'AR23', 'no'),
	(4, 30, 30, 'd', 'SR5', 'no'),
	(5, 30, 35, 'd', 'FS3', 'si'),
	(6, 10, 25, 'd', 'AR23', 'si'),
	(7, 15, 80, 'd', 'FS3', 'si');
/*!40000 ALTER TABLE `aula` ENABLE KEYS */;

-- Volcando estructura para tabla tpdds2017.bedel
DROP TABLE IF EXISTS `bedel`;
CREATE TABLE IF NOT EXISTS `bedel` (
  `id_usuario` int(11) NOT NULL,
  `nombre_bedel` varchar(20) DEFAULT NULL,
  `apellido_bedel` varchar(20) DEFAULT NULL,
  `id_turno` int(11) NOT NULL,
  PRIMARY KEY (`id_usuario`),
  KEY `id_usuario` (`id_usuario`),
  KEY `id_turno` (`id_turno`),
  CONSTRAINT `FK_BEDEL_USUARIO` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id_usuario`),
  CONSTRAINT `FK_PERTENECE_A_TURNO` FOREIGN KEY (`id_turno`) REFERENCES `turno` (`id_turno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla tpdds2017.bedel: ~6 rows (aproximadamente)
DELETE FROM `bedel`;
/*!40000 ALTER TABLE `bedel` DISABLE KEYS */;
INSERT INTO `bedel` (`id_usuario`, `nombre_bedel`, `apellido_bedel`, `id_turno`) VALUES
	(4, 'Mariano', 'Roces', 2),
	(5, 'Matias', 'Jacob', 1),
	(12, 'Matuki', 'ahreeee', 3),
	(14, 'Julian', 'Petric', 2),
	(15, 'Anibal', 'Tonutti', 3),
	(16, 'Elías', 'Veracruz', 2);
/*!40000 ALTER TABLE `bedel` ENABLE KEYS */;

-- Volcando estructura para tabla tpdds2017.catedra
DROP TABLE IF EXISTS `catedra`;
CREATE TABLE IF NOT EXISTS `catedra` (
  `id_catedra` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_catedra` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id_catedra`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla tpdds2017.catedra: ~5 rows (aproximadamente)
DELETE FROM `catedra`;
/*!40000 ALTER TABLE `catedra` DISABLE KEYS */;
INSERT INTO `catedra` (`id_catedra`, `nombre_catedra`) VALUES
	(1, 'DIED'),
	(2, 'DDS'),
	(3, 'Mat Sup'),
	(4, 'Redes'),
	(5, 'Probabilidad');
/*!40000 ALTER TABLE `catedra` ENABLE KEYS */;

-- Volcando estructura para tabla tpdds2017.dia
DROP TABLE IF EXISTS `dia`;
CREATE TABLE IF NOT EXISTS `dia` (
  `id_dia` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_dia` varchar(9) DEFAULT NULL,
  `id_periodica` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_dia`),
  KEY `FK_DIA_PERTENECE` (`id_periodica`),
  CONSTRAINT `FK_DIA_PERTENECE` FOREIGN KEY (`id_periodica`) REFERENCES `periodica` (`id_reserva`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla tpdds2017.dia: ~9 rows (aproximadamente)
DELETE FROM `dia`;
/*!40000 ALTER TABLE `dia` DISABLE KEYS */;
INSERT INTO `dia` (`id_dia`, `nombre_dia`, `id_periodica`) VALUES
	(2, 'Viernes', NULL),
	(10, 'Lunes', 22),
	(11, 'Martes', 23),
	(12, 'Miercoles', NULL),
	(13, 'Jueves', NULL),
	(14, 'Jueves', NULL),
	(15, 'Jueves', NULL),
	(16, 'Lunes', NULL),
	(17, 'Jueves', NULL),
	(18, 'Lunes', 28),
	(19, 'Martes', 28);
/*!40000 ALTER TABLE `dia` ENABLE KEYS */;

-- Volcando estructura para tabla tpdds2017.docente
DROP TABLE IF EXISTS `docente`;
CREATE TABLE IF NOT EXISTS `docente` (
  `id_docente` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_docente` varchar(20) DEFAULT NULL,
  `apellido_docente` varchar(20) DEFAULT NULL,
  `email_docente` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id_docente`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla tpdds2017.docente: ~3 rows (aproximadamente)
DELETE FROM `docente`;
/*!40000 ALTER TABLE `docente` DISABLE KEYS */;
INSERT INTO `docente` (`id_docente`, `nombre_docente`, `apellido_docente`, `email_docente`) VALUES
	(1, 'Jorge', 'Marti', 'jorge@gmail.com'),
	(2, 'Lucho', 'El  Jefe', 'lucho@gmail.com'),
	(3, 'Mati', 'Asd', 'mati@live.com');
/*!40000 ALTER TABLE `docente` ENABLE KEYS */;

-- Volcando estructura para tabla tpdds2017.docente_pertenece_catedra
DROP TABLE IF EXISTS `docente_pertenece_catedra`;
CREATE TABLE IF NOT EXISTS `docente_pertenece_catedra` (
  `id_catedra` int(11) NOT NULL,
  `id_docente` int(11) NOT NULL,
  KEY `id_catedra` (`id_catedra`),
  KEY `id_docente` (`id_docente`),
  CONSTRAINT `FK_PERTENECE_CATEDRA` FOREIGN KEY (`id_catedra`) REFERENCES `catedra` (`id_catedra`),
  CONSTRAINT `FK_PERTENECE_DOCENTE` FOREIGN KEY (`id_docente`) REFERENCES `docente` (`id_docente`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla tpdds2017.docente_pertenece_catedra: ~7 rows (aproximadamente)
DELETE FROM `docente_pertenece_catedra`;
/*!40000 ALTER TABLE `docente_pertenece_catedra` DISABLE KEYS */;
INSERT INTO `docente_pertenece_catedra` (`id_catedra`, `id_docente`) VALUES
	(1, 1),
	(2, 1),
	(3, 1),
	(4, 2),
	(5, 2),
	(3, 3),
	(4, 3);
/*!40000 ALTER TABLE `docente_pertenece_catedra` ENABLE KEYS */;

-- Volcando estructura para tabla tpdds2017.esporadica
DROP TABLE IF EXISTS `esporadica`;
CREATE TABLE IF NOT EXISTS `esporadica` (
  `id_reserva` int(11) NOT NULL,
  PRIMARY KEY (`id_reserva`),
  KEY `id_reserva` (`id_reserva`),
  CONSTRAINT `FK_ESPORADICA_RESERVA` FOREIGN KEY (`id_reserva`) REFERENCES `reserva` (`id_reserva`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla tpdds2017.esporadica: ~5 rows (aproximadamente)
DELETE FROM `esporadica`;
/*!40000 ALTER TABLE `esporadica` DISABLE KEYS */;
INSERT INTO `esporadica` (`id_reserva`) VALUES
	(21),
	(24),
	(25),
	(26),
	(27);
/*!40000 ALTER TABLE `esporadica` ENABLE KEYS */;

-- Volcando estructura para tabla tpdds2017.fecha
DROP TABLE IF EXISTS `fecha`;
CREATE TABLE IF NOT EXISTS `fecha` (
  `id_fecha` int(11) NOT NULL AUTO_INCREMENT,
  `duracion` int(11) DEFAULT NULL,
  `hora_inicio` time DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `id_dia` int(11) NOT NULL,
  `id_reserva` int(11) DEFAULT NULL,
  `id_aula` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_fecha`),
  KEY `id_dia` (`id_dia`),
  KEY `FK_RESERVA_DIA` (`id_reserva`),
  KEY `FK_ASOCIA_AULA` (`id_aula`),
  CONSTRAINT `FK_ASOCIA_AULA` FOREIGN KEY (`id_aula`) REFERENCES `aula` (`id_aula`),
  CONSTRAINT `FK_INCLUYE_DIA` FOREIGN KEY (`id_dia`) REFERENCES `dia` (`id_dia`),
  CONSTRAINT `FK_RESERVA_DIA` FOREIGN KEY (`id_reserva`) REFERENCES `esporadica` (`id_reserva`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla tpdds2017.fecha: ~14 rows (aproximadamente)
DELETE FROM `fecha`;
/*!40000 ALTER TABLE `fecha` DISABLE KEYS */;
INSERT INTO `fecha` (`id_fecha`, `duracion`, `hora_inicio`, `fecha`, `id_dia`, `id_reserva`, `id_aula`) VALUES
	(4, 1500, '22:00:00', '2018-07-26', 2, 21, 3),
	(9, 1000, '10:30:00', '2017-11-27', 10, NULL, 3),
	(10, 1000, '10:30:00', '2017-12-04', 10, NULL, 2),
	(11, 1000, '10:30:00', '2017-12-11', 10, NULL, 1),
	(12, 1000, '10:30:00', '2017-12-18', 10, NULL, 1),
	(13, 2500, '10:10:00', '2017-12-12', 11, NULL, 1),
	(14, 2500, '10:10:00', '2017-12-05', 11, NULL, 4),
	(15, 2500, '10:10:00', '2017-12-19', 11, NULL, 5),
	(16, 3000, '14:00:00', '2017-12-12', 12, 24, 6),
	(17, 1000, '18:00:00', '2017-12-13', 13, 25, 6),
	(18, 2500, '14:30:00', '2020-11-11', 14, 26, 4),
	(19, 3000, '16:00:00', '2018-08-29', 15, 27, 7),
	(20, 1500, '15:00:00', '2018-08-26', 16, 27, 7),
	(21, 3000, '18:00:00', '2018-08-22', 17, 27, 7),
	(22, 3000, '10:20:00', '2017-12-18', 18, NULL, 4),
	(23, 1500, '15:30:00', '2017-12-19', 19, NULL, 5);
/*!40000 ALTER TABLE `fecha` ENABLE KEYS */;

-- Volcando estructura para tabla tpdds2017.historial_contrasenias
DROP TABLE IF EXISTS `historial_contrasenias`;
CREATE TABLE IF NOT EXISTS `historial_contrasenias` (
  `id_cambio` int(11) NOT NULL AUTO_INCREMENT,
  `fecha_cambio` date DEFAULT NULL,
  `contrasenia_nueva` varchar(20) DEFAULT NULL,
  `id_usuario` int(11) NOT NULL,
  `id_politica` int(11) NOT NULL,
  PRIMARY KEY (`id_cambio`),
  KEY `id_usuario` (`id_usuario`),
  KEY `id_politica` (`id_politica`),
  CONSTRAINT `FK_REGISTRA_HISTORIAL_CONTRASENIAS` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id_usuario`),
  CONSTRAINT `FK_RESPETA_HISTORIAL_CONTRASENIAS` FOREIGN KEY (`id_politica`) REFERENCES `politica_contrasenias` (`id_politica`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla tpdds2017.historial_contrasenias: ~7 rows (aproximadamente)
DELETE FROM `historial_contrasenias`;
/*!40000 ALTER TABLE `historial_contrasenias` DISABLE KEYS */;
INSERT INTO `historial_contrasenias` (`id_cambio`, `fecha_cambio`, `contrasenia_nueva`, `id_usuario`, `id_politica`) VALUES
	(1, '2017-12-06', '0123456789', 4, 1),
	(2, '2017-12-12', '0123456789', 14, 1),
	(3, '2017-12-12', '1111111111', 14, 1),
	(11, '2017-12-13', '0123456789', 5, 1),
	(13, '2017-12-13', 'Elloco2208', 5, 1),
	(14, '2017-12-13', 'Matute2208', 5, 1),
	(15, '2017-12-13', '1234567890', 5, 1);
/*!40000 ALTER TABLE `historial_contrasenias` ENABLE KEYS */;

-- Volcando estructura para tabla tpdds2017.informatica
DROP TABLE IF EXISTS `informatica`;
CREATE TABLE IF NOT EXISTS `informatica` (
  `canion` varchar(2) DEFAULT NULL,
  `cantidad_pcs` int(11) DEFAULT NULL,
  `id_aula` int(11) NOT NULL,
  PRIMARY KEY (`id_aula`),
  KEY `AULA` (`id_aula`),
  CONSTRAINT `FK_INFORMATICA_AULA` FOREIGN KEY (`id_aula`) REFERENCES `aula` (`id_aula`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla tpdds2017.informatica: ~0 rows (aproximadamente)
DELETE FROM `informatica`;
/*!40000 ALTER TABLE `informatica` DISABLE KEYS */;
INSERT INTO `informatica` (`canion`, `cantidad_pcs`, `id_aula`) VALUES
	('si', 25, 7);
/*!40000 ALTER TABLE `informatica` ENABLE KEYS */;

-- Volcando estructura para tabla tpdds2017.multimedios
DROP TABLE IF EXISTS `multimedios`;
CREATE TABLE IF NOT EXISTS `multimedios` (
  `televisor` varchar(2) DEFAULT NULL,
  `canion` varchar(2) DEFAULT NULL,
  `computadora` varchar(2) DEFAULT NULL,
  `dvd` varchar(2) DEFAULT NULL,
  `id_aula` int(11) NOT NULL,
  PRIMARY KEY (`id_aula`),
  KEY `id_aula` (`id_aula`),
  CONSTRAINT `FK_MULTIMEDIOS_AULA` FOREIGN KEY (`id_aula`) REFERENCES `aula` (`id_aula`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla tpdds2017.multimedios: ~5 rows (aproximadamente)
DELETE FROM `multimedios`;
/*!40000 ALTER TABLE `multimedios` DISABLE KEYS */;
INSERT INTO `multimedios` (`televisor`, `canion`, `computadora`, `dvd`, `id_aula`) VALUES
	('si', 'si', 'si', 'si', 1),
	('si', 'no', 'si', 'no', 2),
	('no', 'no', 'no', 'no', 3),
	('si', 'si', 'si', 'si', 4),
	('si', 'si', 'si', 'si', 5);
/*!40000 ALTER TABLE `multimedios` ENABLE KEYS */;

-- Volcando estructura para tabla tpdds2017.periodica
DROP TABLE IF EXISTS `periodica`;
CREATE TABLE IF NOT EXISTS `periodica` (
  `id_reserva` int(11) NOT NULL,
  `id_periodo` int(11) NOT NULL,
  PRIMARY KEY (`id_reserva`),
  KEY `id_reserva` (`id_reserva`),
  KEY `id_periodo` (`id_periodo`),
  CONSTRAINT `FK_ABARCA_PERIODO` FOREIGN KEY (`id_periodo`) REFERENCES `periodo` (`id_periodo`),
  CONSTRAINT `FK_PERIODICA_RESERVA` FOREIGN KEY (`id_reserva`) REFERENCES `reserva` (`id_reserva`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla tpdds2017.periodica: ~2 rows (aproximadamente)
DELETE FROM `periodica`;
/*!40000 ALTER TABLE `periodica` DISABLE KEYS */;
INSERT INTO `periodica` (`id_reserva`, `id_periodo`) VALUES
	(22, 2),
	(23, 2),
	(28, 3);
/*!40000 ALTER TABLE `periodica` ENABLE KEYS */;

-- Volcando estructura para tabla tpdds2017.periodo
DROP TABLE IF EXISTS `periodo`;
CREATE TABLE IF NOT EXISTS `periodo` (
  `id_periodo` int(11) NOT NULL AUTO_INCREMENT,
  `tipo_periodo` varchar(13) DEFAULT NULL,
  `fecha_inicio` date DEFAULT NULL,
  `fecha_fin` date DEFAULT NULL,
  PRIMARY KEY (`id_periodo`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla tpdds2017.periodo: ~6 rows (aproximadamente)
DELETE FROM `periodo`;
/*!40000 ALTER TABLE `periodo` DISABLE KEYS */;
INSERT INTO `periodo` (`id_periodo`, `tipo_periodo`, `fecha_inicio`, `fecha_fin`) VALUES
	(1, '1C-2017', '2017-02-01', '2017-06-07'),
	(2, '2C-2017', '2017-06-08', '2017-12-20'),
	(3, 'ANUAL-2017', '2017-02-01', '2017-12-20'),
	(4, '1C-2018', '2018-02-01', '2018-06-07'),
	(5, '2C-2018', '2018-06-08', '2018-12-20'),
	(6, 'ANUAL-2018', '2018-02-01', '2018-12-20');
/*!40000 ALTER TABLE `periodo` ENABLE KEYS */;

-- Volcando estructura para tabla tpdds2017.politica_contrasenias
DROP TABLE IF EXISTS `politica_contrasenias`;
CREATE TABLE IF NOT EXISTS `politica_contrasenias` (
  `id_politica` int(11) NOT NULL AUTO_INCREMENT,
  `tipo_politica` text,
  PRIMARY KEY (`id_politica`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla tpdds2017.politica_contrasenias: ~0 rows (aproximadamente)
DELETE FROM `politica_contrasenias`;
/*!40000 ALTER TABLE `politica_contrasenias` DISABLE KEYS */;
INSERT INTO `politica_contrasenias` (`id_politica`, `tipo_politica`) VALUES
	(1, '7-15-10-20-/;\'"´áéíóú`@#$%&*-n-n-n');
/*!40000 ALTER TABLE `politica_contrasenias` ENABLE KEYS */;

-- Volcando estructura para tabla tpdds2017.reserva
DROP TABLE IF EXISTS `reserva`;
CREATE TABLE IF NOT EXISTS `reserva` (
  `id_reserva` int(11) NOT NULL AUTO_INCREMENT,
  `cantidad_alumnos` int(11) DEFAULT NULL,
  `id_bedel` int(11) DEFAULT NULL,
  `id_catedra` int(11) DEFAULT NULL,
  `id_docente` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_reserva`),
  KEY `id_bedel` (`id_bedel`),
  KEY `id_catedra` (`id_catedra`),
  KEY `id_docente` (`id_docente`),
  CONSTRAINT `FK_ASOCIA_CATEDRA` FOREIGN KEY (`id_catedra`) REFERENCES `catedra` (`id_catedra`),
  CONSTRAINT `FK_BEDEL_RESERVA` FOREIGN KEY (`id_bedel`) REFERENCES `bedel` (`id_usuario`),
  CONSTRAINT `FK_SOLICITA_RESERVA` FOREIGN KEY (`id_docente`) REFERENCES `docente` (`id_docente`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla tpdds2017.reserva: ~7 rows (aproximadamente)
DELETE FROM `reserva`;
/*!40000 ALTER TABLE `reserva` DISABLE KEYS */;
INSERT INTO `reserva` (`id_reserva`, `cantidad_alumnos`, `id_bedel`, `id_catedra`, `id_docente`) VALUES
	(21, 15, 5, 3, 2),
	(22, 10, 5, 3, 2),
	(23, 20, 5, 3, 2),
	(24, 5, 5, 3, 2),
	(25, 20, 5, 3, 2),
	(26, 20, 5, 5, 2),
	(27, 45, 14, 3, 1),
	(28, 25, 5, 4, 2);
/*!40000 ALTER TABLE `reserva` ENABLE KEYS */;

-- Volcando estructura para tabla tpdds2017.sin_recursos
DROP TABLE IF EXISTS `sin_recursos`;
CREATE TABLE IF NOT EXISTS `sin_recursos` (
  `ventiladores` varchar(2) DEFAULT NULL,
  `id_aula` int(11) NOT NULL,
  PRIMARY KEY (`id_aula`),
  KEY `id_aula` (`id_aula`),
  CONSTRAINT `FK_SIN_RECURSOS_AULA` FOREIGN KEY (`id_aula`) REFERENCES `aula` (`id_aula`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla tpdds2017.sin_recursos: ~0 rows (aproximadamente)
DELETE FROM `sin_recursos`;
/*!40000 ALTER TABLE `sin_recursos` DISABLE KEYS */;
INSERT INTO `sin_recursos` (`ventiladores`, `id_aula`) VALUES
	('si', 6);
/*!40000 ALTER TABLE `sin_recursos` ENABLE KEYS */;

-- Volcando estructura para tabla tpdds2017.turno
DROP TABLE IF EXISTS `turno`;
CREATE TABLE IF NOT EXISTS `turno` (
  `id_turno` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_turno` varchar(6) NOT NULL,
  PRIMARY KEY (`id_turno`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla tpdds2017.turno: ~3 rows (aproximadamente)
DELETE FROM `turno`;
/*!40000 ALTER TABLE `turno` DISABLE KEYS */;
INSERT INTO `turno` (`id_turno`, `nombre_turno`) VALUES
	(1, 'MAÑANA'),
	(2, 'TARDE'),
	(3, 'NOCHE');
/*!40000 ALTER TABLE `turno` ENABLE KEYS */;

-- Volcando estructura para tabla tpdds2017.usuario
DROP TABLE IF EXISTS `usuario`;
CREATE TABLE IF NOT EXISTS `usuario` (
  `id_usuario` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_usuario` varchar(20) NOT NULL,
  `contrasenia` varchar(20) NOT NULL,
  PRIMARY KEY (`id_usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla tpdds2017.usuario: ~7 rows (aproximadamente)
DELETE FROM `usuario`;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` (`id_usuario`, `nombre_usuario`, `contrasenia`) VALUES
	(1, 'matute2208', 'Elloco2208'),
	(4, 'mariano033', '0123456789'),
	(5, 'pruebaprueba', '1234567890'),
	(12, 'ahreeeee7777', '0123456789'),
	(14, 'julipetric08', '1111111111'),
	(15, 'anihton1990', 'Teketeke2208'),
	(16, 'eliasveracruz08', 'Prueba1234');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
