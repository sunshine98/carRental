package com.carrental.carrentalcommon.vo;

import com.carrental.carrentalcommon.constant.CommonConstant;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author YANGJUN.LIU
 * @date 2022/3/27 14:12
 * @description 封装的统一响应结构
 */
@Data
@Accessors(chain = true)
public class ResultVo <T> implements Serializable {
	private static final long serialVersionUID = 3128863117211605308L;

	/**
	 * 默认成功code
	 */
	private String code = CommonConstant.SUCCESS_CODE;

	/**
	 * 默认成功message
	 */
	private String msg = CommonConstant.SUCCESS_MESSAGE;


	private T data;

	public Boolean isSuccess() {
		return Objects.equals(this.code, CommonConstant.SUCCESS_CODE);
	}

	public Boolean isNotSuccess() {
		return !Objects.equals(this.code, CommonConstant.SUCCESS_CODE);
	}

	public ResultVo() {
		super();
	}

	public ResultVo(T data) {
		super();
		this.data = data;
	}


	public ResultVo(String code, T data, String msg) {
		super();
		this.code = code;
		this.data = data;
		this.msg = msg;
	}

	public ResultVo(Throwable e) {
		super();
		this.msg = e.getMessage();
		this.code = CommonConstant.FAIL_CODE;
	}

	public ResultVo(String code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
	}

}
