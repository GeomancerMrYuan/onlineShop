package com.yp.manager.dao;


import com.yp.common.entity.TbItemParam;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbItemParamMapper {

    int insert(TbItemParam record);

    int insertSelective(TbItemParam record);

}