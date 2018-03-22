package org.wecancodeit.ecom.catalog;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	@GeneratedValue
	private long id;
	
	private String name;
	
	public String getName() {
		return name;
	}
	
	public long getId() {
		return id;
	}

	@SuppressWarnings("unused") // needed for JSON/JPA
	private Product() {}
	
	public Product(String name) {
		this.name = name;
	}
}
