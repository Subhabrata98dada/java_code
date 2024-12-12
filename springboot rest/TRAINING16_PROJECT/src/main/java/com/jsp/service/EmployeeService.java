package com.jsp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jsp.dao.EmployeeDAO;
import com.jsp.dto.ResponseStructure;
import com.jsp.entity.Employee;
import com.jsp.exception.IdDoesNotExistException;


@Service
public class EmployeeService {
	@Autowired
	private EmployeeDAO empDAO;
	public ResponseEntity<ResponseStructure<Employee>> saveEmployee(Employee employee)
	{
		Employee reciveEmployee= empDAO.saveEmplyeeData(employee);
		ResponseStructure<Employee> response=new ResponseStructure<Employee>();
		response.setStatuscode(HttpStatus.CREATED.value());
		response.setMessage("sucess");
		response.setData(reciveEmployee);
		return new ResponseEntity<ResponseStructure<Employee>>(response,HttpStatus.CREATED);
	}
	
	public ResponseEntity<ResponseStructure<Employee>> getEmployeeById(Integer id) throws IdDoesNotExistException
	{
		Employee emp=empDAO.getEmployeeByiId(id);
		if(emp!=null)
		{
			ResponseStructure<Employee> response=new ResponseStructure<Employee>();
			response.setStatuscode(HttpStatus.OK.value());
			response.setMessage("sucess");
			response.setData(emp);
			return new ResponseEntity<ResponseStructure<Employee>>(response,HttpStatus.OK);
		}
		else
		{
			throw new IdDoesNotExistException("ID : "+id+" not present in the database");
		}
	}
}
