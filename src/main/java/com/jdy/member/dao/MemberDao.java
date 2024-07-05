package com.jdy.member.dao;

public interface MemberDao {

	public void joinDao(String mid, String mpw, String mname, String memail);// 회원가입
	public int checkIdDao(String mid);
}
