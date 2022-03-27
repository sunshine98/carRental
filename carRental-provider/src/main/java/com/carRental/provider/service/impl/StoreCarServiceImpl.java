package com.carRental.provider.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.carRental.provider.mapper.StoreCarMapper;
import com.carRental.provider.model.StoreCar;
import com.carRental.provider.service.StoreCarService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author YANGJUN.LIU
 * @date 2022/3/26 19:06
 * @description
 */
@Slf4j
@Service("storeCarService")
public class StoreCarServiceImpl extends ServiceImpl<StoreCarMapper, StoreCar> implements StoreCarService {
}
