package com.yp.manager.service.impl;

import com.yp.manager.dao.TbItemMapper;
import com.yp.manager.entity.TbItem;
import com.yp.manager.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * desc
 *
 * @Author 袁朋
 * @Date 2019/3/5
 */
@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private TbItemMapper itemMapper;


    @Override
    public TbItem getItemById(Long itemId) {
        TbItem item = itemMapper.selectByPrimaryKey(itemId);
        return item;
    }
}