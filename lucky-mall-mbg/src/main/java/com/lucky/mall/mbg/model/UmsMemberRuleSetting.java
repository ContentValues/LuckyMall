package com.lucky.mall.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class UmsMemberRuleSetting implements Serializable {
    private Long id;

    @ApiModelProperty(value = "连续签到天数")
    private Integer continue_sign_day;

    @ApiModelProperty(value = "连续签到赠送数量")
    private Integer continue_sign_point;

    @ApiModelProperty(value = "每消费多少元获取1个点")
    private BigDecimal consume_per_point;

    @ApiModelProperty(value = "最低获取点数的订单金额")
    private BigDecimal low_order_amount;

    @ApiModelProperty(value = "每笔订单最高获取点数")
    private Integer max_point_per_order;

    @ApiModelProperty(value = "类型：0->积分规则；1->成长值规则")
    private Integer type;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getContinue_sign_day() {
        return continue_sign_day;
    }

    public void setContinue_sign_day(Integer continue_sign_day) {
        this.continue_sign_day = continue_sign_day;
    }

    public Integer getContinue_sign_point() {
        return continue_sign_point;
    }

    public void setContinue_sign_point(Integer continue_sign_point) {
        this.continue_sign_point = continue_sign_point;
    }

    public BigDecimal getConsume_per_point() {
        return consume_per_point;
    }

    public void setConsume_per_point(BigDecimal consume_per_point) {
        this.consume_per_point = consume_per_point;
    }

    public BigDecimal getLow_order_amount() {
        return low_order_amount;
    }

    public void setLow_order_amount(BigDecimal low_order_amount) {
        this.low_order_amount = low_order_amount;
    }

    public Integer getMax_point_per_order() {
        return max_point_per_order;
    }

    public void setMax_point_per_order(Integer max_point_per_order) {
        this.max_point_per_order = max_point_per_order;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", continue_sign_day=").append(continue_sign_day);
        sb.append(", continue_sign_point=").append(continue_sign_point);
        sb.append(", consume_per_point=").append(consume_per_point);
        sb.append(", low_order_amount=").append(low_order_amount);
        sb.append(", max_point_per_order=").append(max_point_per_order);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}