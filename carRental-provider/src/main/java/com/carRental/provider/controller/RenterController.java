package com.carRental.provider.controller;

import com.carRental.provider.service.RenterService;
import com.carrental.carrentalcommon.dto.RegisterRenterDTO;
import com.carrental.carrentalcommon.vo.ResultVo;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YANGJUN.LIU
 * @date 2022/3/26 18:40
 * @description
 */
@Api(value = "/renter", description = "renter相关接口", tags = {"renter"})
@RestController
@RequestMapping(value = "/renter", produces = {"application/json"})

public class RenterController {
	@Autowired
	private RenterService renterService;

	/**
	 * create a renter
	 *
	 * @param registerRenterDTO registerRenter require info
	 * @return common response
	 */
	@PostMapping
	@ApiOperation("Register renter")
	public ResultVo insert(@RequestBody @ApiParam("registerRenterDTO") RegisterRenterDTO registerRenterDTO) {
		return renterService.registerRenter(registerRenterDTO);
	}

}
