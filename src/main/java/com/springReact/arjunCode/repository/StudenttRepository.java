package com.springReact.arjunCode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springReact.arjunCode.model.Student;

@Repository
public interface StudenttRepository extends JpaRepository<Student, Integer>{

}
