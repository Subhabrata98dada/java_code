package com.nt.main;

import java.util.Comparator;

public class ChildComparator implements Comparator<Child>{

	@Override
	public int compare(Child o1, Child o2) {
		// TODO Auto-generated method stub
		return o1.k-o2.k;
	}

}
