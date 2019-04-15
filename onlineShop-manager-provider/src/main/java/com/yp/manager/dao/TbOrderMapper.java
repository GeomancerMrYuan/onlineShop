package com.yp.manager.dao;


import com.yp.common.entity.TbOrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbOrderMapper {

    int insert(TbOrder record);

    int insertSelective(TbOrder record);

}