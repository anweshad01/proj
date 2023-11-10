package com.anwesha.demo.StudentRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.anwesha.demo.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
