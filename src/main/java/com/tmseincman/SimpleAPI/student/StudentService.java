package com.tmseincman.SimpleAPI.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Service
public class StudentService {

    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Maria",
                        "maria@gmail.com",
                        LocalDate.of(1990, Month.DECEMBER, 16),
                        32
                )
        );
    }
}
