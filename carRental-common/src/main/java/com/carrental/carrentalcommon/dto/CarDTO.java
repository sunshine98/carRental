package com.carrental.carrentalcommon.dto;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author YANGJUN.LIU
 * @date 2022/3/26 18:47
 * @description
 */
public class CarDTO implements Serializable {

	private static final long serialVersionUID = 3137463185998549992L;
	/**
	 * 主键
	 */
	@ApiModelProperty("主键")
	private Long id;
	/**
	 * 汽车型号
	 */
	@ApiModelProperty("汽车型号")
	private String modelName;
	/**
	 * 排量
	 */
	@ApiModelProperty("排量")
	private Integer displacement;
	/**
	 * 租车价格/天
	 */
	@ApiModelProperty("租车价格/天")
	private BigDecimal rentPrice;
	/**
	 * 汽车使用年龄
	 */
	@ApiModelProperty("汽车使用年龄")
	private Integer age;
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
