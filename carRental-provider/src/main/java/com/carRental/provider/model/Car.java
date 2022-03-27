package com.carRental.provider.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author YANGJUN.LIU
 * @date 2022/3/26 0:58
 * @description
 */
@TableName(value="car")
@Data
public class Car {
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
	 *  汽车型号
	 *
	 */
	private String modelName;


	/**
	 *  排量
	 *
	 */
	private Integer displacement;


	/**
	 *  租车价格/天
	 *
	 */
	private BigDecimal rentPrice;


	/**
	 *  汽车使用年龄
	 *
	 */
	private Integer age;


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
