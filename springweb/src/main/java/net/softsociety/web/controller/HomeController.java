package net.softsociety.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

/**
 * 메인화면
 */
@Slf4j
@Controller
public class HomeController {

	/**
	 * 메인화면
	 */
	@GetMapping({"", "/"})
	public String home() {
		return "home";
	}

	
	// redirect를 안붙히면 templates 폴더안 board 폴더안 list.html을 열어라
	// redirect를 붙히면 해당 주소로 get으로 접근
}
