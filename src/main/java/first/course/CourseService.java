package first.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;	//so spring injects the instance of topicRepo here in the service
	
	public List<Course> getAllTopics(){
		List<Course> courses= new ArrayList<>();
		courseRepository.findAll().forEach(courses::add);	//adds to topics list topic objects from topicRepo
		return courses;
		}
	
	public Course getCourse(String id){
		return courseRepository.findOne(id); //iterates in the courseRepo to find the id that matches with the argument id in an elegant way
	}
	
	public void addCourse(Course course){ 
		courseRepository.save(course);
		
		}
	
	public void updateCourse(Course course){
		courseRepository.save(course);
	}
	
	public void deleteCourse(String id){
		courseRepository.delete(id);
		
	}
}
