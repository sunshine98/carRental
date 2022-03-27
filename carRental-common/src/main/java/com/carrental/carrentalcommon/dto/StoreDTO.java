package com.carrental.carrentalcommon.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * @author YANGJUN.LIU
 * @date 2022/3/26 18:45
 * @description
 */
@Data
@ApiModel
@Accessors(chain = true)
@ToString(callSuper = true)
public class StoreDTO implements Serializable {

	private static final long serialVersionUID = 1572304838261967625L;
	/**
	 * 主键
	 */
	@ApiModelProperty("主键")
	private Long id;
	/**
	 * 店铺名称
	 */
	@ApiModelProperty("店铺名称")
	private String name;
	/**
	 * 店铺地址
	 */
	@ApiModelProperty("店铺地址")
	private String address;
	/**
	 * 联系电话
	 */
	@ApiModelProperty("联系电话")
	private String phone;
	/**
	 * 营业开始时间（小时）
	 */
	@ApiModelProperty("营业开始时间（小时）")
	private Integer startBusinessHour;
	/**
	 * 营业结束时间（小时）
	 */
	@ApiModelProperty("营业结束时间（小时）")
	private Integer endBusinessHour;
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
