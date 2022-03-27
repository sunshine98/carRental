package com.carRental.provider.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.carRental.provider.mapper.StoreMapper;
import com.carRental.provider.model.Store;
import com.carRental.provider.service.StoreService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author YANGJUN.LIU
 * @date 2022/3/26 18:43
 * @description
 */
@Slf4j
@Service("storeService")
public class StoreServiceImpl extends ServiceImpl<StoreMapper, Store> implements StoreService {
}
