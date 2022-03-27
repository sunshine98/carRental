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
@TableName(value="store")
@Data
public class Store {

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
	 *  店铺名称
	 *
	 */
	private String name;


	/**
	 *  店铺地址
	 *
	 */
	private String address;


	/**
	 *  联系电话
	 *
	 */
	private String phone;


	/**
	 *  营业开始时间（小时）
	 *
	 */
	private Integer startBusinessHour;


	/**
	 *  营业结束时间（小时）
	 *
	 */
	private Integer endBusinessHour;


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
