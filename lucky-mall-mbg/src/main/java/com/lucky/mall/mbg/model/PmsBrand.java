package com.lucky.mall.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class PmsBrand implements Serializable {
    private Long id;

    private String name;

    @ApiModelProperty(value = "首字母")
    private String first_letter;

    private Integer sort;

    @ApiModelProperty(value = "是否为品牌制造商：0->不是；1->是")
    private Integer factory_status;

    private Integer show_status;

    @ApiModelProperty(value = "产品数量")
    private Integer product_count;

    @ApiModelProperty(value = "产品评论数量")
    private Integer product_comment_count;

    @ApiModelProperty(value = "品牌logo")
    private String logo;

    @ApiModelProperty(value = "专区大图")
    private String big_pic;

    @ApiModelProperty(value = "品牌故事")
    private String brand_story;

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

    public String getFirst_letter() {
        return first_letter;
    }

    public void setFirst_letter(String first_letter) {
        this.first_letter = first_letter;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getFactory_status() {
        return factory_status;
    }

    public void setFactory_status(Integer factory_status) {
        this.factory_status = factory_status;
    }

    public Integer getShow_status() {
        return show_status;
    }

    public void setShow_status(Integer show_status) {
        this.show_status = show_status;
    }

    public Integer getProduct_count() {
        return product_count;
    }

    public void setProduct_count(Integer product_count) {
        this.product_count = product_count;
    }

    public Integer getProduct_comment_count() {
        return product_comment_count;
    }

    public void setProduct_comment_count(Integer product_comment_count) {
        this.product_comment_count = product_comment_count;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getBig_pic() {
        return big_pic;
    }

    public void setBig_pic(String big_pic) {
        this.big_pic = big_pic;
    }

    public String getBrand_story() {
        return brand_story;
    }

    public void setBrand_story(String brand_story) {
        this.brand_story = brand_story;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", first_letter=").append(first_letter);
        sb.append(", sort=").append(sort);
        sb.append(", factory_status=").append(factory_status);
        sb.append(", show_status=").append(show_status);
        sb.append(", product_count=").append(product_count);
        sb.append(", product_comment_count=").append(product_comment_count);
        sb.append(", logo=").append(logo);
        sb.append(", big_pic=").append(big_pic);
        sb.append(", brand_story=").append(brand_story);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}