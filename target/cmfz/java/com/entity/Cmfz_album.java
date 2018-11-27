package com.entity;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.alibaba.fastjson.annotation.JSONField;

//专辑模块
public class Cmfz_album {
	
	private Integer album_id;
	private String album_title;
	private String album_cover;//封面路径
	private Integer album_count;//集数
	private String album_author;//作者
	private String album_broadCast;//播音
	@DateTimeFormat(pattern="yyyy-MM-dd")//输入格式
	@JSONField(format="yyyy-MM-dd")//输出格式
	private Date album_publishDate;//出版日期
	private String album_brief;//概要
	private List<Cmfz_chapter> chapter;//章节关系属性
	
	public Cmfz_album() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cmfz_album(Integer album_id, String album_title, String album_cover,
			Integer album_count, String album_author, String album_broadCast,
			Date album_publishDate, String album_brief,
			List<Cmfz_chapter> chapter) {
		super();
		this.album_id = album_id;
		this.album_title = album_title;
		this.album_cover = album_cover;
		this.album_count = album_count;
		this.album_author = album_author;
		this.album_broadCast = album_broadCast;
		this.album_publishDate = album_publishDate;
		this.album_brief = album_brief;
		this.chapter = chapter;
	}

	public Integer getAlbum_id() {
		return album_id;
	}

	public void setAlbum_id(Integer album_id) {
		this.album_id = album_id;
	}

	public String getAlbum_title() {
		return album_title;
	}

	public void setAlbum_title(String album_title) {
		this.album_title = album_title;
	}

	public String getAlbum_cover() {
		return album_cover;
	}

	public void setAlbum_cover(String album_cover) {
		this.album_cover = album_cover;
	}

	public Integer getAlbum_count() {
		return album_count;
	}

	public void setAlbum_count(Integer album_count) {
		this.album_count = album_count;
	}

	public String getAlbum_author() {
		return album_author;
	}

	public void setAlbum_author(String album_author) {
		this.album_author = album_author;
	}

	public String getAlbum_broadCast() {
		return album_broadCast;
	}

	public void setAlbum_broadCast(String album_broadCast) {
		this.album_broadCast = album_broadCast;
	}

	public Date getAlbum_publishDate() {
		return album_publishDate;
	}

	public void setAlbum_publishDate(Date album_publishDate) {
		this.album_publishDate = album_publishDate;
	}

	public String getAlbum_brief() {
		return album_brief;
	}

	public void setAlbum_brief(String album_brief) {
		this.album_brief = album_brief;
	}

	public List<Cmfz_chapter> getChapter() {
		return chapter;
	}

	public void setChapter(List<Cmfz_chapter> chapter) {
		this.chapter = chapter;
	}

	@Override
	public String toString() {
		return "Cmfz_album [album_id=" + album_id + ", album_title="
				+ album_title + ", album_cover=" + album_cover
				+ ", album_count=" + album_count + ", album_author="
				+ album_author + ", album_broadCast=" + album_broadCast
				+ ", album_publishDate=" + album_publishDate + ", album_brief="
				+ album_brief + ", chapter=" + chapter + "]";
	}
	
	
}
