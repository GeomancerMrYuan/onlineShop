package com.yp.manager.entity;

import java.io.Serializable;
import java.util.Date;

public class TbItem implements Serializable {
    private Long id;

    private String title;

    private String sellPoint;

    private Long price;

    private Integer num;

    private String barcode;

    private String image;

    private Long cid;

    private Byte status;

    private Date created;

    private Date updated;

}