package com.dcnl.BangBangCokCok.Dto.User;

public class UserDto {
	private String id;
	private String pw;
	private String userName;
	
	public UserDto() {
		
	}
	
	public UserDto(String id, String pw, String userName) {
		this.id = id;
		this.pw = pw;
		this.userName = userName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
