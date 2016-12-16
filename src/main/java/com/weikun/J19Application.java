package com.weikun;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@SpringBootApplication
public class J19Application {
	//@Value("${my.msg}")
	//private String helloName;
	@RequestMapping("/")
	public String index(){
		return "hello";
	}
	public static void main(String[] args) {
		SpringApplication.run(J19Application.class, args);
	}
}
