package com.java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java.dto.BoardDto;
import com.java.service.BService;
import com.java.service.BServiceImpl;
import com.java.service.BServiceImpl2;

@Controller
public class FController {

	// iv
	// autowired 는 객체를 생성하지 않아도 사용할 수 있게 해줌 : DI 라고 함
	@Autowired
	BoardDto bdto;
	
	@Autowired    // @Service가 붙은 위치에 적용됨
	BService bservice;
	
	
	BServiceImpl bservice1 = new BServiceImpl();
	BServiceImpl2 bservice2 = new BServiceImpl2();
	
	
	@RequestMapping ("/index")
	public String index() {
		BoardDto bdto = new BoardDto();
		bdto.setBno(1);
		System.out.println(bdto.getBno());
		System.out.println(bservice1.add());  //15
		System.out.println(bservice2.add());  //300
		
		return "index";
	}


}
