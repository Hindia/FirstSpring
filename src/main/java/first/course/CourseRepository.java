package first.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import first.topic.Topic;

public interface CourseRepository extends CrudRepository<Course, String>{
	public List<Course> findByTopicId(String topicId);
	

}
