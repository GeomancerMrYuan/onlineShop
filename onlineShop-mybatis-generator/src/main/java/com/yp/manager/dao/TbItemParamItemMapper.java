package com.yp.manager.dao;

import com.yp.manager.dao1.TbItemParamItem;
import com.yp.manager.dao1.TbItemParamItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbItemParamItemMapper {
    long countByExample(TbItemParamItemExample example);

    int deleteByExample(TbItemParamItemExample example);

    int insert(TbItemParamItem record);

    int insertSelective(TbItemParamItem record);

    List<TbItemParamItem> selectByExampleWithBLOBs(TbItemParamItemExample example);

    List<TbItemParamItem> selectByExample(TbItemParamItemExample example);

    int updateByExampleSelective(@Param("record") TbItemParamItem record, @Param("example") TbItemParamItemExample example);

    int updateByExampleWithBLOBs(@Param("record") TbItemParamItem record, @Param("example") TbItemParamItemExample example);

    int updateByExample(@Param("record") TbItemParamItem record, @Param("example") TbItemParamItemExample example);
}