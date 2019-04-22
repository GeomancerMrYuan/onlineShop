package com.yp.common.service;

import com.yp.common.entity.TbItem;
import com.yp.common.vo.E3Result;
import com.yp.common.vo.EasyUIDataGridResult;

/**
 * desc
 *
 * @Author 袁朋
 * @Date 2019/3/5
 */
public interface ItemService {

    TbItem getItemById(Long itemId);

    EasyUIDataGridResult getItemList(Integer page, Integer rows);

    E3Result saveItem(TbItem item, String desc);

    E3Result updateItem(TbItem item, String desc);
}
