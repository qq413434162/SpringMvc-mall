package com.springapp.command;

/*
 * 
 * CREATE TABLE IF NOT EXISTS `user` (
`user_id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
`user_name` varchar(12) NOT NULL COMMENT '��½��',
`user_passwd` varchar(12) NOT NULL COMMENT '��½����',
`user_nickname` varchar(30) NOT NULL COMMENT '��½�ǳ�',
 `phone` varchar(11) NOT NULL COMMENT '�ֻ���',
`status` tinyint(1) unsigned NOT NULL DEFAULT '1' COMMENT '�Ƿ����� 0δ���� 1����',
`listorder` tinyint(3) unsigned NOT NULL DEFAULT '0' COMMENT '����',
`create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '���ʱ��',
`update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '����ʱ��',
`is_delete` tinyint(1) NOT NULL DEFAULT '0' COMMENT '�Ƿ�ɾ�� 0δɾ�� 1ɾ��',
PRIMARY KEY (`application_id`)
) COMMENT='Ӧ�ñ�' ENGINE=InnoDB DEFAULT CHARSET=latin1;
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
