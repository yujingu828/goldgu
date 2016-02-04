CREATE TABLE `domain_info` (
	`id` INT NULL,
	`code` VARCHAR(50) NULL COMMENT '系统简称',
	`name` VARCHAR(50) NULL COMMENT '系统中文名',
	`domain_url` VARCHAR(100) NULL COMMENT '系统域名名称',
	`create_time` TIMESTAMP NULL COMMENT '创建日期',
	`create_by` INT NULL COMMENT '创建人id',
	`update_time` TIMESTAMP NULL COMMENT '修改日期',
	`update_by` INT NULL COMMENT '修改人id',
	`is_enable` CHAR(1) NULL COMMENT '是否启用',
	`desc` VARCHAR(1000) NULL COMMENT '描述',
	`remark` VARCHAR(500) NULL COMMENT '备注'
)
COMMENT='域名信息管理表'
COLLATE='utf8_general_ci'
ENGINE=InnoDB
;


CREATE TABLE `esb_info` (
	`id` INT NULL,
	`direct_url` VARCHAR(50) NULL COMMENT '转发路径endpoint，routeId，唯一标示',
	`sys_code` VARCHAR(50) NULL COMMENT '系统简称',
	`transmit_id` VARCHAR(50) NULL COMMENT '转移ID',
	`create_time` TIMESTAMP NULL COMMENT '创建时间',
	`create_by` INT NULL COMMENT '创建人ID',
	`update_time` TIMESTAMP NULL COMMENT '更新时间',
	`update_by` INT NULL COMMENT '更新人',
	`is_enable` CHAR(1) NULL COMMENT '启用或停用',
	`remark` CHAR(1) NULL COMMENT '备注'
)
COMMENT='ESB配置信息表'
COLLATE='utf8_general_ci'
ENGINE=InnoDB
;

