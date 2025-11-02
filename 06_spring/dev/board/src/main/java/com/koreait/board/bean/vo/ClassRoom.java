package com.koreait.board.bean.vo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.koreait.board.util.MyUtil;

import lombok.Data;

import lombok.extern.slf4j.Slf4j;

@Component // 나 좀 컨테이너에서 관리해줘
@Data
@Slf4j  
public class ClassRoom {
	private int no;
	
	@Autowired
	private Desk desk1;
	
	@Autowired
	private Desk desk2;
	
	@Autowired
	private Chair chair1;
	
	@Autowired
	private Chair chair2;
	
	public ClassRoom() {
		log.info(MyUtil.BLUE + "New ClassRoom Open!!" + MyUtil.END);
	}
}
