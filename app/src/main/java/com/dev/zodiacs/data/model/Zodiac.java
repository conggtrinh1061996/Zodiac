package com.dev.zodiacs.data.model;

import java.io.Serializable;

public class Zodiac implements Serializable {
	private String title1;
	private String title2;
	private int imageResource;
	private String content;

	public Zodiac(String title1, String title2, int imageResource, String content) {
		this.title1 = title1;
		this.title2 = title2;
		this.imageResource = imageResource;
		this.content = content;
	}

	public void setTitle1(String title1) {
		this.title1 = title1;
	}

	public void setTitle2(String title2) {
		this.title2 = title2;
	}

	public void setImageResource(int imageResource) {
		this.imageResource = imageResource;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTitle1() {
		return title1;
	}

	public String getTitle2() {
		return title2;
	}

	public int getImageResource() {
		return imageResource;
	}

	public String getContent() {
		return content;
	}
}
