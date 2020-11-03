package com.lucky.mall.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class CmsMemberReport implements Serializable {
    private Long id;

    @ApiModelProperty(value = "举报类型：0->商品评价；1->话题内容；2->用户评论")
    private Integer report_type;

    @ApiModelProperty(value = "举报人")
    private String report_member_name;

    private Date create_time;

    private String report_object;

    @ApiModelProperty(value = "举报状态：0->未处理；1->已处理")
    private Integer report_status;

    @ApiModelProperty(value = "处理结果：0->无效；1->有效；2->恶意")
    private Integer handle_status;

    private String note;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getReport_type() {
        return report_type;
    }

    public void setReport_type(Integer report_type) {
        this.report_type = report_type;
    }

    public String getReport_member_name() {
        return report_member_name;
    }

    public void setReport_member_name(String report_member_name) {
        this.report_member_name = report_member_name;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getReport_object() {
        return report_object;
    }

    public void setReport_object(String report_object) {
        this.report_object = report_object;
    }

    public Integer getReport_status() {
        return report_status;
    }

    public void setReport_status(Integer report_status) {
        this.report_status = report_status;
    }

    public Integer getHandle_status() {
        return handle_status;
    }

    public void setHandle_status(Integer handle_status) {
        this.handle_status = handle_status;
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
        sb.append(", report_type=").append(report_type);
        sb.append(", report_member_name=").append(report_member_name);
        sb.append(", create_time=").append(create_time);
        sb.append(", report_object=").append(report_object);
        sb.append(", report_status=").append(report_status);
        sb.append(", handle_status=").append(handle_status);
        sb.append(", note=").append(note);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}