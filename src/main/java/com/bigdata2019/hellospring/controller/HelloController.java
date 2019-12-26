package com.bigdata2019.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	
	//@RequestParam 생략가능
	//(value="n") 변수명이 n
	@RequestMapping("/hello")	
	public String hello( @RequestParam(value="n", required=true, defaultValue="") String name
			           , @RequestParam(value="a", required=true, defaultValue="0") int age) {		
		System.out.println("name : " + name);
		System.out.println("age : "  + age);
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
