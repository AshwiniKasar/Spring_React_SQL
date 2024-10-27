package com.springReact.arjunCode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springReact.arjunCode.model.Student;
import com.springReact.arjunCode.repository.StudenttRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudenttRepository studentRepository;
	
	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

}
