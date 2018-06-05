package com.dcnl.BangBangCokCok.Dao.User;

import com.dcnl.BangBangCokCok.Dto.User.UserDto;

public interface UserIDao {
	public void joinUser(String id, String pw, String name);
	public UserDto loginUser(String id, String pw);
}
