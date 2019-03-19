package com.di2;

public class UserBean {
	private UserService userService;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	// 객체가 생성될때 한 번만 호출 (사용자가 지정 가능)
	public void init() {
		System.out.println("init");
	}
	
	public void write() {
		String s = userService.message();
		
		System.out.println("결과 : " + s);
	}
	
	public void destroy() {
		System.out.println("destroy");
	}
}
