package com.jdy.member.dao;

import java.util.ArrayList;

import com.jdy.member.dto.MemberDto;

public interface MemberDao {

	public void joinDao(String mid, String mpw, String mname, String memail);// 회원가입
	public int checkIdDao(String mid);
	public ArrayList<MemberDto> memberListDao();
	
	
	
	
	
}
