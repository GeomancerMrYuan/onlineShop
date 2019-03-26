package com.yp.manager.service;

import com.yp.common.vo.EasyUIDataGridResult;
import com.yp.manager.entity.TbItem;

/**
 * desc
 *
 * @Author 袁朋
 * @Date 2019/3/5
 */
public interface ItemService {

    TbItem getItemById(Long itemId);

    EasyUIDataGridResult getItemList(Integer page, Integer rows);
}
