package com.carRental.provider.service.impl;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.crypto.SecureUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.carRental.provider.mapper.RenterMapper;
import com.carRental.provider.model.Renter;
import com.carRental.provider.model.User;
import com.carRental.provider.service.RenterService;
import com.carRental.provider.service.UserService;
import com.carrental.carrentalcommon.constant.CarRentalErrorCodeConstant;
import com.carrental.carrentalcommon.constant.CommonConstant;
import com.carrental.carrentalcommon.dto.RegisterRenterDTO;
import com.carrental.carrentalcommon.enums.RenterSexEnum;
import com.carrental.carrentalcommon.enums.UserStatusEnum;
import com.carrental.carrentalcommon.exception.BizException;
import com.carrental.carrentalcommon.vo.ResultVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * @author YANGJUN.LIU
 * @date 2022/3/26 18:40
 * @description
 */
@Slf4j
@Service("renterService")
public class RenterServiceImpl extends ServiceImpl<RenterMapper, Renter> implements RenterService {
	@Autowired
	private UserService userService;



	@Override
	@Transactional(rollbackFor = Exception.class)
	public ResultVo registerRenter(RegisterRenterDTO registerRenterDTO) {
		//check param
		if (registerRenterDTO == null) {
			throw new BizException(CarRentalErrorCodeConstant.INVALID_PARAMETER);
		}
		//do business

		//build user subject
		//Check if the user has already registered
		String userName = registerRenterDTO.getUserName();
		LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>(User.class).eq(User::getUserName, userName);
		User user = userService.getOne(queryWrapper);
		if (ObjectUtil.isNotNull(user)) {
			//user has already registered
			throw new BizException(CarRentalErrorCodeConstant.USER_HAS_ALERADY_REGISTERED);
		}
		User newUser = new User();
		newUser.setUserName(registerRenterDTO.getUserName());
		newUser.setNickName(registerRenterDTO.getNickName());
		//genetate random salt string to append password
		String saltString = RandomUtil.randomString(CommonConstant.RANDOM_SALT_STRING_LENGTH);
		newUser.setSalt(saltString);
		//hash password for secure
		newUser.setPassword(SecureUtil.md5(registerRenterDTO.getPassword() + saltString));
		newUser.setIsEnable(UserStatusEnum.ENABLE.getCode());
		newUser.setIsDelete(CommonConstant.falseFlag);
		newUser.setCreateTime(new Date());
		newUser.setUpdateTime(new Date());
		userService.save(newUser);
		//build renter subject
		Renter renter = new Renter();
		renter.setAge(registerRenterDTO.getAge());
		renter.setRealname(registerRenterDTO.getRealname());
		Integer renterSex = registerRenterDTO.getSex();
		if (RenterSexEnum.isIllegal(renterSex)) {
			throw new BizException(CarRentalErrorCodeConstant.RENTER_SEX_ILLEGAL);
		}
		renter.setSex(renterSex);
		renter.setIsDelete(CommonConstant.falseFlag);
		renter.setUserId(newUser.getId());
		renter.setCreateTime(new Date());
		renter.setUpdateTime(new Date());
		this.save(renter);
		return new ResultVo();
	}
}
