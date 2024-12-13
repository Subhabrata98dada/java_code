package com.sp.arraysearch;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		int a[]= {0, 1, 1, 2, 3, 4, 4, 5, 7, 8};
		int min=0;
		int max=a.length-1;
		System.out.println("Enter the element too be searched");
		Scanner sc=new Scanner(System.in);
		int key=sc.nextInt();
		while(min<=max)
		{
			int mid=(min+max)/2;
			if(a[mid]==key) {
				System.out.println("the element present at index : "+mid);
				break;
			}
			else if(key<a[mid]) max=mid-1;
			else min=mid+1;
		}
		sc.close();
	}

}
