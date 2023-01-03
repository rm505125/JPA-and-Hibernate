package com.learnjpa.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.learnjpa.course.Course;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

	@Autowired
	private courseRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//repository.insert();
		
		repository.insert(new Course(1,"Learn AWS NOw", "RAhul"));
		repository.insert(new Course(2,"Learn DevOps NOw", "RAhul"));
		repository.insert(new Course(3,"Learn Azure NOw", "RAhul"));
		
		repository.delete(3);
		System.out.println(repository.findById(2));
		System.out.println(repository.findById(1));
	}

}
