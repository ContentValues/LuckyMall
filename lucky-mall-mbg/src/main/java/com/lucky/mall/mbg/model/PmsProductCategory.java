package com.lucky.mall.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class PmsProductCategory implements Serializable {
    private Long id;

    @ApiModelProperty(value = "上机分类的编号：0表示一级分类")
    private Long parent_id;

    private String name;

    @ApiModelProperty(value = "分类级别：0->1级；1->2级")
    private Integer level;

    private Integer product_count;

    private String product_unit;

    @ApiModelProperty(value = "是否显示在导航栏：0->不显示；1->显示")
    private Integer nav_status;

    @ApiModelProperty(value = "显示状态：0->不显示；1->显示")
    private Integer show_status;

    private Integer sort;

    @ApiModelProperty(value = "图标")
    private String icon;

    private String keywords;

    @ApiModelProperty(value = "描述")
    private String description;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParent_id() {
        return parent_id;
    }

    public void setParent_id(Long parent_id) {
        this.parent_id = parent_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getProduct_count() {
        return product_count;
    }

    public void setProduct_count(Integer product_count) {
        this.product_count = product_count;
    }

    public String getProduct_unit() {
        return product_unit;
    }

    public void setProduct_unit(String product_unit) {
        this.product_unit = product_unit;
    }

    public Integer getNav_status() {
        return nav_status;
    }

    public void setNav_status(Integer nav_status) {
        this.nav_status = nav_status;
    }

    public Integer getShow_status() {
        return show_status;
    }

    public void setShow_status(Integer show_status) {
        this.show_status = show_status;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", parent_id=").append(parent_id);
        sb.append(", name=").append(name);
        sb.append(", level=").append(level);
        sb.append(", product_count=").append(product_count);
        sb.append(", product_unit=").append(product_unit);
        sb.append(", nav_status=").append(nav_status);
        sb.append(", show_status=").append(show_status);
        sb.append(", sort=").append(sort);
        sb.append(", icon=").append(icon);
        sb.append(", keywords=").append(keywords);
        sb.append(", description=").append(description);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}