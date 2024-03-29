package com.cos.blog.test;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Getter
//@Setter
//@Data //게터세터
//@AllArgsConstructor //생성자
//@RequiredArgsConstructor //final이 붙은 변수들을 위한 생성자

@Data
//@AllArgsConstructor
@NoArgsConstructor
public class Member {
	private int id;			//final은 불변성 유지위해 
	private String username;
	private String password;
	private String email;
	
	
	@Builder
	public Member(int id, String username, String password, String email) {
		
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
	}
	
	
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getUsername() {
//		return username;
//	}
//	public void setUsername(String username) {
//		this.username = username;
//	}
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	public String getEmail() {
//		return email;
//	}
//	public void setEmail(String email) {
//		this.email = email;
//	}
	
	

}
