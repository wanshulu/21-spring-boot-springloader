package com.sgcc.dlsc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

	@RequestMapping("/show")
	public String showPage(Model model) {
		System.out.println("show======init===info123");
		model.addAttribute("msg", "这是一个消息123");
		return "index";
	}
}
