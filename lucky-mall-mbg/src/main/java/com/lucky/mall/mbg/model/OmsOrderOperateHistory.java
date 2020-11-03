package com.lucky.mall.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class OmsOrderOperateHistory implements Serializable {
    private Long id;

    @ApiModelProperty(value = "订单id")
    private Long order_id;

    @ApiModelProperty(value = "操作人：用户；系统；后台管理员")
    private String operate_man;

    @ApiModelProperty(value = "操作时间")
    private Date create_time;

    @ApiModelProperty(value = "订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单")
    private Integer order_status;

    @ApiModelProperty(value = "备注")
    private String note;

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

    public String getOperate_man() {
        return operate_man;
    }

    public void setOperate_man(String operate_man) {
        this.operate_man = operate_man;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Integer getOrder_status() {
        return order_status;
    }

    public void setOrder_status(Integer order_status) {
        this.order_status = order_status;
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
        sb.append(", order_id=").append(order_id);
        sb.append(", operate_man=").append(operate_man);
        sb.append(", create_time=").append(create_time);
        sb.append(", order_status=").append(order_status);
        sb.append(", note=").append(note);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}