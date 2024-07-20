package com.Elearning.Elearning.Service;

import com.Elearning.Elearning.Entity.Course;
import com.Elearning.Elearning.Entity.Session;
import com.Elearning.Elearning.Repository.CourseRepository;
import com.Elearning.Elearning.Service.IService.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService implements ICourseService {
    @Autowired
    private CourseRepository courseRepository;

    public Course createCourse(Course course)
    {
        return courseRepository.save(course);
    }
    public Course updateCourse(Course course)
    {
        if(findCourseById(course.getId()).isPresent())
        {
            return courseRepository.save(course);
        }
        return null;
    }

    public List<Course> findAllCourses()
    {
        return courseRepository.findAll();
    }

    public Optional<Course> findCourseById(long id)
    {
        return courseRepository.findById(id);
    }

    public void deleteCourse(long id)
    {
        courseRepository.deleteById(id);
    }
}
