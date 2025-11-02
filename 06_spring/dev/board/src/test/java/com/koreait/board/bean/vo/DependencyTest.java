package com.koreait.board.bean.vo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.koreait.board.util.MyUtil;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class DependencyTest {
	
	@Autowired
	ClassRoom cr;
	
	@Test
	public void testDependency() {
		log.info(MyUtil.BLUE + "Test Start" + MyUtil.END);
		log.info("cr = " + cr);
		Desk myDesk = new Desk();
		myDesk.setName("Norway");
		myDesk.setMaterial("Iron");
		cr.setDesk2(myDesk);
	}
	
	@Test
	public void testAnother() {
		log.info(MyUtil.BLUE + "Test Another" + MyUtil.END);
	}
}
