package com.koreait.board.bean.vo;

import lombok.Data;

@Data
public class SubjectVO {
	int scoreC;
	int scoreJ;
	int scoreP;
//	int total;
//	int average;
	
	public int getTotal() {
		return scoreC + scoreJ + scoreP;
	}
	
	public int getAverage() {
		return getTotal() / 3;
	}
}
