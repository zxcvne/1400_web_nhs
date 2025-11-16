package com.koreait.board.bean.vo;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class BoardVO {
	private Long bno;
	private String title;
	private String content;
	private String writer;
	private String regdate;
	private String updatedate;
	
//	public Long getBno() {
//		log.info("getBno() Called");
//		return 10000L;
//	}
	
	public Long getRealBno() {
		return bno;
	}
}
