package zw.nseremwe.Api;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/courses")
public class CoursesApi {

    @GetMapping("/all")
    @PreAuthorize("hasRole('ACADEMICS')")
    public List<Course> getAllCourses() {
        List<Course> courses = new ArrayList<>();
        courses.add(new Course(101, "Introduction to Java"));
        courses.add(new Course(102, "Web Development with Spring Boot"));
        courses.add(new Course(103, "Database Design and SQL"));
        return courses;
    }

    // Sample Course class
    private static class Course {
        private int courseId;
        private String courseName;

        public Course(int courseId, String courseName) {
            this.courseId = courseId;
            this.courseName = courseName;
        }

        public int getCourseId() {
            return courseId;
        }

        public String getCourseName() {
            return courseName;
        }
    }
}