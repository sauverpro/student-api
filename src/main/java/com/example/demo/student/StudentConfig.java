package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.FEBRUARY;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student john = new Student(
                    "John",
                    "example@gmail.com",
                    LocalDate.of(2003, FEBRUARY, 3)
            );
            Student xavier = new Student(
                    "Xavier",
                    "example@gmail.com",
                    LocalDate.of(2001, FEBRUARY, 3)
            );
            repository.saveAll(
                    List.of(john, xavier)
            );
        };
    }
}
