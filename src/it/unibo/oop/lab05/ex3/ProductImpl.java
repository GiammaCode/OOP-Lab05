package it.unibo.oop.lab05.ex3;

public class ProductImpl implements Product{
	private String nameProduct;
	private double quantity;
	
	public ProductImpl(final String nameProduct, double quantity) {
		this.nameProduct = nameProduct;
		this.quantity = quantity;
	}
	
	public String getName() {
		return this.nameProduct;
	}
	
	public double getQuantity() {
		return quantity;
	}
	
	
	public String toString() {
		return "[" + "name product: " + this.nameProduct 
				+ ", quantity: " + this.quantity + "]";
	}
	
	
}
