package com.carRental.provider.handler;

import cn.hutool.extra.spring.SpringUtil;
import com.carrental.carrentalcommon.constant.CommonConstant;
import com.carrental.carrentalcommon.exception.BizException;
import com.carrental.carrentalcommon.vo.ResultVo;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author YANGJUN.LIU
 * @date 2022/3/27 15:31
 * @description
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
	//business exception handler
	@ExceptionHandler(BizException.class)
	@ResponseStatus(HttpStatus.OK) // business exception still return 200 code
	public ResultVo handleBizException(BizException bizException) {
		MessageSource messageSource = SpringUtil.getBean(MessageSource.class);
		String errorMessage = messageSource.getMessage(bizException.getCode(), null, LocaleContextHolder.getLocale());

		return new ResultVo()
				.setMsg(errorMessage)
				.setCode(bizException.getCode());

	}

	//global exception handler
	@ExceptionHandler(Exception.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public ResultVo handleGlobalException(BizException bizException){
		return new ResultVo()
				.setMsg(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase())
				.setCode(CommonConstant.FAIL_CODE);

	}

}
