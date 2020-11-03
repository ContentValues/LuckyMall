package com.lucky.mall.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class PmsComment implements Serializable {
    private Long id;

    private Long product_id;

    private String member_nick_name;

    private String product_name;

    @ApiModelProperty(value = "评价星数：0->5")
    private Integer star;

    @ApiModelProperty(value = "评价的ip")
    private String member_ip;

    private Date create_time;

    private Integer show_status;

    @ApiModelProperty(value = "购买时的商品属性")
    private String product_attribute;

    private Integer collect_couont;

    private Integer read_count;

    @ApiModelProperty(value = "上传图片地址，以逗号隔开")
    private String pics;

    @ApiModelProperty(value = "评论用户头像")
    private String member_icon;

    private Integer replay_count;

    private String content;

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

    public String getMember_nick_name() {
        return member_nick_name;
    }

    public void setMember_nick_name(String member_nick_name) {
        this.member_nick_name = member_nick_name;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    public String getMember_ip() {
        return member_ip;
    }

    public void setMember_ip(String member_ip) {
        this.member_ip = member_ip;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Integer getShow_status() {
        return show_status;
    }

    public void setShow_status(Integer show_status) {
        this.show_status = show_status;
    }

    public String getProduct_attribute() {
        return product_attribute;
    }

    public void setProduct_attribute(String product_attribute) {
        this.product_attribute = product_attribute;
    }

    public Integer getCollect_couont() {
        return collect_couont;
    }

    public void setCollect_couont(Integer collect_couont) {
        this.collect_couont = collect_couont;
    }

    public Integer getRead_count() {
        return read_count;
    }

    public void setRead_count(Integer read_count) {
        this.read_count = read_count;
    }

    public String getPics() {
        return pics;
    }

    public void setPics(String pics) {
        this.pics = pics;
    }

    public String getMember_icon() {
        return member_icon;
    }

    public void setMember_icon(String member_icon) {
        this.member_icon = member_icon;
    }

    public Integer getReplay_count() {
        return replay_count;
    }

    public void setReplay_count(Integer replay_count) {
        this.replay_count = replay_count;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", product_id=").append(product_id);
        sb.append(", member_nick_name=").append(member_nick_name);
        sb.append(", product_name=").append(product_name);
        sb.append(", star=").append(star);
        sb.append(", member_ip=").append(member_ip);
        sb.append(", create_time=").append(create_time);
        sb.append(", show_status=").append(show_status);
        sb.append(", product_attribute=").append(product_attribute);
        sb.append(", collect_couont=").append(collect_couont);
        sb.append(", read_count=").append(read_count);
        sb.append(", pics=").append(pics);
        sb.append(", member_icon=").append(member_icon);
        sb.append(", replay_count=").append(replay_count);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}