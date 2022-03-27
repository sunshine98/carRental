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
 * @date 2022/3/27 16:29
 * @description user status enum
 */
@AllArgsConstructor
@Getter
public enum UserStatusEnum {
	/**
	 *enable
	 */
	ENABLE(1, "enable"),
	/**
	 *disable
	 */
	DISABLE(0, "disable");
	private static final Map<Integer, UserStatusEnum> TYPE_ROUTING_MAP = new HashMap<>(16);

	static {
		UserStatusEnum[] enums = UserStatusEnum.values();
		for (UserStatusEnum anEnum : enums) {
			TYPE_ROUTING_MAP.put(anEnum.getCode(), anEnum);
		}
	}

	private final Integer code;
	private final String desc;

	public static UserStatusEnum getEnumByCode(Integer code) {
		return TYPE_ROUTING_MAP.get(code);
	}

	public static String getDescByCode(Integer code) {
		UserStatusEnum anEnum = TYPE_ROUTING_MAP.get(code);
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
		for (Map.Entry<Integer, UserStatusEnum> entry : TYPE_ROUTING_MAP.entrySet()) {
			UserStatusEnum anEnum = entry.getValue();
			Map<String, Object> map = BeanUtil.beanToMap(anEnum);
			enumList.add(map);
		}
		return enumList;
	}

}
