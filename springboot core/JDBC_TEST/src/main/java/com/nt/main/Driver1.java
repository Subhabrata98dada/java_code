package com.nt.main;

import java.util.Arrays;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;

public class Driver1 {
	public static void main(String[] args) {
		Child c1=new Child();
		c1.k=10;
		Child c2=new Child();
		c2.k=20;
		Child c3[]= {c1,c2};
		Arrays.sort(c3);
		System.out.println(Arrays.toString(c3));
		
		
	}

}

class MyThread implements Runnable
{

	@Override
	public void run() {
		for(int i=1;i<=5;i++)
		{
			System.out.println("MyThread "+i);
			try {
				Thread.sleep(200);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		
	}
	
}
