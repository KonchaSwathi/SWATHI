package com.cts.training.Bootapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api")
public class TestController {
	@GetMapping("/test")
	public ResponseEntity<String>test(){
		ResponseEntity<String> response = new ResponseEntity<String>("Hello",HttpStatus.OK);
       
		return response;

	}

}
