-- --------------------------------------------------------
-- SETUP DASAR
-- --------------------------------------------------------

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";

CREATE DATABASE IF NOT EXISTS dbimpal;
USE dbimpal;

-- --------------------------------------------------------
-- TABLE: user
-- --------------------------------------------------------

CREATE TABLE user (
  id INT(11) NOT NULL AUTO_INCREMENT,
  username VARCHAR(50) NOT NULL,
  password VARCHAR(255) NOT NULL,
  email VARCHAR(100) NOT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY email (email)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------
-- TABLE: pesan
-- --------------------------------------------------------

CREATE TABLE pesan (
  idPesan INT(11) NOT NULL AUTO_INCREMENT,
  idPenerima INT(11) NOT NULL,
  idPengirim INT(11) NOT NULL,
  judul VARCHAR(30) NOT NULL,
  TextPesan TEXT NOT NULL,
  date DATE NOT NULL,
  PRIMARY KEY (idPesan),
  KEY fk_pesan_penerima (idPenerima),
  KEY fk_pesan_pengirim (idPengirim),
  CONSTRAINT fk_pesan_penerima FOREIGN KEY (idPenerima)
      REFERENCES user (id) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT fk_pesan_pengirim FOREIGN KEY (idPengirim)
      REFERENCES user (id) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

COMMIT;
