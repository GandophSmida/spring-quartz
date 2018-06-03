package com.luna.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QuartzController {
	@ResponseBody
	@RequestMapping("login")
	private String hello(@RequestParam(value="username",required=false)String username,
			@RequestParam(value="password",required=false)String password){
		return "Hello,"+username+"Your password is:"+password;
	}
}
