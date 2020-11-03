package com.lucky.mall.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class SmsCouponProductCategoryRelation implements Serializable {
    private Long id;

    private Long coupon_id;

    private Long product_category_id;

    @ApiModelProperty(value = "产品分类名称")
    private String product_category_name;

    @ApiModelProperty(value = "父分类名称")
    private String parent_category_name;

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

    public Long getProduct_category_id() {
        return product_category_id;
    }

    public void setProduct_category_id(Long product_category_id) {
        this.product_category_id = product_category_id;
    }

    public String getProduct_category_name() {
        return product_category_name;
    }

    public void setProduct_category_name(String product_category_name) {
        this.product_category_name = product_category_name;
    }

    public String getParent_category_name() {
        return parent_category_name;
    }

    public void setParent_category_name(String parent_category_name) {
        this.parent_category_name = parent_category_name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", coupon_id=").append(coupon_id);
        sb.append(", product_category_id=").append(product_category_id);
        sb.append(", product_category_name=").append(product_category_name);
        sb.append(", parent_category_name=").append(parent_category_name);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}