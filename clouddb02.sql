/*
 Navicat Premium Data Transfer

 Source Server         : 本地mysql数据库
 Source Server Type    : MySQL
 Source Server Version : 50558
 Source Host           : localhost:3306
 Source Schema         : clouddb02

 Target Server Type    : MySQL
 Target Server Version : 50558
 File Encoding         : 65001

 Date: 29/02/2020 21:35:26
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept`  (
  `deptno` bigint(20) NOT NULL AUTO_INCREMENT,
  `dname` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `db_source` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`deptno`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of dept
-- ----------------------------
INSERT INTO `dept` VALUES (1, '开发部', 'clouddb02');
INSERT INTO `dept` VALUES (2, '人事部', 'clouddb02');
INSERT INTO `dept` VALUES (3, '财务部', 'clouddb02');
INSERT INTO `dept` VALUES (4, '市场部', 'clouddb02');
INSERT INTO `dept` VALUES (5, '运维部', 'clouddb02');

SET FOREIGN_KEY_CHECKS = 1;
