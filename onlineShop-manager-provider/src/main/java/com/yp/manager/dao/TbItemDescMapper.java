package com.yp.manager.dao;


import com.yp.common.entity.TbItemDesc;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbItemDescMapper {


    int insert(TbItemDesc record);

    int insertSelective(TbItemDesc record);

}