package com.springboot.hotjar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String renderDashboard() {
		return "dashboard";
	}
	
	@GetMapping("/about")
	public String aboutHandler() {
		return "about";
	}
}
