package com.carRental.provider.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.carRental.provider.mapper.UserMapper;
import com.carRental.provider.model.User;
import com.carRental.provider.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author YANGJUN.LIU
 * @date 2022/3/26 18:58
 * @description
 */
@Slf4j
@Service("userService")
public class UserServiceImpl  extends ServiceImpl<UserMapper, User> implements UserService {
}
