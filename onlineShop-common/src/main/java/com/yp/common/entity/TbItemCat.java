package com.yp.common.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
/**
 * desc: 商品类目
 * @auther: 袁朋
 * @date: 2019/4/15 4:05 PM
 */
@Data
public class TbItemCat implements Serializable {

    private static final long serialVersionUID = 7823336194627140292L;
    private Long id;//类目ID

    private Long parentId;//父类目ID=0时，代表的是一级的类目

    private String name;//类目名称

    private Integer status;//状态。可选值:1(正常),2(删除)

    private Integer sortOrder;//排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数

    private Boolean isParent;//该类目是否为父类目，1为true，0为false

    private Date created;//创建时间

    private Date updated;//更新时间
}