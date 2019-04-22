package com.yp.manager.controller;

import com.yp.common.service.ItemCatService;
import com.yp.common.vo.EasyUITreeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 商品类目
 */
@Controller
public class ItemCatController {
    @Autowired
    private ItemCatService itemCatService;

    /**
     * 获取商品类别列表
     * @param parentId
     * @return
     */
    @RequestMapping("/item/cat/list")
    @ResponseBody
    public List<EasyUITreeNode> getItemCatList(@RequestParam(value = "id",defaultValue = "0")Long parentId){
        List<EasyUITreeNode> result = itemCatService.getCatList(parentId);
        return result;
    }


}
