/*
 Navicat Premium Data Transfer

 Source Server         : ddd
 Source Server Type    : MySQL
 Source Server Version : 50728
 Source Host           : localhost:3306
 Source Schema         : interview

 Target Server Type    : MySQL
 Target Server Version : 50728
 File Encoding         : 65001

 Date: 29/07/2020 02:14:32
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- DATABASE
-- ----------------------------
create database if not exists interview;

USE interview;

-- ----------------------------
-- Table structure for t_order
-- ----------------------------
DROP TABLE IF EXISTS `t_order`;
CREATE TABLE `t_order`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `order_no` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `user_id` bigint(20) NOT NULL,
  `merchant_id` bigint(20) NOT NULL,
  `amount` decimal(16, 2) NOT NULL,
  `create_date` datetime(0) NULL DEFAULT NULL,
  `update_date` datetime(0) NULL DEFAULT NULL,
  `status` int(255) NOT NULL DEFAULT 0 COMMENT '0：未付款，1：已付款，2：已发货，3：已收货，4：已评价，-1：已撤销，-2：已退款',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 16 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_order
-- ----------------------------
INSERT INTO `t_order` VALUES (1, '123', 111, 222, 100.00, '2020-07-27 14:48:23', NULL, 0);
INSERT INTO `t_order` VALUES (3, 'JxsVWjLubP', 32131, 2321, 31231.00, '2020-07-27 17:17:35', NULL, 0);
INSERT INTO `t_order` VALUES (4, 'FgNkz0rUeZ', 222, 333, 500.00, '2020-07-27 17:51:42', NULL, 0);
INSERT INTO `t_order` VALUES (5, 'Pvp84D0O8m', 222, 333, 500.00, '2020-07-27 17:51:45', NULL, 0);
INSERT INTO `t_order` VALUES (6, 'oq5vUP3Fml', 231, 32131, 600.00, '2020-07-27 19:07:25', NULL, 0);
INSERT INTO `t_order` VALUES (7, 'UGJl5HlxWm', 444, 555, 500.00, '2020-07-27 19:34:27', NULL, 0);
INSERT INTO `t_order` VALUES (8, 'rjCJKUmzsM', 555, 666, 5000.00, '2020-07-27 19:45:48', NULL, 0);
INSERT INTO `t_order` VALUES (9, 'CynRH2htda', 200, 3213, 6000.00, '2020-07-27 19:54:19', NULL, 0);
INSERT INTO `t_order` VALUES (10, 'SFPIUqCT38', 500, 500, 7000.00, '2020-07-27 19:57:02', NULL, 0);
INSERT INTO `t_order` VALUES (11, 'qpahOH1vKC', 500, 500, 8000.00, '2020-07-27 19:57:13', NULL, 0);
INSERT INTO `t_order` VALUES (14, '0OgXpB8bFD', 1, 1, 2.00, '2020-07-28 03:19:43', NULL, 0);
INSERT INTO `t_order` VALUES (15, '6JwEmOIFmv', 2, 2, 2.00, '2020-07-28 03:19:51', NULL, 0);

SET FOREIGN_KEY_CHECKS = 1;
