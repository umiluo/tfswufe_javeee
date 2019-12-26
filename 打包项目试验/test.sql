/*
 Navicat Premium Data Transfer

 Source Server         : YY
 Source Server Type    : MySQL
 Source Server Version : 80017
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 80017
 File Encoding         : 65001

 Date: 16/11/2019 14:40:31
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for article
-- ----------------------------
DROP TABLE IF EXISTS `article`;
CREATE TABLE `article`  (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `content` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of article
-- ----------------------------
INSERT INTO `article` VALUES (1, 'Lara系统安装', 'one');
INSERT INTO `article` VALUES (2, 'AndServer+Service 打造 Android 服务器实现 so 文件调用', 'two');
INSERT INTO `article` VALUES (3, 'jstl标签', '');
INSERT INTO `article` VALUES (4, 'jstl标签', '');
INSERT INTO `article` VALUES (5, 'jstl标签', '');
INSERT INTO `article` VALUES (6, 'jstl标签', '');
INSERT INTO `article` VALUES (7, '1', '1236');
INSERT INTO `article` VALUES (8, 'jstl标签', '');
INSERT INTO `article` VALUES (9, 'jstl标签', '');
INSERT INTO `article` VALUES (10, 'jstl标签', '52+26\n5+41521265');
INSERT INTO `article` VALUES (11, 'jstl标签', '123sdfdsfsd');
INSERT INTO `article` VALUES (12, 'jstl标签', '123sdfdsfsd');
INSERT INTO `article` VALUES (13, 'jstl标签', '12364');

-- ----------------------------
-- Table structure for publish
-- ----------------------------
DROP TABLE IF EXISTS `publish`;
CREATE TABLE `publish`  (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `text` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 28 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of publish
-- ----------------------------
INSERT INTO `publish` VALUES (1, '有事没事说两句...');
INSERT INTO `publish` VALUES (2, '有事没事说两句...');
INSERT INTO `publish` VALUES (3, '有事没事说两句...');
INSERT INTO `publish` VALUES (4, '有事没事说两句...');
INSERT INTO `publish` VALUES (5, '有事没事说两句...');
INSERT INTO `publish` VALUES (6, '有事没事说两句...');
INSERT INTO `publish` VALUES (7, '有事没事说两句...');
INSERT INTO `publish` VALUES (8, '有事没事说两句...');
INSERT INTO `publish` VALUES (9, '有事没事说两句...');
INSERT INTO `publish` VALUES (10, '有事没事说两句...');
INSERT INTO `publish` VALUES (11, '有事没事说两句...');
INSERT INTO `publish` VALUES (12, '有事没事说两句...');
INSERT INTO `publish` VALUES (13, '有事没事说两句...');
INSERT INTO `publish` VALUES (14, '有事没事说两句...');
INSERT INTO `publish` VALUES (15, '有事没事说两句...');
INSERT INTO `publish` VALUES (16, '有事没事说两句...');
INSERT INTO `publish` VALUES (17, '有事没事说两句...');
INSERT INTO `publish` VALUES (18, '有事没事说两句...');
INSERT INTO `publish` VALUES (19, '有事没事说两句...');
INSERT INTO `publish` VALUES (20, '有事没事说两句...');
INSERT INTO `publish` VALUES (21, '有事没事说两句...');
INSERT INTO `publish` VALUES (22, '有事没事说两句...');
INSERT INTO `publish` VALUES (23, '有事没事说两句...');
INSERT INTO `publish` VALUES (24, '有事没事说两句...');
INSERT INTO `publish` VALUES (25, '有事没事说两句...');
INSERT INTO `publish` VALUES (26, '有事没事说两句...');
INSERT INTO `publish` VALUES (27, '3435435');
INSERT INTO `publish` VALUES (28, '165465165');
INSERT INTO `publish` VALUES (29, '有事没事说两句...');
INSERT INTO `publish` VALUES (30, '有事没事说两句...');
INSERT INTO `publish` VALUES (31, '有事没事说两句...');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `username` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `telephone` int(255) NULL DEFAULT NULL,
  `email` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  `address` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  `sex` int(1) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, '1', '2', 123654, '86543@qq.com', 'china', 1);
INSERT INTO `user` VALUES (2, '2', '2', 2, '2', '2', 1);
INSERT INTO `user` VALUES (3, '3', '4', 16543215, '6283692@qq.com', 'China', 1);

SET FOREIGN_KEY_CHECKS = 1;
