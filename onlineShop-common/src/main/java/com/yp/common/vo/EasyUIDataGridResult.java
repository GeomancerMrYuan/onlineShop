package com.yp.common.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * desc
 *
 * @Author 袁朋
 * @Date 2019/3/12
 */
@Data
public class EasyUIDataGridResult implements Serializable {

    private Integer total;
    private List<?> rows;
}
