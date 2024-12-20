package com.jsp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.entity.Student;
import com.jsp.responsestructure.ResponseStructure;

@RestController
public class DemoController {
	
	@PostMapping("/save/{rol}")
	public ResponseEntity<ResponseStructure<Student>> saveStudent(@PathVariable Integer rol)
	{
		if(rol==1)
		{
			Student s=new Student();
			s.setRol(rol);
			s.setName("raja");
			s.setHeight(6.1);
			ResponseStructure<Student> rs=new ResponseStructure<Student>();
			rs.setStatusCode(200);
			rs.setMessage("sucess");
			rs.setData(s);
			return new ResponseEntity<ResponseStructure<Student>>(rs,HttpStatus.OK);
		}
		else
		{
			ResponseStructure<Student> rs=new ResponseStructure<Student>();
			rs.setStatusCode(404);
			rs.setMessage("id not found");
			rs.setData(null);
			return new ResponseEntity<ResponseStructure<Student>>(rs,HttpStatus.NOT_FOUND);
		}
	}
		@GetMapping("/get")
		public ResponseEntity<ResponseStructure<Student>> getStudent()
		{
			Student s= new Student();
			s.setRol(1);
			s.setName("raja");
			s.setHeight(5.8);
			ResponseStructure<Student> rs=new ResponseStructure<Student>();
			rs.setStatusCode(200);
			rs.setMessage("sucess");
			rs.setData(s);
			ResponseEntity<ResponseStructure<Student>> re=new ResponseEntity<ResponseStructure<Student>>(rs,HttpStatus.OK);
			return re;
	     }
	
}
