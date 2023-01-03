package com.learnjpa.course.springDataJPA;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learnjpa.course.Course;

@Repository
public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {
	
	List<Course> findByAuthor(String author);
	List<Course> findByName(String name);
}
