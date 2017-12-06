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
  `id_admin` int(11) NOT NULL AUTO_INCREMENT,
  `id_usuario` int(11) NOT NULL,
  PRIMARY KEY (`id_admin`),
  KEY `id_usuario` (`id_usuario`),
  CONSTRAINT `FK_ADMINISTRADOR_USUARIO` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id_usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla tpdds2017.administrador: ~2 rows (aproximadamente)
DELETE FROM `administrador`;
/*!40000 ALTER TABLE `administrador` DISABLE KEYS */;
INSERT INTO `administrador` (`id_admin`, `id_usuario`) VALUES
	(1, 1),
	(2, 4);
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
  `id_reserva` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_aula`),
  KEY `FK_RESERVA_CONTIENE_AULA` (`id_reserva`),
  CONSTRAINT `FK_RESERVA_CONTIENE_AULA` FOREIGN KEY (`id_reserva`) REFERENCES `reserva` (`id_reserva`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla tpdds2017.aula: ~0 rows (aproximadamente)
DELETE FROM `aula`;
/*!40000 ALTER TABLE `aula` DISABLE KEYS */;
/*!40000 ALTER TABLE `aula` ENABLE KEYS */;

-- Volcando estructura para tabla tpdds2017.bedel
DROP TABLE IF EXISTS `bedel`;
CREATE TABLE IF NOT EXISTS `bedel` (
  `id_bedel` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_bedel` varchar(20) DEFAULT NULL,
  `apellido_bedel` varchar(20) DEFAULT NULL,
  `id_usuario` int(11) NOT NULL,
  `id_turno` int(11) NOT NULL,
  PRIMARY KEY (`id_bedel`),
  KEY `id_usuario` (`id_usuario`),
  KEY `id_turno` (`id_turno`),
  CONSTRAINT `FK_BEDEL_USUARIO` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id_usuario`),
  CONSTRAINT `FK_PERTENECE_A_TURNO` FOREIGN KEY (`id_turno`) REFERENCES `turno` (`id_turno`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla tpdds2017.bedel: ~0 rows (aproximadamente)
DELETE FROM `bedel`;
/*!40000 ALTER TABLE `bedel` DISABLE KEYS */;
INSERT INTO `bedel` (`id_bedel`, `nombre_bedel`, `apellido_bedel`, `id_usuario`, `id_turno`) VALUES
	(3, 'Mariano', 'Roces', 4, 2),
	(4, 'Matias', 'Jacob', 5, 1);
/*!40000 ALTER TABLE `bedel` ENABLE KEYS */;

-- Volcando estructura para tabla tpdds2017.catedra
DROP TABLE IF EXISTS `catedra`;
CREATE TABLE IF NOT EXISTS `catedra` (
  `id_catedra` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_catedra` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id_catedra`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla tpdds2017.catedra: ~0 rows (aproximadamente)
DELETE FROM `catedra`;
/*!40000 ALTER TABLE `catedra` DISABLE KEYS */;
/*!40000 ALTER TABLE `catedra` ENABLE KEYS */;

-- Volcando estructura para tabla tpdds2017.dia
DROP TABLE IF EXISTS `dia`;
CREATE TABLE IF NOT EXISTS `dia` (
  `id_dia` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_dia` varchar(9) DEFAULT NULL,
  `id_periodica` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_dia`),
  KEY `FK_DIA_PERTENECE` (`id_periodica`),
  CONSTRAINT `FK_DIA_PERTENECE` FOREIGN KEY (`id_periodica`) REFERENCES `periodica` (`id_periodo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla tpdds2017.dia: ~0 rows (aproximadamente)
DELETE FROM `dia`;
/*!40000 ALTER TABLE `dia` DISABLE KEYS */;
/*!40000 ALTER TABLE `dia` ENABLE KEYS */;

