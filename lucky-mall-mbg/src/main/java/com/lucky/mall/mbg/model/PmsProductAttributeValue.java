package com.lucky.mall.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class PmsProductAttributeValue implements Serializable {
    private Long id;

    private Long product_id;

    private Long product_attribute_id;

    @ApiModelProperty(value = "手动添加规格或参数的值，参数单值，规格有多个时以逗号隔开")
    private String value;

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

    public Long getProduct_attribute_id() {
        return product_attribute_id;
    }

    public void setProduct_attribute_id(Long product_attribute_id) {
        this.product_attribute_id = product_attribute_id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", product_id=").append(product_id);
        sb.append(", product_attribute_id=").append(product_attribute_id);
        sb.append(", value=").append(value);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}