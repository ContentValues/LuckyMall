package com.lucky.mall.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class SmsCouponHistory implements Serializable {
    private Long id;

    private Long coupon_id;

    private Long member_id;

    private String coupon_code;

    @ApiModelProperty(value = "领取人昵称")
    private String member_nickname;

    @ApiModelProperty(value = "获取类型：0->后台赠送；1->主动获取")
    private Integer get_type;

    private Date create_time;

    @ApiModelProperty(value = "使用状态：0->未使用；1->已使用；2->已过期")
    private Integer use_status;

    @ApiModelProperty(value = "使用时间")
    private Date use_time;

    @ApiModelProperty(value = "订单编号")
    private Long order_id;

    @ApiModelProperty(value = "订单号码")
    private String order_sn;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCoupon_id() {
        return coupon_id;
    }

    public void setCoupon_id(Long coupon_id) {
        this.coupon_id = coupon_id;
    }

    public Long getMember_id() {
        return member_id;
    }

    public void setMember_id(Long member_id) {
        this.member_id = member_id;
    }

    public String getCoupon_code() {
        return coupon_code;
    }

    public void setCoupon_code(String coupon_code) {
        this.coupon_code = coupon_code;
    }

    public String getMember_nickname() {
        return member_nickname;
    }

    public void setMember_nickname(String member_nickname) {
        this.member_nickname = member_nickname;
    }

    public Integer getGet_type() {
        return get_type;
    }

    public void setGet_type(Integer get_type) {
        this.get_type = get_type;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Integer getUse_status() {
        return use_status;
    }

    public void setUse_status(Integer use_status) {
        this.use_status = use_status;
    }

    public Date getUse_time() {
        return use_time;
    }

    public void setUse_time(Date use_time) {
        this.use_time = use_time;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", coupon_id=").append(coupon_id);
        sb.append(", member_id=").append(member_id);
        sb.append(", coupon_code=").append(coupon_code);
        sb.append(", member_nickname=").append(member_nickname);
        sb.append(", get_type=").append(get_type);
        sb.append(", create_time=").append(create_time);
        sb.append(", use_status=").append(use_status);
        sb.append(", use_time=").append(use_time);
        sb.append(", order_id=").append(order_id);
        sb.append(", order_sn=").append(order_sn);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}