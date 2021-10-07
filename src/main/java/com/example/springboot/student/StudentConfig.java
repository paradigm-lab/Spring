package com.example.springboot.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//What is a static import
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2003, JANUARY, 17)
            );

            Student matt = new Student(
                    "Matt",
                    "Matt@gmail.com",
                    LocalDate.of(1980, JANUARY, 15)
            );

            Student collin = new Student(
                    "Collin",
                    "collinsboniface1000@gmail.com",
                    LocalDate.of(2000, JANUARY, 8)
            );
            repository.saveAll(
                    List.of(collin, alex, matt)
            );
        };
    }
}
