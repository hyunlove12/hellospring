package com.bigdata2019.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello(String name) {
		
		System.out.println("name : " + name);
		//root경로는 webapp
		//jsp로 포워딩
		return "/WEB-INF/views/hello.jsp";
	}
	
	@RequestMapping("/hello/world")
	public String hello2() {		
		//root경로는 webapp
		//jsp로 포워딩
		return "/WEB-INF/views/hello2.jsp";
	}
}
