package com.yp.common.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * desc
 *
 * @Author 袁朋
 * @Date 2019/4/2
 */
@Data
public class EasyUITreeNode implements Serializable {
    private static final long serialVersionUID = 5225912380334918705L;
    private long id;
    private String text;
    private String state;
}
