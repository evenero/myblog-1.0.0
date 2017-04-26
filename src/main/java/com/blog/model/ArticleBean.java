package com.blog.model;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class ArticleBean {
    private Integer id;
    private String title;
    private String imgUrl;
    private String content;
    private Date createTime;
    private Date updateTime;
    private Integer isDelete;
    private Integer Like;
    private List<Map<String, Object>> comments;
	private String temp1;
    private String temp2;
    private String temp3;
    public List<Map<String, Object>> getComments() {
    	return comments;
    }
    public void setComments(List<Map<String, Object>> comments) {
    	this.comments = comments;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }
    public String getImgUrl() {
        return imgUrl;
    }
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public Date getUpdateTime() {
        return updateTime;
    }
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    public Integer getIsDelete() {
        return isDelete;
    }
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
    public String getTemp1() {
        return temp1;
    }
    public void setTemp1(String temp1) {
        this.temp1 = temp1 == null ? null : temp1.trim();
    }
    public String getTemp2() {
        return temp2;
    }
    public void setTemp2(String temp2) {
        this.temp2 = temp2 == null ? null : temp2.trim();
    }
    public String getTemp3() {
        return temp3;
    }
    public void setTemp3(String temp3) {
        this.temp3 = temp3 == null ? null : temp3.trim();
    }
	public Integer getLike() {
		return Like;
	}
	public void setLike(Integer like) {
		Like = like;
	}
}
