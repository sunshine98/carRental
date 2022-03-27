package com.carRental.provider.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.carRental.provider.model.Renter;
import com.carrental.carrentalcommon.dto.RegisterRenterDTO;
import com.carrental.carrentalcommon.vo.ResultVo;

/**
 * @author YANGJUN.LIU
 * @date 2022/3/26 18:39
 * @description
 */
public interface RenterService extends IService<Renter> {

	ResultVo registerRenter(RegisterRenterDTO registerRenterDTO);
}
