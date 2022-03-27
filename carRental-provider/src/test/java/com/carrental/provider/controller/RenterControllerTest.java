package com.carrental.provider.controller;

import com.carRental.provider.controller.RenterController;
import com.carRental.provider.service.RenterService;
import com.carrental.carrentalcommon.dto.RegisterRenterDTO;
import com.carrental.carrentalcommon.exception.BizException;
import com.carrental.carrentalcommon.vo.ResultVo;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import static org.mockito.Mockito.when;

@SpringBootTest
class RenterControllerTest {

	@Autowired
	private RenterService renterService;

	@Test
	void testInsertNewRenter() {
		// Setup
		final RegisterRenterDTO registerRenterDTO = new RegisterRenterDTO();
		registerRenterDTO.setNickName("nickName");
		registerRenterDTO.setUserName("userName");
		registerRenterDTO.setPassword("password");
		registerRenterDTO.setAge(0);
		registerRenterDTO.setRealname("realname");
		registerRenterDTO.setSex(1);

		// Run the test
		ResultVo resultVo = renterService.registerRenter(registerRenterDTO);
	}

	@Test
	void testInsertExistedRenter() {
		// Setup
		final RegisterRenterDTO registerRenterDTO = new RegisterRenterDTO();
		registerRenterDTO.setNickName("lucas");
		registerRenterDTO.setUserName("lucas001");
		registerRenterDTO.setPassword("qwe123");
		registerRenterDTO.setAge(23);
		registerRenterDTO.setRealname("lucas");
		registerRenterDTO.setSex(1);
		Assert.assertThrows(BizException.class,()->{
			ResultVo resultVo = renterService.registerRenter(registerRenterDTO);
		});


	}
}
