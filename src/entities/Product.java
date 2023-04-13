package entities;

import java.util.Objects;

public class Product {
	
	private String name;
	private Double price;
	private int quantity;
	
	public Product() {
	}
	
	public Product(String name, Double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}	

	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name	+ ", price=" + String.format("%.2f", price) + "]";
			
	}
	
	public static boolean staticProductPredicate(Product p) {		
			return p.getPrice() >= 100.0;		
	}
	
	public boolean nonStaticProductPredicate() {		
		return price >= 100.0;		
	}
	
	public static void staticPriceUpdate(Product p) {		
		p.setPrice(p.getPrice() * 1.1);		
	}
	
	public void nonStaticPriceUpdate() {		
		price = price * 1.1;		
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(name, other.name) && Objects.equals(price, other.price);
	}
	
	
	
}
