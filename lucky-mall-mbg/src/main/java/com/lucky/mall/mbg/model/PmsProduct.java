package com.lucky.mall.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PmsProduct implements Serializable {
    private Long id;

    private Long brand_id;

    private Long product_category_id;

    private Long feight_template_id;

    private Long product_attribute_category_id;

    private String name;

    private String pic;

    @ApiModelProperty(value = "货号")
    private String product_sn;

    @ApiModelProperty(value = "删除状态：0->未删除；1->已删除")
    private Integer delete_status;

    @ApiModelProperty(value = "上架状态：0->下架；1->上架")
    private Integer publish_status;

    @ApiModelProperty(value = "新品状态:0->不是新品；1->新品")
    private Integer new_status;

    @ApiModelProperty(value = "推荐状态；0->不推荐；1->推荐")
    private Integer recommand_status;

    @ApiModelProperty(value = "审核状态：0->未审核；1->审核通过")
    private Integer verify_status;

    @ApiModelProperty(value = "排序")
    private Integer sort;

    @ApiModelProperty(value = "销量")
    private Integer sale;

    private BigDecimal price;

    @ApiModelProperty(value = "促销价格")
    private BigDecimal promotion_price;

    @ApiModelProperty(value = "赠送的成长值")
    private Integer gift_growth;

    @ApiModelProperty(value = "赠送的积分")
    private Integer gift_point;

    @ApiModelProperty(value = "限制使用的积分数")
    private Integer use_point_limit;

    @ApiModelProperty(value = "副标题")
    private String sub_title;

    @ApiModelProperty(value = "市场价")
    private BigDecimal original_price;

    @ApiModelProperty(value = "库存")
    private Integer stock;

    @ApiModelProperty(value = "库存预警值")
    private Integer low_stock;

    @ApiModelProperty(value = "单位")
    private String unit;

    @ApiModelProperty(value = "商品重量，默认为克")
    private BigDecimal weight;

    @ApiModelProperty(value = "是否为预告商品：0->不是；1->是")
    private Integer preview_status;

    @ApiModelProperty(value = "以逗号分割的产品服务：1->无忧退货；2->快速退款；3->免费包邮")
    private String service_ids;

    private String keywords;

    private String note;

    @ApiModelProperty(value = "画册图片，连产品图片限制为5张，以逗号分割")
    private String album_pics;

    private String detail_title;

    @ApiModelProperty(value = "促销开始时间")
    private Date promotion_start_time;

    @ApiModelProperty(value = "促销结束时间")
    private Date promotion_end_time;

    @ApiModelProperty(value = "活动限购数量")
    private Integer promotion_per_limit;

    @ApiModelProperty(value = "促销类型：0->没有促销使用原价;1->使用促销价；2->使用会员价；3->使用阶梯价格；4->使用满减价格；5->限时购")
    private Integer promotion_type;

    @ApiModelProperty(value = "品牌名称")
    private String brand_name;

    @ApiModelProperty(value = "商品分类名称")
    private String product_category_name;

    @ApiModelProperty(value = "商品描述")
    private String description;

    private String detail_desc;

    @ApiModelProperty(value = "产品详情网页内容")
    private String detail_html;

    @ApiModelProperty(value = "移动端网页详情")
    private String detail_mobile_html;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(Long brand_id) {
        this.brand_id = brand_id;
    }

    public Long getProduct_category_id() {
        return product_category_id;
    }

    public void setProduct_category_id(Long product_category_id) {
        this.product_category_id = product_category_id;
    }

    public Long getFeight_template_id() {
        return feight_template_id;
    }

    public void setFeight_template_id(Long feight_template_id) {
        this.feight_template_id = feight_template_id;
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

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getProduct_sn() {
        return product_sn;
    }

    public void setProduct_sn(String product_sn) {
        this.product_sn = product_sn;
    }

    public Integer getDelete_status() {
        return delete_status;
    }

    public void setDelete_status(Integer delete_status) {
        this.delete_status = delete_status;
    }

    public Integer getPublish_status() {
        return publish_status;
    }

    public void setPublish_status(Integer publish_status) {
        this.publish_status = publish_status;
    }

    public Integer getNew_status() {
        return new_status;
    }

    public void setNew_status(Integer new_status) {
        this.new_status = new_status;
    }

    public Integer getRecommand_status() {
        return recommand_status;
    }

    public void setRecommand_status(Integer recommand_status) {
        this.recommand_status = recommand_status;
    }

    public Integer getVerify_status() {
        return verify_status;
    }

    public void setVerify_status(Integer verify_status) {
        this.verify_status = verify_status;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getSale() {
        return sale;
    }

    public void setSale(Integer sale) {
        this.sale = sale;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPromotion_price() {
        return promotion_price;
    }

    public void setPromotion_price(BigDecimal promotion_price) {
        this.promotion_price = promotion_price;
    }

    public Integer getGift_growth() {
        return gift_growth;
    }

    public void setGift_growth(Integer gift_growth) {
        this.gift_growth = gift_growth;
    }

    public Integer getGift_point() {
        return gift_point;
    }

    public void setGift_point(Integer gift_point) {
        this.gift_point = gift_point;
    }

    public Integer getUse_point_limit() {
        return use_point_limit;
    }

    public void setUse_point_limit(Integer use_point_limit) {
        this.use_point_limit = use_point_limit;
    }

    public String getSub_title() {
        return sub_title;
    }

    public void setSub_title(String sub_title) {
        this.sub_title = sub_title;
    }

    public BigDecimal getOriginal_price() {
        return original_price;
    }

    public void setOriginal_price(BigDecimal original_price) {
        this.original_price = original_price;
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

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public Integer getPreview_status() {
        return preview_status;
    }

    public void setPreview_status(Integer preview_status) {
        this.preview_status = preview_status;
    }

    public String getService_ids() {
        return service_ids;
    }

    public void setService_ids(String service_ids) {
        this.service_ids = service_ids;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getAlbum_pics() {
        return album_pics;
    }

    public void setAlbum_pics(String album_pics) {
        this.album_pics = album_pics;
    }

    public String getDetail_title() {
        return detail_title;
    }

    public void setDetail_title(String detail_title) {
        this.detail_title = detail_title;
    }

    public Date getPromotion_start_time() {
        return promotion_start_time;
    }

    public void setPromotion_start_time(Date promotion_start_time) {
        this.promotion_start_time = promotion_start_time;
    }

    public Date getPromotion_end_time() {
        return promotion_end_time;
    }

    public void setPromotion_end_time(Date promotion_end_time) {
        this.promotion_end_time = promotion_end_time;
    }

    public Integer getPromotion_per_limit() {
        return promotion_per_limit;
    }

    public void setPromotion_per_limit(Integer promotion_per_limit) {
        this.promotion_per_limit = promotion_per_limit;
    }

    public Integer getPromotion_type() {
        return promotion_type;
    }

    public void setPromotion_type(Integer promotion_type) {
        this.promotion_type = promotion_type;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public String getProduct_category_name() {
        return product_category_name;
    }

    public void setProduct_category_name(String product_category_name) {
        this.product_category_name = product_category_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetail_desc() {
        return detail_desc;
    }

    public void setDetail_desc(String detail_desc) {
        this.detail_desc = detail_desc;
    }

    public String getDetail_html() {
        return detail_html;
    }

    public void setDetail_html(String detail_html) {
        this.detail_html = detail_html;
    }

    public String getDetail_mobile_html() {
        return detail_mobile_html;
    }

    public void setDetail_mobile_html(String detail_mobile_html) {
        this.detail_mobile_html = detail_mobile_html;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", brand_id=").append(brand_id);
        sb.append(", product_category_id=").append(product_category_id);
        sb.append(", feight_template_id=").append(feight_template_id);
        sb.append(", product_attribute_category_id=").append(product_attribute_category_id);
        sb.append(", name=").append(name);
        sb.append(", pic=").append(pic);
        sb.append(", product_sn=").append(product_sn);
        sb.append(", delete_status=").append(delete_status);
        sb.append(", publish_status=").append(publish_status);
        sb.append(", new_status=").append(new_status);
        sb.append(", recommand_status=").append(recommand_status);
        sb.append(", verify_status=").append(verify_status);
        sb.append(", sort=").append(sort);
        sb.append(", sale=").append(sale);
        sb.append(", price=").append(price);
        sb.append(", promotion_price=").append(promotion_price);
        sb.append(", gift_growth=").append(gift_growth);
        sb.append(", gift_point=").append(gift_point);
        sb.append(", use_point_limit=").append(use_point_limit);
        sb.append(", sub_title=").append(sub_title);
        sb.append(", original_price=").append(original_price);
        sb.append(", stock=").append(stock);
        sb.append(", low_stock=").append(low_stock);
        sb.append(", unit=").append(unit);
        sb.append(", weight=").append(weight);
        sb.append(", preview_status=").append(preview_status);
        sb.append(", service_ids=").append(service_ids);
        sb.append(", keywords=").append(keywords);
        sb.append(", note=").append(note);
        sb.append(", album_pics=").append(album_pics);
        sb.append(", detail_title=").append(detail_title);
        sb.append(", promotion_start_time=").append(promotion_start_time);
        sb.append(", promotion_end_time=").append(promotion_end_time);
        sb.append(", promotion_per_limit=").append(promotion_per_limit);
        sb.append(", promotion_type=").append(promotion_type);
        sb.append(", brand_name=").append(brand_name);
        sb.append(", product_category_name=").append(product_category_name);
        sb.append(", description=").append(description);
        sb.append(", detail_desc=").append(detail_desc);
        sb.append(", detail_html=").append(detail_html);
        sb.append(", detail_mobile_html=").append(detail_mobile_html);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}