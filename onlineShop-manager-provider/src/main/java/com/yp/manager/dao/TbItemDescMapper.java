package com.yp.manager.dao;


import com.yp.common.entity.TbItemDesc;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbItemDescMapper {

    /**
     * 1.新增商品详情
     * @param record
     * @return
     */
    int insert(TbItemDesc record);

    /**
     * 2.更新商品详情
     * @param tbItemDesc
     */
    void update(TbItemDesc tbItemDesc);
}