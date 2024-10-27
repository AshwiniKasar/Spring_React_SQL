package com.springReact.arjunCode.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springReact.arjunCode.model.Student;

@Service
public interface StudentService {

	public Student saveStudent(Student student);
	public List<Student> getAllStudents();
}
