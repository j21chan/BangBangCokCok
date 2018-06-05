package com.dcnl.BangBangCokCok;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dcnl.BangBangCokCok.Dao.User.UserIDao;
import com.dcnl.BangBangCokCok.Dto.User.UserDto;

@RestController
@RequestMapping(value = "/user")
public class UserController {
	
	@Autowired
	private SqlSession sqlSession;
	
	// 회원가입 요청
	@RequestMapping(value = "/join")
	public Map<String, Object> joinUser(HttpServletRequest request) {
		
		UserIDao dao = sqlSession.getMapper(UserIDao.class);
		dao.joinUser(request.getParameter("id"), request.getParameter("pw"), request.getParameter("UserName"));
		
		return null;
	}
	
	// 로그인 요청
	@RequestMapping(value = "/login")
	public UserDto loginUser(HttpServletRequest request) {
		
		UserIDao dao = sqlSession.getMapper(UserIDao.class);
		return dao.loginUser(request.getParameter("id"), request.getParameter("pw"));
	}
	
	// 회원탈퇴 요청
	
	// 회원수정 요청
	
	// 관광코스 등록
	
	// 관광코스 삭제
}
