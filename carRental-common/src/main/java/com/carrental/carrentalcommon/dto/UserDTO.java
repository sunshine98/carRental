package com.carrental.carrentalcommon.dto;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * @author YANGJUN.LIU
 * @date 2022/3/26 18:59
 * @description
 */
public class UserDTO implements Serializable {
	private static final long serialVersionUID = 314996381562456192L;
	/**
	 * 主键
	 */
	@ApiModelProperty("主键")
	private Long id;
	/**
	 * 昵称
	 */
	@ApiModelProperty("昵称")
	private String nickName;
	/**
	 * 登录用户名
	 */
	@ApiModelProperty("登录用户名")
	private String userName;
	/**
	 * 登录密码
	 */
	@ApiModelProperty("登录密码")
	private String password;
	/**
	 * 创建时间
	 */
	@ApiModelProperty("创建时间")
	private Date createTime;
	/**
	 * 更新时间
	 */
	@ApiModelProperty("更新时间")
	private Date updateTime;
	/**
	 * 是否删除
	 */
	@ApiModelProperty("是否删除")
	private Integer isDelete;
	/**
	 * 是否禁用
	 */
	@ApiModelProperty("是否禁用")
	private Integer isEnable;
}
