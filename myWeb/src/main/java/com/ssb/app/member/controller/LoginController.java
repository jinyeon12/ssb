package com.ssb.app.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssb.app.member.MemberVO;
import com.ssb.app.member.service.MemberService;


@Controller
public class LoginController {
	
	@Autowired
	private MemberService memberService;

	@RequestMapping(value="/views/**/login.do")
	public String loginController() {
		return "login";
	}
	
	@RequestMapping(value="/views/**/loginProc.do")
	public String loginProcController(String id, String pw) {
		MemberVO vo = memberService.getPW(id);
		
		if(vo.getId()!=null) { //아이디는 일단 맞고 
			if(pw.equals(vo.getPw())){ //비밀번호도 맞고
				System.out.println("로그인 성공");
				return "1";
			}else { //비밀번호는 틀리고
				System.out.println("비밀번호가 틀렸습니다");
				return "3";
			}			
		}else {
			System.out.println("아이디 없습니다");
			return "2";
		}
	}
	
	@RequestMapping(value="/views/**/left.do")
	public String leftController() {
		return "left";
	}
	
	@RequestMapping(value="/views/**/main.do")
	public String mainController() {
		return "main";
	}
	
	@RequestMapping(value="/views/**/page11.do")
	public String page11Controller() {
		return "page11";
	}
	
	@RequestMapping(value="/views/**/page9.do")
	public String page9Controller() {
		return "page9";
	}
	
	@RequestMapping(value="/views/**/page8.do")
	public String page8Controller() {
		return "page8";
	}
	
	@RequestMapping(value="/views/**/page7.do")
	public String page7Controller() {
		return "page7";
	}
	
	@RequestMapping(value="/views/**/page6.do")
	public String page6Controller() {
		return "page6";
	}
	
	@RequestMapping(value="/views/**/page5.do")
	public String page5Controller() {
		return "page5";
	}
	
	@RequestMapping(value="/views/**/page4.do")
	public String page4Controller() {
		return "page4";
	}
	
	

	
}
