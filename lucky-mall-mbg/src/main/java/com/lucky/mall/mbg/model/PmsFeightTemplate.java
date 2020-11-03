package com.lucky.mall.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class PmsFeightTemplate implements Serializable {
    private Long id;

    private String name;

    @ApiModelProperty(value = "计费类型:0->按重量；1->按件数")
    private Integer charge_type;

    @ApiModelProperty(value = "首重kg")
    private BigDecimal first_weight;

    @ApiModelProperty(value = "首费（元）")
    private BigDecimal first_fee;

    private BigDecimal continue_weight;

    private BigDecimal continme_fee;

    @ApiModelProperty(value = "目的地（省、市）")
    private String dest;

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

    public Integer getCharge_type() {
        return charge_type;
    }

    public void setCharge_type(Integer charge_type) {
        this.charge_type = charge_type;
    }

    public BigDecimal getFirst_weight() {
        return first_weight;
    }

    public void setFirst_weight(BigDecimal first_weight) {
        this.first_weight = first_weight;
    }

    public BigDecimal getFirst_fee() {
        return first_fee;
    }

    public void setFirst_fee(BigDecimal first_fee) {
        this.first_fee = first_fee;
    }

    public BigDecimal getContinue_weight() {
        return continue_weight;
    }

    public void setContinue_weight(BigDecimal continue_weight) {
        this.continue_weight = continue_weight;
    }

    public BigDecimal getContinme_fee() {
        return continme_fee;
    }

    public void setContinme_fee(BigDecimal continme_fee) {
        this.continme_fee = continme_fee;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", charge_type=").append(charge_type);
        sb.append(", first_weight=").append(first_weight);
        sb.append(", first_fee=").append(first_fee);
        sb.append(", continue_weight=").append(continue_weight);
        sb.append(", continme_fee=").append(continme_fee);
        sb.append(", dest=").append(dest);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}