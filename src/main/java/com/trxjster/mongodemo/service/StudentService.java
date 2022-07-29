package com.trxjster.mongodemo.service;

import com.trxjster.mongodemo.model.Student;
import com.trxjster.mongodemo.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public List<Student> getAll(){
        return studentRepo.findAll();
    }

    public Student getStudentById(String id){
        return studentRepo.findStudentById(id).orElseThrow(() -> new IllegalStateException("Student with id "+id + " does not exist"));
    }

    public Student createStudent(Student student){
        return studentRepo.save(student);
    }

}
