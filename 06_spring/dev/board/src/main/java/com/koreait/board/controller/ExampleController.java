package com.koreait.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.koreait.board.bean.vo.ArtVO;
import com.koreait.board.bean.vo.SubjectVO;
import com.koreait.board.util.MyUtil;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;

@Controller // cf.RestController
@Slf4j
@RequestMapping("/ex/*") // localhost:10000/ex 를 담당
public class ExampleController {

//	@GetMapping("")
//	public void nothing() {
//		log.info("Noting Method was Called");
//	}

	@GetMapping("sports")
	public void getSports() {
		// Controller에서 void 메서드는 메서드가 종료되면 자동으로
		// Mapping Keyword로 이동한다.
		// getSports는 templates/ex/sports.html로 이동한다.
		log.info(MyUtil.BLUE + "My favorate sports is the golf" + MyUtil.END);
	}

	@PostMapping("sports")
	public String postSports() {
		// Controller에서 void 메서드는 메서드가 종료되면 자동으로
		// Mapping Keyword로 이동한다.
		// getSports는 templates/ex/sports.html로 이동한다.
		log.info(MyUtil.BLUE + "(POST)My favorate sports is the golf" + MyUtil.END);
		return "index";
	}

	@GetMapping("music")
	public String getMusic() {
		log.info(MyUtil.BLUE + "My favorite music is the classical music" + MyUtil.END);
		return "ex/sports";
	}

	// 파라미터가 전달되는 경우
	// classical way
	// http://localhost:10000/ex/classic?title=nocturne&artist=Chopin
	@GetMapping("classic")
	public String classicTest(HttpServletRequest req) {
		String title = req.getParameter("title");
		String artist = req.getParameter("artist");
		log.info("classic : " + title + "(" + artist + ")");
		return "index";
	}
	
	// spring way I
	// http://localhost:10000/ex/modern?title=nocturne&artist=Chopin
	@GetMapping("modern")
	public String modernTest(String title, String artist) {
		log.info("modern : " + title + "(" + artist + ")");
		return "index";
	}
	// spring way II
	// http://localhost:10000/ex/modern2?t=nocturne&a=Chopin
	@GetMapping("modern2")
	public String modern2Test(@RequestParam("t") String title,
							  @RequestParam("a") String artist) {
		log.info("modern2 : " + title + "(" + artist + ")");
		return "index";
	}
	
	// spring way III
	// http://localhost:10000/ex/future?title=nocturne&artist=Chopin
	@GetMapping("future")
	public String futureTest(String title, ArtVO artVO) {
		// 1. artVo의 title로만 값이 들어간다.
		// 2. String title로만 값이 들어간다.
		// 3. ambigous 오류를 발생시킨다.
		// 4. 두 군데 모두 들어간다. (O)
		// title과 artVO의 title에 공통으로 값이 들어간다.
		log.info("future : "+ title);
		log.info("future : "+ artVO);
		return "index";
	}
	
	// query?title= &artist= &desc=
	@GetMapping("query")
	public void query(@ModelAttribute("MyModel") ArtVO vo, String desc) {
		vo.setTitle("Piano Concerto No.1");
		vo.setArtist("차이코프스키");
		vo.setDesc("desc");
	}

	
	@GetMapping("subject")
	public void subject() {
	}
	
	@GetMapping("subject2")
	public void subject2(Model model, int scoreC, int scoreJ, int scoreP, SubjectVO vo) {
		log.info("C : " + scoreC);
		log.info("Java : " + scoreJ);
		log.info("Python : " + scoreP);
		log.info("SubjectVO : " + vo);
		model.addAttribute("vo", vo);
		model.addAttribute("feel", "기분 안좋아");
	}
}
