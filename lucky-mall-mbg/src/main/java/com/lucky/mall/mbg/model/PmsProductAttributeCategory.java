package com.lucky.mall.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class PmsProductAttributeCategory implements Serializable {
    private Long id;

    private String name;

    @ApiModelProperty(value = "属性数量")
    private Integer attribute_count;

    @ApiModelProperty(value = "参数数量")
    private Integer param_count;

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

    public Integer getAttribute_count() {
        return attribute_count;
    }

    public void setAttribute_count(Integer attribute_count) {
        this.attribute_count = attribute_count;
    }

    public Integer getParam_count() {
        return param_count;
    }

    public void setParam_count(Integer param_count) {
        this.param_count = param_count;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", attribute_count=").append(attribute_count);
        sb.append(", param_count=").append(param_count);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}