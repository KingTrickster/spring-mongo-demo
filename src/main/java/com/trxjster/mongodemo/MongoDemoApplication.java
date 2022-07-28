package com.trxjster.mongodemo;

import com.trxjster.mongodemo.model.Address;
import com.trxjster.mongodemo.model.Gender;
import com.trxjster.mongodemo.model.Student;
import com.trxjster.mongodemo.repo.StudentRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;

@SpringBootApplication
public class MongoDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongoDemoApplication.class, args);
    }

    //TODO: Remove bean underneath, change for service and controller layers implementation
    @Bean
    CommandLineRunner runner(StudentRepo repo){
        return  args -> {
            Address address = new Address("Mexico", "Mexico City", "55123");
            Student student = new Student(
                    "Mike",
                    "Mock",
                    "mike2@mail.com",
                    Gender.MALE,
                    address,
                    List.of("Computer Science", "Videogames"),
                    BigDecimal.TEN,
                    LocalDateTime.now()
            );
            repo.insert(student);
        };
    }

}
