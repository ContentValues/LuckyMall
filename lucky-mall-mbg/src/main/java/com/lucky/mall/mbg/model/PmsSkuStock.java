package com.lucky.mall.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class PmsSkuStock implements Serializable {
    private Long id;

    private Long product_id;

    @ApiModelProperty(value = "sku编码")
    private String sku_code;

    private BigDecimal price;

    @ApiModelProperty(value = "库存")
    private Integer stock;

    @ApiModelProperty(value = "预警库存")
    private Integer low_stock;

    @ApiModelProperty(value = "展示图片")
    private String pic;

    @ApiModelProperty(value = "销量")
    private Integer sale;

    @ApiModelProperty(value = "单品促销价格")
    private BigDecimal promotion_price;

    @ApiModelProperty(value = "锁定库存")
    private Integer lock_stock;

    @ApiModelProperty(value = "商品销售属性，json格式")
    private String sp_data;

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

    public String getSku_code() {
        return sku_code;
    }

    public void setSku_code(String sku_code) {
        this.sku_code = sku_code;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getLow_stock() {
        return low_stock;
    }

    public void setLow_stock(Integer low_stock) {
        this.low_stock = low_stock;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Integer getSale() {
        return sale;
    }

    public void setSale(Integer sale) {
        this.sale = sale;
    }

    public BigDecimal getPromotion_price() {
        return promotion_price;
    }

    public void setPromotion_price(BigDecimal promotion_price) {
        this.promotion_price = promotion_price;
    }

    public Integer getLock_stock() {
        return lock_stock;
    }

    public void setLock_stock(Integer lock_stock) {
        this.lock_stock = lock_stock;
    }

    public String getSp_data() {
        return sp_data;
    }

    public void setSp_data(String sp_data) {
        this.sp_data = sp_data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", product_id=").append(product_id);
        sb.append(", sku_code=").append(sku_code);
        sb.append(", price=").append(price);
        sb.append(", stock=").append(stock);
        sb.append(", low_stock=").append(low_stock);
        sb.append(", pic=").append(pic);
        sb.append(", sale=").append(sale);
        sb.append(", promotion_price=").append(promotion_price);
        sb.append(", lock_stock=").append(lock_stock);
        sb.append(", sp_data=").append(sp_data);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}