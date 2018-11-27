package com.entity;

import org.springframework.format.annotation.DateTimeFormat;

import com.alibaba.fastjson.annotation.JSONField;

//文章表
public class Cmfz_article {
	
	private Integer article_id;
	private String article_title;
	private String article_content;//内容
	private String article_figurePath;//插图
	               
	@DateTimeFormat(pattern="yyyy-MM-dd")//输入格式
	@JSONField(format="yyyy-MM-dd")//输出格式
	private String article_publishDate;//发布时间
	private String article_status;//状态
	private Cmfz_guru article_guruId;//上师关系属性
	
	public Cmfz_article() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cmfz_article(Integer article_id, String article_title,
			String article_content, String article_figurePath,
			String article_publishDate, String article_status,
			Cmfz_guru article_guruId) {
		super();
		this.article_id = article_id;
		this.article_title = article_title;
		this.article_content = article_content;
		this.article_figurePath = article_figurePath;
		this.article_publishDate = article_publishDate;
		this.article_status = article_status;
		this.article_guruId = article_guruId;
	}

	public Integer getArticle_id() {
		return article_id;
	}

	public void setArticle_id(Integer article_id) {
		this.article_id = article_id;
	}

	public String getArticle_title() {
		return article_title;
	}

	public void setArticle_title(String article_title) {
		this.article_title = article_title;
	}

	public String getArticle_content() {
		return article_content;
	}

	public void setArticle_content(String article_content) {
		this.article_content = article_content;
	}

	public String getArticle_figurePath() {
		return article_figurePath;
	}

	public void setArticle_figurePath(String article_figurePath) {
		this.article_figurePath = article_figurePath;
	}

	public String getArticle_publishDate() {
		return article_publishDate;
	}

	public void setArticle_publishDate(String article_publishDate) {
		this.article_publishDate = article_publishDate;
	}

	public String getArticle_status() {
		return article_status;
	}

	public void setArticle_status(String article_status) {
		this.article_status = article_status;
	}

	public Cmfz_guru getArticle_guruId() {
		return article_guruId;
	}

	public void setArticle_guruId(Cmfz_guru article_guruId) {
		this.article_guruId = article_guruId;
	}

	@Override
	public String toString() {
		return "Cmfz_article [article_id=" + article_id + ", article_title="
				+ article_title + ", article_content=" + article_content
				+ ", article_figurePath=" + article_figurePath
				+ ", article_publishDate=" + article_publishDate
				+ ", article_status=" + article_status + ", article_guruId="
				+ article_guruId + "]";
	}

	
	
}
