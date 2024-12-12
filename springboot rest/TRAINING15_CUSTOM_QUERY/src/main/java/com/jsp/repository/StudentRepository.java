package com.jsp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jsp.entity.Student;
import java.util.List;


public interface StudentRepository extends JpaRepository<Student, Integer>{
     List<Student> findByName(String name);
     List<Student> findByHeightGreaterThan(Double d);
     @Query("select s from Student s where s.name=?1")
     List<Student> find(String n);
     @Query("select s from Student s where s.name=:n")
     List<Student> find2(String n);
}
