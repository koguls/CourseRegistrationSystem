package com.codye.CourseRegistrationSystem.Contoller;

import com.codye.CourseRegistrationSystem.Service.CourseService;
import com.codye.CourseRegistrationSystem.model.Course;
import com.codye.CourseRegistrationSystem.model.CourseRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("courses")
    public List<Course> availableCourses(){
        return courseService.availableCourses();
    }

    @GetMapping("courses/entrolled")
    public List<CourseRegistry> entrollStudents(){
        return courseService.entrollstudents();
    }


    @PostMapping("courses/reg")
    public String enrollCourse(@RequestParam("name") String name,
                               @RequestParam("emailId") String emailId,
                               @RequestParam("courseName") String courseName){
        courseService.entrollCourse(name, emailId, courseName);
        return "Congratulation "+ name +" you succefully enroll " + courseName;

    }

}
