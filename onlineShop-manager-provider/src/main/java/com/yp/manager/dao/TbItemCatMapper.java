package com.yp.manager.dao;


import com.yp.common.entity.TbItemCat;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbItemCatMapper {
    /**
     * desc: 1.根据 parentId 查询所有对象
     * @auther: 袁朋
     * @date: 2019/4/15 4:05 PM
     */
    List<TbItemCat> getTbItemCatListByParentId(long parentId);
}