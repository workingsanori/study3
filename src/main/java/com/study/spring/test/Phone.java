package com.study.spring.test;

import java.util.List;

public interface Phone {
	
	//추상메서드 선언
	void calling();
	
	List<String> getAddress();
	
	void setAddress(List<String> address);
		
}
