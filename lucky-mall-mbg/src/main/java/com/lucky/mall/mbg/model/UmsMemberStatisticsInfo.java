package com.lucky.mall.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class UmsMemberStatisticsInfo implements Serializable {
    private Long id;

    private Long member_id;

    @ApiModelProperty(value = "累计消费金额")
    private BigDecimal consume_amount;

    @ApiModelProperty(value = "订单数量")
    private Integer order_count;

    @ApiModelProperty(value = "优惠券数量")
    private Integer coupon_count;

    @ApiModelProperty(value = "评价数")
    private Integer comment_count;

    @ApiModelProperty(value = "退货数量")
    private Integer return_order_count;

    @ApiModelProperty(value = "登录次数")
    private Integer login_count;

    @ApiModelProperty(value = "关注数量")
    private Integer attend_count;

    @ApiModelProperty(value = "粉丝数量")
    private Integer fans_count;

    private Integer collect_product_count;

    private Integer collect_subject_count;

    private Integer collect_topic_count;

    private Integer collect_comment_count;

    private Integer invite_friend_count;

    @ApiModelProperty(value = "最后一次下订单时间")
    private Date recent_order_time;

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

    public BigDecimal getConsume_amount() {
        return consume_amount;
    }

    public void setConsume_amount(BigDecimal consume_amount) {
        this.consume_amount = consume_amount;
    }

    public Integer getOrder_count() {
        return order_count;
    }

    public void setOrder_count(Integer order_count) {
        this.order_count = order_count;
    }

    public Integer getCoupon_count() {
        return coupon_count;
    }

    public void setCoupon_count(Integer coupon_count) {
        this.coupon_count = coupon_count;
    }

    public Integer getComment_count() {
        return comment_count;
    }

    public void setComment_count(Integer comment_count) {
        this.comment_count = comment_count;
    }

    public Integer getReturn_order_count() {
        return return_order_count;
    }

    public void setReturn_order_count(Integer return_order_count) {
        this.return_order_count = return_order_count;
    }

    public Integer getLogin_count() {
        return login_count;
    }

    public void setLogin_count(Integer login_count) {
        this.login_count = login_count;
    }

    public Integer getAttend_count() {
        return attend_count;
    }

    public void setAttend_count(Integer attend_count) {
        this.attend_count = attend_count;
    }

    public Integer getFans_count() {
        return fans_count;
    }

    public void setFans_count(Integer fans_count) {
        this.fans_count = fans_count;
    }

    public Integer getCollect_product_count() {
        return collect_product_count;
    }

    public void setCollect_product_count(Integer collect_product_count) {
        this.collect_product_count = collect_product_count;
    }

    public Integer getCollect_subject_count() {
        return collect_subject_count;
    }

    public void setCollect_subject_count(Integer collect_subject_count) {
        this.collect_subject_count = collect_subject_count;
    }

    public Integer getCollect_topic_count() {
        return collect_topic_count;
    }

    public void setCollect_topic_count(Integer collect_topic_count) {
        this.collect_topic_count = collect_topic_count;
    }

    public Integer getCollect_comment_count() {
        return collect_comment_count;
    }

    public void setCollect_comment_count(Integer collect_comment_count) {
        this.collect_comment_count = collect_comment_count;
    }

    public Integer getInvite_friend_count() {
        return invite_friend_count;
    }

    public void setInvite_friend_count(Integer invite_friend_count) {
        this.invite_friend_count = invite_friend_count;
    }

    public Date getRecent_order_time() {
        return recent_order_time;
    }

    public void setRecent_order_time(Date recent_order_time) {
        this.recent_order_time = recent_order_time;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", member_id=").append(member_id);
        sb.append(", consume_amount=").append(consume_amount);
        sb.append(", order_count=").append(order_count);
        sb.append(", coupon_count=").append(coupon_count);
        sb.append(", comment_count=").append(comment_count);
        sb.append(", return_order_count=").append(return_order_count);
        sb.append(", login_count=").append(login_count);
        sb.append(", attend_count=").append(attend_count);
        sb.append(", fans_count=").append(fans_count);
        sb.append(", collect_product_count=").append(collect_product_count);
        sb.append(", collect_subject_count=").append(collect_subject_count);
        sb.append(", collect_topic_count=").append(collect_topic_count);
        sb.append(", collect_comment_count=").append(collect_comment_count);
        sb.append(", invite_friend_count=").append(invite_friend_count);
        sb.append(", recent_order_time=").append(recent_order_time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}