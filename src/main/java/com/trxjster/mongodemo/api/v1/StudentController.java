package com.trxjster.mongodemo.api.v1;

import com.trxjster.mongodemo.model.Student;
import com.trxjster.mongodemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/{studentId}")
    public Student getStudentById(@PathVariable String studentId){
        return studentService.getStudentById(studentId);
    }

    @GetMapping
    public List<Student> getAllStudents(){
        return studentService.getAll();
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }
}
