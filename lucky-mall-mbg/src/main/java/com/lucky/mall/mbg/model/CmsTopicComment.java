package com.lucky.mall.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class CmsTopicComment implements Serializable {
    private Long id;

    private String member_nick_name;

    private Long topic_id;

    private String member_icon;

    private String content;

    private Date create_time;

    private Integer show_status;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMember_nick_name() {
        return member_nick_name;
    }

    public void setMember_nick_name(String member_nick_name) {
        this.member_nick_name = member_nick_name;
    }

    public Long getTopic_id() {
        return topic_id;
    }

    public void setTopic_id(Long topic_id) {
        this.topic_id = topic_id;
    }

    public String getMember_icon() {
        return member_icon;
    }

    public void setMember_icon(String member_icon) {
        this.member_icon = member_icon;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", member_nick_name=").append(member_nick_name);
        sb.append(", topic_id=").append(topic_id);
        sb.append(", member_icon=").append(member_icon);
        sb.append(", content=").append(content);
        sb.append(", create_time=").append(create_time);
        sb.append(", show_status=").append(show_status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}