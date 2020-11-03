package com.lucky.mall.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class UmsIntegrationConsumeSetting implements Serializable {
    private Long id;

    @ApiModelProperty(value = "每一元需要抵扣的积分数量")
    private Integer deduction_per_amount;

    @ApiModelProperty(value = "每笔订单最高抵用百分比")
    private Integer max_percent_per_order;

    @ApiModelProperty(value = "每次使用积分最小单位100")
    private Integer use_unit;

    @ApiModelProperty(value = "是否可以和优惠券同用；0->不可以；1->可以")
    private Integer coupon_status;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getDeduction_per_amount() {
        return deduction_per_amount;
    }

    public void setDeduction_per_amount(Integer deduction_per_amount) {
        this.deduction_per_amount = deduction_per_amount;
    }

    public Integer getMax_percent_per_order() {
        return max_percent_per_order;
    }

    public void setMax_percent_per_order(Integer max_percent_per_order) {
        this.max_percent_per_order = max_percent_per_order;
    }

    public Integer getUse_unit() {
        return use_unit;
    }

    public void setUse_unit(Integer use_unit) {
        this.use_unit = use_unit;
    }

    public Integer getCoupon_status() {
        return coupon_status;
    }

    public void setCoupon_status(Integer coupon_status) {
        this.coupon_status = coupon_status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", deduction_per_amount=").append(deduction_per_amount);
        sb.append(", max_percent_per_order=").append(max_percent_per_order);
        sb.append(", use_unit=").append(use_unit);
        sb.append(", coupon_status=").append(coupon_status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}