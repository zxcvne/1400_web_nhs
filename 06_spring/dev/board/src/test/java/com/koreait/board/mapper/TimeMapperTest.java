package com.koreait.board.mapper;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import lombok.extern.slf4j.Slf4j;

@SpringBootTest // test 가능
@Slf4j // log 찍게 해줌
public class TimeMapperTest {
	
	@Autowired // 의존 관계 주입
	TimeMapper timeMapper;
	
	@BeforeAll // 테스트 시작 시 1번 수행하는 메서드
	public static void init() {
		log.info("테스트 시 주의하시오.. 테스트 내용 유출 시 엄벌");
	}
	
	@BeforeEach
	public void init2() {
		log.info("테스트 할 때마다의 유의사항 : 웬만하면 하지 마");
	}
	
	@AfterEach
	public void finish() {
		log.info("테스트 하시고 나면 뒷 정리 부탁요");
	}
	
	@Test
	public void testGetTime1() {
		log.info("-----------------------------------------");
		log.info("Current Time 1 : " + timeMapper.getTime1());
		log.info("-----------------------------------------");
//		System.out.println("[testGetTime1()] Current 1 : " + timeMapper.getTime1());
	}
	
	@Test
	public void testGetTime2() {
		log.info("-----------------------------------------");
		log.info("Current Time 2 : " + timeMapper.getTime2());
		log.info("-----------------------------------------");
	}

	@Test
	public void testGetTestString() {
		log.info("-----------------------------------------");
		log.info("Test String : " + timeMapper.getTestString());
		log.info("-----------------------------------------");
	}
}
