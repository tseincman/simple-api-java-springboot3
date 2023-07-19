package com.tmseincman.SimpleAPI.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query(nativeQuery = true, value = "SELECT * FROM tb_student WHERE email = :email")
    Optional<Student> findStudentByEmail(String email);
}
