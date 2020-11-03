package com.lucky.mall.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class CmsTopic implements Serializable {
    private Long id;

    private Long category_id;

    private String name;

    private Date create_time;

    private Date start_time;

    private Date end_time;

    @ApiModelProperty(value = "参与人数")
    private Integer attend_count;

    @ApiModelProperty(value = "关注人数")
    private Integer attention_count;

    private Integer read_count;

    @ApiModelProperty(value = "奖品名称")
    private String award_name;

    @ApiModelProperty(value = "参与方式")
    private String attend_type;

    @ApiModelProperty(value = "话题内容")
    private String content;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Long category_id) {
        this.category_id = category_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
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

    public Integer getAttend_count() {
        return attend_count;
    }

    public void setAttend_count(Integer attend_count) {
        this.attend_count = attend_count;
    }

    public Integer getAttention_count() {
        return attention_count;
    }

    public void setAttention_count(Integer attention_count) {
        this.attention_count = attention_count;
    }

    public Integer getRead_count() {
        return read_count;
    }

    public void setRead_count(Integer read_count) {
        this.read_count = read_count;
    }

    public String getAward_name() {
        return award_name;
    }

    public void setAward_name(String award_name) {
        this.award_name = award_name;
    }

    public String getAttend_type() {
        return attend_type;
    }

    public void setAttend_type(String attend_type) {
        this.attend_type = attend_type;
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
        sb.append(", category_id=").append(category_id);
        sb.append(", name=").append(name);
        sb.append(", create_time=").append(create_time);
        sb.append(", start_time=").append(start_time);
        sb.append(", end_time=").append(end_time);
        sb.append(", attend_count=").append(attend_count);
        sb.append(", attention_count=").append(attention_count);
        sb.append(", read_count=").append(read_count);
        sb.append(", award_name=").append(award_name);
        sb.append(", attend_type=").append(attend_type);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}