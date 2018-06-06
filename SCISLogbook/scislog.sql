-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: scislog
-- ------------------------------------------------------
-- Server version	5.7.19

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
-- Table structure for table `accounts`
--

DROP TABLE IF EXISTS `accounts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `accounts` (
  `account_id` int(11) NOT NULL AUTO_INCREMENT,
  `idnumber` int(7) NOT NULL,
  `code` varchar(5) NOT NULL,
  `adviser` varchar(30) NOT NULL,
  `status` varchar(20) DEFAULT 'active',
  `subjid` int(11) NOT NULL,
  PRIMARY KEY (`account_id`),
  UNIQUE KEY `account_id_UNIQUE` (`account_id`),
  KEY `idnumber_idx` (`idnumber`),
  KEY `subjid_idx` (`subjid`),
  CONSTRAINT `idnumber` FOREIGN KEY (`idnumber`) REFERENCES `students` (`idnumber`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `subjid` FOREIGN KEY (`subjid`) REFERENCES `subject` (`subjid`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `accounts`
--

LOCK TABLES `accounts` WRITE;
/*!40000 ALTER TABLE `accounts` DISABLE KEYS */;
INSERT INTO `accounts` VALUES (24,2123456,'9456','Cecilia Mercado','active',4);
/*!40000 ALTER TABLE `accounts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `admin` (
  `admin_id` int(11) NOT NULL AUTO_INCREMENT,
  `admin_fname` varchar(20) NOT NULL,
  `admin_lname` varchar(20) NOT NULL,
  `admin_uname` varchar(15) NOT NULL,
  `admin_password` varchar(45) NOT NULL,
  PRIMARY KEY (`admin_id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES (1,'Benz','Servidad','ray','rayray');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `faculty`
--

DROP TABLE IF EXISTS `faculty`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `faculty` (
  `fac_id` int(11) NOT NULL AUTO_INCREMENT,
  `fac_fname` varchar(30) NOT NULL,
  `fac_lname` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`fac_id`)
) ENGINE=MyISAM AUTO_INCREMENT=19 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `faculty`
--

LOCK TABLES `faculty` WRITE;
/*!40000 ALTER TABLE `faculty` DISABLE KEYS */;
INSERT INTO `faculty` VALUES (1,'Ma. Concepcion','Clemente'),(2,'Cecilia','Mercado'),(3,'Jonathan','Ramirez'),(4,'Ria Andrea','Nana'),(5,'Gerry Paul','Genove'),(6,'Randy','Domantay'),(7,'Bench','Bacani'),(8,'Carlos Ben','Montes'),(9,'Landley','Bernardo'),(16,'Francis','Magalona'),(17,'dgdfasdf','asdfsdfsdf'),(18,'asdasdasdsd','ewqeqwewqe');
/*!40000 ALTER TABLE `faculty` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `logs`
--

DROP TABLE IF EXISTS `logs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `logs` (
  `log_id` int(11) NOT NULL AUTO_INCREMENT,
  `account_id` int(11) NOT NULL,
  `office` varchar(45) NOT NULL,
  `date` varchar(45) NOT NULL,
  `time_in` time NOT NULL,
  `time_out` time DEFAULT NULL,
  `hours_rendered` time DEFAULT NULL,
  `term` varchar(45) NOT NULL,
  PRIMARY KEY (`log_id`),
  KEY `account_id_idx` (`account_id`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `logs`
--

LOCK TABLES `logs` WRITE;
/*!40000 ALTER TABLE `logs` DISABLE KEYS */;
INSERT INTO `logs` VALUES (19,15,'Open Laboratory (D424)','May 30, 2018','10:50:00',NULL,NULL,'Short Term'),(20,16,'Open Laboratory (D424)','May 30, 2018','10:52:02',NULL,NULL,'First Sem'),(21,17,'Open Laboratory (D424)','May 30, 2018','10:56:54',NULL,NULL,'Second Sem'),(22,18,'Open Laboratory (D424)','May 30, 2018','11:00:12',NULL,NULL,'Second Sem'),(23,19,'Open Laboratory (D424)','May 30, 2018','11:22:40','11:13:08','-00:09:32','Short Term'),(24,20,'Open Laboratory (D424)','May 30, 2018','11:30:30','11:31:49','00:01:19','Short Term'),(25,21,'Open Laboratory (D424)','May 31, 2018','10:52:33','10:52:59','00:00:26','First Sem'),(26,23,'Open Laboratory (D424)','May 31, 2018','14:14:35','14:14:42','00:00:07','Short Term'),(27,19,'Open Laboratory (D424)','May 31, 2018','20:25:38',NULL,NULL,'Second Sem'),(28,19,'Open Laboratory (D424)','May 31, 2018','20:26:24',NULL,NULL,'Second Sem'),(29,19,'Open Laboratory (D424)','May 31, 2018','20:48:41',NULL,NULL,'First Sem'),(30,24,'Open Laboratory (D424)','June 04, 2018','14:23:04','14:23:15','00:00:11','Short Term');
/*!40000 ALTER TABLE `logs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `students`
--

DROP TABLE IF EXISTS `students`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `students` (
  `idnumber` int(7) NOT NULL,
  `fname` varchar(20) NOT NULL,
  `lname` varchar(15) NOT NULL,
  `course_year` varchar(10) NOT NULL,
  `password` varchar(45) CHARACTER SET latin1 COLLATE latin1_general_cs NOT NULL,
  `recovery_pass` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idnumber`),
  UNIQUE KEY `idnumber_UNIQUE` (`idnumber`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `students`
--

LOCK TABLES `students` WRITE;
/*!40000 ALTER TABLE `students` DISABLE KEYS */;
INSERT INTO `students` VALUES (2123456,'Juan','Dela Cruz','BSIT-3','•‰…k6‘ëâŸ±›Lò9Œ}',NULL),(2161745,'Genesis','Soriano','BSIT-3','•‰…k6‘ëâŸ±›Lò9Œ}',NULL),(2162322,'Ashley Chester','Pua Phee','BSIT-3','•‰…k6‘ëâŸ±›Lò9Œ}',NULL),(2165522,'Earl Jethro Aaron','Rimando','BSIT-3','q|dšXZu1>EÛrçMI',NULL),(2165775,'Bill Lenard','Hilarion','BSIT-3','ð±âÿ+üN Œ˜E5',NULL),(2166167,'Janxiene Azly','Maniti','BSIT-3','•‰…k6‘ëâŸ±›Lò9Œ}',NULL),(2167978,'Genrie','Gayaso','BSIT-3','xõŸ³ªÇ dZf¯´2DÑ',NULL),(2789456,'Try LAng','Ulit Ulit','BSIT-3','•‰…k6‘ëâŸ±›Lò9Œ}',NULL);
/*!40000 ALTER TABLE `students` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subject`
--

DROP TABLE IF EXISTS `subject`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `subject` (
  `subjid` int(11) NOT NULL AUTO_INCREMENT,
  `subj_title` varchar(45) NOT NULL,
  PRIMARY KEY (`subjid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subject`
--

LOCK TABLES `subject` WRITE;
/*!40000 ALTER TABLE `subject` DISABLE KEYS */;
INSERT INTO `subject` VALUES (1,'IT Project 1'),(2,'Practicum 1'),(3,'Practicum 2'),(4,'IT Project 2');
/*!40000 ALTER TABLE `subject` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-06-06 11:09:21
