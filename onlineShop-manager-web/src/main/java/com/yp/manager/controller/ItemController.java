package com.yp.manager.controller;

import com.yp.common.entity.TbItem;
import com.yp.common.service.ItemService;
import com.yp.common.vo.E3Result;
import com.yp.common.vo.EasyUIDataGridResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ItemController {
    @Autowired
    private ItemService itemService;

    /**
     * 获取商品列表分页
     *
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping("/item/list")
    @ResponseBody
    public EasyUIDataGridResult getItemList(Integer page, Integer rows) {
        EasyUIDataGridResult result = itemService.getItemList(page, rows);
        return result;
    }

    /**
     * 新增商品
     * @param item
     * @param desc
     * @return
     */
    @RequestMapping("/item/save")
    public E3Result saveItem(TbItem item, String desc) {
        E3Result result=itemService.saveItem(item,desc);
        return result;
    }

    /**
     * 修改商品
     * @param item
     * @param desc
     * @return
     */
    @RequestMapping("/item/update")
    public E3Result updateItem(TbItem item,String desc){
        E3Result result=itemService.updateItem(item,desc);
        return result;
    }

}
