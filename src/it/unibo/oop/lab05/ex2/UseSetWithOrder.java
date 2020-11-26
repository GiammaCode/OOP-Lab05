package it.unibo.oop.lab05.ex2;

import java.util.TreeSet;

/**
 * 
 */
public final class UseSetWithOrder {

    private UseSetWithOrder() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
        
    	final TreeSet<String> ordered = new TreeSet<>(new MyComparator());
    	for(int i=0; i<100; i++) {
    		ordered.add(Double.toString(Math.random()));
    	}
    	
    	for(var i : ordered) {
    		System.out.print(" " + i);
    	}
    	
//    	System.out.println();   	
//    	TreeSet<String> tree2 = new TreeSet<>();
//    	tree2 = ordered;
//    	tree2.stream().sorted(new MyComparator()).forEach(s -> System.out.print(s + " "));    	
//    	    	

    }
}
