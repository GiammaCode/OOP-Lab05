package it.unibo.oop.lab05.ex2;

import java.util.Comparator;

public class MyComparator implements Comparator<String> {
	
	public MyComparator() {
		super();
	}
	
	public int compare(final String str1, final String str2) {
		return str1.compareTo(str2);
	}
		
}
