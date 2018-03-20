package org.wecancodeit.ecom.catalog;

public class Product {

	private String name;

	private Product() {}
	
	public Product(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
