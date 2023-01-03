package com.learnjpa.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.learnjpa.course.Course;
import com.learnjpa.course.jdbc.courseRepository;
import com.learnjpa.course.jdbc.jpa.CourseJpaRepository;
import com.learnjpa.course.springDataJPA.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//	@Autowired
//	private courseRepository repository;
	
//	@Autowired
//	private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//repository.insert();
		
		/*
		repository.insert(new Course(1,"Learn JPA", "RAhul"));
		repository.insert(new Course(2,"Learn DevOps NOw", "RAhul"));
		repository.insert(new Course(3,"Learn Azure NOw", "RAhul"));
		
		repository.deleteById(3);
		System.out.println(repository.findById(2));
		System.out.println(repository.findById(1));
		*/
		repository.save(new Course(1,"Learn JPA", "RAhul"));
		repository.save(new Course(2,"Learn DevOps NOw", "RAhul"));
		repository.save(new Course(3,"Learn Azure NOw", "RAhul"));
		
		repository.deleteById(3l);
		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(1l));
		
		System.out.println(repository.count());
		System.out.println(repository.findAll());
		System.out.println(repository.findByAuthor("RAhul"));
		System.out.println(repository.findByAuthor(" "));
		System.out.println(repository.findByName("Learn JPA"));
		System.out.println(repository.findByName(""));
		
	}

}
