package com.manu.expenser;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping("/islive")
	@ResponseBody
	public String liveCheck(){
		return "I'm live, its " + LocalDateTime.now() + " Here..!";
	}
}
