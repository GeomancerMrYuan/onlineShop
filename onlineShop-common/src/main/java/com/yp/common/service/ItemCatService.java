package com.yp.common.service;

import com.yp.common.vo.EasyUITreeNode;

import java.util.List;

/**
 * desc
 *
 * @Author 袁朋
 * @Date 2019/4/2
 */
public interface ItemCatService {
    List<EasyUITreeNode> getCatList(long parentId);
}
