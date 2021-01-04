-- MySQL dump 10.13  Distrib 8.0.22, for Linux (x86_64)
--
-- Host: localhost    Database: omgdatabase
-- ------------------------------------------------------
-- Server version	8.0.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cart`
--

DROP TABLE IF EXISTS `cart`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cart` (
  `id` int NOT NULL AUTO_INCREMENT,
  `isactive` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cart`
--

LOCK TABLES `cart` WRITE;
/*!40000 ALTER TABLE `cart` DISABLE KEYS */;
INSERT INTO `cart` VALUES (11,11),(12,12),(13,11),(14,11),(15,11);
/*!40000 ALTER TABLE `cart` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cart_item_map`
--

DROP TABLE IF EXISTS `cart_item_map`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cart_item_map` (
  `cartid` int NOT NULL,
  `itemid` int NOT NULL,
  `size` varchar(10) NOT NULL,
  `quantity` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cart_item_map`
--

LOCK TABLES `cart_item_map` WRITE;
/*!40000 ALTER TABLE `cart_item_map` DISABLE KEYS */;
INSERT INTO `cart_item_map` VALUES (11,121,'XL',3),(14,1,'XS',54),(14,2,'XS',10),(14,2,'XSS',20),(15,2,'XSS',10),(11,2,'XSS',10);
/*!40000 ALTER TABLE `cart_item_map` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cart_user_map`
--

DROP TABLE IF EXISTS `cart_user_map`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cart_user_map` (
  `cartid` int NOT NULL,
  `userid` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cart_user_map`
--

LOCK TABLES `cart_user_map` WRITE;
/*!40000 ALTER TABLE `cart_user_map` DISABLE KEYS */;
INSERT INTO `cart_user_map` VALUES (11,12),(13,11),(14,15),(15,19);
/*!40000 ALTER TABLE `cart_user_map` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cloth`
--

DROP TABLE IF EXISTS `cloth`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cloth` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `price` float DEFAULT NULL,
  `typeid` int DEFAULT NULL,
  `imgpath` varchar(255) DEFAULT NULL,
  `size` varchar(100) DEFAULT NULL,
  `quantity` int DEFAULT NULL,
  PRIMARY KEY (`id`,`name`),
  KEY `item_type_type_id` (`typeid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cloth`
--

LOCK TABLES `cloth` WRITE;
/*!40000 ALTER TABLE `cloth` DISABLE KEYS */;
INSERT INTO `cloth` VALUES (4,'ABC',45.22,1,'C:\\OMG_repo\\OMG\\src\\main\\resources\\images\\ABC.jpg','32',10),(5,'Green Shirt',45.22,1,'C:\\OMG_repo\\OMG\\src\\main\\resources\\images\\Green Shirt.jpg','32',10),(6,'blue jeans',34.22,4,'C:\\OMG_repo\\OMG\\src\\main\\resources\\images\\blue jeans.jpg','34',10);
/*!40000 ALTER TABLE `cloth` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `item`
--

DROP TABLE IF EXISTS `item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `item` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `typeid` int DEFAULT NULL,
  `imgpath` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`,`name`),
  KEY `item_type_type_id` (`typeid`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item`
--

LOCK TABLES `item` WRITE;
/*!40000 ALTER TABLE `item` DISABLE KEYS */;
INSERT INTO `item` VALUES (4,'ABC',1,'C:\\OMG_repo\\OMG\\src\\main\\resources\\images\\ABC.jpg'),(5,'Green Shirt',1,'C:\\OMG_repo\\OMG\\src\\main\\resources\\images\\Green Shirt.jpg'),(6,'blue jeans',4,'C:\\OMG_repo\\OMG\\src\\main\\resources\\images\\blue jeans.jpg'),(7,'joker',3,'C:\\OMG_repo\\OMG\\src\\main\\resources\\images\\joker.jpg'),(8,'killer',4,'lslsjs'),(9,'spiderMan',3,'C:\\OMG_repo\\OMG\\src\\main\\resources\\images\\spiderMan.jpg'),(10,'thor',3,'C:\\OMG_repo\\OMG\\src\\main\\resources\\images\\thor.jpg');
/*!40000 ALTER TABLE `item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `item_size_quantity_price_map`
--

DROP TABLE IF EXISTS `item_size_quantity_price_map`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `item_size_quantity_price_map` (
  `itemid` int DEFAULT NULL,
  `size` varchar(10) DEFAULT NULL,
  `quantity` int DEFAULT NULL,
  `price` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item_size_quantity_price_map`
--

LOCK TABLES `item_size_quantity_price_map` WRITE;
/*!40000 ALTER TABLE `item_size_quantity_price_map` DISABLE KEYS */;
INSERT INTO `item_size_quantity_price_map` VALUES (0,'23',10,32.5),(9,'24',5,76.5),(10,'24',5,76.5),(10,'25',4,53.4),(10,'26',5,33.5),(30,'XL',10,34.5),(30,'XL',10,34),(10,'XL',10,20),(10,'XS',7,130.3),(1,'XS',17,230.3);
/*!40000 ALTER TABLE `item_size_quantity_price_map` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `itemtype`
--

DROP TABLE IF EXISTS `itemtype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `itemtype` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`,`name`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `itemtype`
--

LOCK TABLES `itemtype` WRITE;
/*!40000 ALTER TABLE `itemtype` DISABLE KEYS */;
INSERT INTO `itemtype` VALUES (1,'SHIRT'),(2,'PANT'),(3,'JACKET'),(4,'JEANS'),(5,'skirts');
/*!40000 ALTER TABLE `itemtype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `userid` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `mobilenumber` varchar(20) DEFAULT NULL,
  `emailId` varchar(255) DEFAULT NULL,
  `userrole` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'testUser','9783678263','abc@gmail.com','CUSTOMER');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-01-04 22:57:54
