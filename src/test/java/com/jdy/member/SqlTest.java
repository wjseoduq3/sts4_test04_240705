package com.jdy.member;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import com.jdy.member.dao.MemberDao;
import com.jdy.member.dto.MemberDto;

@SpringBootTest
@TestPropertySource(locations = "classpath:application2.properties")
public class SqlTest {
	@Autowired 
	private SqlSession sqlSession;
	
	@Test
	@DisplayName("모든 회원 몰록 불러오기")
	public void memberList() {
		MemberDao memberDao = sqlSession.getMapper(MemberDao.class); 
		ArrayList<MemberDto> memberDtos = memberDao.memberListDao();
	
		for(MemberDto memberDto:memberDtos) {
			System.out.print(memberDto.getMid() + "/");
			System.out.print(memberDto.getMpw() + "/");
			System.out.print(memberDto.getMname() + "/");
			System.out.print(memberDto.getMemail() + "/");
			System.out.print(memberDto.getMdate() + "/\n");
			System.out.println("----------------------------\n");
			
			
		}
	
	}
	
	@Test
	@DisplayName("회원삭제테스트")
	public void delete() {
		MemberDao memberDao = sqlSession.getMapper(MemberDao.class);
		memberDao.deleteDao("tiger");
		
		memberList();
	}
	

}
