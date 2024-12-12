package com.nt.dao;

import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.model.Employee;

@Repository("empdao")
public class EmployeeDAOImplementation implements EmployeeDAO {
	
	@Autowired
	private DataSource ds;
	
	 String GET_EMP_BY_DESIGNATION="SELECT * FROM EMPLOYEE WHERE JOB IN(?,?,?)";

	@Override
	public List<Employee> showEmployeeByDesignation(String designation1, String designation2, String designation3)throws Exception{
		List<Employee> listofEmployees=new ArrayList<Employee>();
		//System.out.println(ds.getClass());
		
		System.out.println(ds);
		System.out.println("dao class method startted");
		try(Connection con=ds.getConnection()){
		PreparedStatement ps=con.prepareStatement(GET_EMP_BY_DESIGNATION);
		ps.setString(1, designation1);
		ps.setString(2, designation2);
		ps.setString(3, designation3);
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			Employee e=new Employee();
			e.setEmpno(rs.getInt(1));
			e.setName(rs.getString(2));
			e.setJob(rs.getString(3));
			e.setSal(rs.getInt(4));
			e.setDeptno(rs.getInt(5));
			e.setGrossSalary(rs.getFloat(6));
			e.setNetSalary(rs.getFloat(7));
			listofEmployees.add(e);
			
		}
		
		}
		//System.out.println(listofEmployees);
		return listofEmployees;
	}

}
