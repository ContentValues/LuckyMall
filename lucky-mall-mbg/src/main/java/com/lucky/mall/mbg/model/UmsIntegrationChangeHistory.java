package com.lucky.mall.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class UmsIntegrationChangeHistory implements Serializable {
    private Long id;

    private Long member_id;

    private Date create_time;

    @ApiModelProperty(value = "改变类型：0->增加；1->减少")
    private Integer change_type;

    @ApiModelProperty(value = "积分改变数量")
    private Integer change_count;

    @ApiModelProperty(value = "操作人员")
    private String operate_man;

    @ApiModelProperty(value = "操作备注")
    private String operate_note;

    @ApiModelProperty(value = "积分来源：0->购物；1->管理员修改")
    private Integer source_type;

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

    public Integer getChange_type() {
        return change_type;
    }

    public void setChange_type(Integer change_type) {
        this.change_type = change_type;
    }

    public Integer getChange_count() {
        return change_count;
    }

    public void setChange_count(Integer change_count) {
        this.change_count = change_count;
    }

    public String getOperate_man() {
        return operate_man;
    }

    public void setOperate_man(String operate_man) {
        this.operate_man = operate_man;
    }

    public String getOperate_note() {
        return operate_note;
    }

    public void setOperate_note(String operate_note) {
        this.operate_note = operate_note;
    }

    public Integer getSource_type() {
        return source_type;
    }

    public void setSource_type(Integer source_type) {
        this.source_type = source_type;
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
        sb.append(", change_type=").append(change_type);
        sb.append(", change_count=").append(change_count);
        sb.append(", operate_man=").append(operate_man);
        sb.append(", operate_note=").append(operate_note);
        sb.append(", source_type=").append(source_type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}