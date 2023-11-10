package com.anwesha.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anwesha.demo.StudentRepository.StudentRepository;
import com.anwesha.demo.model.Student;

@Service
public class StudentserviceImpl implements StudentService  {

	@Autowired //inject repository dependency
	StudentRepository studentRepository;
	
	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student); //save student
	}
	
	@Override
	public Student getStudentById(Long id) {
		Optional<Student> student = studentRepository.findById(id);
		if(student.isPresent())
		{	
		return  student.get();
		}
		return null;
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> students = new ArrayList<Student>(); //create list of students variable
		studentRepository.findAll().forEach(student ->students.add(student)); // keep each student in students list
		return students;
	}
	
//	@Override
//	public Student updateStudent(Long id, Student student) {
//		Optional<Student> studentById = studentRepository.findById(id);
//		
//		if(studentById.isPresent()) { 
//			Student updatedStudent = studentById.get();
//		
//			updatedStudent.setId(student.getId());
//			updatedStudent.setFirstName(student.getFirstName());
//			updatedStudent.setLastName(student.getLastName());
//		
//			
//			return studentRepository.save(updatedStudent);
//		}
//		
//		return null;
//	}

//	@Override
//	public String deleteStudent(Long id) {
//		studentRepository.deleteById(id); //delete student by id
//		return "id" + id + "is deleted successfully"; 
//	}

}
