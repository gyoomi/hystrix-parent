package com.gyoomi.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping(value = "/getUser",method = RequestMethod.GET)
	public String getUser(@RequestParam("username") String username) throws Exception{
		if(username.equals("hystrix")) {
			return "This is real user";
		}else {
			throw new Exception();
		}
	}
}
