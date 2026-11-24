package com.ecomm_git_training.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class EcommController {

	@GetMapping
	public String getCheck() {
		return "Ecomm API working";
	}
	

}
