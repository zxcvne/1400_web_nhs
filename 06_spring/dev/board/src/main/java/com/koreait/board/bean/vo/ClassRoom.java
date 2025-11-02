package com.koreait.board.bean.vo;

import com.koreait.board.util.MyUtil;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j  
public class ClassRoom {
	private int no;
	
	private Desk desk1;
	private Desk desk2;
	private Chair chair1;
	private Chair chair2;
	
	public ClassRoom() {
		log.info(MyUtil.BLUE + "New ClassRoom Open!!" + MyUtil.END);
	}
}
