package com.jsp.demppackage1;

import java.util.Scanner;

public class DemoApp {
	public void sayHello(String username)
	{
		System.out.println("DemoApp.sayHello()");
		for(int i=1;i<=10;i++)
		{
			System.out.println(username+" "+ i);
		}
		System.out.println("End of sayHello");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr msg");
		String msg=sc.next();
		displayMessage(msg);
	}
	
	public void displayMessage(String msg)
	{
		System.out.println("DemoApp.displayMsg()" +msg);
		System.out.println("DemoApp.displayMsg()" +msg);
		printNumbers(10);
	}
	
	public void printNumbers(int n)
	{
		for(int i=1;i<=n;i++)
		{
			System.out.println(i);
		}
		System.out.println("end");
	}
	
	public int add(int a,int b)
	{
		System.out.println("DemoApp.add()");
		return a+b;
	}
	
	public int sub(int a,int b)
	{
		System.out.println("DemoApp.sub()");
		return a-b;
	}
	
	public static void main(String[] args) {
		
		DemoApp app1=new DemoApp();
		app1.sayHello("raja");
		app1.add(10, 20);
		app1.sub(10, 20);
		
	}

}
