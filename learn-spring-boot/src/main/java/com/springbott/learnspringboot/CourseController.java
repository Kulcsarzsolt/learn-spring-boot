package com.springbott.learnspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
                new Course(1, "Learn AWS", "Bill Gates"),
                new Course(2, "Learn DevOps", "Elon Musk"),
                new Course(3, "Learn Azure", "Jeff Bezos"),
                new Course(4, "Learn GCP", "Sundar Pichai")
        );
    }

}
