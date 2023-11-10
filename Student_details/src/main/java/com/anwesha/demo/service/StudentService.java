package com.anwesha.demo.service;
import java.util.List;
import com.anwesha.demo.model.Student;
public interface StudentService {
		
		List<Student> getAllStudent();
		Student getStudentById(Long id);
		Student saveStudent(Student student);

	}


