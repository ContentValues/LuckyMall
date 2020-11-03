package com.lucky.mall.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class UmsMemberLoginLog implements Serializable {
    private Long id;

    private Long member_id;

    private Date create_time;

    private String ip;

    private String city;

    @ApiModelProperty(value = "登录类型：0->PC；1->android;2->ios;3->小程序")
    private Integer login_type;

    private String province;

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

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getLogin_type() {
        return login_type;
    }

    public void setLogin_type(Integer login_type) {
        this.login_type = login_type;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", member_id=").append(member_id);
        sb.append(", create_time=").append(create_time);
        sb.append(", ip=").append(ip);
        sb.append(", city=").append(city);
        sb.append(", login_type=").append(login_type);
        sb.append(", province=").append(province);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}