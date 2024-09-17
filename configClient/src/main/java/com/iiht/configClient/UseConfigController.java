package com.iiht.configClient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import lombok.Value;

@RestController
@RequestMapping("/readprops")
public class UseConfigController {
	
	@Value("${server.port}")
	String serverPort;
	
	@Value("${spring.application.name}")
	String appName;
	
	@Value("${name_test}")
	String name;
	
	@Value("${age}")
	String age;
	
	@GetMapping
	public String showProps() {
		return "port = "+serverPort+" AppName: "+appName+"name: "+name+"age: "+age;
	}
}
