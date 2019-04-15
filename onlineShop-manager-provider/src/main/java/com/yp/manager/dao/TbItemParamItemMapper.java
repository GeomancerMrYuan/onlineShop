package com.yp.manager.dao;


import com.yp.common.entity.TbItemParamItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbItemParamItemMapper {

    int insert(TbItemParamItem record);

    int insertSelective(TbItemParamItem record);

}