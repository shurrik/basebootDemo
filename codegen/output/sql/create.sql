DROP TABLE IF EXISTS `t_wl_glass`;
CREATE TABLE `t_wl_glass` (
  `id` varchar(64) COLLATE utf8_general_ci NOT NULL COMMENT '主键',
  `name` varchar(100) COLLATE utf8_general_ci NOT NULL COMMENT '书名',
  `price` int(11) COLLATE utf8_general_ci NOT NULL COMMENT '价格',
  `create_date` datetime COLLATE utf8_general_ci NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci COMMENT='书籍';
