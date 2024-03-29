package com.example.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@TableName(value = "Product")
@Data
public class Product implements Serializable {

    /**
     * 商品ID
     */
    @TableId(type = IdType.ASSIGN_ID)
    private Long productId;



    /**
     * 是否删除
     */
    @TableLogic
    private Integer isDelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
