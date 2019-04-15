package com.yp.manager.dao;


import com.yp.common.entity.TbUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbUserMapper {

    int insert(TbUser record);

    int insertSelective(TbUser record);

}