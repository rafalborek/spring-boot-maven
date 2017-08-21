package pl.rafalborek.springbootsimpleexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.rafalborek.springbootsimpleexample.model.Topic;
import pl.rafalborek.springbootsimpleexample.service.TopicService;

@RestController
@RequestMapping("/topics")
public class TopicRestController {

	@Autowired
	private TopicService topicService;
	
	@GetMapping("")
	private List<Topic> getAllTopics(){
		return topicService.getAllTopics();
	}
	
	
	
	@PostMapping("")
	public void addTopic(@RequestBody Topic topic) {
		topicService.add(topic);
	}
	
	@GetMapping("/{id}")
	public Topic getTopic(@PathVariable Long id) {
		return topicService.getTopic(id);	
	}
	
	@PutMapping("/{id}")
	public void updateTopic(@PathVariable Long id, @RequestBody Topic topic) {
		topicService.update(id, topic);
		
		
	}
	
	@DeleteMapping("/{id}")
	public void deleteTopic(@PathVariable Long id) {
		topicService.delete(id);
	
	}
	
}
