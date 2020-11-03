package com.lucky.mall.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class UmsMemberReceiveAddress implements Serializable {
    private Long id;

    private Long member_id;

    @ApiModelProperty(value = "收货人名称")
    private String name;

    private String phone_number;

    @ApiModelProperty(value = "是否为默认")
    private Integer default_status;

    @ApiModelProperty(value = "邮政编码")
    private String post_code;

    @ApiModelProperty(value = "省份/直辖市")
    private String province;

    @ApiModelProperty(value = "城市")
    private String city;

    @ApiModelProperty(value = "区")
    private String region;

    @ApiModelProperty(value = "详细地址(街道)")
    private String detail_address;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public Integer getDefault_status() {
        return default_status;
    }

    public void setDefault_status(Integer default_status) {
        this.default_status = default_status;
    }

    public String getPost_code() {
        return post_code;
    }

    public void setPost_code(String post_code) {
        this.post_code = post_code;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDetail_address() {
        return detail_address;
    }

    public void setDetail_address(String detail_address) {
        this.detail_address = detail_address;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", member_id=").append(member_id);
        sb.append(", name=").append(name);
        sb.append(", phone_number=").append(phone_number);
        sb.append(", default_status=").append(default_status);
        sb.append(", post_code=").append(post_code);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", region=").append(region);
        sb.append(", detail_address=").append(detail_address);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}