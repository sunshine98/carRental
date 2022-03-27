package com.carrental.carrentalcommon.utils;

import cn.hutool.core.util.StrUtil;
import cn.hutool.extra.spring.SpringUtil;
import com.carrental.carrentalcommon.vo.ResultVo;
import lombok.experimental.UtilityClass;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;

/**
 * @author YANGJUN.LIU
 * @date 2022/3/27 14:46
 * @description
 */
@UtilityClass
public class ResultUtil {

	/**
	 * 接收字符串类型的code
	 * @param code
	 * @return
	 */
	public ResultVo returnFailByCode(String code) {
		ResultVo returnResult = new ResultVo();
		returnResult.setCode(code);
		MessageSource messageSource = SpringUtil.getBean(MessageSource.class);
		if (messageSource != null) {
			returnResult.setMsg(messageSource.getMessage(code, null, LocaleContextHolder.getLocale()));
		}
		return returnResult;
	}



}
