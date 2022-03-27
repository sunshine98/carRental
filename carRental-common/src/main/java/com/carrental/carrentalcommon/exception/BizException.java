package com.carrental.carrentalcommon.exception;

import lombok.Data;

/**
 * @author YANGJUN.LIU
 * @date 2022/3/27 15:28
 * @description
 */
@Data
public class BizException extends RuntimeException{
	private static final long serialVersionUID = -1274545311872833951L;
	/**
	 * 错误码
	 */
	private String code;
	public BizException(String code) {
		super();
		this.code = code;
	}
}
