package com.sp.arraysearch;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		int a[]= {2,1,4,3,1,7,8,0,5,4};
		Scanner sc=new Scanner(System.in);
		int index=-1;
		System.out.println("Enter the element to be searched");
		int key=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)
			{
				index=i;
				break;
			}
		}
		System.out.println("Element found at index : "+index);
		sc.close();
	}
}
