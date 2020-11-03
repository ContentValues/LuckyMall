package com.lucky.mall.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class SmsCouponProductRelation implements Serializable {
    private Long id;

    private Long coupon_id;

    private Long product_id;

    @ApiModelProperty(value = "商品名称")
    private String product_name;

    @ApiModelProperty(value = "商品编码")
    private String product_sn;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCoupon_id() {
        return coupon_id;
    }

    public void setCoupon_id(Long coupon_id) {
        this.coupon_id = coupon_id;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_sn() {
        return product_sn;
    }

    public void setProduct_sn(String product_sn) {
        this.product_sn = product_sn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", coupon_id=").append(coupon_id);
        sb.append(", product_id=").append(product_id);
        sb.append(", product_name=").append(product_name);
        sb.append(", product_sn=").append(product_sn);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}