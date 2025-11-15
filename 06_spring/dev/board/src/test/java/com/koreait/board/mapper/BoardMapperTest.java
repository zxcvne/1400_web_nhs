package com.koreait.board.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.koreait.board.bean.dao.BoardVO;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class BoardMapperTest {
	
	@Autowired
	private BoardMapper mapper;
	
	@Test
	public void insertTest() {
		BoardVO vo = new BoardVO();
		vo.setTitle("어제 축구함");
		vo.setContent("경기 내용이 수준 이하");
		vo.setWriter("경기본자");
		mapper.insert(vo);
		log.info("BoardVO : "+vo);
	}
	
}
