package com.ssb.app.member.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssb.app.member.MemberVO;
import com.ssb.app.member.dao.MemberDAO;
import com.ssb.app.member.service.MemberService;

@Service
public class MemberServiceImpl  implements MemberService{

	@Autowired
	private MemberDAO memberDAO;
	
	@Override
	public MemberVO getPW(String id) {
		return memberDAO.getPw(id);
	}

}
