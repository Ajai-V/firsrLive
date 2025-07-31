package com.example.Project.controller;


import com.example.Project.model.Course;
import com.example.Project.model.CourseRegistry;
import com.example.Project.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5500")
public class CourseController {

    @Autowired
    CourseService courseService;


    @GetMapping("courses")
    public List<Course> availableCourses()0{
        return  courseService.availableCourses();
    }

    @GetMapping("courses/enrolled")
    public  List<CourseRegistry> enrolledStudents(){
        return  courseService.enrolledStudents();
    }

    @PostMapping("/courses/register")
    public String enrollCourse(@RequestParam("name") String name,
                               @RequestParam("emailId") String emailId,
                               @RequestParam("courseName") String courseName){

        courseService.enrollCourse(name,emailId,courseName);
        return "Congrats " + name +" enrollment successfully for " +courseName +" Course";

    }

}
