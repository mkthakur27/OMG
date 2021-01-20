-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: localhost    Database: omgdatabase
-- ------------------------------------------------------
-- Server version	8.0.21

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `brand`
--

DROP TABLE IF EXISTS `brand`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `brand` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(250) DEFAULT NULL,
  `imgpath` varchar(500) DEFAULT NULL,
  `logoimgpath` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `brand`
--

LOCK TABLES `brand` WRITE;
/*!40000 ALTER TABLE `brand` DISABLE KEYS */;
INSERT INTO `brand` VALUES (1,'levis','.\\images\\levis.jpg','.\\images\\levisLogo.jpg'),(2,'arrow','.\\images\\arrow.jpg','.\\images\\arrowLogo.jpg'),(3,'calvinKlein','.\\images\\calvinKlein.jpg','.\\images\\calvinKleinLogo.jpg'),(4,'gas','.\\images\\gas.jpg','.\\images\\gasLogo.jpg'),(5,'h&m','.\\images\\h&m.jpg','.\\images\\h&mLogo.jpg'),(6,'indigoNation','.\\images\\indigoNation.jpg','.\\images\\indigoNationLogo.jpg'),(7,'jack&Jones','.\\images\\jack&Jones.jpg','.\\images\\jack&JonesLogo.jpg'),(8,'lee','.\\images\\lee.jpg','.\\images\\leeLogo.jpg'),(9,'nike','.\\images\\nike.jpg','.\\images\\nikeLogo.jpg'),(10,'pepe','.\\images\\pepe.jpg','.\\images\\pepeLogo.jpg'),(11,'reebok','.\\images\\reebok.jpg','.\\images\\reebokLogo.jpg'),(12,'veroModa','.\\images\\veroModa.jpg','.\\images\\veroModaLogo.jpg'),(13,'wrangle','.\\images\\wrangle.jpg','.\\images\\wrangleLogo.jpg'),(14,'zara','.\\images\\zara.jpg','.\\images\\zaraLogo.jpg'),(16,'abc','.\\images\\abc.jpg','.\\images\\abcLogo.jpg'),(17,'chutia','.\\images\\chutia.jpg','.\\images\\chutiaLogo.jpg');
/*!40000 ALTER TABLE `brand` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-01-20 20:49:14
