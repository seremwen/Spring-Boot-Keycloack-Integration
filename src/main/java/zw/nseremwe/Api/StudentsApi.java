package zw.nseremwe.Api;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentsApi {

    @GetMapping("/all")
    @PreAuthorize("hasRole('ADMISSIONS')")
    public List<Student> getAll() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "John Doe"));
        students.add(new Student(2, "Jane Smith"));
        students.add(new Student(3, "Bob Johnson"));
        return students;
    }

    // Sample Student class
    private static class Student {
        private int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }
}