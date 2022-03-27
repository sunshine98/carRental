package com.carRental.provider.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * @author YANGJUN.LIU
 * @date 2022/3/26 16:58
 * @description
 */
@TableName(value="renter")
@Data
public class Renter {
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
	 * user 主键id
	 */
	private Long userId;


	/**
	 *  年龄
	 *
	 */
	private Integer age;


	/**
	 *  真实姓名
	 *
	 */
	private String realname;


	/**
	 *  性别 0-未知 1-男 -2女
	 *
	 */
	private Integer sex;


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

}
