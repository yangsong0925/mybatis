/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50536
Source Host           : localhost:3306
Source Database       : mybatis

Target Server Type    : MYSQL
Target Server Version : 50536
File Encoding         : 65001

Date: 2018-05-28 00:53:20
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` varchar(36) NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `user_Sex` tinyint(1) DEFAULT NULL,
  `nick_Name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('0341682c-9c0b-4b3c-a5f3-704cbb9e176b', '帅哥46', 'ys46', '1', '46');
INSERT INTO `t_user` VALUES ('04b77954-1cc5-45cc-802b-a8fd058898e4', '帅哥33', 'ys33', '0', '33');
INSERT INTO `t_user` VALUES ('08618de6-9ccc-497d-a738-820d3da83833', '帅哥93', 'ys93', '0', '93');
INSERT INTO `t_user` VALUES ('0d9f8013-5845-48a7-aae6-257e34390c90', '帅哥54', 'ys54', '1', '54');
INSERT INTO `t_user` VALUES ('1372212b-1919-4845-9ec1-a3f1608224a1', '帅哥55', 'ys55', '0', '55');
INSERT INTO `t_user` VALUES ('1e66c726-fdb5-4652-9287-5a271fbb019f', '帅哥26', 'ys26', '1', '26');
INSERT INTO `t_user` VALUES ('1ef1f454-a868-4916-907e-ad3474c9013c', '帅哥19', 'ys19', '0', '19');
INSERT INTO `t_user` VALUES ('255a149e-09a9-4772-961b-e43f40b45412', '帅哥86', 'ys86', '1', '86');
INSERT INTO `t_user` VALUES ('2754cf3c-8790-49b5-9bba-36e122feff69', '帅哥100', 'ys100', '1', '100');
INSERT INTO `t_user` VALUES ('27bd43bb-a52e-4cd8-a39f-666a37192c42', '帅哥5', 'ys5', '0', '5');
INSERT INTO `t_user` VALUES ('2b78a024-63ee-4884-98ac-4e7d4698fbe7', '帅哥14', 'ys14', '1', '14');
INSERT INTO `t_user` VALUES ('2d2ec3ba-15fa-4a78-91b7-d5103942a598', '帅哥38', 'ys38', '1', '38');
INSERT INTO `t_user` VALUES ('2f576bd4-400c-4822-8c81-00ba94a956b7', '帅哥95', 'ys95', '0', '95');
INSERT INTO `t_user` VALUES ('317c3f03-5f90-4ad6-b230-ae81bc81d42b', '帅哥58', 'ys58', '1', '58');
INSERT INTO `t_user` VALUES ('31e751db-4e03-4850-a8a2-89b3c4ba009c', '帅哥68', 'ys68', '1', '68');
INSERT INTO `t_user` VALUES ('32f47035-e112-4d0d-8bf9-5069105834c1', 'ys', '123456', '1', '帅哥');
INSERT INTO `t_user` VALUES ('341ce543-d829-4115-9545-519b444e963b', '帅哥96', 'ys96', '1', '96');
INSERT INTO `t_user` VALUES ('34762edc-898f-48f4-8635-c2b17d902e15', '帅哥35', 'ys35', '0', '35');
INSERT INTO `t_user` VALUES ('386794f8-9c47-4f40-8deb-9134b6a68f72', '帅哥89', 'ys89', '0', '89');
INSERT INTO `t_user` VALUES ('395f7ab5-77b2-4923-b3b0-df001a56c63b', '帅哥25', 'ys25', '0', '25');
INSERT INTO `t_user` VALUES ('39a6d1e5-c837-4f7d-830a-cc913e46db12', '帅哥94', 'ys94', '1', '94');
INSERT INTO `t_user` VALUES ('3a5e2b0a-4b41-4f7f-8ad2-9144bfc97149', '帅哥63', 'ys63', '0', '63');
INSERT INTO `t_user` VALUES ('3c692646-49c6-424c-8a7b-a23bea4f2f6f', '帅哥82', 'ys82', '1', '82');
INSERT INTO `t_user` VALUES ('407dba71-5665-43d2-9475-fbaa63a988f6', '帅哥23', 'ys23', '0', '23');
INSERT INTO `t_user` VALUES ('41170cda-3b2d-4f9e-80db-e644ad7706da', '帅哥81', 'ys81', '0', '81');
INSERT INTO `t_user` VALUES ('42a8b2c6-ba5d-442e-b0bd-9ba7967afc1a', '帅哥51', 'ys51', '0', '51');
INSERT INTO `t_user` VALUES ('44269d38-4bbf-421f-b194-32877ed939bd', '帅哥42', 'ys42', '1', '42');
INSERT INTO `t_user` VALUES ('453e2bee-4d80-4c1a-a17d-7c25093e5a37', '帅哥43', 'ys43', '0', '43');
INSERT INTO `t_user` VALUES ('45ce8096-5f53-11e8-acb3-4ccc6ae0a51e', 'ys', '123456', '1', '帅哥');
INSERT INTO `t_user` VALUES ('48097f7b-3c31-4c4f-8432-8081586014cc', '帅哥88', 'ys88', '1', '88');
INSERT INTO `t_user` VALUES ('4898d73c-fbe0-440b-9271-257c7870d62a', '帅哥48', 'ys48', '1', '48');
INSERT INTO `t_user` VALUES ('4e8dcf02-29be-4bc2-84ab-563d83a03739', '帅哥69', 'ys69', '0', '69');
INSERT INTO `t_user` VALUES ('4fc4cf60-ed07-4955-ae1b-cb39ab478755', '帅哥17', 'ys17', '0', '17');
INSERT INTO `t_user` VALUES ('50fd53bb-5fc6-11e8-acb3-4ccc6ae0a51e', 'ys', '123456', '1', '帅哥');
INSERT INTO `t_user` VALUES ('53c595a1-8d2f-4ffd-9f73-a1876c4bd57f', '帅哥83', 'ys83', '0', '83');
INSERT INTO `t_user` VALUES ('5512afa8-6421-4586-9794-b093cd5feb92', '帅哥64', 'ys64', '1', '64');
INSERT INTO `t_user` VALUES ('59c6e028-5fc6-11e8-acb3-4ccc6ae0a51e', 'ys', '123456', '1', '帅哥');
INSERT INTO `t_user` VALUES ('5c3ad28d-4525-4857-8518-d7532b070485', '帅哥73', 'ys73', '0', '73');
INSERT INTO `t_user` VALUES ('5e061245-73cc-439c-b5b9-f4711b88d949', '帅哥37', 'ys37', '0', '37');
INSERT INTO `t_user` VALUES ('6420d8cb-2e31-40e7-b4c3-1a871efc0462', '帅哥78', 'ys78', '1', '78');
INSERT INTO `t_user` VALUES ('64a66426-d166-4bae-b990-7c6fe8255f49', '帅哥75', 'ys75', '0', '75');
INSERT INTO `t_user` VALUES ('656eec60-cd33-4607-a881-e8b8bad45182', '帅哥41', 'ys41', '0', '41');
INSERT INTO `t_user` VALUES ('6b4abae7-551c-4cb7-9616-5f5b71f5eec9', '帅哥90', 'ys90', '1', '90');
INSERT INTO `t_user` VALUES ('6c4e4f7f-2ca8-425f-964b-edbae1c5e40d', '帅哥80', 'ys80', '1', '80');
INSERT INTO `t_user` VALUES ('6cc1a1c1-4cfc-4f39-a08f-fd7b2cc41846', '帅哥77', 'ys77', '0', '77');
INSERT INTO `t_user` VALUES ('6d0845c7-0d9a-488a-9a2d-c311ff4c61d7', '帅哥53', 'ys53', '0', '53');
INSERT INTO `t_user` VALUES ('6d58293a-2d7b-45d4-9c25-edc612a5f3c7', '帅哥71', 'ys71', '0', '71');
INSERT INTO `t_user` VALUES ('6e7c154f-c3a9-4b0c-9680-71bd50d97137', '帅哥34', 'ys34', '1', '34');
INSERT INTO `t_user` VALUES ('6f74e05b-7ad6-4189-8a9a-c0e16245ec8f', '帅哥85', 'ys85', '0', '85');
INSERT INTO `t_user` VALUES ('7039dfda-5811-40b3-ae44-6e93a3bbc25e', '帅哥1', 'ys1', '0', '1');
INSERT INTO `t_user` VALUES ('713547b8-e826-45af-a473-4b2fd824d356', '帅哥47', 'ys47', '0', '47');
INSERT INTO `t_user` VALUES ('76595619-f03c-4992-86f6-c5875e1e3041', '帅哥49', 'ys49', '0', '49');
INSERT INTO `t_user` VALUES ('78aadf1a-8d50-4487-bd01-60e167804a2e', '帅哥79', 'ys79', '0', '79');
INSERT INTO `t_user` VALUES ('79fb0c72-ead0-46e8-8784-586102f22466', '帅哥31', 'ys31', '0', '31');
INSERT INTO `t_user` VALUES ('7a2019e3-9970-43fb-b7a5-dfcfbcc5ec26', '帅哥29', 'ys29', '0', '29');
INSERT INTO `t_user` VALUES ('7ee55356-242d-4345-ab17-2924dd8d067e', '帅哥10', 'ys10', '1', '10');
INSERT INTO `t_user` VALUES ('80004062-8b92-40a1-a84c-d0220b9886dd', '帅哥67', 'ys67', '0', '67');
INSERT INTO `t_user` VALUES ('801ad570-d087-4740-b423-8e85a41e763b', '帅哥2', 'ys2', '1', '2');
INSERT INTO `t_user` VALUES ('86b99fb3-9ecb-40d4-9624-34c42e34f1c2', '帅哥74', 'ys74', '1', '74');
INSERT INTO `t_user` VALUES ('89f2bbc0-3d0b-447e-ad1d-847dc81c816b', 'ys', 'mmp', '0', '帅哥');
INSERT INTO `t_user` VALUES ('8c959735-e019-4b3a-bb03-29ea5d9cb382', '帅哥97', 'ys97', '0', '97');
INSERT INTO `t_user` VALUES ('8d474e7a-00e2-467f-ba1e-ad095edf4a06', '帅哥60', 'ys60', '1', '60');
INSERT INTO `t_user` VALUES ('931801ba-5627-401b-9e26-dbbb17435746', 'ys', '123456', '1', '帅哥');
INSERT INTO `t_user` VALUES ('95764595-2819-4318-b8b4-b5611d113633', '帅哥6', 'ys6', '1', '6');
INSERT INTO `t_user` VALUES ('a1b6f665-f9b9-4573-a7a6-20b37554a84c', '帅哥52', 'ys52', '1', '52');
INSERT INTO `t_user` VALUES ('a3cf9106-daad-45e4-b9c7-ff20451c82e7', '帅哥44', 'ys44', '1', '44');
INSERT INTO `t_user` VALUES ('a79e6f7b-a069-4029-8724-01273ff4e57d', '帅哥20', 'ys20', '1', '20');
INSERT INTO `t_user` VALUES ('a878ac4a-71ef-4114-a110-622f3465657d', '帅哥99', 'ys99', '0', '99');
INSERT INTO `t_user` VALUES ('abda54ed-5fd4-11e8-acb3-4ccc6ae0a51e', 'ys', '123456', '1', '帅哥');
INSERT INTO `t_user` VALUES ('adc34706-6442-4a8c-b496-9fb72ac77c7d', '帅哥8', 'ys8', '1', '8');
INSERT INTO `t_user` VALUES ('af468926-65d5-4cdf-88b4-4d80248a1a01', '帅哥11', 'ys11', '0', '11');
INSERT INTO `t_user` VALUES ('b5056090-e0c0-48b3-877a-182b36a5c976', '帅哥4', 'ys4', '1', '4');
INSERT INTO `t_user` VALUES ('b5818140-e60d-4c33-9514-ff2749849be9', '帅哥70', 'ys70', '1', '70');
INSERT INTO `t_user` VALUES ('b6dfe9d4-ec79-4187-afac-f3dc127727a6', '帅哥27', 'ys27', '0', '27');
INSERT INTO `t_user` VALUES ('b991c3fc-61b0-4e7e-91cf-91031eefaf48', '帅哥56', 'ys56', '1', '56');
INSERT INTO `t_user` VALUES ('ba13c7a0-8bed-4058-b0ea-bf4a1143e2fa', '帅哥40', 'ys40', '1', '40');
INSERT INTO `t_user` VALUES ('bb775e51-2158-49da-a34d-d66de56405c7', '帅哥76', 'ys76', '1', '76');
INSERT INTO `t_user` VALUES ('bbe4e11b-0f5f-4718-b8ed-f125f4f95d7e', '帅哥45', 'ys45', '0', '45');
INSERT INTO `t_user` VALUES ('bc767d8b-db8a-42fc-a439-35da7cfb4e4f', '帅哥16', 'ys16', '1', '16');
INSERT INTO `t_user` VALUES ('bd22e0e3-e53a-467a-a377-bf67d5846ddd', '帅哥98', 'ys98', '1', '98');
INSERT INTO `t_user` VALUES ('bd384708-5fc5-11e8-acb3-4ccc6ae0a51e', 'ys', '123456', '1', '帅哥');
INSERT INTO `t_user` VALUES ('bf0b57ef-2d90-4fae-92b5-af5f5f0c0c85', '帅哥66', 'ys66', '1', '66');
INSERT INTO `t_user` VALUES ('bf18ea9c-732f-483a-8189-dd12072798ae', '帅哥92', 'ys92', '1', '92');
INSERT INTO `t_user` VALUES ('c1fce52a-5fd4-11e8-acb3-4ccc6ae0a51e', 'ys', '123456', '1', '帅哥');
INSERT INTO `t_user` VALUES ('c62701c0-3142-4321-b5d2-d49921aacb83', '帅哥30', 'ys30', '1', '30');
INSERT INTO `t_user` VALUES ('c7f22866-31ed-47c1-b51a-0e21708f956b', '帅哥61', 'ys61', '0', '61');
INSERT INTO `t_user` VALUES ('cd39155d-597a-4f8d-9786-829aee4c9d02', '帅哥87', 'ys87', '0', '87');
INSERT INTO `t_user` VALUES ('ceddaf72-1e88-43d6-ad27-749ad57100c4', '帅哥13', 'ys13', '0', '13');
INSERT INTO `t_user` VALUES ('cf0fd3d2-785f-401f-926d-1293a3124ef4', '帅哥7', 'ys7', '0', '7');
INSERT INTO `t_user` VALUES ('d1dfbbb9-919b-41c1-bf9f-a5313566cbac', '帅哥62', 'ys62', '1', '62');
INSERT INTO `t_user` VALUES ('d62be30f-c76c-4ed2-a338-fd0e966352d4', '帅哥24', 'ys24', '1', '24');
INSERT INTO `t_user` VALUES ('d8336a92-37ec-48ee-900a-0a5f13ba49b9', '帅哥12', 'ys12', '1', '12');
INSERT INTO `t_user` VALUES ('dbbf7caa-4b3c-40f4-b979-2b0b3af41730', 'ys', '123456', '1', '帅哥');
INSERT INTO `t_user` VALUES ('dc4951b2-864b-4c93-a217-72b2e5f78d48', '帅哥36', 'ys36', '1', '36');
INSERT INTO `t_user` VALUES ('dc5468c3-e0fe-40c9-8b23-5f70cc106b2c', '帅哥50', 'ys50', '1', '50');
INSERT INTO `t_user` VALUES ('dcfcee43-5b73-4b53-8745-34e4d0a84337', '帅哥15', 'ys15', '0', '15');
INSERT INTO `t_user` VALUES ('de585396-de04-41c6-84fe-fbc5b3cdaa5f', '帅哥28', 'ys28', '1', '28');
INSERT INTO `t_user` VALUES ('de64571e-b9f0-4c6f-9bf5-b2117589cd06', '帅哥84', 'ys84', '1', '84');
INSERT INTO `t_user` VALUES ('e6d5cd6a-63e6-4647-b3c1-4e0c8d43c683', '帅哥9', 'ys9', '0', '9');
INSERT INTO `t_user` VALUES ('ee93d62c-28f6-42f8-99e4-d60933a524ce', '帅哥21', 'ys21', '0', '21');
INSERT INTO `t_user` VALUES ('f0553fee-aaa5-45fd-817c-1d1600308418', '帅哥91', 'ys91', '0', '91');
INSERT INTO `t_user` VALUES ('f1fa304d-9ea5-4a25-85ad-5fc0dde9a7b2', '帅哥39', 'ys39', '0', '39');
INSERT INTO `t_user` VALUES ('f2745e92-d4f8-46d4-9f62-962f099213f7', '帅哥72', 'ys72', '1', '72');
INSERT INTO `t_user` VALUES ('f2f65147-f643-4df0-b15f-6d02ccb48f6d', '帅哥18', 'ys18', '1', '18');
INSERT INTO `t_user` VALUES ('f3a1f1dd-1db6-4dd1-872f-c8d866dc8bb8', '帅哥65', 'ys65', '0', '65');
INSERT INTO `t_user` VALUES ('f532f07f-4081-4255-a1b3-95e55aabe96c', 'ys', '123456', '1', '帅哥');
INSERT INTO `t_user` VALUES ('f7d2f9b8-b7ad-4c8d-836a-8eeaeee5c40f', '帅哥22', 'ys22', '1', '22');
INSERT INTO `t_user` VALUES ('fb2aa2da-ac91-46fc-8ab4-a8d6f5238e64', '帅哥59', 'ys59', '0', '59');
INSERT INTO `t_user` VALUES ('fc3793c5-0613-42af-84ed-025f84253f9a', '帅哥57', 'ys57', '0', '57');
INSERT INTO `t_user` VALUES ('fc412c49-1235-4823-9f71-39831eb08a6d', '帅哥3', 'ys3', '0', '3');
INSERT INTO `t_user` VALUES ('ffdf9ca1-1ea2-4e26-96e0-68b6594adff9', '帅哥32', 'ys32', '1', '32');
