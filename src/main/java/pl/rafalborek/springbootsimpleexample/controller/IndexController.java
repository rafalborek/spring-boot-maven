package pl.rafalborek.springbootsimpleexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pl.rafalborek.springbootsimpleexample.service.TopicService;
import pl.rafalborek.springbootsimpleexample.model.Topic;

@Controller
public class IndexController {

	@Autowired
	private TopicService topicService;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	

	
	
}
