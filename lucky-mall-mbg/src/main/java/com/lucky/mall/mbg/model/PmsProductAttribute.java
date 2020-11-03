package com.lucky.mall.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class PmsProductAttribute implements Serializable {
    private Long id;

    private Long product_attribute_category_id;

    private String name;

    @ApiModelProperty(value = "属性选择类型：0->唯一；1->单选；2->多选")
    private Integer select_type;

    @ApiModelProperty(value = "属性录入方式：0->手工录入；1->从列表中选取")
    private Integer input_type;

    @ApiModelProperty(value = "可选值列表，以逗号隔开")
    private String input_list;

    @ApiModelProperty(value = "排序字段：最高的可以单独上传图片")
    private Integer sort;

    @ApiModelProperty(value = "分类筛选样式：1->普通；1->颜色")
    private Integer filter_type;

    @ApiModelProperty(value = "检索类型；0->不需要进行检索；1->关键字检索；2->范围检索")
    private Integer search_type;

    @ApiModelProperty(value = "相同属性产品是否关联；0->不关联；1->关联")
    private Integer related_status;

    @ApiModelProperty(value = "是否支持手动新增；0->不支持；1->支持")
    private Integer hand_add_status;

    @ApiModelProperty(value = "属性的类型；0->规格；1->参数")
    private Integer type;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProduct_attribute_category_id() {
        return product_attribute_category_id;
    }

    public void setProduct_attribute_category_id(Long product_attribute_category_id) {
        this.product_attribute_category_id = product_attribute_category_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSelect_type() {
        return select_type;
    }

    public void setSelect_type(Integer select_type) {
        this.select_type = select_type;
    }

    public Integer getInput_type() {
        return input_type;
    }

    public void setInput_type(Integer input_type) {
        this.input_type = input_type;
    }

    public String getInput_list() {
        return input_list;
    }

    public void setInput_list(String input_list) {
        this.input_list = input_list;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getFilter_type() {
        return filter_type;
    }

    public void setFilter_type(Integer filter_type) {
        this.filter_type = filter_type;
    }

    public Integer getSearch_type() {
        return search_type;
    }

    public void setSearch_type(Integer search_type) {
        this.search_type = search_type;
    }

    public Integer getRelated_status() {
        return related_status;
    }

    public void setRelated_status(Integer related_status) {
        this.related_status = related_status;
    }

    public Integer getHand_add_status() {
        return hand_add_status;
    }

    public void setHand_add_status(Integer hand_add_status) {
        this.hand_add_status = hand_add_status;
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
        sb.append(", product_attribute_category_id=").append(product_attribute_category_id);
        sb.append(", name=").append(name);
        sb.append(", select_type=").append(select_type);
        sb.append(", input_type=").append(input_type);
        sb.append(", input_list=").append(input_list);
        sb.append(", sort=").append(sort);
        sb.append(", filter_type=").append(filter_type);
        sb.append(", search_type=").append(search_type);
        sb.append(", related_status=").append(related_status);
        sb.append(", hand_add_status=").append(hand_add_status);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}