-- Volcando estructura para tabla tpdds2017.docente
DROP TABLE IF EXISTS `docente`;
CREATE TABLE IF NOT EXISTS `docente` (
  `id_docente` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_docente` varchar(20) DEFAULT NULL,
  `apellido_docente` varchar(20) DEFAULT NULL,
  `email_docente` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id_docente`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla tpdds2017.docente: ~0 rows (aproximadamente)
DELETE FROM `docente`;
/*!40000 ALTER TABLE `docente` DISABLE KEYS */;
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

-- Volcando datos para la tabla tpdds2017.docente_pertenece_catedra: ~0 rows (aproximadamente)
DELETE FROM `docente_pertenece_catedra`;
/*!40000 ALTER TABLE `docente_pertenece_catedra` DISABLE KEYS */;
/*!40000 ALTER TABLE `docente_pertenece_catedra` ENABLE KEYS */;

-- Volcando estructura para tabla tpdds2017.esporadica
DROP TABLE IF EXISTS `esporadica`;
CREATE TABLE IF NOT EXISTS `esporadica` (
  `id_reserva` int(11) NOT NULL,
  PRIMARY KEY (`id_reserva`),
  KEY `id_reserva` (`id_reserva`),
  CONSTRAINT `FK_ESPORADICA_RESERVA` FOREIGN KEY (`id_reserva`) REFERENCES `reserva` (`id_reserva`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla tpdds2017.esporadica: ~0 rows (aproximadamente)
DELETE FROM `esporadica`;
/*!40000 ALTER TABLE `esporadica` DISABLE KEYS */;
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
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla tpdds2017.fecha: ~0 rows (aproximadamente)
DELETE FROM `fecha`;
/*!40000 ALTER TABLE `fecha` DISABLE KEYS */;
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
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla tpdds2017.historial_contrasenias: ~1 rows (aproximadamente)
DELETE FROM `historial_contrasenias`;
/*!40000 ALTER TABLE `historial_contrasenias` DISABLE KEYS */;
INSERT INTO `historial_contrasenias` (`id_cambio`, `fecha_cambio`, `contrasenia_nueva`, `id_usuario`, `id_politica`) VALUES
	(1, '2017-12-06', '', 4, 1);
/*!40000 ALTER TABLE `historial_contrasenias` ENABLE KEYS */;

-- Volcando estructura para tabla tpdds2017.informatica
DROP TABLE IF EXISTS `informatica`;
CREATE TABLE IF NOT EXISTS `informatica` (
  `canion` varchar(2) DEFAULT NULL,
  `cantidad_pcs` int(11) DEFAULT NULL,
  `id_aula` int(11) NOT NULL,
  PRIMARY KEY (`id_aula`),
  KEY `id_aula` (`id_aula`),
  CONSTRAINT `FK_INFORMATICA_AULA` FOREIGN KEY (`id_aula`) REFERENCES `aula` (`id_aula`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla tpdds2017.informatica: ~0 rows (aproximadamente)
DELETE FROM `informatica`;
/*!40000 ALTER TABLE `informatica` DISABLE KEYS */;
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

-- Volcando datos para la tabla tpdds2017.multimedios: ~0 rows (aproximadamente)
DELETE FROM `multimedios`;
/*!40000 ALTER TABLE `multimedios` DISABLE KEYS */;
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

-- Volcando datos para la tabla tpdds2017.periodica: ~0 rows (aproximadamente)
DELETE FROM `periodica`;
/*!40000 ALTER TABLE `periodica` DISABLE KEYS */;
/*!40000 ALTER TABLE `periodica` ENABLE KEYS */;

-- Volcando estructura para tabla tpdds2017.periodo
DROP TABLE IF EXISTS `periodo`;
CREATE TABLE IF NOT EXISTS `periodo` (
  `id_periodo` int(11) NOT NULL AUTO_INCREMENT,
  `tipo_periodo` varchar(13) DEFAULT NULL,
  `fecha_inicio` date DEFAULT NULL,
  `fecha_fin` date DEFAULT NULL,
  PRIMARY KEY (`id_periodo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla tpdds2017.periodo: ~0 rows (aproximadamente)
DELETE FROM `periodo`;
/*!40000 ALTER TABLE `periodo` DISABLE KEYS */;
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
	(1, '7-15-10-20');
/*!40000 ALTER TABLE `politica_contrasenias` ENABLE KEYS */;

-- Volcando estructura para tabla tpdds2017.reserva
DROP TABLE IF EXISTS `reserva`;
CREATE TABLE IF NOT EXISTS `reserva` (
  `id_reserva` int(11) NOT NULL AUTO_INCREMENT,
  `cantidad_alumnos` int(11) DEFAULT NULL,
  `id_bedel` int(11) NOT NULL,
  `id_catedra` int(11) NOT NULL,
  `id_docente` int(11) NOT NULL,
  PRIMARY KEY (`id_reserva`),
  KEY `id_bedel` (`id_bedel`),
  KEY `id_catedra` (`id_catedra`),
  KEY `id_docente` (`id_docente`),
  CONSTRAINT `FK_ASOCIA_CATEDRA` FOREIGN KEY (`id_catedra`) REFERENCES `catedra` (`id_catedra`),
  CONSTRAINT `FK_REGISTRA_BEDEL` FOREIGN KEY (`id_bedel`) REFERENCES `bedel` (`id_bedel`),
  CONSTRAINT `FK_SOLICITA_RESERVA` FOREIGN KEY (`id_docente`) REFERENCES `docente` (`id_docente`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla tpdds2017.reserva: ~0 rows (aproximadamente)
DELETE FROM `reserva`;
/*!40000 ALTER TABLE `reserva` DISABLE KEYS */;
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
/*!40000 ALTER TABLE `sin_recursos` ENABLE KEYS */;

-- Volcando estructura para tabla tpdds2017.turno
DROP TABLE IF EXISTS `turno`;
CREATE TABLE IF NOT EXISTS `turno` (
  `id_turno` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_turno` varchar(6) NOT NULL,
  PRIMARY KEY (`id_turno`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla tpdds2017.turno: ~2 rows (aproximadamente)
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
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla tpdds2017.usuario: ~2 rows (aproximadamente)
DELETE FROM `usuario`;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` (`id_usuario`, `nombre_usuario`, `contrasenia`) VALUES
	(1, 'matute2208', 'elloco2208'),
	(4, 'mariano033', ''),
	(5, 'metelasacala', '0123456789');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
