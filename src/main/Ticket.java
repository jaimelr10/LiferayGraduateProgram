package main;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Ticket {

	private List<Product> productList = new ArrayList<>();
	private BigDecimal totalTaxes = BigDecimal.valueOf(0);
	private BigDecimal totalPrice = BigDecimal.valueOf(0);
	
	public Ticket(List<Product> productList) {
		this.productList = productList;
		this.calculateCosts(productList);
	}

	private void calculateCosts(List<Product> productList) {
		for (Product product : productList) {
			this.setTotalPrice(this.totalPrice.add(product.getPrice()));
			this.setTotalTaxes(this.totalTaxes.add(product.getTaxes()));
		}
	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	public BigDecimal getTotalTaxes() {
		return totalTaxes;
	}

	public void setTotalTaxes(BigDecimal totalTaxes) {
		this.totalTaxes = totalTaxes;
	}

	public BigDecimal getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}

	public void printTicket() {
		for(Product product : this.productList) {
			System.out.println("1 "+product.getName()+ ": "+product.getPrice()+"€");
		}
		System.out.println("Impuestos sobre las ventas: "+this.getTotalTaxes()+" €");
		System.out.println("Total: "+this.getTotalPrice()+" €");
	}
}
