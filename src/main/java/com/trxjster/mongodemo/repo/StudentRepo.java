package com.trxjster.mongodemo.repo;

import com.trxjster.mongodemo.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends MongoRepository<Student, String> {
}
