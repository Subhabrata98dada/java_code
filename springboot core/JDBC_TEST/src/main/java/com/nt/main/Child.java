package com.nt.main;

public class Child extends Parent implements I,Comparable<Child>{
	public int k;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return k+"";
	}

	@Override
	public int compareTo(Child o) {
		// TODO Auto-generated method stub
		return this.k-o.k;
	}

}
