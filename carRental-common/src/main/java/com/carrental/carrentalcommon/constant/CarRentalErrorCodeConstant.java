package com.carrental.carrentalcommon.constant;

/**
 * @author YANGJUN.LIU
 * @date 2022/3/27 15:57
 * @description 错误码常量定义 5位数字 以“00001”开头
 */
public interface CarRentalErrorCodeConstant {

	/** invalid param **/
	String INVALID_PARAMETER = "00001";

	/** user is not login in **/
	String USER_IS_NOT_LOGGED_IN = "00002";


	/**
	 * user has alerady registered
	 */
	String USER_HAS_ALERADY_REGISTERED = "00003";
	/**
	 * renter sex illegal
	 */
	String RENTER_SEX_ILLEGAL = "00004";
}

