package first.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	private List<Topic> topics= Arrays.asList(
			new Topic("id","spring","description"),
			new Topic("id2","spring2","description2"),
			new Topic("id3","spring3","description3")				
			);
	
	public List<Topic> getAllTopics(){ return topics;}
	
	public Topic getTopic(String id){
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();	//iterates in the list to find the id that matches with the argument id in an elegant waay
	}
}
