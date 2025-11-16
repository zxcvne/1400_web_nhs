package com.koreait.board.bean.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.koreait.board.bean.vo.BoardVO;
import com.koreait.board.mapper.BoardMapper;

@Repository
public class BoardDAO {
	@Autowired
	private BoardMapper mapper;
	
	// register(insert)
	public int register(BoardVO board) {
		return mapper.insert(board);
	}
	
	// getList
	public List<BoardVO> getList() {
		return mapper.getList();
	}
}
