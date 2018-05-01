package com.dcnl.BangBangCokCok.Dto.TourAPI;

public class AreaCode {
	private String code;
	private String name;
	private String rnum;
	
	// 디폴트 생성자
	public AreaCode () {
		
	}

	// 필드를 이용한 생성자
	public AreaCode(String code, String name, String rnum) {
		this.code = code;
		this.name = name;
		this.rnum = rnum;
	}

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
