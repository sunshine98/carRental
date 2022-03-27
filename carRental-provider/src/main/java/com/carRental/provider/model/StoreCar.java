package com.carRental.provider.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * @author YANGJUN.LIU
 * @date 2022/3/26 17:00
 * @description
 */
@TableName(value="store_car")
@Data
public class StoreCar {
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
	 *  店铺id
	 *
	 */
	private Long storeId;


	/**
	 *  汽车id
	 *
	 */
	private Long carId;


	/**
	 *  开始服役时间
	 *
	 */
	private Date startServiceTime;


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
