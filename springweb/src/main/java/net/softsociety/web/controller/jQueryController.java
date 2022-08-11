package net.softsociety.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("jq")
@Controller
public class jQueryController {
	
	@GetMapping("jq1")
	public String js1() {
		return "/jQueryView/jq1";
	}
	
	@GetMapping("jq2")
	public String js2() {
		return "/jQueryView/jq2";
	}
	
	@GetMapping("jq3")
	public String js3() {
		return "/jQueryView/jq3";
	}
}
