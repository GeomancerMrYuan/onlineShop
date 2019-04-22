package com.yp.manager.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yp.common.entity.TbItem;
import com.yp.common.entity.TbItemDesc;
import com.yp.common.service.ItemService;
import com.yp.common.util.IDUtils;
import com.yp.common.vo.E3Result;
import com.yp.common.vo.EasyUIDataGridResult;
import com.yp.manager.dao.TbItemDescMapper;
import com.yp.manager.dao.TbItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

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

    @Autowired
    private TbItemDescMapper tbItemDescMapper;


    @Override
    public TbItem getItemById(Long itemId) {
        TbItem item = itemMapper.getTbItem(itemId);
        return item;
    }

    @Override
    public EasyUIDataGridResult getItemList(Integer page, Integer rows) {
        //设置分页信息
        PageHelper.startPage(page, rows);
        //执行查询所有
        List<TbItem> list = itemMapper.getTbItemList();
        //取分页信息
        PageInfo<TbItem> pageInfo = new PageInfo<>(list);
        //创建返回结果对象
        EasyUIDataGridResult result = new EasyUIDataGridResult();
        result.setTotal((int)pageInfo.getTotal());
        result.setRows(list);
        return result;
    }

    @Override
    public E3Result saveItem(TbItem item, String desc) {
        long itemId=IDUtils.genItemId();
        item.setId(itemId);
        itemMapper.insertTbItem(item);
        TbItemDesc itemDesc = new TbItemDesc();
        itemDesc.setItemId(itemId);
        itemDesc.setItemDesc(desc);
        tbItemDescMapper.insert(itemDesc);
        return E3Result.ok();
    }

    @Override
    public E3Result updateItem(TbItem item, String desc) {
        itemMapper.updateItem(item);
        TbItemDesc tbItemDesc=new TbItemDesc();
        tbItemDesc.setItemId(item.getId());
        tbItemDesc.setItemDesc(desc);
        tbItemDescMapper.update(tbItemDesc);
        return E3Result.ok();
    }
}