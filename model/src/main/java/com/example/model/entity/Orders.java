package com.example.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @TableName orders
 */
@TableName(value = "orders")
@Data
public class Orders implements Serializable {
    /**
     *
     */
    @TableId(type = IdType.AUTO)
    private Long orderId;

    /**
     *
     */
    private String orderNum;

    /**
     *
     */
    private Long userId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}