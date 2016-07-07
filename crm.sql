/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 50530
Source Host           : localhost:3306
Source Database       : crm

Target Server Type    : MYSQL
Target Server Version : 50530
File Encoding         : 65001

Date: 2016-07-07 12:41:12
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_dept`
-- ----------------------------
DROP TABLE IF EXISTS `t_dept`;
CREATE TABLE `t_dept` (
  `id` int(20) NOT NULL DEFAULT '0',
  `name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of t_dept
-- ----------------------------
INSERT INTO `t_dept` VALUES ('1', '综合部');
INSERT INTO `t_dept` VALUES ('2', '市场发展部');

-- ----------------------------
-- Table structure for `t_permission`
-- ----------------------------
DROP TABLE IF EXISTS `t_permission`;
CREATE TABLE `t_permission` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) DEFAULT NULL,
  `url` varchar(200) CHARACTER SET gbk COLLATE gbk_bin DEFAULT NULL,
  `pid` int(200) DEFAULT NULL,
  `sort` int(200) DEFAULT NULL,
  `pids` varchar(200) DEFAULT NULL,
  `type` varchar(200) CHARACTER SET gbk COLLATE gbk_bin DEFAULT NULL,
  `percode` varchar(200) CHARACTER SET gbk COLLATE gbk_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=75 DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of t_permission
-- ----------------------------
INSERT INTO `t_permission` VALUES ('1', '系统管理', null, '0', '1', null, 'menu', null);
INSERT INTO `t_permission` VALUES ('2', '销售管理', null, '0', '2', null, 'menu', null);
INSERT INTO `t_permission` VALUES ('3', '客户管理', null, '0', '3', null, 'menu', null);
INSERT INTO `t_permission` VALUES ('4', '服务管理', null, '0', '4', null, 'menu', null);
INSERT INTO `t_permission` VALUES ('5', '订单管理', null, '0', '5', null, 'menu', null);
INSERT INTO `t_permission` VALUES ('6', '合同管理', null, '0', '6', null, 'menu', null);
INSERT INTO `t_permission` VALUES ('7', '统计分析', null, '0', '7', null, 'menu', null);
INSERT INTO `t_permission` VALUES ('11', '角色管理', 'role/list.do', '1', '1', null, 'menu', null);
INSERT INTO `t_permission` VALUES ('12', '组织结构', null, '1', '2', null, 'menu', null);
INSERT INTO `t_permission` VALUES ('13', '员工管理', 'staff/list.do', '1', '3', null, 'menu', null);
INSERT INTO `t_permission` VALUES ('14', '公告管理', 'notice/list.do', '1', '4', null, 'menu', null);
INSERT INTO `t_permission` VALUES ('15', '个人信息', null, '1', '5', null, 'menu', null);
INSERT INTO `t_permission` VALUES ('16', '基础信息', null, '1', '6', null, 'menu', null);
INSERT INTO `t_permission` VALUES ('17', '书籍字典', null, '1', '7', null, 'menu', null);
INSERT INTO `t_permission` VALUES ('21', '销售计划', null, '2', '1', null, 'menu', null);
INSERT INTO `t_permission` VALUES ('22', '销售预测', null, '2', '2', null, 'menu', null);
INSERT INTO `t_permission` VALUES ('23', '销售绩效', null, '2', '3', null, 'menu', null);
INSERT INTO `t_permission` VALUES ('24', '机会管理', null, '2', '4', null, 'menu', null);
INSERT INTO `t_permission` VALUES ('25', '联系人管理', null, '2', '5', null, 'menu', null);
INSERT INTO `t_permission` VALUES ('26', '竞争管理', null, '2', '6', null, 'menu', null);
INSERT INTO `t_permission` VALUES ('27', '销售分析', null, '2', '7', null, 'menu', null);
INSERT INTO `t_permission` VALUES ('31', '客户资源管理', null, '3', '1', null, 'menu', null);
INSERT INTO `t_permission` VALUES ('32', '客户发展计划', null, '3', '2', null, 'menu', null);
INSERT INTO `t_permission` VALUES ('33', '客户价值管理', null, '3', '3', null, 'menu', null);
INSERT INTO `t_permission` VALUES ('34', '客户满意度管理', null, '3', '4', null, 'menu', null);
INSERT INTO `t_permission` VALUES ('35', '客户信誉管理', null, '3', '5', null, 'menu', null);
INSERT INTO `t_permission` VALUES ('36', '客户关怀', null, '3', '6', null, 'menu', null);
INSERT INTO `t_permission` VALUES ('41', '服务创建', null, '4', '1', null, 'menu', null);
INSERT INTO `t_permission` VALUES ('42', '服务分配', null, '4', '2', null, 'menu', null);
INSERT INTO `t_permission` VALUES ('43', '服务处理', null, '4', '3', null, 'menu', null);
INSERT INTO `t_permission` VALUES ('44', '服务反馈', null, '4', '4', null, 'menu', null);
INSERT INTO `t_permission` VALUES ('45', '服务归档', null, '4', '5', null, 'menu', null);
INSERT INTO `t_permission` VALUES ('46', '常见问题管理', null, '4', '6', null, 'menu', null);
INSERT INTO `t_permission` VALUES ('51', '代下订单', null, '5', '1', null, 'menu', null);
INSERT INTO `t_permission` VALUES ('52', '订单查询', null, '5', '2', null, 'menu', null);
INSERT INTO `t_permission` VALUES ('53', '订单统计', null, '5', '3', null, 'menu', null);
INSERT INTO `t_permission` VALUES ('61', '合同创建', null, '6', '1', null, 'menu', null);
INSERT INTO `t_permission` VALUES ('62', '合同审核', null, '6', '2', null, 'menu', null);
INSERT INTO `t_permission` VALUES ('63', '合同管理', null, '6', '3', null, 'menu', null);
INSERT INTO `t_permission` VALUES ('71', '客户构成统计', null, '7', '1', null, 'menu', null);
INSERT INTO `t_permission` VALUES ('72', '客户流失统计', null, '7', '2', null, 'menu', null);
INSERT INTO `t_permission` VALUES ('73', '客户贡献统计', null, '7', '3', null, 'menu', null);
INSERT INTO `t_permission` VALUES ('74', '客户服务统计', null, '7', '4', null, 'menu', null);

