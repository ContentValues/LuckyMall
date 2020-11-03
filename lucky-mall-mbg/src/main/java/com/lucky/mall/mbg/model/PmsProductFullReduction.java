package com.lucky.mall.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class PmsProductFullReduction implements Serializable {
    private Long id;

    private Long product_id;

    private BigDecimal full_price;

    private BigDecimal reduce_price;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public BigDecimal getFull_price() {
        return full_price;
    }

    public void setFull_price(BigDecimal full_price) {
        this.full_price = full_price;
    }

    public BigDecimal getReduce_price() {
        return reduce_price;
    }

    public void setReduce_price(BigDecimal reduce_price) {
        this.reduce_price = reduce_price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", product_id=").append(product_id);
        sb.append(", full_price=").append(full_price);
        sb.append(", reduce_price=").append(reduce_price);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}