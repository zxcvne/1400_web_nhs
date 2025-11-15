package com.koreait.board.bean.dao;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.koreait.board.mapper.TimeMapper;

@Repository // @Component의 자식 Anotation으로 DAO에 사용
public class TimeDAO {
	@Autowired
	private TimeMapper mapper;
	
	public String getTime() {
		Random rd = new Random();
		int num = rd.nextInt(3);
		
		if(num == 0) {
			return mapper.getTime1();
		}else if(num == 1) {
			return mapper.getTime2();
		}else {
			return mapper.getTestString();
		}
	}
	
}
