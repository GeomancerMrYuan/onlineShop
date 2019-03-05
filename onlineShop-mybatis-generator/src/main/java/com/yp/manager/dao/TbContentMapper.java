package com.yp.manager.dao;

import com.yp.manager.dao1.TbContent;
import com.yp.manager.dao1.TbContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbContentMapper {
    long countByExample(TbContentExample example);

    int deleteByExample(TbContentExample example);

    int insert(TbContent record);

    int insertSelective(TbContent record);

    List<TbContent> selectByExampleWithBLOBs(TbContentExample example);

    List<TbContent> selectByExample(TbContentExample example);

    int updateByExampleSelective(@Param("record") TbContent record, @Param("example") TbContentExample example);

    int updateByExampleWithBLOBs(@Param("record") TbContent record, @Param("example") TbContentExample example);

    int updateByExample(@Param("record") TbContent record, @Param("example") TbContentExample example);
}