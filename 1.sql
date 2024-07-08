/*
SQLyog Enterprise - MySQL GUI v8.14 
MySQL - 5.5.20 : Database - test
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`test` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `test`;

/*Table structure for table `cheliang` */

DROP TABLE IF EXISTS `cheliang`;

CREATE TABLE `cheliang` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mingcheng` varchar(20) DEFAULT NULL,
  `pinpai` varchar(20) DEFAULT NULL,
  `jiage` varchar(20) DEFAULT NULL,
  `chepaihao` varchar(20) DEFAULT NULL,
  `zhuangtai` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `cheliang` */

insert  into `cheliang`(`id`,`mingcheng`,`pinpai`,`jiage`,`chepaihao`,`zhuangtai`) values (1,'车辆1','奥迪','1','1','正常'),(2,'车辆2','比亚迪','2','2','正常'),(3,'车辆3','本田','3','3','正常');

/*Table structure for table `cheliangguihuan` */

DROP TABLE IF EXISTS `cheliangguihuan`;

CREATE TABLE `cheliangguihuan` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `chelinagid` varchar(20) DEFAULT NULL,
  `luxian` varchar(20) DEFAULT NULL,
  `cheliangzhuangtai` varchar(20) DEFAULT NULL,
  `kaishishijian` varchar(20) DEFAULT NULL,
  `guihuanshijian` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `cheliangguihuan` */

insert  into `cheliangguihuan`(`id`,`chelinagid`,`luxian`,`cheliangzhuangtai`,`kaishishijian`,`guihuanshijian`) values (1,NULL,'11','正常','2024-06-05',''),(2,'1','111','正常','2024-06-06','2024-06-16 08:14:11'),(3,'3','1','正常','2024-05-28','2024-05-29'),(4,'1','111','正常','',''),(5,'1','1','正常','','');

/*Table structure for table `cheliangpaidan` */

DROP TABLE IF EXISTS `cheliangpaidan`;

CREATE TABLE `cheliangpaidan` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cheliangid` varchar(20) DEFAULT NULL,
  `sijiid` varchar(20) DEFAULT NULL,
  `paidanshijian` varchar(20) DEFAULT NULL,
  `lianxifangshi` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

/*Data for the table `cheliangpaidan` */

insert  into `cheliangpaidan`(`id`,`cheliangid`,`sijiid`,`paidanshijian`,`lianxifangshi`) values (4,'1','1','2024-06-16 07:58:03','小程序派单'),(5,'2','1','2024-06-16 07:58:09','小程序派单'),(6,'3','2','2024-06-16 07:59:22','小程序派单'),(7,'1','3','2024-06-19 18:55:44','小程序派单'),(8,'1','4','2024-06-19 22:30:08','小程序派单-归还'),(9,'2','7','2024-06-19 22:30:41','小程序派单-归还'),(10,'1','4','2024-06-19 23:07:36','小程序派单-归还'),(11,'1','4','2024-06-19 23:09:52','小程序派单-归还'),(12,'1','4','2024-06-19 23:09:58','小程序派单-归还'),(13,'2','4','2024-06-19 23:10:05','小程序派单-归还'),(14,'2','4','2024-06-19 23:10:57','小程序派单-归还');

/*Table structure for table `siji` */

DROP TABLE IF EXISTS `siji`;

CREATE TABLE `siji` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mingcheng` varchar(20) DEFAULT NULL,
  `jialing` varchar(20) DEFAULT NULL,
  `jiazhaodengji` varchar(20) DEFAULT NULL,
  `sijizhuangtai` varchar(20) DEFAULT NULL,
  `zhanghao` varchar(20) DEFAULT NULL,
  `mima` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

/*Data for the table `siji` */

insert  into `siji`(`id`,`mingcheng`,`jialing`,`jiazhaodengji`,`sijizhuangtai`,`zhanghao`,`mima`) values (1,'q','q','q','休息','1','1'),(2,'w','w','w','休息','2','2'),(3,'e','e','e','休息','3','3'),(4,'小王司机','三年','C证','休息','xiaowang','123'),(5,'1','1','1','休息','xiaowang1','11'),(6,'11','11','1','休息','1111','1'),(7,'123','123','123','休息','11111','1111');

/*Table structure for table `user2` */

DROP TABLE IF EXISTS `user2`;

CREATE TABLE `user2` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `pass` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user2` */

/*Table structure for table `usera` */

DROP TABLE IF EXISTS `usera`;

CREATE TABLE `usera` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `pass` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `usera` */

insert  into `usera`(`id`,`name`,`pass`) values (1,'1','1'),(2,'2','2'),(3,'111','11');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
