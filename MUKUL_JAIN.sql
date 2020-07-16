/*
SQLyog - Free MySQL GUI v5.17
Host - 5.5.27 : Database - jnp
*********************************************************************
Server version : 5.5.27
*/

SET NAMES utf8;

SET SQL_MODE='';

create database if not exists `jnp`;

USE `jnp`;

SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO';

/*Table structure for table `psk` */

DROP TABLE IF EXISTS `psk`;

CREATE TABLE `psk` (
  `username` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `psk` */

insert into `psk` (`username`) values ('abc');
insert into `psk` (`username`) values ('xyz');

/*Table structure for table `pskv` */

DROP TABLE IF EXISTS `pskv`;

CREATE TABLE `pskv` (
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `role` varchar(50) DEFAULT NULL,
  `section` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `pskv` */

insert into `pskv` (`username`,`password`,`role`,`section`) values ('mukul','1234','student','X');
insert into `pskv` (`username`,`password`,`role`,`section`) values ('sunil','5678','teacher','MATHS');
insert into `pskv` (`username`,`password`,`role`,`section`) values ('piyush','1236','student','IX');
insert into `pskv` (`username`,`password`,`role`,`section`) values ('jai','2345','student','VII');
insert into `pskv` (`username`,`password`,`role`,`section`) values ('lalit','2356','teacher','SST');
insert into `pskv` (`username`,`password`,`role`,`section`) values ('mahi','2367','teacher','SCIENCE');
insert into `pskv` (`username`,`password`,`role`,`section`) values ('akshay','3689','student','V');
insert into `pskv` (`username`,`password`,`role`,`section`) values ('veer','2367','student','VI');
insert into `pskv` (`username`,`password`,`role`,`section`) values ('ja','5904','teacher','ENGLISH');
insert into `pskv` (`username`,`password`,`role`,`section`) values ('jai','4567','teacher','HINDI');
insert into `pskv` (`username`,`password`,`role`,`section`) values ('vaibhav','9034','student','VII');
insert into `pskv` (`username`,`password`,`role`,`section`) values ('pawan','1324','student','VII');
insert into `pskv` (`username`,`password`,`role`,`section`) values ('jaimq','1270','student','VIII');
insert into `pskv` (`username`,`password`,`role`,`section`) values ('manoj','6712','student','IX');
insert into `pskv` (`username`,`password`,`role`,`section`) values ('nitesh','9056','student','V');
insert into `pskv` (`username`,`password`,`role`,`section`) values ('keshav','0976','student','X');
insert into `pskv` (`username`,`password`,`role`,`section`) values ('ksdf','9584','student','X');
insert into `pskv` (`username`,`password`,`role`,`section`) values ('chanchal','asdf1234','teacher','MATHS');
insert into `pskv` (`username`,`password`,`role`,`section`) values ('jain','2368','teacher','SST');
insert into `pskv` (`username`,`password`,`role`,`section`) values ('lokesh','9045','student','VI');
insert into `pskv` (`username`,`password`,`role`,`section`) values ('ganesh','6709','student','X');
insert into `pskv` (`username`,`password`,`role`,`section`) values ('ben','1290','student','VI');
insert into `pskv` (`username`,`password`,`role`,`section`) values ('hena','8945','teacher','HINDI');
insert into `pskv` (`username`,`password`,`role`,`section`) values ('nana','5678','student','V');
insert into `pskv` (`username`,`password`,`role`,`section`) values ('chanchal','1234','teacher','SST');
insert into `pskv` (`username`,`password`,`role`,`section`) values ('kanak','6789','student','VIII');
insert into `pskv` (`username`,`password`,`role`,`section`) values ('mahak','3456','teacher','SST');
insert into `pskv` (`username`,`password`,`role`,`section`) values ('janavi','2370','teacher','ENGLISH');
insert into `pskv` (`username`,`password`,`role`,`section`) values ('pankaj','1256','student','VII');
insert into `pskv` (`username`,`password`,`role`,`section`) values ('chanchal1','12345','student','VI');

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
