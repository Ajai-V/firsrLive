package com.example.Project.repository;

import com.example.Project.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course,String>{
}
