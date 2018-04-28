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
-- Table structure for table `log_itproject`
--

DROP TABLE IF EXISTS `log_itproject`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `log_itproject` (
  `logid` int(11) NOT NULL AUTO_INCREMENT,
  `idnum` int(11) DEFAULT NULL,
  `date` varchar(45) DEFAULT NULL,
  `time_in` varchar(45) DEFAULT NULL,
  `time_out` varchar(45) DEFAULT NULL,
  `office` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`logid`),
  KEY `idnumber_idx` (`idnum`),
  KEY `idnumber_idx2` (`idnum`),
  KEY `idnumber_id` (`idnum`) USING BTREE,
  CONSTRAINT `idnum` FOREIGN KEY (`idnum`) REFERENCES `student_itproject` (`idnum`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `log_itproject`
--

LOCK TABLES `log_itproject` WRITE;
/*!40000 ALTER TABLE `log_itproject` DISABLE KEYS */;
INSERT INTO `log_itproject` VALUES (1,2165522,'April 28, 2018','09:51 PM','09:51 PM','Knowledge Center 1');
/*!40000 ALTER TABLE `log_itproject` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `log_practicum`
--

DROP TABLE IF EXISTS `log_practicum`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `log_practicum` (
  `logid` int(11) NOT NULL AUTO_INCREMENT,
  `idnumber` int(11) DEFAULT NULL,
  `date` varchar(45) DEFAULT NULL,
  `time_in` varchar(45) DEFAULT NULL,
  `time_out` varchar(45) DEFAULT NULL,
  `office` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`logid`),
  KEY `idnumber_idx` (`idnumber`),
  CONSTRAINT `idnumber` FOREIGN KEY (`idnumber`) REFERENCES `student_practicum` (`idnumber`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=45 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `log_practicum`
--

LOCK TABLES `log_practicum` WRITE;
/*!40000 ALTER TABLE `log_practicum` DISABLE KEYS */;
INSERT INTO `log_practicum` VALUES (38,2165522,'April 28, 2018','08:07 PM','2018.04.28 8:8:48','Knowledge Center 1'),(39,2165522,'April 28, 2018','08:09 PM','08:09 PM','Knowledge Center 1'),(40,2165522,'April 28, 2018','08:48 PM','08:48 PM','Knowledge Center 1'),(41,2165522,'April 28, 2018','08:56 PM','08:56 PM','Knowledge Center 1'),(42,2165522,'April 28, 2018','09:04 PM','09:04 PM','Knowledge Center 1'),(43,2165522,'April 28, 2018','09:26 PM','09:26 PM','Knowledge Center 1'),(44,2165522,'April 28, 2018','09:50 PM','09:50 PM','Knowledge Center 1');
/*!40000 ALTER TABLE `log_practicum` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student_itproject`
--

DROP TABLE IF EXISTS `student_itproject`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student_itproject` (
  `idnum` int(11) NOT NULL,
  `fname` varchar(45) NOT NULL,
  `lname` varchar(45) NOT NULL,
  `course_year` varchar(45) NOT NULL,
  `subject` varchar(45) NOT NULL,
  `code` varchar(45) NOT NULL,
  `adviser` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`idnum`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student_itproject`
--

LOCK TABLES `student_itproject` WRITE;
/*!40000 ALTER TABLE `student_itproject` DISABLE KEYS */;
INSERT INTO `student_itproject` VALUES (2165522,'Earl Jethro','Rimando','IT Project','BSIT-3','9364B','Cecilia Mercado','2165522');
/*!40000 ALTER TABLE `student_itproject` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student_practicum`
--

DROP TABLE IF EXISTS `student_practicum`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student_practicum` (
  `idnumber` int(11) NOT NULL,
  `fname` varchar(45) NOT NULL,
  `lname` varchar(45) NOT NULL,
  `course_year` varchar(45) NOT NULL,
  `subject` varchar(45) NOT NULL,
  `code` varchar(45) NOT NULL,
  `adviser` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`idnumber`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student_practicum`
--

LOCK TABLES `student_practicum` WRITE;
/*!40000 ALTER TABLE `student_practicum` DISABLE KEYS */;
INSERT INTO `student_practicum` VALUES (1234567,'Juan','Luna','BSIT-3','Practicum 1','1234B','Jonathan Ramirez','1234567'),(2162322,'Ashley Chester','Pua Phee','BSIT-3','Practicum 1','1231B','Ma. Concepcion Clemente','2162322'),(2163227,'Ray Oliver','Servidad','Practicum 1','BSIT-3','9364B','Ma. Concepcion Clemente','2163227'),(2165522,'Earl','Rimando','BSIT-3','Practicum 1','1234B','Ma. Concepcion Clemente','2165522'),(2166167,'Janxiene','Maniti','BSIT-3','Practicum 1','1315B','Ma. Concepcion Clemente','2166167'),(2167856,'JP','Sese','BSIT-3','Practicum 1','9364B','Cecilia Mercado','2167856');
/*!40000 ALTER TABLE `student_practicum` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'scislog'
--
/*!50003 DROP PROCEDURE IF EXISTS `addITProjLog` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `addITProjLog`(date VARCHAR(45), time_in VARCHAR(45), idnum int(11), office VARCHAR(45))
BEGIN
	insert into log_itproject(date, time_in, idnum, office)
		values(date, time_in, idnum, office);
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `addPracLog` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `addPracLog`(date VARCHAR(45), time_in VARCHAR(45), idnumber int(11), office VARCHAR(45))
BEGIN
	insert into log_practicum(date, time_in, idnumber, office)
		values(date, time_in, idnumber, office);
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `regITProjAccount` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `regITProjAccount`(idnum int(11), fname VARCHAR(45), lname VARCHAR(45), course_year VARCHAR(45), subject VARCHAR(45), code VARCHAR(45), adviser VARCHAR(45), password VARCHAR(45))
BEGIN
	insert into student_itproject(idnum, fname, lname, course_year, subject, code, adviser, password)
		values(idnum, fname, lname, course_year, subject, code, adviser, password);
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `regPracAccount` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `regPracAccount`(idnumber int(11), fname VARCHAR(45), lname VARCHAR(45), course_year VARCHAR(45), subject VARCHAR(45), code VARCHAR(45), adviser VARCHAR(45), password VARCHAR(45))
BEGIN
	insert into student_practicum(idnumber, fname, lname, course_year, subject, code, adviser, password)
		values(idnumber, fname, lname, course_year, subject, code, adviser, password);
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `timeOutITProj` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `timeOutITProj`(time_out VARCHAR(45))
BEGIN
	insert into log_itproject(time_out)
		values(time_out);
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `timeOutPrac` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `timeOutPrac`(time_out VARCHAR(45))
BEGIN
	insert into log_practicum(time_out)
		values(time_out);
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-04-28 21:52:48
