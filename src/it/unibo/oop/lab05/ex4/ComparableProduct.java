package it.unibo.oop.lab05.ex4;

import it.unibo.oop.lab05.ex3.Product;
import it.unibo.oop.lab05.ex3.ProductImpl;

public class ComparableProduct extends ProductImpl implements Comparable<Product> {

	public ComparableProduct(String nameProduct, double quantity) {
		super(nameProduct, quantity);
	}
	
	public int compareTo(final Product p2) {
		return getName().compareTo(p2.getName());
	}

//	@Override
//	public int compareTo(Product arg0) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
	
}
