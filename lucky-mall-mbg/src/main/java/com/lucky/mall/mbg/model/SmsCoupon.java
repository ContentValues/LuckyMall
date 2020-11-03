package com.lucky.mall.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SmsCoupon implements Serializable {
    private Long id;

    @ApiModelProperty(value = "优惠卷类型；0->全场赠券；1->会员赠券；2->购物赠券；3->注册赠券")
    private Integer type;

    private String name;

    @ApiModelProperty(value = "使用平台：0->全部；1->移动；2->PC")
    private Integer platform;

    @ApiModelProperty(value = "数量")
    private Integer count;

    @ApiModelProperty(value = "金额")
    private BigDecimal amount;

    @ApiModelProperty(value = "每人限领张数")
    private Integer per_limit;

    @ApiModelProperty(value = "使用门槛；0表示无门槛")
    private BigDecimal min_point;

    private Date start_time;

    private Date end_time;

    @ApiModelProperty(value = "使用类型：0->全场通用；1->指定分类；2->指定商品")
    private Integer use_type;

    @ApiModelProperty(value = "备注")
    private String note;

    @ApiModelProperty(value = "发行数量")
    private Integer publish_count;

    @ApiModelProperty(value = "已使用数量")
    private Integer use_count;

    @ApiModelProperty(value = "领取数量")
    private Integer receive_count;

    @ApiModelProperty(value = "可以领取的日期")
    private Date enable_time;

    @ApiModelProperty(value = "优惠码")
    private String code;

    @ApiModelProperty(value = "可领取的会员类型：0->无限时")
    private Integer member_level;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPlatform() {
        return platform;
    }

    public void setPlatform(Integer platform) {
        this.platform = platform;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getPer_limit() {
        return per_limit;
    }

    public void setPer_limit(Integer per_limit) {
        this.per_limit = per_limit;
    }

    public BigDecimal getMin_point() {
        return min_point;
    }

    public void setMin_point(BigDecimal min_point) {
        this.min_point = min_point;
    }

    public Date getStart_time() {
        return start_time;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    public Integer getUse_type() {
        return use_type;
    }

    public void setUse_type(Integer use_type) {
        this.use_type = use_type;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getPublish_count() {
        return publish_count;
    }

    public void setPublish_count(Integer publish_count) {
        this.publish_count = publish_count;
    }

    public Integer getUse_count() {
        return use_count;
    }

    public void setUse_count(Integer use_count) {
        this.use_count = use_count;
    }

    public Integer getReceive_count() {
        return receive_count;
    }

    public void setReceive_count(Integer receive_count) {
        this.receive_count = receive_count;
    }

    public Date getEnable_time() {
        return enable_time;
    }

    public void setEnable_time(Date enable_time) {
        this.enable_time = enable_time;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getMember_level() {
        return member_level;
    }

    public void setMember_level(Integer member_level) {
        this.member_level = member_level;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", type=").append(type);
        sb.append(", name=").append(name);
        sb.append(", platform=").append(platform);
        sb.append(", count=").append(count);
        sb.append(", amount=").append(amount);
        sb.append(", per_limit=").append(per_limit);
        sb.append(", min_point=").append(min_point);
        sb.append(", start_time=").append(start_time);
        sb.append(", end_time=").append(end_time);
        sb.append(", use_type=").append(use_type);
        sb.append(", note=").append(note);
        sb.append(", publish_count=").append(publish_count);
        sb.append(", use_count=").append(use_count);
        sb.append(", receive_count=").append(receive_count);
        sb.append(", enable_time=").append(enable_time);
        sb.append(", code=").append(code);
        sb.append(", member_level=").append(member_level);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}