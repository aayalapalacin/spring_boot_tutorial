package com.example.springboot2.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args ->{
            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2000, Month.JANUARY,5)


            );

            Student sam = new Student(
                    "Sam",
                    "sam@gmail.com",
                    LocalDate.of(2000, Month.MAY,20)


            );
            repository.saveAll(
                    List.of(alex,sam)
            );

        };
    }
}
