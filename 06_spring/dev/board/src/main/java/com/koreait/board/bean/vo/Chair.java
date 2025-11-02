package com.koreait.board.bean.vo;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Chair {
	private String name;
	private int numOfLegs;
	
	public Chair() {
		this.name = "Tom Sawyer";
		this.numOfLegs = 4;
	}
	
	
}
