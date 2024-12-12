package com.jsp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.entity.Student;
import com.jsp.repository.StudentRepository;

@RestController
public class DemoController {
	@Autowired
	StudentRepository studentRepo;
	@GetMapping("/find")
	public List<Student> getStudentByName(@RequestParam String name)
	{
		System.out.println(name);
		return  studentRepo.findByName(name);
	}
	@GetMapping("/find2")
	public List<Student> getStudentByHeight(@RequestParam Double height)
	{
		System.out.println(height);
		return  studentRepo.findByHeightGreaterThan(height);
	}
	@GetMapping("/find3")
	public List<Student> getStudentByHeight2(@RequestParam String name)
	{
		System.out.println(name);
		return  studentRepo.find(name);
	}
	@GetMapping("/find4")
	public List<Student> getStudentByHeight3(@RequestParam String name)
	{
		System.out.println(name);
		return  studentRepo.find2(name);
	}
}
