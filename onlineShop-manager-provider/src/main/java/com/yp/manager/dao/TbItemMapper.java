package com.yp.manager.dao;


import com.yp.common.entity.TbItem;
import com.yp.common.entity.TbItemExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbItemMapper {

    long countByExample(TbItemExample example);

    int deleteByExample(TbItemExample example);

    int insert(TbItem record);

    int insertSelective(TbItem record);

    List<TbItem> selectByExample(TbItemExample example);

    int updateByExampleSelective(@Param("record") TbItem record, @Param("example") TbItemExample example);

    int updateByExample(@Param("record") TbItem record, @Param("example") TbItemExample example);

    TbItem selectByPrimaryKey(Long id);
}