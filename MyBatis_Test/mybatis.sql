/*
 Navicat Premium Data Transfer

 Source Server         : YY
 Source Server Type    : MySQL
 Source Server Version : 80017
 Source Host           : localhost:3306
 Source Schema         : mybatis

 Target Server Type    : MySQL
 Target Server Version : 80017
 File Encoding         : 65001

 Date: 04/11/2019 12:29:47
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order`  (
  `order_id` int(9) NOT NULL AUTO_INCREMENT,
  `user_id` int(9) NOT NULL COMMENT '外键',
  `order_site` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`order_id`) USING BTREE,
  INDEX `user_id`(`user_id`) USING BTREE,
  CONSTRAINT `user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of order
-- ----------------------------
INSERT INTO `order` VALUES (1, 1, 'China');
INSERT INTO `order` VALUES (2, 1, 'America');
INSERT INTO `order` VALUES (3, 2, 'America');
INSERT INTO `order` VALUES (4, 3, 'China');
INSERT INTO `order` VALUES (5, 4, '新加坡');
INSERT INTO `order` VALUES (6, 5, '加拿大');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `user_id` int(9) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `user_password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, '1', '2');
INSERT INTO `user` VALUES (2, '2', '3');
INSERT INTO `user` VALUES (3, '3', '4');
INSERT INTO `user` VALUES (4, '阿大声道', 'd351315w');
INSERT INTO `user` VALUES (5, '厘米见', '3693');

SET FOREIGN_KEY_CHECKS = 1;
