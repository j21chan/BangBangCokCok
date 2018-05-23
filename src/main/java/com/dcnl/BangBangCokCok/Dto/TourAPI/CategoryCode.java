package com.dcnl.BangBangCokCok.Dto.TourAPI;

public class CategoryCode {
	private String code;
	private String name;
	private String rnum;
	
	// 디폴트 생성자
	public CategoryCode() {
		
	}
	
	// 필드값을 이용한 생성자
	public CategoryCode(String code, String name, String rnum) {
		this.code = code;
		this.name = name;
		this.rnum = rnum;
	}
	
	// Getters and Setters
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRnum() {
		return rnum;
	}
	public void setRnum(String rnum) {
		this.rnum = rnum;
	}
}
