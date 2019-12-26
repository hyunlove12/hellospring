package com.bigdata2019.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/board")
@Controller
public class BoardController {
	/*
	 * restful
	 * method=RequestMethod.GET/POST/PUT/DELETE ->
	 *   
	 * */
	
	@ResponseBody
	@RequestMapping("/list")
	public String list() {
		//responseBody -> /WEB-INF/views/list.jsp리턴 값이 그대로 보여진다. 뷰 리졸버가 아닌 메시지 컨버터가 처리한다. 
		//responsebody에 직접 값을 전달하겠다.
		return "board:list";
	}
	
	@ResponseBody
	@RequestMapping(value = "/writeform", method=RequestMethod.GET)
	public String writeform() {
		//responseBody -> /WEB-INF/views/list.jsp리턴 값이 그대로 보여진다. 뷰 리졸버가 아닌 메시지 컨버터가 처리한다. 
		//responsebody에 직접 값을 전달하겠다.
		return "board:writeform";
	}
		
	@RequestMapping("/write")
	public String write() {
		System.out.println("board:write");
		//contextpath제외
		return "redirect:/board/list";
	}
	
}
