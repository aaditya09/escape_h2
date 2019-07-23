package com.example.demo.repository;

import com.example.demo.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Aaditya.t on 22/7/19.
 */

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
