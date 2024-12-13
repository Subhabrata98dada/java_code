package com.sp.arraysort;

import java.util.Arrays;

public class InsertionSort {public static void main(String[] args) {
	int a[]= {2,1,4,3,1,7,8,0,5,4};
	for(int i=1;i<a.length;i++)
	{
		int key=a[i];
		int j=i-1;
		while(j>=0 && key<a[j])
		{
			a[j+1]=a[j];
			j--;
		}
		a[j+1]=key;
	}
	System.out.println(Arrays.toString(a));
 }
}
