package com.lucky.mall.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OmsOrderReturnApply implements Serializable {
    private Long id;

    @ApiModelProperty(value = "订单id")
    private Long order_id;

    @ApiModelProperty(value = "收货地址表id")
    private Long company_address_id;

    @ApiModelProperty(value = "退货商品id")
    private Long product_id;

    @ApiModelProperty(value = "订单编号")
    private String order_sn;

    @ApiModelProperty(value = "申请时间")
    private Date create_time;

    @ApiModelProperty(value = "会员用户名")
    private String member_username;

    @ApiModelProperty(value = "退款金额")
    private BigDecimal return_amount;

    @ApiModelProperty(value = "退货人姓名")
    private String return_name;

    @ApiModelProperty(value = "退货人电话")
    private String return_phone;

    @ApiModelProperty(value = "申请状态：0->待处理；1->退货中；2->已完成；3->已拒绝")
    private Integer status;

    @ApiModelProperty(value = "处理时间")
    private Date handle_time;

    @ApiModelProperty(value = "商品图片")
    private String product_pic;

    @ApiModelProperty(value = "商品名称")
    private String product_name;

    @ApiModelProperty(value = "商品品牌")
    private String product_brand;

    @ApiModelProperty(value = "商品销售属性：颜色：红色；尺码：xl;")
    private String product_attr;

    @ApiModelProperty(value = "退货数量")
    private Integer product_count;

    @ApiModelProperty(value = "商品单价")
    private BigDecimal product_price;

    @ApiModelProperty(value = "商品实际支付单价")
    private BigDecimal product_real_price;

    @ApiModelProperty(value = "原因")
    private String reason;

    @ApiModelProperty(value = "描述")
    private String description;

    @ApiModelProperty(value = "凭证图片，以逗号隔开")
    private String proof_pics;

    @ApiModelProperty(value = "处理备注")
    private String handle_note;

    @ApiModelProperty(value = "处理人员")
    private String handle_man;

    @ApiModelProperty(value = "收货人")
    private String receive_man;

    @ApiModelProperty(value = "收货时间")
    private Date receive_time;

    @ApiModelProperty(value = "收货备注")
    private String receive_note;

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

    public Long getCompany_address_id() {
        return company_address_id;
    }

    public void setCompany_address_id(Long company_address_id) {
        this.company_address_id = company_address_id;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
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

    public BigDecimal getReturn_amount() {
        return return_amount;
    }

    public void setReturn_amount(BigDecimal return_amount) {
        this.return_amount = return_amount;
    }

    public String getReturn_name() {
        return return_name;
    }

    public void setReturn_name(String return_name) {
        this.return_name = return_name;
    }

    public String getReturn_phone() {
        return return_phone;
    }

    public void setReturn_phone(String return_phone) {
        this.return_phone = return_phone;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getHandle_time() {
        return handle_time;
    }

    public void setHandle_time(Date handle_time) {
        this.handle_time = handle_time;
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

    public String getProduct_attr() {
        return product_attr;
    }

    public void setProduct_attr(String product_attr) {
        this.product_attr = product_attr;
    }

    public Integer getProduct_count() {
        return product_count;
    }

    public void setProduct_count(Integer product_count) {
        this.product_count = product_count;
    }

    public BigDecimal getProduct_price() {
        return product_price;
    }

    public void setProduct_price(BigDecimal product_price) {
        this.product_price = product_price;
    }

    public BigDecimal getProduct_real_price() {
        return product_real_price;
    }

    public void setProduct_real_price(BigDecimal product_real_price) {
        this.product_real_price = product_real_price;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProof_pics() {
        return proof_pics;
    }

    public void setProof_pics(String proof_pics) {
        this.proof_pics = proof_pics;
    }

    public String getHandle_note() {
        return handle_note;
    }

    public void setHandle_note(String handle_note) {
        this.handle_note = handle_note;
    }

    public String getHandle_man() {
        return handle_man;
    }

    public void setHandle_man(String handle_man) {
        this.handle_man = handle_man;
    }

    public String getReceive_man() {
        return receive_man;
    }

    public void setReceive_man(String receive_man) {
        this.receive_man = receive_man;
    }

    public Date getReceive_time() {
        return receive_time;
    }

    public void setReceive_time(Date receive_time) {
        this.receive_time = receive_time;
    }

    public String getReceive_note() {
        return receive_note;
    }

    public void setReceive_note(String receive_note) {
        this.receive_note = receive_note;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", order_id=").append(order_id);
        sb.append(", company_address_id=").append(company_address_id);
        sb.append(", product_id=").append(product_id);
        sb.append(", order_sn=").append(order_sn);
        sb.append(", create_time=").append(create_time);
        sb.append(", member_username=").append(member_username);
        sb.append(", return_amount=").append(return_amount);
        sb.append(", return_name=").append(return_name);
        sb.append(", return_phone=").append(return_phone);
        sb.append(", status=").append(status);
        sb.append(", handle_time=").append(handle_time);
        sb.append(", product_pic=").append(product_pic);
        sb.append(", product_name=").append(product_name);
        sb.append(", product_brand=").append(product_brand);
        sb.append(", product_attr=").append(product_attr);
        sb.append(", product_count=").append(product_count);
        sb.append(", product_price=").append(product_price);
        sb.append(", product_real_price=").append(product_real_price);
        sb.append(", reason=").append(reason);
        sb.append(", description=").append(description);
        sb.append(", proof_pics=").append(proof_pics);
        sb.append(", handle_note=").append(handle_note);
        sb.append(", handle_man=").append(handle_man);
        sb.append(", receive_man=").append(receive_man);
        sb.append(", receive_time=").append(receive_time);
        sb.append(", receive_note=").append(receive_note);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}