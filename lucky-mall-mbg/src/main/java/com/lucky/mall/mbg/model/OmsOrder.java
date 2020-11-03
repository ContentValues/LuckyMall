package com.lucky.mall.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OmsOrder implements Serializable {
    @ApiModelProperty(value = "订单id")
    private Long id;

    private Long member_id;

    private Long coupon_id;

    @ApiModelProperty(value = "订单编号")
    private String order_sn;

    @ApiModelProperty(value = "提交时间")
    private Date create_time;

    @ApiModelProperty(value = "用户帐号")
    private String member_username;

    @ApiModelProperty(value = "订单总金额")
    private BigDecimal total_amount;

    @ApiModelProperty(value = "应付金额（实际支付金额）")
    private BigDecimal pay_amount;

    @ApiModelProperty(value = "运费金额")
    private BigDecimal freight_amount;

    @ApiModelProperty(value = "促销优化金额（促销价、满减、阶梯价）")
    private BigDecimal promotion_amount;

    @ApiModelProperty(value = "积分抵扣金额")
    private BigDecimal integration_amount;

    @ApiModelProperty(value = "优惠券抵扣金额")
    private BigDecimal coupon_amount;

    @ApiModelProperty(value = "管理员后台调整订单使用的折扣金额")
    private BigDecimal discount_amount;

    @ApiModelProperty(value = "支付方式：0->未支付；1->支付宝；2->微信")
    private Integer pay_type;

    @ApiModelProperty(value = "订单来源：0->PC订单；1->app订单")
    private Integer source_type;

    @ApiModelProperty(value = "订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单")
    private Integer status;

    @ApiModelProperty(value = "订单类型：0->正常订单；1->秒杀订单")
    private Integer order_type;

    @ApiModelProperty(value = "物流公司(配送方式)")
    private String delivery_company;

    @ApiModelProperty(value = "物流单号")
    private String delivery_sn;

    @ApiModelProperty(value = "自动确认时间（天）")
    private Integer auto_confirm_day;

    @ApiModelProperty(value = "可以获得的积分")
    private Integer integration;

    @ApiModelProperty(value = "可以活动的成长值")
    private Integer growth;

    @ApiModelProperty(value = "活动信息")
    private String promotion_info;

    @ApiModelProperty(value = "发票类型：0->不开发票；1->电子发票；2->纸质发票")
    private Integer bill_type;

    @ApiModelProperty(value = "发票抬头")
    private String bill_header;

    @ApiModelProperty(value = "发票内容")
    private String bill_content;

    @ApiModelProperty(value = "收票人电话")
    private String bill_receiver_phone;

    @ApiModelProperty(value = "收票人邮箱")
    private String bill_receiver_email;

    @ApiModelProperty(value = "收货人姓名")
    private String receiver_name;

    @ApiModelProperty(value = "收货人电话")
    private String receiver_phone;

    @ApiModelProperty(value = "收货人邮编")
    private String receiver_post_code;

    @ApiModelProperty(value = "省份/直辖市")
    private String receiver_province;

    @ApiModelProperty(value = "城市")
    private String receiver_city;

    @ApiModelProperty(value = "区")
    private String receiver_region;

    @ApiModelProperty(value = "详细地址")
    private String receiver_detail_address;

    @ApiModelProperty(value = "订单备注")
    private String note;

    @ApiModelProperty(value = "确认收货状态：0->未确认；1->已确认")
    private Integer confirm_status;

    @ApiModelProperty(value = "删除状态：0->未删除；1->已删除")
    private Integer delete_status;

    @ApiModelProperty(value = "下单时使用的积分")
    private Integer use_integration;

    @ApiModelProperty(value = "支付时间")
    private Date payment_time;

    @ApiModelProperty(value = "发货时间")
    private Date delivery_time;

    @ApiModelProperty(value = "确认收货时间")
    private Date receive_time;

    @ApiModelProperty(value = "评价时间")
    private Date comment_time;

    @ApiModelProperty(value = "修改时间")
    private Date modify_time;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMember_id() {
        return member_id;
    }

    public void setMember_id(Long member_id) {
        this.member_id = member_id;
    }

    public Long getCoupon_id() {
        return coupon_id;
    }

    public void setCoupon_id(Long coupon_id) {
        this.coupon_id = coupon_id;
    }

    public String getOrder_sn() {
        return order_sn;
    }

    public void setOrder_sn(String order_sn) {
        this.order_sn = order_sn;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getMember_username() {
        return member_username;
    }

    public void setMember_username(String member_username) {
        this.member_username = member_username;
    }

    public BigDecimal getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(BigDecimal total_amount) {
        this.total_amount = total_amount;
    }

    public BigDecimal getPay_amount() {
        return pay_amount;
    }

    public void setPay_amount(BigDecimal pay_amount) {
        this.pay_amount = pay_amount;
    }

    public BigDecimal getFreight_amount() {
        return freight_amount;
    }

    public void setFreight_amount(BigDecimal freight_amount) {
        this.freight_amount = freight_amount;
    }

    public BigDecimal getPromotion_amount() {
        return promotion_amount;
    }

    public void setPromotion_amount(BigDecimal promotion_amount) {
        this.promotion_amount = promotion_amount;
    }

    public BigDecimal getIntegration_amount() {
        return integration_amount;
    }

    public void setIntegration_amount(BigDecimal integration_amount) {
        this.integration_amount = integration_amount;
    }

    public BigDecimal getCoupon_amount() {
        return coupon_amount;
    }

    public void setCoupon_amount(BigDecimal coupon_amount) {
        this.coupon_amount = coupon_amount;
    }

    public BigDecimal getDiscount_amount() {
        return discount_amount;
    }

    public void setDiscount_amount(BigDecimal discount_amount) {
        this.discount_amount = discount_amount;
    }

    public Integer getPay_type() {
        return pay_type;
    }

    public void setPay_type(Integer pay_type) {
        this.pay_type = pay_type;
    }

    public Integer getSource_type() {
        return source_type;
    }

    public void setSource_type(Integer source_type) {
        this.source_type = source_type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getOrder_type() {
        return order_type;
    }

    public void setOrder_type(Integer order_type) {
        this.order_type = order_type;
    }

    public String getDelivery_company() {
        return delivery_company;
    }

    public void setDelivery_company(String delivery_company) {
        this.delivery_company = delivery_company;
    }

    public String getDelivery_sn() {
        return delivery_sn;
    }

    public void setDelivery_sn(String delivery_sn) {
        this.delivery_sn = delivery_sn;
    }

    public Integer getAuto_confirm_day() {
        return auto_confirm_day;
    }

    public void setAuto_confirm_day(Integer auto_confirm_day) {
        this.auto_confirm_day = auto_confirm_day;
    }

    public Integer getIntegration() {
        return integration;
    }

    public void setIntegration(Integer integration) {
        this.integration = integration;
    }

    public Integer getGrowth() {
        return growth;
    }

    public void setGrowth(Integer growth) {
        this.growth = growth;
    }

    public String getPromotion_info() {
        return promotion_info;
    }

    public void setPromotion_info(String promotion_info) {
        this.promotion_info = promotion_info;
    }

    public Integer getBill_type() {
        return bill_type;
    }

    public void setBill_type(Integer bill_type) {
        this.bill_type = bill_type;
    }

    public String getBill_header() {
        return bill_header;
    }

    public void setBill_header(String bill_header) {
        this.bill_header = bill_header;
    }

    public String getBill_content() {
        return bill_content;
    }

    public void setBill_content(String bill_content) {
        this.bill_content = bill_content;
    }

    public String getBill_receiver_phone() {
        return bill_receiver_phone;
    }

    public void setBill_receiver_phone(String bill_receiver_phone) {
        this.bill_receiver_phone = bill_receiver_phone;
    }

    public String getBill_receiver_email() {
        return bill_receiver_email;
    }

    public void setBill_receiver_email(String bill_receiver_email) {
        this.bill_receiver_email = bill_receiver_email;
    }

    public String getReceiver_name() {
        return receiver_name;
    }

    public void setReceiver_name(String receiver_name) {
        this.receiver_name = receiver_name;
    }

    public String getReceiver_phone() {
        return receiver_phone;
    }

    public void setReceiver_phone(String receiver_phone) {
        this.receiver_phone = receiver_phone;
    }

    public String getReceiver_post_code() {
        return receiver_post_code;
    }

    public void setReceiver_post_code(String receiver_post_code) {
        this.receiver_post_code = receiver_post_code;
    }

    public String getReceiver_province() {
        return receiver_province;
    }

    public void setReceiver_province(String receiver_province) {
        this.receiver_province = receiver_province;
    }

    public String getReceiver_city() {
        return receiver_city;
    }

    public void setReceiver_city(String receiver_city) {
        this.receiver_city = receiver_city;
    }

    public String getReceiver_region() {
        return receiver_region;
    }

    public void setReceiver_region(String receiver_region) {
        this.receiver_region = receiver_region;
    }

    public String getReceiver_detail_address() {
        return receiver_detail_address;
    }

    public void setReceiver_detail_address(String receiver_detail_address) {
        this.receiver_detail_address = receiver_detail_address;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getConfirm_status() {
        return confirm_status;
    }

    public void setConfirm_status(Integer confirm_status) {
        this.confirm_status = confirm_status;
    }

    public Integer getDelete_status() {
        return delete_status;
    }

    public void setDelete_status(Integer delete_status) {
        this.delete_status = delete_status;
    }

    public Integer getUse_integration() {
        return use_integration;
    }

    public void setUse_integration(Integer use_integration) {
        this.use_integration = use_integration;
    }

    public Date getPayment_time() {
        return payment_time;
    }

    public void setPayment_time(Date payment_time) {
        this.payment_time = payment_time;
    }

    public Date getDelivery_time() {
        return delivery_time;
    }

    public void setDelivery_time(Date delivery_time) {
        this.delivery_time = delivery_time;
    }

    public Date getReceive_time() {
        return receive_time;
    }

    public void setReceive_time(Date receive_time) {
        this.receive_time = receive_time;
    }

    public Date getComment_time() {
        return comment_time;
    }

    public void setComment_time(Date comment_time) {
        this.comment_time = comment_time;
    }

    public Date getModify_time() {
        return modify_time;
    }

    public void setModify_time(Date modify_time) {
        this.modify_time = modify_time;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", member_id=").append(member_id);
        sb.append(", coupon_id=").append(coupon_id);
        sb.append(", order_sn=").append(order_sn);
        sb.append(", create_time=").append(create_time);
        sb.append(", member_username=").append(member_username);
        sb.append(", total_amount=").append(total_amount);
        sb.append(", pay_amount=").append(pay_amount);
        sb.append(", freight_amount=").append(freight_amount);
        sb.append(", promotion_amount=").append(promotion_amount);
        sb.append(", integration_amount=").append(integration_amount);
        sb.append(", coupon_amount=").append(coupon_amount);
        sb.append(", discount_amount=").append(discount_amount);
        sb.append(", pay_type=").append(pay_type);
        sb.append(", source_type=").append(source_type);
        sb.append(", status=").append(status);
        sb.append(", order_type=").append(order_type);
        sb.append(", delivery_company=").append(delivery_company);
        sb.append(", delivery_sn=").append(delivery_sn);
        sb.append(", auto_confirm_day=").append(auto_confirm_day);
        sb.append(", integration=").append(integration);
        sb.append(", growth=").append(growth);
        sb.append(", promotion_info=").append(promotion_info);
        sb.append(", bill_type=").append(bill_type);
        sb.append(", bill_header=").append(bill_header);
        sb.append(", bill_content=").append(bill_content);
        sb.append(", bill_receiver_phone=").append(bill_receiver_phone);
        sb.append(", bill_receiver_email=").append(bill_receiver_email);
        sb.append(", receiver_name=").append(receiver_name);
        sb.append(", receiver_phone=").append(receiver_phone);
        sb.append(", receiver_post_code=").append(receiver_post_code);
        sb.append(", receiver_province=").append(receiver_province);
        sb.append(", receiver_city=").append(receiver_city);
        sb.append(", receiver_region=").append(receiver_region);
        sb.append(", receiver_detail_address=").append(receiver_detail_address);
        sb.append(", note=").append(note);
        sb.append(", confirm_status=").append(confirm_status);
        sb.append(", delete_status=").append(delete_status);
        sb.append(", use_integration=").append(use_integration);
        sb.append(", payment_time=").append(payment_time);
        sb.append(", delivery_time=").append(delivery_time);
        sb.append(", receive_time=").append(receive_time);
        sb.append(", comment_time=").append(comment_time);
        sb.append(", modify_time=").append(modify_time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}