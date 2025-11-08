package com.koreait.board.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper // MyBatis 연결
public interface TimeMapper {
	
	@Select("SELECT SYSDATE() FROM DUAL")
	public String getTime1();
	
	public String getTime2();
	
//	@Select("SELECT 'This is Test String' FROM DUAL")
	public String getTestString();
	
}
