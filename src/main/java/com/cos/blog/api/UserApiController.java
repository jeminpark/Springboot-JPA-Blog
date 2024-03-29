package com.cos.blog.api;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cos.blog.dto.ResponseDTO;
import com.cos.blog.model.RoleType;
import com.cos.blog.model.Users;
import com.cos.blog.service.UserService;

@RestController
public class UserApiController {
	
	@Autowired
	private UserService userService;
	
	
	@Autowired
	private HttpSession session;

	@PostMapping("/auth/joinProc")
	public ResponseDTO<Integer> save(@RequestBody Users user) { //파라미터 username, password, email
		System.out.println("UseApiController : save 호출됨");
		//실제로 DB에 insert를하고 아래에서 return을 처리함.
		
		//user.setRole(RoleType.USER);				// user의 역할타입만 set으로 넣어준다. Service로 옮김
		userService.회원가입(user);
		return new ResponseDTO<Integer>(HttpStatus.OK.value(), 1);	//자바 오브젝트를 JSON으로 변환해서 리턴 (Jackson)사용
	}
	
	//스프링시큐리티 이용해서 로그인
	
	
	
	
	
	//전통방식 로그인
//	@PostMapping("/api/user/login")
//	public ResponseDTO<Integer> login(@RequestBody Users user) {
//		System.out.println("UseApiController : login 호출됨");
//		
//		Users principal = userService.로그인(user); //Principal 접근주체
//		
//		if(principal != null) {
//			session.setAttribute("principal",principal);
//		}
//		return new ResponseDTO<Integer>(HttpStatus.OK.value(), 1);
//	}
}
