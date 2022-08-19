package main;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Product {
	private String name;
	private BigDecimal price;
	private BigDecimal taxes;

	public Product(String name, BigDecimal price, boolean isImported, boolean isBasicTaxFree) {
		this.name = name;
		this.price = price;
		calculateTaxes(isImported, isBasicTaxFree);
	}

	protected void calculateTaxes(boolean isImported, boolean isBasicTaxFree) {
		BigDecimal importTax = new BigDecimal(0);
		BigDecimal basicTax = new BigDecimal(0);

		if (isImported) {
			importTax = roundTaxes(this.price.multiply(BigDecimal.valueOf(0.05)));
		}

		if (!isBasicTaxFree) {
			basicTax = roundTaxes(this.price.multiply(BigDecimal.valueOf(0.1)));
		}

		BigDecimal finalTaxes = importTax.add(basicTax);
		BigDecimal finalProductPrice = this.price.add(finalTaxes);

		BigDecimal roundedPrice = BigDecimal.valueOf(Math.ceil(finalProductPrice.doubleValue() * 100) / 100);

		this.setPrice(roundedPrice);
		this.setTaxes(finalTaxes);
	}

	public BigDecimal roundTaxes(BigDecimal taxesCalculated) {
		BigDecimal roundedTaxes = BigDecimal.valueOf(Math.ceil(taxesCalculated.doubleValue() * 20) / 20);
		return roundedTaxes.setScale(2, RoundingMode.HALF_UP);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal finalProductPrice) {
		this.price = finalProductPrice;
	}

	public BigDecimal getTaxes() {
		return taxes;
	}

	public void setTaxes(BigDecimal finalTaxes) {
		this.taxes = finalTaxes;
	}

	public String printProduct() {
		return "1 " + name + " a " + price + " €";
	}
}
