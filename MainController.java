

package com.sb.controller;

	

	import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

	@RestController
	public class MainController {

		@GetMapping("/")
		public String hello() {
			
			return "Hello Controller";
		}

	}


	


