package com.Elearning.Elearning.Controller;

import com.Elearning.Elearning.Entity.Course;
import com.Elearning.Elearning.Service.CourseService;
import com.Elearning.Elearning.Service.IService.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/course")
public class CourseController {
    @Autowired
    private ICourseService courseService;

    @GetMapping
    public List<Course> getCourses()
    {
        return  courseService.findAllCourses();
    }
    @PostMapping
    public Course addCourse(Course course)
    {
        return courseService.createCourse(course);
    }
    @PutMapping
    public Course updateCourse(Course course)
    {
        course.setSections(courseService.findCourseById(course.getId()).orElseThrow().getSections());
        return courseService.updateCourse(course);
    }
    @DeleteMapping("/{id}")
    public void updateCourse(@PathVariable long id)
    {
        courseService.deleteCourse(id);
    }

    @GetMapping("/{id}")
    public Optional<Course> getCourseById(@PathVariable long id)
    {
        return courseService.findCourseById(id);
    }
}
