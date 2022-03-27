package com.carrental.carrentalcommon.dto;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * @author YANGJUN.LIU
 * @date 2022/3/26 19:07
 * @description
 */
public class StoreCarDTO implements Serializable {
	private static final long serialVersionUID = -1060892659108157620L;
	/**
	 * 主键
	 */
	@ApiModelProperty("主键")
	private Long id;
	/**
	 * 店铺id
	 */
	@ApiModelProperty("店铺id")
	private Long storeId;
	/**
	 * 汽车id
	 */
	@ApiModelProperty("汽车id")
	private Long carId;
	/**
	 * 开始服役时间
	 */
	@ApiModelProperty("开始服役时间")
	private Date startServiceTime;
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
