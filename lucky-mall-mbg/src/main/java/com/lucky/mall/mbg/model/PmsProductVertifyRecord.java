package com.lucky.mall.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class PmsProductVertifyRecord implements Serializable {
    private Long id;

    private Long product_id;

    private Date create_time;

    @ApiModelProperty(value = "审核人")
    private String vertify_man;

    private Integer status;

    @ApiModelProperty(value = "反馈详情")
    private String detail;

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

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getVertify_man() {
        return vertify_man;
    }

    public void setVertify_man(String vertify_man) {
        this.vertify_man = vertify_man;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", product_id=").append(product_id);
        sb.append(", create_time=").append(create_time);
        sb.append(", vertify_man=").append(vertify_man);
        sb.append(", status=").append(status);
        sb.append(", detail=").append(detail);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}