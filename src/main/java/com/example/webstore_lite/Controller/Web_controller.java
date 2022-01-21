package com.example.webstore_lite.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.webstore_lite.Web_store;
import com.example.webstore_lite.Service.Web_Service;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;

@RestController
@RequestMapping("/web")
public class Web_controller {
	

	
//	private static final Logger Logger = LogManager.getLogger(Web_controller.class);
//
//	@GetMapping("/sam")
//	public String getme() {
//		 Logger.info("Starting Spring Boot application..");
//		    SpringApplication app = new SpringApplication(Web_controller.class);
//		    return "Log4j";
//	}
	
	@Autowired
	Web_Service ws;

	@PostMapping("/new")
	public String insertnew(@RequestBody Web_store p1) {

		return ws.insertserv(p1);
	}

	@GetMapping("/d")
	public List<Web_store> getctrl() {
		//Logger.info("Getting Data");
//	    SpringApplication app = new 
//	   SpringApplication(Web_controller.class);
		return ws.getsevice();
	}

	@GetMapping("/verif")
	String getverifctrl(@RequestParam 
			String email_id, 
			@RequestParam String pasword) {
		return ws.getverifserv(email_id, pasword);
	}

	@PutMapping("/insrt")
	public void updatectrl(@RequestBody Web_store p1) {
		ws.updateservice(p1);
	}

	@DeleteMapping("/dlt/{email_id}")
	public void dltctrl(@PathVariable String email_id) {
		ws.dltservice(email_id);
	}
}
