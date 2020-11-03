package com.lucky.mall.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class OmsOrderItem implements Serializable {
    private Long id;

    @ApiModelProperty(value = "订单id")
    private Long order_id;

    @ApiModelProperty(value = "订单编号")
    private String order_sn;

    private Long product_id;

    private String product_pic;

    private String product_name;

    private String product_brand;

    private String product_sn;

    @ApiModelProperty(value = "销售价格")
    private BigDecimal product_price;

    @ApiModelProperty(value = "购买数量")
    private Integer product_quantity;

    @ApiModelProperty(value = "商品sku编号")
    private Long product_sku_id;

    @ApiModelProperty(value = "商品sku条码")
    private String product_sku_code;

    @ApiModelProperty(value = "商品分类id")
    private Long product_category_id;

    @ApiModelProperty(value = "商品促销名称")
    private String promotion_name;

    @ApiModelProperty(value = "商品促销分解金额")
    private BigDecimal promotion_amount;

    @ApiModelProperty(value = "优惠券优惠分解金额")
    private BigDecimal coupon_amount;

    @ApiModelProperty(value = "积分优惠分解金额")
    private BigDecimal integration_amount;

    @ApiModelProperty(value = "该商品经过优惠后的分解金额")
    private BigDecimal real_amount;

    private Integer gift_integration;

    private Integer gift_growth;

    @ApiModelProperty(value = "商品销售属性:[{'key':'颜色','value':'颜色'},{'key':'容量','value':'4G'}]")
    private String product_attr;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Long order_id) {
        this.order_id = order_id;
    }

    public String getOrder_sn() {
        return order_sn;
    }

    public void setOrder_sn(String order_sn) {
        this.order_sn = order_sn;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
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

    public BigDecimal getProduct_price() {
        return product_price;
    }

    public void setProduct_price(BigDecimal product_price) {
        this.product_price = product_price;
    }

    public Integer getProduct_quantity() {
        return product_quantity;
    }

    public void setProduct_quantity(Integer product_quantity) {
        this.product_quantity = product_quantity;
    }

    public Long getProduct_sku_id() {
        return product_sku_id;
    }

    public void setProduct_sku_id(Long product_sku_id) {
        this.product_sku_id = product_sku_id;
    }

    public String getProduct_sku_code() {
        return product_sku_code;
    }

    public void setProduct_sku_code(String product_sku_code) {
        this.product_sku_code = product_sku_code;
    }

    public Long getProduct_category_id() {
        return product_category_id;
    }

    public void setProduct_category_id(Long product_category_id) {
        this.product_category_id = product_category_id;
    }

    public String getPromotion_name() {
        return promotion_name;
    }

    public void setPromotion_name(String promotion_name) {
        this.promotion_name = promotion_name;
    }

    public BigDecimal getPromotion_amount() {
        return promotion_amount;
    }

    public void setPromotion_amount(BigDecimal promotion_amount) {
        this.promotion_amount = promotion_amount;
    }

    public BigDecimal getCoupon_amount() {
        return coupon_amount;
    }

    public void setCoupon_amount(BigDecimal coupon_amount) {
        this.coupon_amount = coupon_amount;
    }

    public BigDecimal getIntegration_amount() {
        return integration_amount;
    }

    public void setIntegration_amount(BigDecimal integration_amount) {
        this.integration_amount = integration_amount;
    }

    public BigDecimal getReal_amount() {
        return real_amount;
    }

    public void setReal_amount(BigDecimal real_amount) {
        this.real_amount = real_amount;
    }

    public Integer getGift_integration() {
        return gift_integration;
    }

    public void setGift_integration(Integer gift_integration) {
        this.gift_integration = gift_integration;
    }

    public Integer getGift_growth() {
        return gift_growth;
    }

    public void setGift_growth(Integer gift_growth) {
        this.gift_growth = gift_growth;
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
        sb.append(", order_id=").append(order_id);
        sb.append(", order_sn=").append(order_sn);
        sb.append(", product_id=").append(product_id);
        sb.append(", product_pic=").append(product_pic);
        sb.append(", product_name=").append(product_name);
        sb.append(", product_brand=").append(product_brand);
        sb.append(", product_sn=").append(product_sn);
        sb.append(", product_price=").append(product_price);
        sb.append(", product_quantity=").append(product_quantity);
        sb.append(", product_sku_id=").append(product_sku_id);
        sb.append(", product_sku_code=").append(product_sku_code);
        sb.append(", product_category_id=").append(product_category_id);
        sb.append(", promotion_name=").append(promotion_name);
        sb.append(", promotion_amount=").append(promotion_amount);
        sb.append(", coupon_amount=").append(coupon_amount);
        sb.append(", integration_amount=").append(integration_amount);
        sb.append(", real_amount=").append(real_amount);
        sb.append(", gift_integration=").append(gift_integration);
        sb.append(", gift_growth=").append(gift_growth);
        sb.append(", product_attr=").append(product_attr);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}