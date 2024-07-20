package com.Elearning.Elearning.Service.IService;

import com.Elearning.Elearning.Entity.Course;

import java.util.List;
import java.util.Optional;

public interface ICourseService {
    public Course createCourse(Course course);
    public Course updateCourse(Course course);
    public List<Course> findAllCourses();
    public Optional<Course> findCourseById(long id);
    public void deleteCourse(long id);
}
