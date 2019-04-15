package com.yp.manager.dao;


import com.yp.common.entity.TbOrderItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbOrderItemMapper {

    int insert(TbOrderItem record);

    int insertSelective(TbOrderItem record);

}