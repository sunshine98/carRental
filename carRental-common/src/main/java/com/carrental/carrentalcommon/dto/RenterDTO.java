package com.carrental.carrentalcommon.dto;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * @author YANGJUN.LIU
 * @date 2022/3/26 18:53
 * @description
 */
public class RenterDTO implements Serializable {
	private static final long serialVersionUID = -1731519279279482501L;
	/**
	 * 主键
	 */
	@ApiModelProperty("主键")
	private Long id;
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

}
