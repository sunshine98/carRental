package com.carRental.provider.controller;

import com.carRental.provider.service.StoreCarService;
import io.swagger.annotations.Api;
import io.swagger.annotations.Info;
import io.swagger.annotations.SwaggerDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YANGJUN.LIU
 * @date 2022/3/26 19:07
 * @description
 */
@Api(value = "/storecar", description = "store_car相关接口", tags = {"storecar"})
@RestController
@RequestMapping(value = "/storeCar" , produces = {"application/json"})

public class StoreCarController {
	@Autowired
	private StoreCarService storeCarService;
}
