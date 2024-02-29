package com.anti.weblerschoolmanytomanygyepi.controller;

import com.anti.weblerschoolmanytomanygyepi.entity.Course;
import com.anti.weblerschoolmanytomanygyepi.entity.School;
import com.anti.weblerschoolmanytomanygyepi.service.CourseService;
import com.anti.weblerschoolmanytomanygyepi.service.SchoolService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api")
@RestController
public class CourseController {

    private final CourseService courseService;

    private final SchoolService schoolService;

    @GetMapping("/courses")
    public ResponseEntity<List<Course>> renderAllUsers() {
        return ResponseEntity.status(200).body(courseService.findAllCourses());
    }

    @PostMapping("/courses")
    public Course addNewCourse(@RequestBody Course course) {
        School school = schoolService.findSchoolByNameIgnoreCase(course.getSchool().getName());
        System.out.println(school);
        return courseService.saveCourse(course);
    }

    @DeleteMapping("/courses/{id}")
    public void deleteCourse(@PathVariable("id") long id) {
        courseService.deleteCourse(id);
    }

    @PutMapping("/courses/{id}")
    public Course updateCourse(@PathVariable("id") long id, @RequestBody Course course) {
        return courseService.updateSchool(id, course);
    }
}
//https://www.bezkoder.com/jpa-one-to-many/