package com.yp.manager.dao;

import com.yp.manager.dao1.TbUser;
import com.yp.manager.dao1.TbUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbUserMapper {
    long countByExample(TbUserExample example);

    int deleteByExample(TbUserExample example);

    int insert(TbUser record);

    int insertSelective(TbUser record);

    List<TbUser> selectByExample(TbUserExample example);

    int updateByExampleSelective(@Param("record") TbUser record, @Param("example") TbUserExample example);

    int updateByExample(@Param("record") TbUser record, @Param("example") TbUserExample example);
}