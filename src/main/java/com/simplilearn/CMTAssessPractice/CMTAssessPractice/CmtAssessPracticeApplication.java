package com.simplilearn.CMTAssessPractice.CMTAssessPractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CmtAssessPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CmtAssessPracticeApplication.class, args);
	}
	@GetMapping("/")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("<h1>Hello %s!</h1> <h2>This is sample header</h2></br><h2>Output after first change</h2>", name);
	}

}