-- ----------------------------
-- Table structure for `t_role`
-- ----------------------------
DROP TABLE IF EXISTS `t_role`;
CREATE TABLE `t_role` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of t_role
-- ----------------------------
INSERT INTO `t_role` VALUES ('1', '系统管理员');
INSERT INTO `t_role` VALUES ('2', '销售总监');
INSERT INTO `t_role` VALUES ('3', '销售经理');
INSERT INTO `t_role` VALUES ('4', '销售代表');

-- ----------------------------
-- Table structure for `t_role_permission`
-- ----------------------------
DROP TABLE IF EXISTS `t_role_permission`;
CREATE TABLE `t_role_permission` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `roleId` int(20) DEFAULT NULL,
  `pid` int(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of t_role_permission
-- ----------------------------
INSERT INTO `t_role_permission` VALUES ('1', '1', '1');
INSERT INTO `t_role_permission` VALUES ('2', '1', '2');
INSERT INTO `t_role_permission` VALUES ('3', '1', '3');
INSERT INTO `t_role_permission` VALUES ('4', '1', '4');
INSERT INTO `t_role_permission` VALUES ('5', '1', '2');
INSERT INTO `t_role_permission` VALUES ('6', '1', '2');
INSERT INTO `t_role_permission` VALUES ('7', '1', '5');
INSERT INTO `t_role_permission` VALUES ('8', '1', '6');
INSERT INTO `t_role_permission` VALUES ('9', '1', '7');
INSERT INTO `t_role_permission` VALUES ('10', '1', '11');
INSERT INTO `t_role_permission` VALUES ('11', '1', '12');
INSERT INTO `t_role_permission` VALUES ('12', '1', '13');
INSERT INTO `t_role_permission` VALUES ('13', '1', '14');
INSERT INTO `t_role_permission` VALUES ('14', '1', '15');
INSERT INTO `t_role_permission` VALUES ('15', '1', '16');
INSERT INTO `t_role_permission` VALUES ('16', '1', '17');
INSERT INTO `t_role_permission` VALUES ('17', '1', '21');
INSERT INTO `t_role_permission` VALUES ('18', '1', '22');
INSERT INTO `t_role_permission` VALUES ('19', '1', '23');
INSERT INTO `t_role_permission` VALUES ('20', '1', '24');
INSERT INTO `t_role_permission` VALUES ('21', '1', '25');
INSERT INTO `t_role_permission` VALUES ('22', '1', '26');
INSERT INTO `t_role_permission` VALUES ('23', '1', '27');
INSERT INTO `t_role_permission` VALUES ('24', '2', '21');
INSERT INTO `t_role_permission` VALUES ('25', '2', '22');
INSERT INTO `t_role_permission` VALUES ('26', '2', '23');
INSERT INTO `t_role_permission` VALUES ('27', '2', '24');
INSERT INTO `t_role_permission` VALUES ('28', '2', '25');
INSERT INTO `t_role_permission` VALUES ('29', '2', '26');
INSERT INTO `t_role_permission` VALUES ('30', '2', '27');
INSERT INTO `t_role_permission` VALUES ('31', '2', '2');

-- ----------------------------
-- Table structure for `t_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `userName` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `sex` varchar(20) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `salt` varchar(20) DEFAULT NULL,
  `createTime` date DEFAULT NULL,
  `deptId` int(20) DEFAULT NULL,
  `roleId` int(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', 'admin', 'b100a80b52d3232d3a1e6c9316e95600', '男', '系统管理员', 'czg', '2016-07-06', '1', '1');
INSERT INTO `t_user` VALUES ('2', 'zhangsan', 'b100a80b52d3232d3a1e6c9316e95600', '男', '张三', 'czg', '2016-06-14', '2', '2');
