package com.API.Acutator.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.API.Acutator.bean.Sportsperson;

@RestController
public class Controller {

@Autowired
private Sportsperson sportsperson;
	

@GetMapping("/legend")
public Map<String, String> getname()
{
	return Map.of("Cr7","Vk18");
	
}
	
	
	
}
