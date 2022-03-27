package com.carRental.provider.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.carRental.provider.mapper.CarMapper;
import com.carRental.provider.model.Car;
import com.carRental.provider.service.CarService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author YANGJUN.LIU
 * @date 2022/3/26 17:45
 * @description
 */
@Slf4j
@Service("carService")
public class CarServiceImpl extends ServiceImpl<CarMapper, Car> implements CarService {
}
