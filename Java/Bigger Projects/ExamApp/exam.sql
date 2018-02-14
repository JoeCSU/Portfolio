CREATE DATABASE  IF NOT EXISTS `exam` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `exam`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: exam
-- ------------------------------------------------------
-- Server version	5.7.19-log

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
-- Table structure for table `answers`
--

DROP TABLE IF EXISTS `answers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `answers` (
  `idQuestion` varchar(45) NOT NULL DEFAULT '1',
  `idAnswer` varchar(20) NOT NULL DEFAULT '1',
  `isCorrect` tinyint(4) NOT NULL DEFAULT '0',
  `answerText` varchar(1000) NOT NULL,
  `examId` varchar(20) NOT NULL,
  PRIMARY KEY (`idAnswer`,`idQuestion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `answers`
--

LOCK TABLES `answers` WRITE;
/*!40000 ALTER TABLE `answers` DISABLE KEYS */;
INSERT INTO `answers` VALUES ('1chem400','1chem4001',0,'conduction','chem400'),('1chem400','1chem4002',0,'nothing','chem400'),('1chem400','1chem4003',0,'something','chem400'),('1chem400','1chem4004',1,'heat transfer','chem400'),('1phys100','1phys1001',0,'nothing','phys100'),('1phys100','1phys1002',0,'god','phys100'),('1phys100','1phys1003',0,'philosophy','phys100'),('1phys100','1phys1004',1,'a force','phys100'),('2chem400','2chem4001',0,'sugar','chem400'),('2chem400','2chem4002',0,'god','chem400'),('2chem400','2chem4003',1,'fat','chem400'),('2chem400','2chem4004',0,'nothing','chem400'),('2phys100','2phys1001',0,'9.8 km/s','phys100'),('2phys100','2phys1002',1,'3.0x10^8 m/s','phys100'),('2phys100','2phys1003',0,'12.5 m/s','phys100'),('2phys100','2phys1004',0,'55 m/s','phys100');
/*!40000 ALTER TABLE `answers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `exam`
--

DROP TABLE IF EXISTS `exam`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `exam` (
  `examId` varchar(20) NOT NULL DEFAULT 'none',
  `description` varchar(45) DEFAULT 'exam for...',
  `passingScore` int(3) NOT NULL DEFAULT '60',
  `maxScore` int(3) NOT NULL DEFAULT '100',
  `rules` varchar(10000) NOT NULL DEFAULT 'none',
  `isRegistered` tinyint(4) DEFAULT '0',
  `idStudent` int(11) NOT NULL DEFAULT '0',
  `time` int(4) DEFAULT NULL,
  PRIMARY KEY (`examId`,`idStudent`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `exam`
--

LOCK TABLES `exam` WRITE;
/*!40000 ALTER TABLE `exam` DISABLE KEYS */;
INSERT INTO `exam` VALUES ('chem400','Chemistry of Cooking Final Exam',60,100,'You have 1 hour to finish. You m ay use a calculator. The exam is open book and open notes.',0,0,3600),('phys100','Physics 100 Final Exam',60,100,'You have 2 hours to finish the exam. You may use a calculator and scrap paper.',0,0,7200),('phys100','Physics 100 Final Exam',60,100,'You have 2 hours to finish the exam. You may use a calculator and scrap paper.',1,2,7200),('phys100','Physics 100 Final Exam',60,100,'You have 2 hours to finish the exam. You may use a calculator and scrap paper.',1,123456789,7200);
/*!40000 ALTER TABLE `exam` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `questions`
--

DROP TABLE IF EXISTS `questions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `questions` (
  `examId` varchar(20) NOT NULL DEFAULT 'exam',
  `questionText` varchar(500) NOT NULL DEFAULT 'what is',
  `questionOrder` int(200) DEFAULT '0',
  `idQuestion` varchar(20) NOT NULL DEFAULT 'q0000',
  `answer` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idQuestion`,`examId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `questions`
--

LOCK TABLES `questions` WRITE;
/*!40000 ALTER TABLE `questions` DISABLE KEYS */;
INSERT INTO `questions` VALUES ('phys100','What is gravity?',1,'1phys100','1phys1001'),('phys100','What is the Speed of light?',2,'2phys100','2phys1001');
/*!40000 ALTER TABLE `questions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student` (
  `idStudent` varchar(20) NOT NULL DEFAULT '9999',
  `firstName` varchar(45) DEFAULT 'none',
  `lastName` varchar(45) DEFAULT 'none',
  PRIMARY KEY (`idStudent`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES ('1','Jane','Smith'),('123456789','Joseph','Antonacci'),('2','Bill','Johnson');
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

-- Dump completed on 2017-12-08 21:57:22
