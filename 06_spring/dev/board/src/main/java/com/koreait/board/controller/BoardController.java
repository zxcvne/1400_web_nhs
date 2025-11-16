package com.koreait.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.koreait.board.bean.dao.BoardDAO;
import com.koreait.board.bean.vo.BoardVO;
import com.koreait.board.util.MyUtil;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/board/*")
public class BoardController {
	
	@Autowired
	private BoardDAO dao;
	
	@GetMapping("register")
	public void registForm() {
		
	}
	
	@PostMapping("register")
	public void regist(BoardVO board) {
		// 본체로부터 받은 title, content, writer를 출력해보세요.
		log.info("register called");
		log.info("board : " + board);
		int result = dao.register(board);
		if(result > 0) {
			log.info("글 등록이 성공하였습니다.");
		}else {
			log.info("너 지금 뭐 보낸거냐?");
		}
	}

	@GetMapping("list")
	public void list(Model model) {
		log.info("------------------------------------------>");
		log.info(MyUtil.getColor() + "getList" + MyUtil.END);
		dao.getList().forEach(board->log.info(MyUtil.getColor() + board + MyUtil.END));
		model.addAttribute("board", dao.getList());
		model.addAttribute("myFeel", "very gloomy");
	}
	
}
