package com.jsp.jdbctest;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/enroll")
public class ReferToEnrollSubjectServlet extends GenericServlet {

	public ReferToEnrollSubjectServlet() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Enroll form");
		String subject=req.getParameter("subject");
		System.out.println(subject);
		RequestDispatcher rd=req.getRequestDispatcher("/enroll.jsp");
		rd.forward(req, res);
		
	}

}
