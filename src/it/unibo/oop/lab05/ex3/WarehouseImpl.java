package it.unibo.oop.lab05.ex3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class WarehouseImpl implements Warehouse {
	
	private Set<Product> warehouse = new HashSet<>();
	
	public WarehouseImpl() {}
	
	public void addProduct(Product p) {
		warehouse.add(p);
	}
	
	public Set<String> allNames(){
		Set<String> warehouseNames = new HashSet<>();
		for(Product p : warehouse) {
			warehouseNames.add(p.getName());
		}
		return warehouseNames;
	}
	
	public boolean containsProduct(Product p) {
		if(warehouse.contains(p)) {
			System.out.println("warehouse contains product " + p.getName());
			return true;
		}
		System.out.println("warehouse don't conains product " + p.getName());
		return false;
	}
	
	public double getQuantity(String name) {
		for(Product p : warehouse) {
			if(p.getName().equals(name)) {
				return p.getQuantity();
			}
		}
			return 0;	 
	}
	
	public Set<Product> allProducts() {
		Set<Product> allProduct = new HashSet<>();
		allProduct = warehouse;
		return allProduct;
	}
	
}
