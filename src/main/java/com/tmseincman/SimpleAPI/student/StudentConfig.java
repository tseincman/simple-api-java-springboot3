package com.tmseincman.SimpleAPI.student;

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
        return args -> {
            Student maria = new Student(
                    "Maria",
                    "maria@gmail.com",
                    LocalDate.of(1990, Month.DECEMBER, 16),
                    32
            );

            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(1989, Month.DECEMBER, 10),
                    33
            );

            repository.saveAll(List.of(maria, alex));
        };
    }
}
