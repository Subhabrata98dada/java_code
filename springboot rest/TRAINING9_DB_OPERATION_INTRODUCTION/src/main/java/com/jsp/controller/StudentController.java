package com.jsp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.entity.Student;
import com.jsp.repository.StudentRepository;

@RestController
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepo;
	@PostMapping("/save")
	public String saveStudent(@RequestBody Student student)
	{
		studentRepo.save(student);
		return "student saved";
	}
	
	@GetMapping("/single/{id}")
	public Student getStudentById(@PathVariable Integer id)
	{
		Optional<Student> opt= studentRepo.findById(id);
		if(opt.isPresent()) return opt.get();
		else return null;
	}
	
	@GetMapping("/findall")
	public List<Student> findAllStudent()
	{
		List<Student> students= studentRepo.findAll();
		return students;
	}
	
	@PutMapping("/update")
	public String updateStudent(@RequestBody Student student)
	{
		studentRepo.save(student);
		return "record updated";
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteMapping(@PathVariable Integer id)
	{
		Optional<Student> opt= studentRepo.findById(id);
		if(opt.isPresent())
		{
			Student s= opt.get();
			studentRepo.delete(s);
			return "Student dleted";
		}
		else
		{
			return "student not found";
		}
	}

}
