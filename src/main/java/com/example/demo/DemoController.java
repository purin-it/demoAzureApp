package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

	//@GetMapping("/")
	@RequestMapping("/")
	public String index(Model model){
		model.addAttribute("message", "Hello App Service!!");
		return "index";
	}
}
