package com.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/home")
	public ResponseEntity<String> getMessage(){
		return new ResponseEntity<>("Hello Sam Bahadur...!!!", HttpStatus.OK);
	}
}
