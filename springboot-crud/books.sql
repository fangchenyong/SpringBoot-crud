/*
Navicat MySQL Data Transfer

Source Server         : springboot
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : springboot

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2018-11-06 20:36:34
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for books
-- ----------------------------
DROP TABLE IF EXISTS `books`;
CREATE TABLE `books` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `title` varchar(100) NOT NULL COMMENT '书名',
  `price` decimal(10,2) DEFAULT NULL COMMENT '价格',
  PRIMARY KEY (`id`),
  UNIQUE KEY `title` (`title`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of books
-- ----------------------------
INSERT INTO `books` VALUES ('1', 'Java编程思想', '98.50');
INSERT INTO `books` VALUES ('2', 'HeadFirst设计模式', '55.70');
INSERT INTO `books` VALUES ('3', '第一行Android代码', '69.90');
INSERT INTO `books` VALUES ('4', 'C++编程思想', '88.50');
INSERT INTO `books` VALUES ('5', 'HeadFirst Java', '55.70');
INSERT INTO `books` VALUES ('6', '疯狂Android', '19.50');
