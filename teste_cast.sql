-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           5.7.28-log - MySQL Community Server (GPL)
-- OS do Servidor:               Win64
-- HeidiSQL Versão:              11.0.0.5919
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Copiando estrutura do banco de dados para teste_cast
CREATE DATABASE IF NOT EXISTS `teste_cast` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `teste_cast`;

-- Copiando estrutura para tabela teste_cast.categoria
CREATE TABLE IF NOT EXISTS `categoria` (
  `codigo` bigint(20) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(255) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela teste_cast.categoria: ~4 rows (aproximadamente)
/*!40000 ALTER TABLE `categoria` DISABLE KEYS */;
INSERT INTO `categoria` (`codigo`, `descricao`) VALUES
	(1, 'Comportamental'),
	(2, 'Programação'),
	(3, 'Qualidade'),
	(4, 'Processos');
/*!40000 ALTER TABLE `categoria` ENABLE KEYS */;

-- Copiando estrutura para tabela teste_cast.curso
CREATE TABLE IF NOT EXISTS `curso` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `categoria` varchar(255) NOT NULL,
  `data_fim` datetime NOT NULL,
  `data_inicio` datetime NOT NULL,
  `descricao_treinamento` varchar(255) NOT NULL,
  `quantidade_alunos` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela teste_cast.curso: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `curso` DISABLE KEYS */;
INSERT INTO `curso` (`id`, `categoria`, `data_fim`, `data_inicio`, `descricao_treinamento`, `quantidade_alunos`) VALUES
	(1, 'Programação', '2021-04-23 18:37:58', '2021-04-20 18:38:20', 'Curso de Java', 10),
	(2, 'Qualidade', '2021-05-05 00:00:00', '2021-05-03 00:00:00', 'teste', 5);
/*!40000 ALTER TABLE `curso` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
