package com.example.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @TableName orders
 */
@TableName(value = "Orders")
@Data
public class Orders implements Serializable {
    /**
     * 订单ID
     */
    @TableId(type = IdType.AUTO)
    private Long orderId;

    /**
     * 订单号
     */
    private String orderNum;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 订单状态
     */
    private Integer orderStatus;

    /**
     * 订单金额
     */
    private double orderAmount;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}