package com.carRental.provider.controller;

import com.carRental.provider.service.StoreService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YANGJUN.LIU
 * @date 2022/3/26 18:43
 * @description
 */
@Api(value = "/store", description = "store相关接口", tags = {"store"})
@RestController
@RequestMapping(value = "/store" , produces = {"application/json"})

public class StoreController {
	@Autowired
	private StoreService storeService;


}
