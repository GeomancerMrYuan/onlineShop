package com.yp.manager.service.impl;

import com.yp.common.entity.TbItemCat;
import com.yp.common.service.ItemCatService;
import com.yp.common.vo.EasyUITreeNode;
import com.yp.manager.dao.TbItemCatMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * desc
 *
 * @Author 袁朋
 * @Date 2019/4/2
 */
@Service
public class ItemCatServiceImpl implements ItemCatService {
    @Autowired
    private TbItemCatMapper tbItemCatMapper;

    @Override
    public List<EasyUITreeNode> getCatList(long parentId) {
        // 1、根据 parentId 查询节点列表

        List<TbItemCat> list = tbItemCatMapper.getTbItemCatListByParentId(parentId);
        // 2、转换成 EasyUITreeNode 列表。
        List<EasyUITreeNode> resultList = new ArrayList<>();
        for (TbItemCat tbItemCat : list) {
            EasyUITreeNode node = new EasyUITreeNode();
            node.setId(tbItemCat.getId());
            node.setText(tbItemCat.getName());
            node.setState(tbItemCat.getIsParent() ? "closed" : "open"); //添加到列表
            resultList.add(node);
        }
        // 3、返回。
        return resultList;
    }
}
