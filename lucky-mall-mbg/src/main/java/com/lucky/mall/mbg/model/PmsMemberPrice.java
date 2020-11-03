package com.lucky.mall.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class PmsMemberPrice implements Serializable {
    private Long id;

    private Long product_id;

    private Long member_level_id;

    @ApiModelProperty(value = "会员价格")
    private BigDecimal member_price;

    private String member_level_name;

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

    public Long getMember_level_id() {
        return member_level_id;
    }

    public void setMember_level_id(Long member_level_id) {
        this.member_level_id = member_level_id;
    }

    public BigDecimal getMember_price() {
        return member_price;
    }

    public void setMember_price(BigDecimal member_price) {
        this.member_price = member_price;
    }

    public String getMember_level_name() {
        return member_level_name;
    }

    public void setMember_level_name(String member_level_name) {
        this.member_level_name = member_level_name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", product_id=").append(product_id);
        sb.append(", member_level_id=").append(member_level_id);
        sb.append(", member_price=").append(member_price);
        sb.append(", member_level_name=").append(member_level_name);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}