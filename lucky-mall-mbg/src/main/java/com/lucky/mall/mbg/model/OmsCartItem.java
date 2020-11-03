package com.lucky.mall.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OmsCartItem implements Serializable {
    private Long id;

    private Long product_id;

    private Long product_sku_id;

    private Long member_id;

    @ApiModelProperty(value = "购买数量")
    private Integer quantity;

    @ApiModelProperty(value = "添加到购物车的价格")
    private BigDecimal price;

    @ApiModelProperty(value = "商品主图")
    private String product_pic;

    @ApiModelProperty(value = "商品名称")
    private String product_name;

    @ApiModelProperty(value = "商品副标题（卖点）")
    private String product_sub_title;

    @ApiModelProperty(value = "商品sku条码")
    private String product_sku_code;

    @ApiModelProperty(value = "会员昵称")
    private String member_nickname;

    @ApiModelProperty(value = "创建时间")
    private Date create_date;

    @ApiModelProperty(value = "修改时间")
    private Date modify_date;

    @ApiModelProperty(value = "是否删除")
    private Integer delete_status;

    @ApiModelProperty(value = "商品分类")
    private Long product_category_id;

    private String product_brand;

    private String product_sn;

    @ApiModelProperty(value = "商品销售属性:[{'key':'颜色','value':'颜色'},{'key':'容量','value':'4G'}]")
    private String product_attr;

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

    public Long getProduct_sku_id() {
        return product_sku_id;
    }

    public void setProduct_sku_id(Long product_sku_id) {
        this.product_sku_id = product_sku_id;
    }

    public Long getMember_id() {
        return member_id;
    }

    public void setMember_id(Long member_id) {
        this.member_id = member_id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getProduct_pic() {
        return product_pic;
    }

    public void setProduct_pic(String product_pic) {
        this.product_pic = product_pic;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_sub_title() {
        return product_sub_title;
    }

    public void setProduct_sub_title(String product_sub_title) {
        this.product_sub_title = product_sub_title;
    }

    public String getProduct_sku_code() {
        return product_sku_code;
    }

    public void setProduct_sku_code(String product_sku_code) {
        this.product_sku_code = product_sku_code;
    }

    public String getMember_nickname() {
        return member_nickname;
    }

    public void setMember_nickname(String member_nickname) {
        this.member_nickname = member_nickname;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public Date getModify_date() {
        return modify_date;
    }

    public void setModify_date(Date modify_date) {
        this.modify_date = modify_date;
    }

    public Integer getDelete_status() {
        return delete_status;
    }

    public void setDelete_status(Integer delete_status) {
        this.delete_status = delete_status;
    }

    public Long getProduct_category_id() {
        return product_category_id;
    }

    public void setProduct_category_id(Long product_category_id) {
        this.product_category_id = product_category_id;
    }

    public String getProduct_brand() {
        return product_brand;
    }

    public void setProduct_brand(String product_brand) {
        this.product_brand = product_brand;
    }

    public String getProduct_sn() {
        return product_sn;
    }

    public void setProduct_sn(String product_sn) {
        this.product_sn = product_sn;
    }

    public String getProduct_attr() {
        return product_attr;
    }

    public void setProduct_attr(String product_attr) {
        this.product_attr = product_attr;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", product_id=").append(product_id);
        sb.append(", product_sku_id=").append(product_sku_id);
        sb.append(", member_id=").append(member_id);
        sb.append(", quantity=").append(quantity);
        sb.append(", price=").append(price);
        sb.append(", product_pic=").append(product_pic);
        sb.append(", product_name=").append(product_name);
        sb.append(", product_sub_title=").append(product_sub_title);
        sb.append(", product_sku_code=").append(product_sku_code);
        sb.append(", member_nickname=").append(member_nickname);
        sb.append(", create_date=").append(create_date);
        sb.append(", modify_date=").append(modify_date);
        sb.append(", delete_status=").append(delete_status);
        sb.append(", product_category_id=").append(product_category_id);
        sb.append(", product_brand=").append(product_brand);
        sb.append(", product_sn=").append(product_sn);
        sb.append(", product_attr=").append(product_attr);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}