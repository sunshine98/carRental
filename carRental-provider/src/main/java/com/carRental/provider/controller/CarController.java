package com.carRental.provider.controller;

import com.carRental.provider.service.CarService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YANGJUN.LIU
 * @date 2022/3/26 17:46
 * @description
 */
@Api(value = "/car", description = "car相关接口", tags = {"car"})
@RestController
@RequestMapping(value = "/car", produces = {"application/json"})

public class CarController {
	@Autowired
	private CarService carService;
}
