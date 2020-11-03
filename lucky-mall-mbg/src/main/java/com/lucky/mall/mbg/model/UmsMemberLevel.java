package com.lucky.mall.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class UmsMemberLevel implements Serializable {
    private Long id;

    private String name;

    private Integer growth_point;

    @ApiModelProperty(value = "是否为默认等级：0->不是；1->是")
    private Integer default_status;

    @ApiModelProperty(value = "免运费标准")
    private BigDecimal free_freight_point;

    @ApiModelProperty(value = "每次评价获取的成长值")
    private Integer comment_growth_point;

    @ApiModelProperty(value = "是否有免邮特权")
    private Integer priviledge_free_freight;

    @ApiModelProperty(value = "是否有签到特权")
    private Integer priviledge_sign_in;

    @ApiModelProperty(value = "是否有评论获奖励特权")
    private Integer priviledge_comment;

    @ApiModelProperty(value = "是否有专享活动特权")
    private Integer priviledge_promotion;

    @ApiModelProperty(value = "是否有会员价格特权")
    private Integer priviledge_member_price;

    @ApiModelProperty(value = "是否有生日特权")
    private Integer priviledge_birthday;

    private String note;

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

    public Integer getGrowth_point() {
        return growth_point;
    }

    public void setGrowth_point(Integer growth_point) {
        this.growth_point = growth_point;
    }

    public Integer getDefault_status() {
        return default_status;
    }

    public void setDefault_status(Integer default_status) {
        this.default_status = default_status;
    }

    public BigDecimal getFree_freight_point() {
        return free_freight_point;
    }

    public void setFree_freight_point(BigDecimal free_freight_point) {
        this.free_freight_point = free_freight_point;
    }

    public Integer getComment_growth_point() {
        return comment_growth_point;
    }

    public void setComment_growth_point(Integer comment_growth_point) {
        this.comment_growth_point = comment_growth_point;
    }

    public Integer getPriviledge_free_freight() {
        return priviledge_free_freight;
    }

    public void setPriviledge_free_freight(Integer priviledge_free_freight) {
        this.priviledge_free_freight = priviledge_free_freight;
    }

    public Integer getPriviledge_sign_in() {
        return priviledge_sign_in;
    }

    public void setPriviledge_sign_in(Integer priviledge_sign_in) {
        this.priviledge_sign_in = priviledge_sign_in;
    }

    public Integer getPriviledge_comment() {
        return priviledge_comment;
    }

    public void setPriviledge_comment(Integer priviledge_comment) {
        this.priviledge_comment = priviledge_comment;
    }

    public Integer getPriviledge_promotion() {
        return priviledge_promotion;
    }

    public void setPriviledge_promotion(Integer priviledge_promotion) {
        this.priviledge_promotion = priviledge_promotion;
    }

    public Integer getPriviledge_member_price() {
        return priviledge_member_price;
    }

    public void setPriviledge_member_price(Integer priviledge_member_price) {
        this.priviledge_member_price = priviledge_member_price;
    }

    public Integer getPriviledge_birthday() {
        return priviledge_birthday;
    }

    public void setPriviledge_birthday(Integer priviledge_birthday) {
        this.priviledge_birthday = priviledge_birthday;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", growth_point=").append(growth_point);
        sb.append(", default_status=").append(default_status);
        sb.append(", free_freight_point=").append(free_freight_point);
        sb.append(", comment_growth_point=").append(comment_growth_point);
        sb.append(", priviledge_free_freight=").append(priviledge_free_freight);
        sb.append(", priviledge_sign_in=").append(priviledge_sign_in);
        sb.append(", priviledge_comment=").append(priviledge_comment);
        sb.append(", priviledge_promotion=").append(priviledge_promotion);
        sb.append(", priviledge_member_price=").append(priviledge_member_price);
        sb.append(", priviledge_birthday=").append(priviledge_birthday);
        sb.append(", note=").append(note);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}