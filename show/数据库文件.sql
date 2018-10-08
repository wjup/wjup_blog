/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 50153
 Source Host           : localhost:3306
 Source Schema         : springboot

 Target Server Type    : MySQL
 Target Server Version : 50153
 File Encoding         : 65001

 Date: 08/10/2018 16:23:47
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for blog_notice
-- ----------------------------
DROP TABLE IF EXISTS `blog_notice`;
CREATE TABLE `blog_notice`  (
  `id` int(4) NOT NULL,
  `title` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '标题',
  `notice` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '内容',
  `creatTime` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '创建时间',
  `isOverdue` int(2) DEFAULT NULL COMMENT '公告是否过期',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of blog_notice
-- ----------------------------
INSERT INTO `blog_notice` VALUES (1, '服务器升级公告', '由于，人数也不短剧增，小型服务器已支撑不了各位友友们的访问，于是本网站将在后天上午6点进行业务升级，给各位带来的不便请谅解。   </br></br><div class=\"nav navbar-nav navbar-right\"><b> ---wjup运营团队</b></div>', '2018-10-21', 1);

-- ----------------------------
-- Table structure for blog_text
-- ----------------------------
DROP TABLE IF EXISTS `blog_text`;
CREATE TABLE `blog_text`  (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '标题',
  `url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '链接地址',
  `text` varchar(9999) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '内容',
  `creatTime` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '创建时间',
  `work` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '火-加精-认证等',
  `comment` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '评论',
  `state` int(2) DEFAULT NULL COMMENT '状态（0--发表 1--草稿 2--已删除）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 25 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of blog_text
-- ----------------------------
INSERT INTO `blog_text` VALUES (1, '刚和女朋友/男朋友同居是一种什么体验？', 'details/1', '通知通知通知通知通知通知通知通知通知通知通知通知通知通知通知通知通知通知通知通知通知通知通知', '2018-09-29', '火', NULL, 1);
INSERT INTO `blog_text` VALUES (2, '面试想拿 10K，HR 说你只值 7K，该怎样回答或者反驳？', 'details/1', '京东积分漏洞可刷取999个积分，并且领取袜子十亿双', '2018-09-29', '加精', NULL, 1);
INSERT INTO `blog_text` VALUES (3, '你班主任说过最让你难忘的一句话是什么？', 'details/1', '京东积分漏洞可刷取999个积分，并且领取袜子十亿双', '2018-09-29', '已认证', NULL, 1);
INSERT INTO `blog_text` VALUES (4, '商业模式丨如何用互联网思维去卖一只烧鸡？', 'details/1', '京东积分漏洞可刷取999个积分，并且领取袜子十亿双', '2018-09-29', '推荐', NULL, 1);
INSERT INTO `blog_text` VALUES (5, '女生如何看待长相一般的男生的？', 'details/1', '京东积分漏洞可刷取999个积分，并且领取袜子十亿双', '2018-09-29', NULL, NULL, 1);
INSERT INTO `blog_text` VALUES (6, '马云的资产能在北京二环/上海内环买多少平米的房子？', 'details/6', '京东积分漏洞可刷取999个积分，并且领取袜子十亿双', '2018-09-29', NULL, NULL, 1);
INSERT INTO `blog_text` VALUES (11, '你高中时做过的最热血的事情是什么？', 'details/你高中时做过的最热血的事情是什么？', '京东积分漏洞可刷取999个积分，并且领取袜子十亿双', '2018-09-29', '推荐', NULL, 2);
INSERT INTO `blog_text` VALUES (12, '你们高考当天发生了什么有趣的事？', 'details/你们高考当天发生了什么有趣的事？', '京东积分漏洞可刷取999个积分，并且领取袜子十亿双', '2018-09-31', NULL, NULL, 2);
INSERT INTO `blog_text` VALUES (23, '国庆游客创新高', 'details/国庆游客创新高', '好好好好好好 好好好好好好好好好好就就看看看 看 哦看好v非非共同框架 看了 哦哦了就就', '2018-10-08', '国庆', NULL, 1);
INSERT INTO `blog_text` VALUES (24, 'AI 的预言：人类不再是“不可替代” 越来越像人却却来越被抗拒', 'details/AI 的预言：人类不再是“不可替代” 越来越像人却却来越被抗拒', '刚刚结束的十一小长假，谷歌还没重返大陆，Google AI 体验展却先它一步去到了“魔都”上海。   9 月 20 日至 10 月 7 日，谷歌在上海龙美术馆举办的 AI 体验展场景。图 / 好奇心日报  在为期 17 天的展期和 2000 平米的展区内，Google AI 集中展示了今年 7 月份推出的微信小程序猜画小歌、Google 艺术与文化、Google 翻译等 AI 产品', '2018-10-08', '智能', NULL, 1);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(32) NOT NULL AUTO_INCREMENT,
  `userName` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `passWord` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `realName` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 18 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'admin', 'L7GWTTt2byT4GBT6ZxHEmg==', '管理员');
INSERT INTO `user` VALUES (2, 'abc', '123', '管理员');
INSERT INTO `user` VALUES (3, 'qqq', 'wqwq', NULL);
INSERT INTO `user` VALUES (6, 'abcwqw', '123wqwq', NULL);
INSERT INTO `user` VALUES (7, 'abcewqe', '123eqweqw', NULL);
INSERT INTO `user` VALUES (8, 'abc21', '12321', NULL);
INSERT INTO `user` VALUES (10, 'abc222', '123222', NULL);
INSERT INTO `user` VALUES (11, 'abc312', '12321', NULL);
INSERT INTO `user` VALUES (12, 'abc2121212121', '12321212121212', NULL);
INSERT INTO `user` VALUES (13, 'abcsss', '123ssss', NULL);
INSERT INTO `user` VALUES (14, 'abcdasdas', '123dsada', NULL);
INSERT INTO `user` VALUES (15, '79798', '908098', NULL);
INSERT INTO `user` VALUES (16, '你还', '', NULL);
INSERT INTO `user` VALUES (17, 'fsdfsfs', 'sdfsdfsdf', NULL);

SET FOREIGN_KEY_CHECKS = 1;
