package com.yp.manager.dao;



import com.yp.common.entity.TbContent;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbContentMapper {


    int insert(TbContent record);

    int insertSelective(TbContent record);


}