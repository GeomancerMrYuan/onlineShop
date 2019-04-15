package com.yp.manager.dao;


import com.yp.common.entity.TbOrderShipping;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbOrderShippingMapper {

    int insert(TbOrderShipping record);

    int insertSelective(TbOrderShipping record);

}