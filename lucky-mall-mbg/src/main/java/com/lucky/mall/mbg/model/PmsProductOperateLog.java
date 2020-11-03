package com.lucky.mall.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PmsProductOperateLog implements Serializable {
    private Long id;

    private Long product_id;

    private BigDecimal price_old;

    private BigDecimal price_new;

    private BigDecimal sale_price_old;

    private BigDecimal sale_price_new;

    @ApiModelProperty(value = "赠送的积分")
    private Integer gift_point_old;

    private Integer gift_point_new;

    private Integer use_point_limit_old;

    private Integer use_point_limit_new;

    @ApiModelProperty(value = "操作人")
    private String operate_man;

    private Date create_time;

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

    public BigDecimal getPrice_old() {
        return price_old;
    }

    public void setPrice_old(BigDecimal price_old) {
        this.price_old = price_old;
    }

    public BigDecimal getPrice_new() {
        return price_new;
    }

    public void setPrice_new(BigDecimal price_new) {
        this.price_new = price_new;
    }

    public BigDecimal getSale_price_old() {
        return sale_price_old;
    }

    public void setSale_price_old(BigDecimal sale_price_old) {
        this.sale_price_old = sale_price_old;
    }

    public BigDecimal getSale_price_new() {
        return sale_price_new;
    }

    public void setSale_price_new(BigDecimal sale_price_new) {
        this.sale_price_new = sale_price_new;
    }

    public Integer getGift_point_old() {
        return gift_point_old;
    }

    public void setGift_point_old(Integer gift_point_old) {
        this.gift_point_old = gift_point_old;
    }

    public Integer getGift_point_new() {
        return gift_point_new;
    }

    public void setGift_point_new(Integer gift_point_new) {
        this.gift_point_new = gift_point_new;
    }

    public Integer getUse_point_limit_old() {
        return use_point_limit_old;
    }

    public void setUse_point_limit_old(Integer use_point_limit_old) {
        this.use_point_limit_old = use_point_limit_old;
    }

    public Integer getUse_point_limit_new() {
        return use_point_limit_new;
    }

    public void setUse_point_limit_new(Integer use_point_limit_new) {
        this.use_point_limit_new = use_point_limit_new;
    }

    public String getOperate_man() {
        return operate_man;
    }

    public void setOperate_man(String operate_man) {
        this.operate_man = operate_man;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", product_id=").append(product_id);
        sb.append(", price_old=").append(price_old);
        sb.append(", price_new=").append(price_new);
        sb.append(", sale_price_old=").append(sale_price_old);
        sb.append(", sale_price_new=").append(sale_price_new);
        sb.append(", gift_point_old=").append(gift_point_old);
        sb.append(", gift_point_new=").append(gift_point_new);
        sb.append(", use_point_limit_old=").append(use_point_limit_old);
        sb.append(", use_point_limit_new=").append(use_point_limit_new);
        sb.append(", operate_man=").append(operate_man);
        sb.append(", create_time=").append(create_time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}