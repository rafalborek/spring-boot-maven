package pl.rafalborek.springbootsimpleexample.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.rafalborek.springbootsimpleexample.model.Topic;

public interface TopicRepository extends JpaRepository<Topic, Long> {

}
