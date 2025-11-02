package com.koreait.board.bean.vo;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Desk {
	private String name;
	private String material;
	
	public Desk() {
		this.name = "Island";
		this.material = "Wood";
	}
}
