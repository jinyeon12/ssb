package com.ssb.app.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class LoginController {

	@RequestMapping(value="/views/**/login.do")
	public String loginController() {
		return "login";
	}
	
	@RequestMapping(value="/views/**/index.do")
	public String indexController() {
		return "index";
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
