package com.yp.manager.dao;


import com.yp.common.entity.TbItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbItemMapper {
    /**
     * desc: 1.根据 id 查询对象
     * @auther: 袁朋
     * @date: 2019/4/15 3:45 PM
     */
    TbItem getTbItem(Long itemId);
    
    /**
     * desc: 2.获取所有的产品
     * @auther: 袁朋
     * @date: 2019/4/15 3:45 PM
     */
    List<TbItem> getTbItemList();


}