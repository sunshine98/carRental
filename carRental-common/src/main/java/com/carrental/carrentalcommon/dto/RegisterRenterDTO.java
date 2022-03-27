package com.carrental.carrentalcommon.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author YANGJUN.LIU
 * @date 2022/3/26 21:24
 * @description
 */
@Data
@ApiModel
@Accessors(chain = true)
@ToString(callSuper = true)
public class RegisterRenterDTO implements Serializable {
	private static final long serialVersionUID = -842964812435592426L;
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
	 * 年龄
	 */
	@ApiModelProperty("年龄")
	private Integer age;
	/**
	 * 真实姓名
	 */
	@ApiModelProperty("真实姓名")
	private String realname;
	/**
	 * 性别 0-未知 1-男 -2女
	 */
	@ApiModelProperty("性别 0-未知 1-男 -2女")
	private Integer sex;

}
