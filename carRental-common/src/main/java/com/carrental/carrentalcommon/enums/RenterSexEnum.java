package com.carrental.carrentalcommon.enums;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.ObjectUtil;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author YANGJUN.LIU
 * @date 2022/3/27 16:33
 * @description
 */
@AllArgsConstructor
@Getter
public enum RenterSexEnum {
	/**
	 *male
	 */
	MALE(1, "amle"),
	/**
	 *female
	 */
	FEMALE(2, "female"),
	/**
	 * unknow
	 */
	UNKNOW(3,"unknow")
	;
	private static final Map<Integer, RenterSexEnum> TYPE_ROUTING_MAP = new HashMap<>(16);

	static {
		RenterSexEnum[] enums = RenterSexEnum.values();
		for (RenterSexEnum anEnum : enums) {
			TYPE_ROUTING_MAP.put(anEnum.getCode(), anEnum);
		}
	}

	private final Integer code;
	private final String desc;

	public static RenterSexEnum getEnumByCode(Integer code) {
		return TYPE_ROUTING_MAP.get(code);
	}

	public static String getDescByCode(Integer code) {
		RenterSexEnum anEnum = TYPE_ROUTING_MAP.get(code);
		if (anEnum == null) {
			return null;
		} else {
			return anEnum.getDesc();
		}
	}

	public static boolean isIllegal(Integer code) {
		return ObjectUtil.isNull(getEnumByCode(code));
	}

	public static List<Map<String, Object>> getEnumList() {
		List<Map<String, Object>> enumList = CollUtil.newArrayList();
		for (Map.Entry<Integer, RenterSexEnum> entry : TYPE_ROUTING_MAP.entrySet()) {
			RenterSexEnum anEnum = entry.getValue();
			Map<String, Object> map = BeanUtil.beanToMap(anEnum);
			enumList.add(map);
		}
		return enumList;
	}

}
