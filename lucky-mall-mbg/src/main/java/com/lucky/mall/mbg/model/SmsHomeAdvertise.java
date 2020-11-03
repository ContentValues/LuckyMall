package com.lucky.mall.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class SmsHomeAdvertise implements Serializable {
    private Long id;

    private String name;

    @ApiModelProperty(value = "轮播位置：0->PC首页轮播；1->app首页轮播")
    private Integer type;

    private String pic;

    private Date start_time;

    private Date end_time;

    @ApiModelProperty(value = "上下线状态：0->下线；1->上线")
    private Integer status;

    @ApiModelProperty(value = "点击数")
    private Integer click_count;

    @ApiModelProperty(value = "下单数")
    private Integer order_count;

    @ApiModelProperty(value = "链接地址")
    private String url;

    @ApiModelProperty(value = "备注")
    private String note;

    @ApiModelProperty(value = "排序")
    private Integer sort;

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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getClick_count() {
        return click_count;
    }

    public void setClick_count(Integer click_count) {
        this.click_count = click_count;
    }

    public Integer getOrder_count() {
        return order_count;
    }

    public void setOrder_count(Integer order_count) {
        this.order_count = order_count;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", type=").append(type);
        sb.append(", pic=").append(pic);
        sb.append(", start_time=").append(start_time);
        sb.append(", end_time=").append(end_time);
        sb.append(", status=").append(status);
        sb.append(", click_count=").append(click_count);
        sb.append(", order_count=").append(order_count);
        sb.append(", url=").append(url);
        sb.append(", note=").append(note);
        sb.append(", sort=").append(sort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}