package com.lucky.mall.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class SmsFlashPromotionProductRelation implements Serializable {
    @ApiModelProperty(value = "编号")
    private Long id;

    private Long flash_promotion_id;

    @ApiModelProperty(value = "编号")
    private Long flash_promotion_session_id;

    private Long product_id;

    @ApiModelProperty(value = "限时购价格")
    private BigDecimal flash_promotion_price;

    @ApiModelProperty(value = "限时购数量")
    private Integer flash_promotion_count;

    @ApiModelProperty(value = "每人限购数量")
    private Integer flash_promotion_limit;

    @ApiModelProperty(value = "排序")
    private Integer sort;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFlash_promotion_id() {
        return flash_promotion_id;
    }

    public void setFlash_promotion_id(Long flash_promotion_id) {
        this.flash_promotion_id = flash_promotion_id;
    }

    public Long getFlash_promotion_session_id() {
        return flash_promotion_session_id;
    }

    public void setFlash_promotion_session_id(Long flash_promotion_session_id) {
        this.flash_promotion_session_id = flash_promotion_session_id;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public BigDecimal getFlash_promotion_price() {
        return flash_promotion_price;
    }

    public void setFlash_promotion_price(BigDecimal flash_promotion_price) {
        this.flash_promotion_price = flash_promotion_price;
    }

    public Integer getFlash_promotion_count() {
        return flash_promotion_count;
    }

    public void setFlash_promotion_count(Integer flash_promotion_count) {
        this.flash_promotion_count = flash_promotion_count;
    }

    public Integer getFlash_promotion_limit() {
        return flash_promotion_limit;
    }

    public void setFlash_promotion_limit(Integer flash_promotion_limit) {
        this.flash_promotion_limit = flash_promotion_limit;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", flash_promotion_id=").append(flash_promotion_id);
        sb.append(", flash_promotion_session_id=").append(flash_promotion_session_id);
        sb.append(", product_id=").append(product_id);
        sb.append(", flash_promotion_price=").append(flash_promotion_price);
        sb.append(", flash_promotion_count=").append(flash_promotion_count);
        sb.append(", flash_promotion_limit=").append(flash_promotion_limit);
        sb.append(", sort=").append(sort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}