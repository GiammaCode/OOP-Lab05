package it.unibo.oop.lab05.ex1;

import java.util.Set;
import java.util.TreeSet;

/**
 * Example class using {@link Set}.
 * 
 */
public final class UseSet {
	
    private UseSet() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
    	
    	final TreeSet<String> tree = new TreeSet<>();

    	for(int i = 1; i <= 20; i++) {
    		tree.add(Integer.toString(i));
    	}
    	    	
    	for(var i : tree) {
    		System.out.print(" " + i);
    	}
    	
    	System.out.println();
    	
    	for(int i = 0; i <= 20; i++) {
    		if(i%3 == 0) {
    			tree.remove(new String("" + i));
    			//tree.remove(Integer.toString(i));
    		}
    	}
    	
    	for(var i : tree) {
    		System.out.print(" " + i);
    	}
    	
    }
}
