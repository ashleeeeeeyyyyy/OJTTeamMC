CREATE DATABASE  IF NOT EXISTS `logbook` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `logbook`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: logbook
-- ------------------------------------------------------
-- Server version	5.7.14

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `faculty`
--

DROP TABLE IF EXISTS `faculty`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `faculty` (
  `facultynumber` int(11) NOT NULL,
  `facultyname` varchar(45) NOT NULL,
  `facultypassword` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`facultynumber`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `faculty`
--

LOCK TABLES `faculty` WRITE;
/*!40000 ALTER TABLE `faculty` DISABLE KEYS */;
INSERT INTO `faculty` VALUES (123,'Ben Simmons','sixers');
/*!40000 ALTER TABLE `faculty` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `log`
--

DROP TABLE IF EXISTS `log`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `log` (
  `logid` int(11) NOT NULL AUTO_INCREMENT,
  `date` date NOT NULL,
  `time_in` timestamp NULL DEFAULT NULL,
  `time_out` timestamp NULL DEFAULT NULL,
  `idnumber` int(11) NOT NULL,
  PRIMARY KEY (`logid`),
  KEY `idnumber_idx` (`logid`),
  KEY `idnumber_idx1` (`idnumber`),
  CONSTRAINT `idnumber` FOREIGN KEY (`idnumber`) REFERENCES `student` (`idnumber`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `log`
--

LOCK TABLES `log` WRITE;
/*!40000 ALTER TABLE `log` DISABLE KEYS */;
INSERT INTO `log` VALUES (3,'2018-02-10','2018-02-09 17:32:43','2018-02-09 17:34:22',2167856),(4,'2018-02-10','2018-02-09 17:33:21','2018-02-09 17:52:24',2166538),(5,'2018-02-10','2018-02-09 17:33:37','2018-02-09 17:52:42',2166348),(6,'2018-02-10','2018-02-09 17:38:56','2018-02-22 01:37:13',2167856),(7,'2018-02-10','2018-02-09 17:53:21',NULL,2166538),(8,'2018-03-03','2018-03-02 17:27:01','2018-03-02 17:27:22',2167856),(9,'2018-03-03','2018-03-02 17:28:47','2018-03-02 17:33:14',2167856),(10,'2018-03-03','2018-03-02 17:33:24','2018-03-02 17:36:00',2167856),(11,'2018-03-03','2018-03-02 17:36:08','2018-03-02 17:43:15',2167856),(12,'2018-03-03','2018-03-02 17:43:23','2018-03-02 17:55:11',2167856),(13,'2018-03-03','2018-03-02 17:55:21','2018-03-06 17:29:46',2167856),(14,'2018-03-07','2018-03-06 17:29:57','2018-03-08 01:17:46',2167856),(15,'2018-03-08','2018-03-08 01:37:08',NULL,2167856);
/*!40000 ALTER TABLE `log` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student` (
  `idnumber` int(11) NOT NULL,
  `studentname` varchar(45) NOT NULL,
  `password` varchar(45) DEFAULT NULL,
  `facultynumber` int(11) DEFAULT NULL,
  PRIMARY KEY (`idnumber`),
  KEY `facultynumber_idx` (`facultynumber`),
  CONSTRAINT `facultynumber` FOREIGN KEY (`facultynumber`) REFERENCES `faculty` (`facultynumber`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (2166348,'Benz Servidad','123',NULL),(2166538,'Earl Rimando','123',NULL),(2167856,'Ashley Pua Phee','123',NULL);
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-03-08 11:12:10
