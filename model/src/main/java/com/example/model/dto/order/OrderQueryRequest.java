package com.example.model.dto.order;

import com.example.common.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = true)
public class OrderQueryRequest extends PageRequest implements Serializable {

    private Long orderId;

    private String orderNum;

    private Integer userId;

    private static final long serialVersionUID = 1L;
}
