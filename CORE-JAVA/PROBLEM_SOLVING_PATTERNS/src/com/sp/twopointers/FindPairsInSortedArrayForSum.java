package com.sp.twopointers;

import java.util.Scanner;

public class FindPairsInSortedArrayForSum {
	public static void main(String[] args) {
		int a[]= {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		System.out.println("Enter the key to find as sum");
		Scanner sc=new Scanner(System.in);
		int key=sc.nextInt();
		int start=0,end=a.length-1;
		while(start<end) {
			if(a[start]+a[end]==key)
			{
				System.out.println(start+" "+end);
				break;
			}
			else if(a[start]+a[end]<key) start++;
			else end--;
		}
		if(start==end)
			System.out.println("Key not found as sum");
		sc.close();
	}
}

/*
Finding Pairs in an Array (Sum of Two Elements)
Problem: Given a sorted array, find two elements whose sum equals a target value.

Solution:

Initialize one pointer at the beginning (left) and the other at the end (right) of the array.
While the left pointer is less than the right pointer:
If the sum of the elements at the left and right pointers is equal to the target, return the pair.
If the sum is less than the target, increment the left pointer to increase the sum.
If the sum is greater than the target, decrement the right pointer to decrease the sum.
This approach runs in O(n) time, where n is the length of the array.
*/
