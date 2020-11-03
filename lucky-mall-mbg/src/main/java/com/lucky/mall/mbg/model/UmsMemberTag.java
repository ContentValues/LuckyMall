package com.lucky.mall.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class UmsMemberTag implements Serializable {
    private Long id;

    private String name;

    @ApiModelProperty(value = "自动打标签完成订单数量")
    private Integer finish_order_count;

    @ApiModelProperty(value = "自动打标签完成订单金额")
    private BigDecimal finish_order_amount;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFinish_order_count() {
        return finish_order_count;
    }

    public void setFinish_order_count(Integer finish_order_count) {
        this.finish_order_count = finish_order_count;
    }

    public BigDecimal getFinish_order_amount() {
        return finish_order_amount;
    }

    public void setFinish_order_amount(BigDecimal finish_order_amount) {
        this.finish_order_amount = finish_order_amount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", finish_order_count=").append(finish_order_count);
        sb.append(", finish_order_amount=").append(finish_order_amount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}