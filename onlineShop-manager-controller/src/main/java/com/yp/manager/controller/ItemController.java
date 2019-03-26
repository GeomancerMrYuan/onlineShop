package com.yp.manager.controller;

import com.yp.common.vo.EasyUIDataGridResult;
import com.yp.manager.entity.TbItem;
import com.yp.manager.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * desc
 *
 * @Author 袁朋
 * @Date 2019/3/5
 */
@Controller
public class ItemController {
    @Autowired
    private ItemService itemService;

    @RequestMapping("/item/{itemId}")
    @ResponseBody
    private TbItem getItemById(@PathVariable Long itemId) {
        TbItem tbItem = itemService.getItemById(itemId);
        return tbItem;
    }

    @RequestMapping("/item/list")
    @ResponseBody
    public EasyUIDataGridResult getItemList(Integer page, Integer rows) {
        if(page==null||rows==null){
            page=1;
            rows=10;
        }
        EasyUIDataGridResult dataGridResult = itemService.getItemList(page, rows);
        return dataGridResult;
    }
}