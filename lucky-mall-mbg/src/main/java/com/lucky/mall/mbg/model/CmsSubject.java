package com.lucky.mall.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class CmsSubject implements Serializable {
    private Long id;

    private Long category_id;

    private String title;

    @ApiModelProperty(value = "专题主图")
    private String pic;

    @ApiModelProperty(value = "关联产品数量")
    private Integer product_count;

    private Integer recommend_status;

    private Date create_time;

    private Integer collect_count;

    private Integer read_count;

    private Integer comment_count;

    @ApiModelProperty(value = "画册图片用逗号分割")
    private String album_pics;

    private String description;

    @ApiModelProperty(value = "显示状态：0->不显示；1->显示")
    private Integer show_status;

    @ApiModelProperty(value = "转发数")
    private Integer forward_count;

    @ApiModelProperty(value = "专题分类名称")
    private String category_name;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Integer getProduct_count() {
        return product_count;
    }

    public void setProduct_count(Integer product_count) {
        this.product_count = product_count;
    }

    public Integer getRecommend_status() {
        return recommend_status;
    }

    public void setRecommend_status(Integer recommend_status) {
        this.recommend_status = recommend_status;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Integer getCollect_count() {
        return collect_count;
    }

    public void setCollect_count(Integer collect_count) {
        this.collect_count = collect_count;
    }

    public Integer getRead_count() {
        return read_count;
    }

    public void setRead_count(Integer read_count) {
        this.read_count = read_count;
    }

    public Integer getComment_count() {
        return comment_count;
    }

    public void setComment_count(Integer comment_count) {
        this.comment_count = comment_count;
    }

    public String getAlbum_pics() {
        return album_pics;
    }

    public void setAlbum_pics(String album_pics) {
        this.album_pics = album_pics;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getShow_status() {
        return show_status;
    }

    public void setShow_status(Integer show_status) {
        this.show_status = show_status;
    }

    public Integer getForward_count() {
        return forward_count;
    }

    public void setForward_count(Integer forward_count) {
        this.forward_count = forward_count;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
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
        sb.append(", title=").append(title);
        sb.append(", pic=").append(pic);
        sb.append(", product_count=").append(product_count);
        sb.append(", recommend_status=").append(recommend_status);
        sb.append(", create_time=").append(create_time);
        sb.append(", collect_count=").append(collect_count);
        sb.append(", read_count=").append(read_count);
        sb.append(", comment_count=").append(comment_count);
        sb.append(", album_pics=").append(album_pics);
        sb.append(", description=").append(description);
        sb.append(", show_status=").append(show_status);
        sb.append(", forward_count=").append(forward_count);
        sb.append(", category_name=").append(category_name);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}