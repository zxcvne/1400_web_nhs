package com.koreait.board.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.koreait.board.bean.vo.BoardVO;
import com.koreait.board.bean.vo.TestVO;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class BoardMapperTest {
	
	@Autowired
	private BoardMapper mapper;
	
	// @Test
	public void insertTest() {
		BoardVO vo = new BoardVO();
		vo.setTitle("어제 축구함");
		vo.setContent("경기 내용이 수준 이하");
		vo.setWriter("경기본자");
		
		mapper.insert(vo);
		log.info("BoardVO : "+vo);
		
		TestVO vo2 = new TestVO();
		mapper.insert2(vo2);
		
		mapper.insertSelectKey(vo);
		log.info("BoardVO : " + vo);
		log.info("BoardVO : " + vo.getRealBno());
		
		// 임의의 글 50개 인서트를 해보세요
		for(int i = 0; i < 50; i++) {
			BoardVO board = new BoardVO();
			board.setTitle("제목" + i);
			board.setContent("내용" + i);
			board.setWriter("글쓴이" + i);
			mapper.insertSelectKey(board);
		}
		
	}
	
	@Test
	public void testGetList() {
		mapper.getList()
			.forEach(board->log.info("Board : " + board));;
	}
	
}
