package com.yp.common.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
/**
 * desc: 商品表
 * @auther: 袁朋
 * @date: 2019/4/15 3:48 PM
 */
@Data
public class TbItem implements Serializable{
    private static final long serialVersionUID = 3331609087012064249L;
    private Long id;//商品id，同时也是商品编号

    private String title;//商品标题

    private String sellPoint;//商品卖点

    private Long price;//商品价格，单位为：分

    private Integer num;//库存数量

    private String barcode;//商品条形码

    private String image;//商品图片

    private Long cid;//所属类目，叶子类目

    private Byte status;//商品状态，1-正常，2-下架，3-删除

    private Date created;//创建时间

    private Date updated;//更新时间
}