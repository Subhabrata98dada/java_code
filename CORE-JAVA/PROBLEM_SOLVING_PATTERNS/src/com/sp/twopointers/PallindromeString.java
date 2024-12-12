package com.sp.twopointers;

public class PallindromeString {
	public static void main(String[] args) {
		String s="malayalam";
		int start=0;
		int end=s.length()-1;
		while(start<end)
		{
			if(s.charAt(start) != s.charAt(end))
			{
				System.out.println("Not pallindrome");
				break;
			}
			start++;
			end--;
		}
		if(start==end && start==s.length()/2)
			System.out.println("Pallindrome");
	}
}
