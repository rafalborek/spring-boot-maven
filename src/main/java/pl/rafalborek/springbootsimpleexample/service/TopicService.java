package pl.rafalborek.springbootsimpleexample.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import pl.rafalborek.springbootsimpleexample.dao.TopicRepository;
import pl.rafalborek.springbootsimpleexample.model.Topic;;

@Service
@Transactional
public class TopicService {

	private final TopicRepository topicRepository;

	public TopicService(TopicRepository topicRepository) {
		this.topicRepository = topicRepository;
	}

	public List<Topic> getAllTopics() {
		// List<Topic> topics = new ArrayList<Topic>();
		// topicRepository.findAll().forEach(t ->topics.add(t));
		// return topics;
		return topicRepository.findAll();
	}

	public Topic getTopic(Long id) {
		return topicRepository.findOne(id);
		// return ((List<Topic>)topicRepository.findAll()).stream().filter(t ->
		// t.getId()==id).findFirst().get();

	}

	public void add(Topic topic) {
		if (topic.getId() == null || topicRepository.findOne(topic.getId()) == null)
			topicRepository.save(topic);
	}

	public void update(Long id, Topic topic) {
		topic.setId(id);
		if (topic.getId() != null && topicRepository.findOne(topic.getId()) != null)
			topicRepository.save(topic);
	}

	public void delete(Long id) {
		topicRepository.delete(id);
	}

}
