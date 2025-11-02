package com.koreait.board.bean.vo;

import lombok.Data;

@Data
public class SampleVO {
	private String name;
	private int age;
	
	// 내가 직접 getter를 만들면 lombok이 생성하는 
	// getter 메서드가 아닌 내가 만든 getter를 사용함.
//	public String getName() {
//		return "장난치지마라";
//	}
}

