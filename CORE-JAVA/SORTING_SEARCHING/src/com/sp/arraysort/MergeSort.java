package com.sp.arraysort;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int a[]= {2,1,0,3,5,3,6,8,2,9,0};
		mergesort(a);
		System.out.println(Arrays.toString(a));
	}
	public static void mergesort(int a[])
	{
		if(a.length==1) return;
		int left[]=new int[a.length/2];
		int right[]=new int[a.length-left.length];
		for(int i=0;i<left.length;i++)
			left[i]=a[i];
		for(int i=0;i<right.length;i++)
			right[i]=a[left.length+i];
		mergesort(left);
		mergesort(right);
		merge(left, right, a);
		
	}
	public static void merge(int left[],int right[],int a[]) {
		int i=0;
		int j=0;
		int k=0;
		while(i<left.length && j<right.length)
		{
			if(left[i]<right[j]) a[k++]=left[i++];
			else a[k++]=right[j++];
		}
		while(i<left.length)
			a[k++]=left[i++];
		while(j<right.length)
			a[k++]=right[j++];
	}
}
