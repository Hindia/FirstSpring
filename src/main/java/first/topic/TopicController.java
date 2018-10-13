package first.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics(){
		return Arrays.asList(
				new Topic("id","spring","description"),
				new Topic("id2","spring2","description2"),
				new Topic("id3","spring3","description3")				
				);
	
	}

}
