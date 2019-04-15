package com.yp.manager.dao;



import com.yp.common.entity.TbContentCategory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbContentCategoryMapper {
    int insert(TbContentCategory record);

    int insertSelective(TbContentCategory record);


}