package com.koustubha.NammaArea.controller;
/**
 * 
 * @author koustubha
 *
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/hello")
	public String hello() {
		
		return "Hello welcome to Namma Area Application";
	}
}
