package com.carRental.provider.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * @author YANGJUN.LIU
 * @date 2022/3/26 16:59
 * @description
 */
@TableName(value="user")
@Data
public class User {
	/**
	 * 主键 默认主键自增
	 */
	@TableId(value = "id", type = IdType.AUTO)

	/**
	 *  主键
	 *
	 */
	private Long id;


	/**
	 *  昵称
	 *
	 */
	private String nickName;


	/**
	 *  登录用户名
	 *
	 */
	private String userName;


	/**
	 *  登录密码
	 *
	 */
	private String password;

	/**
	 * 密码随机盐
	 */
	private String salt;


	/**
	 *  创建时间
	 *
	 */
	private Date createTime;


	/**
	 *  更新时间
	 *
	 */
	private Date updateTime;


	/**
	 *  是否删除
	 *
	 */
	private Integer isDelete;


	/**
	 *  是否禁用
	 *
	 */
	private Integer isEnable;
}
