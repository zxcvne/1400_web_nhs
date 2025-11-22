package com.koreait.board.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.koreait.board.bean.vo.BoardVO;
import com.koreait.board.bean.vo.TestVO;

@Mapper
public interface BoardMapper {
	// 게시글 추가
	public int insert(BoardVO vo);
	
	// get 메서드만 구현하면 데이터 제공 가능
	public int insert2(TestVO vo);
	
	// 게시글 추가(글번호 리턴 포함)
	public int insertSelectKey(BoardVO vo); // bno 채번 결과를 넣어줌
	
	// 리스트 조회
	public List<BoardVO> getList();
	
	// 게시글 삭제
	public int delete(Long bno);
	
	// 게시글 수정
	public int update(BoardVO vo);
	
	// 게시글 조회
	public BoardVO get(Long bno);
	
	
	
}
