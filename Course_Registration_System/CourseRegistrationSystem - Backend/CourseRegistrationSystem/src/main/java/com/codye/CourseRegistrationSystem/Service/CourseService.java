package com.codye.CourseRegistrationSystem.Service;

import com.codye.CourseRegistrationSystem.Reposistory.CourseRegistryRepo;
import com.codye.CourseRegistrationSystem.Reposistory.CourseRepo;
import com.codye.CourseRegistrationSystem.model.Course;
import com.codye.CourseRegistrationSystem.model.CourseRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepo courseRepo;
    @Autowired
    CourseRegistryRepo courseregistryRepo;

    public List<Course> availableCourses() {
        return courseRepo.findAll();
    }

    public List<CourseRegistry> entrollstudents() {
        return courseregistryRepo.findAll();
    }

    public void entrollCourse(String name, String emailId, String courseName) {
        CourseRegistry courseRegistry = new CourseRegistry(name, emailId, courseName);
        courseregistryRepo.save(courseRegistry);
    }
}
