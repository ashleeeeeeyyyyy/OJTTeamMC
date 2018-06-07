CREATE DATABASE  IF NOT EXISTS `scislog` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `scislog`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: scislog
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
  `term` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`account_id`),
  UNIQUE KEY `account_id_UNIQUE` (`account_id`),
  KEY `idnumber_idx` (`idnumber`),
  KEY `subjid_idx` (`subjid`),
  CONSTRAINT `idnumber` FOREIGN KEY (`idnumber`) REFERENCES `students` (`idnumber`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `subjid` FOREIGN KEY (`subjid`) REFERENCES `subject` (`subjid`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `accounts`
--

LOCK TABLES `accounts` WRITE;
/*!40000 ALTER TABLE `accounts` DISABLE KEYS */;
INSERT INTO `accounts` VALUES (26,2123456,'9874','Cecilia Mercado','active',1,'Short Term, A.Y. 2017-2018'),(27,2123457,'9865','Ria Andrea Nana','active',2,'Short Term, A.Y. 2017-2018'),(28,2123458,'9854','Ria Andrea Nana','active',3,'Short Term, A.Y. 2017-2018'),(29,2165522,'9123','Ria Andrea Nana','active',2,'Short Term, A.Y. 2017-2018'),(30,2112222,'9875','Jonathan Ramirez','active',2,'Second Semester, A.Y. 2018-2019');
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
  `admin_password` varchar(45) CHARACTER SET latin1 COLLATE latin1_general_cs NOT NULL,
  PRIMARY KEY (`admin_id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES (1,'Tony','Stark','ironman','•‰…k6‘ëâŸ±›Lò9Œ}');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `current_term`
--

DROP TABLE IF EXISTS `current_term`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `current_term` (
  `term_id` int(11) NOT NULL,
  `semester` varchar(45) NOT NULL,
  `academic_year` varchar(45) NOT NULL,
  PRIMARY KEY (`term_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `current_term`
--

LOCK TABLES `current_term` WRITE;
/*!40000 ALTER TABLE `current_term` DISABLE KEYS */;
INSERT INTO `current_term` VALUES (1,'First Semester','2018-2019');
/*!40000 ALTER TABLE `current_term` ENABLE KEYS */;
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
) ENGINE=MyISAM AUTO_INCREMENT=20 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `faculty`
--

LOCK TABLES `faculty` WRITE;
/*!40000 ALTER TABLE `faculty` DISABLE KEYS */;
INSERT INTO `faculty` VALUES (1,'Ma. Concepcion','Clemente'),(2,'Cecilia','Mercado'),(3,'Jonathan','Ramirez'),(4,'Ria Andrea','Nana'),(5,'Gerry Paul','Genove'),(6,'Randy','Domantay'),(7,'Bench','Bacani'),(8,'Carlos Ben','Montes'),(9,'Landley','Bernardo'),(16,'Francis','Magalona');
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
  PRIMARY KEY (`log_id`),
  KEY `account_id_idx` (`account_id`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `logs`
--

LOCK TABLES `logs` WRITE;
/*!40000 ALTER TABLE `logs` DISABLE KEYS */;
INSERT INTO `logs` VALUES (19,15,'Open Laboratory (D424)','May 30, 2018','10:50:00',NULL,NULL),(20,16,'Open Laboratory (D424)','May 30, 2018','10:52:02',NULL,NULL),(21,17,'Open Laboratory (D424)','May 30, 2018','10:56:54',NULL,NULL),(22,18,'Open Laboratory (D424)','May 30, 2018','11:00:12',NULL,NULL),(23,19,'Open Laboratory (D424)','May 30, 2018','11:22:40','11:13:08','-00:09:32'),(24,20,'Open Laboratory (D424)','May 30, 2018','11:30:30','11:31:49','00:01:19'),(25,21,'Open Laboratory (D424)','May 31, 2018','10:52:33','10:52:59','00:00:26'),(26,23,'Open Laboratory (D424)','May 31, 2018','14:14:35','14:14:42','00:00:07'),(27,19,'Open Laboratory (D424)','May 31, 2018','20:25:38',NULL,NULL),(28,19,'Open Laboratory (D424)','May 31, 2018','20:26:24',NULL,NULL),(29,19,'Open Laboratory (D424)','May 31, 2018','20:48:41',NULL,NULL),(30,24,'Open Laboratory (D424)','June 04, 2018','14:23:04','14:23:15','00:00:11'),(31,25,'Open Laboratory (D424)','June 05, 2018','13:44:58','13:45:07','00:00:09'),(32,29,'Open Laboratory (D424)','June 06, 2018','14:56:47','14:56:54','00:00:07'),(33,29,'Open Laboratory (D424)','June 06, 2018','14:57:04','14:57:10','00:00:06'),(34,30,'Open Laboratory (D424)','June 07, 2018','17:07:39','17:07:55','00:00:16');
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
  `fname` varchar(45) NOT NULL,
  `lname` varchar(45) NOT NULL,
  `course_year` varchar(10) NOT NULL,
  `password` varchar(45) CHARACTER SET latin1 COLLATE latin1_general_cs NOT NULL,
  `recovery_pass` varchar(45) CHARACTER SET latin1 COLLATE latin1_general_cs DEFAULT NULL,
  PRIMARY KEY (`idnumber`),
  UNIQUE KEY `idnumber_UNIQUE` (`idnumber`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `students`
--

LOCK TABLES `students` WRITE;
/*!40000 ALTER TABLE `students` DISABLE KEYS */;
INSERT INTO `students` VALUES (2112222,'dNHó_£Ê–u“`ò±','Rë½Hð9üºô¢Q=—‚ð','BSIT-3',' §Ú˜|¨Åõ£PþV\r€Œ','WQùíƒl!Ë?w$P±Ã'),(2112233,'’ç1 ìÐjNM Õ  q','ðzŠ9\rñÔw…jØ?\0','BSIT-3','•‰…k6‘ëâŸ±›Lò9Œ}',':ÂK·Ðy¶Àµ%H~A'),(2123456,'Juan','Luna','BSIT-3','•‰…k6‘ëâŸ±›Lò9Œ}','ž\0ÍÅWÝ0Mbm±­‹Ï\''),(2123457,'Apolinario','Mabini','BSCS-3','•‰…k6‘ëâŸ±›Lò9Œ}','£dk)tN‡Ýþ¢©'),(2123458,'Jose','Rizal','BSMATH-4','•‰…k6‘ëâŸ±›Lò9Œ}','ÙšÈö!Þã$Î‚Ûk“ Ñ'),(2165522,'Earl Jethro Aaron','Rimando','BSIT-3','q|dšXZu1>EÛrçMI','f›£yÍ•<¨nµ+\\@3Ö');
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
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subject`
--

LOCK TABLES `subject` WRITE;
/*!40000 ALTER TABLE `subject` DISABLE KEYS */;
INSERT INTO `subject` VALUES (1,'IT Project 1'),(2,'Practicum 1'),(3,'Practicum 2'),(4,'IT Project 2');
/*!40000 ALTER TABLE `subject` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'scislog'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-06-07 23:58:06
