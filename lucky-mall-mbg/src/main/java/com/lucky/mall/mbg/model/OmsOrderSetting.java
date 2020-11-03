package com.lucky.mall.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class OmsOrderSetting implements Serializable {
    private Long id;

    @ApiModelProperty(value = "秒杀订单超时关闭时间(分)")
    private Integer flash_order_overtime;

    @ApiModelProperty(value = "正常订单超时时间(分)")
    private Integer normal_order_overtime;

    @ApiModelProperty(value = "发货后自动确认收货时间（天）")
    private Integer confirm_overtime;

    @ApiModelProperty(value = "自动完成交易时间，不能申请售后（天）")
    private Integer finish_overtime;

    @ApiModelProperty(value = "订单完成后自动好评时间（天）")
    private Integer comment_overtime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getFlash_order_overtime() {
        return flash_order_overtime;
    }

    public void setFlash_order_overtime(Integer flash_order_overtime) {
        this.flash_order_overtime = flash_order_overtime;
    }

    public Integer getNormal_order_overtime() {
        return normal_order_overtime;
    }

    public void setNormal_order_overtime(Integer normal_order_overtime) {
        this.normal_order_overtime = normal_order_overtime;
    }

    public Integer getConfirm_overtime() {
        return confirm_overtime;
    }

    public void setConfirm_overtime(Integer confirm_overtime) {
        this.confirm_overtime = confirm_overtime;
    }

    public Integer getFinish_overtime() {
        return finish_overtime;
    }

    public void setFinish_overtime(Integer finish_overtime) {
        this.finish_overtime = finish_overtime;
    }

    public Integer getComment_overtime() {
        return comment_overtime;
    }

    public void setComment_overtime(Integer comment_overtime) {
        this.comment_overtime = comment_overtime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", flash_order_overtime=").append(flash_order_overtime);
        sb.append(", normal_order_overtime=").append(normal_order_overtime);
        sb.append(", confirm_overtime=").append(confirm_overtime);
        sb.append(", finish_overtime=").append(finish_overtime);
        sb.append(", comment_overtime=").append(comment_overtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}