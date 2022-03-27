package com.carRental.provider.controller;

import com.carRental.provider.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.Info;
import io.swagger.annotations.SwaggerDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YANGJUN.LIU
 * @date 2022/3/26 18:58
 * @description
 */
@Api(value = "/user", description = "user相关接口", tags = {"user"})
@RestController
@SwaggerDefinition(info = @Info(description = "Carrental API", version = "1.0.0",title = "Carrental API DOC"))

public class UserController {
	@Autowired
	private UserService userService;

//	/**
//	 * 新增user
//	 */
//	@ApiOperation("user 新增")
//	@RequestMapping(value = "/save", method = RequestMethod.POST)
//	public ResultVo<UserDTO> save(@ApiParam(value = "用户信息条件", required = true) @RequestBodyUserDTO user){
//
//	}
}
