package com.springapp.command;

/*
 * 
 * CREATE TABLE IF NOT EXISTS `user` (
`user_id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
`user_name` varchar(12) NOT NULL COMMENT '登陆名',
`user_passwd` varchar(12) NOT NULL COMMENT '登陆密码',
`user_nickname` varchar(30) NOT NULL COMMENT '登陆昵称',
 `phone` varchar(11) NOT NULL COMMENT '手机号',
`status` tinyint(1) unsigned NOT NULL DEFAULT '1' COMMENT '是否启用 0未启用 1启用',
`listorder` tinyint(3) unsigned NOT NULL DEFAULT '0' COMMENT '排序',
`create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
`update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
`is_delete` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否删除 0未删除 1删除',
PRIMARY KEY (`application_id`)
) COMMENT='应用表' ENGINE=InnoDB DEFAULT CHARSET=latin1;
 */
public class UserCommand {
	private String userName;
	private Integer userId;
	private String phone;
	private String userPasswd;
	public String getUserPasswd() {
		return userPasswd;
	}

	public void setUserPasswd(
			String user_passwd) {
		this.userPasswd = userPasswd;
	}

	private Boolean status = true;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setUserName(String user_name) {
		this.userName = user_name;
	}

	public String getUserName() {
		return userName;
	}
	
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getUserId() {
		return userId;
	}
}
