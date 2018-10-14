package first.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;	//so spring injects the instance of topicRepo here in the service
	
	public List<Topic> getAllTopics(){
		List<Topic> topics= new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);	//adds to topics list topic objects from topicRepo
		return topics;
		}
	
	public Topic getTopic(String id){
		return topicRepository.findOne(id); //iterates in the topicRepo to find the id that matches with the argument id in an elegant way
	}
	
	public void addTopic(Topic topic){ 
		topicRepository.save(topic);
		
		}
	
	public void updateTopic(Topic topic, String id){
		topicRepository.save(topic);
	}
	
	public void deleteTopic(String id){
		topicRepository.delete(id);
		
	}
}
