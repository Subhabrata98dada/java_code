package com.jsp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
