package com.yp.manager.dao;

import com.yp.manager.dao1.TbContentCategory;
import com.yp.manager.dao1.TbContentCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbContentCategoryMapper {
    long countByExample(TbContentCategoryExample example);

    int deleteByExample(TbContentCategoryExample example);

    int insert(TbContentCategory record);

    int insertSelective(TbContentCategory record);

    List<TbContentCategory> selectByExample(TbContentCategoryExample example);

    int updateByExampleSelective(@Param("record") TbContentCategory record, @Param("example") TbContentCategoryExample example);

    int updateByExample(@Param("record") TbContentCategory record, @Param("example") TbContentCategoryExample example);
}