package com.example.aws.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping(path = "/api")
public class RestController {

	@GetMapping("/call")
	public ResponseEntity<String> helloAWS()
	{
		return new ResponseEntity<>("Hello AWS codebuild stack", HttpStatus.OK);
	}
}
