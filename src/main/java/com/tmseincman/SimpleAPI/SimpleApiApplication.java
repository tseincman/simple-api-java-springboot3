package com.tmseincman.SimpleAPI;

import com.tmseincman.SimpleAPI.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class SimpleApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleApiApplication.class, args);
	}
	@GetMapping
	public List<Student> hello(){
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
