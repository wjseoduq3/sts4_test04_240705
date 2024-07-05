package com.jdy.member.controller;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jdy.member.dao.MemberDao;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MemberController {	
	
	@Autowired
	private SqlSession sqlSession;
	
	@RequestMapping(value = "/test")
	public String test() {
	return "test";
	}
	
	@RequestMapping(value = "/join")
	public String join() {
		return "join";
	}
	
	@RequestMapping(value = "/joinOk")
	public String joinOk(HttpServletRequest request, Model model) {
		
		MemberDao memberDao = sqlSession.getMapper(MemberDao.class); 
		
		int idCheck = memberDao.checkIdDao(request.getParameter("mid")); //회원존재여부 확인
		
		if(idCheck==0) {
			memberDao.joinDao(request.getParameter("mid"), request.getParameter("mpw"), request.getParameter("mname"), request.getParameter("memail"));
			return "joinOk";
		} else {
			model.addAttribute("joinFail", "이미 가입된 아이디입니다.");
			return "join";
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
