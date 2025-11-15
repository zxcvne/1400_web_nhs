package com.koreait.board.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.koreait.board.bean.dao.BoardVO;

@Mapper
public interface BoardMapper {
	// 게시글 추가
	public int insert(BoardVO vo);
	
}
