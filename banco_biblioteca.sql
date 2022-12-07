-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Tempo de geração: 01-Nov-2022 às 19:18
-- Versão do servidor: 8.0.27
-- versão do PHP: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `banco_biblioteca`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `emprestimo`
--

DROP TABLE IF EXISTS `emprestimo`;
CREATE TABLE IF NOT EXISTS `emprestimo` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome_cliente` varchar(200) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `cpf` varchar(11) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `telefone` varchar(12) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `rua` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `nCasa` varchar(10) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `bairro` varchar(50) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `nome_livro` varchar(200) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `data_emprestimo` varchar(15) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `data_devolucao` varchar(15) COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `cpf` (`cpf`)
) ENGINE=MyISAM AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `emprestimo`
--

INSERT INTO `emprestimo` (`id`, `nome_cliente`, `cpf`, `telefone`, `rua`, `nCasa`, `bairro`, `nome_livro`, `data_emprestimo`, `data_devolucao`) VALUES
(12, 'Marcos Silva', '47856932104', '75944663322', 'Rua 23', '78', 'Bairro 90', 'O Que Aconteceu Com Annie', '16/09/2022', '20/09/2022');

-- --------------------------------------------------------

--
-- Estrutura da tabela `livros`
--

DROP TABLE IF EXISTS `livros`;
CREATE TABLE IF NOT EXISTS `livros` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome_livro` varchar(200) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `editora` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `autor` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `categoria` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `valor_livro` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `ano_lancamento` varchar(4) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `cod_livro` varchar(10) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `status_livro` varchar(20) COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'Disponivel',
  PRIMARY KEY (`id`),
  UNIQUE KEY `nome_livro` (`nome_livro`)
) ENGINE=MyISAM AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `livros`
--

INSERT INTO `livros` (`id`, `nome_livro`, `editora`, `autor`, `categoria`, `valor_livro`, `ano_lancamento`, `cod_livro`, `status_livro`) VALUES
(10, 'Manual De Assassinato Para Boas Garotas - Vol. 1', 'Intrínseca', 'Holly Jackson', 'Policial e Mistério', '35', '2022', '65556049', 'Disponivel'),
(11, 'Os sete maridos de Evelyn Hugo', 'Paralela', ' Taylor Jenkins', 'Ficção Feminina', '31', '2019', '85843915', 'Disponivel'),
(12, 'O Menino que Desenhava Monstros ', 'DarkSide', 'Keith Donohue', 'Ficção', '54', '2016', '85945400', 'Disponivel'),
(13, 'O Homem de Giz', 'Intrínseca', ' C. J. Tudor', 'Suspenses de Espionagem e Política', '39', '2018', '8551002937', 'Disponivel'),
(14, 'O Que Aconteceu Com Annie', 'Intrínseca', 'C. J. Tudor ', ' Suspenses Sobrenaturais', '44', '2019', '85510047', 'Emprestado'),
(15, 'As Outras Pessoas', ' Intrínseca', 'C. J. TUDOR', 'Suspenses Sobrenaturais', '38', '2020', '85510045', 'Disponivel'),
(16, 'Corte de espinhos e rosas (Vol. 1) ', 'Galera', 'Sarah J. Maas', 'Literatura e Ficção', '39', '2015', '85011798', 'Disponivel'),
(17, 'Corte de névoa e fúria (Vol. 2)', 'Galera', 'Sarah J. Mass', 'Fantasia Romance ', '47', '2016', '85010766', 'Disponivel'),
(18, 'Corte de asas e ruína (Vol. 3)', 'Galera ', 'Sarah J. Mass', 'Fantasia, Romance', '47', '2017', '85011101', 'Disponivel'),
(19, 'Corte de chamas prateadas (Vol. 4)', 'Galera', 'Sarah J. Maas', 'Fantasia, Romance', '52', '2021', '65598103', 'Disponivel');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
