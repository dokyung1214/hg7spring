package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java.dto.MemberDto;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/member")
public class MemberController {

	@RequestMapping("/member1")
	public String member1() {
		return "member/member1";
	}
	
	@RequestMapping("/login")
	public String login () {
		return "member/login";
	}
	
	// 회원가입 창을 보여줌
	@RequestMapping("/memberForm")
	public String memberForm () {
		return "member/memberForm";
	}
	// 회원가입 후 전송버튼을 눌렀을때 이동
	@RequestMapping("/domemberForm")
	public String domemberForm(MemberDto mdto,HttpServletRequest request,Model model){
		/*
		  String id = request.getParameter("id"); String pw =
		  request.getParameter("pw"); String name = request.getParameter("name");
		  String gender = request.getParameter("gender");
		System.out.println(id);
		System.out.println(name);
		System.out.println(pw);
		System.out.println(gender);
		 */
		
		// MemberDto member = new MemberDto(id,pw,name,gender);
		// model 에 정보넣기
		// form 태그속 name 명과 dto 변수명이 같은경우
		model.addAttribute("member",mdto);
		/*
		  model.addAttribute("id",id); 
		  model.addAttribute("pw",pw);
		  model.addAttribute("name",name); 
		  model.addAttribute("gender",gender);
		 */
		return "member/domemberForm";
	}
	@RequestMapping("/doLogin")
	public String doLogin (MemberDto mdto,Model model) {
		model.addAttribute("member",mdto);
		
		// htttpSession session = request.getSession(); 
		// iv에 @Autowired 로 httpsSession session  선언한다
		
		// 만약 db에 aaa 1111이 있다면
		return "member/doLogin";
	}
	
	@RequestMapping("/mForm")
	public String mForm (MemberDto mdto , Model model) {
		model.addAttribute("member",mdto);
		return "member/mForm";
	}
	@RequestMapping("/domForm")
	public String domForm (MemberDto mdto ,String[] hobbys, Model model) {
		model.addAttribute("member",mdto);
		// System.out.println("이름"+mdto.getName());
		String hobby = "";
		for(int i=0; i<hobbys.length ; i++) {
			if(i==0) hobby+=hobbys[i];
			else hobby += ","+hobbys[i];
		}
		System.out.println(hobby);
		mdto.setHobby(hobby); // mdto 객체에 취미를 저장
		return "member/domForm";
	}
	
	@RequestMapping("/updateMForm")
	public String updateMForm (MemberDto mdto , Model model) {
		model.addAttribute("member",mdto);
		
		return "member/updateMForm";
	}
}
