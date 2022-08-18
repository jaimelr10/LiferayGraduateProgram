package tets;

import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

import main.Product;

class ProductTests {
	private Product testProduct = new Product("Libro", BigDecimal.valueOf(1), true, true);
	private Product testProductTT = new Product("Libro", BigDecimal.valueOf(1), true, true);
	private Product testProductTF = new Product("Libro", BigDecimal.valueOf(1), true, false);
	private Product testProductFT = new Product("Libro", BigDecimal.valueOf(1), false, true);
	private Product testProductFF = new Product("Libro", BigDecimal.valueOf(1), false, false);

	@Test
	void testRoundZero() {
		BigDecimal response = testProduct.roundTaxes(BigDecimal.valueOf(0.00));
		BigDecimal expectedResponse = BigDecimal.valueOf(0.00);
		assertTrue(response.compareTo(expectedResponse) == 0);
	}

	@Test
	void testRoundTwo() {
		BigDecimal response = testProduct.roundTaxes(BigDecimal.valueOf(0.02));
		BigDecimal expectedResponse = BigDecimal.valueOf(0.05);
		assertTrue(response.compareTo(expectedResponse) == 0);
	}

	@Test
	void testRoundFive() {
		BigDecimal response = testProduct.roundTaxes(BigDecimal.valueOf(0.05));
		BigDecimal expectedResponse = BigDecimal.valueOf(0.05);
		assertTrue(response.compareTo(expectedResponse) == 0);
	}

	@Test
	void testRoundSix() {
		BigDecimal response = testProduct.roundTaxes(BigDecimal.valueOf(0.06));
		BigDecimal expectedResponse = BigDecimal.valueOf(0.1);
		assertTrue(response.compareTo(expectedResponse) == 0);
	}

	@Test
	void testRoundNine() {
		BigDecimal response = testProduct.roundTaxes(BigDecimal.valueOf(0.09));
		BigDecimal expectedResponse = BigDecimal.valueOf(0.1);
		assertTrue(response.compareTo(expectedResponse) == 0);
	}

	@Test
	void testRoundTen() {
		BigDecimal response = testProduct.roundTaxes(BigDecimal.valueOf(0.1));
		BigDecimal expectedResponse = BigDecimal.valueOf(0.1);
		assertTrue(response.compareTo(expectedResponse) == 0);
	}

	@Test
	void testRoundNinetyNine() {
		BigDecimal response = testProduct.roundTaxes(BigDecimal.valueOf(0.99));
		BigDecimal expectedResponse = BigDecimal.valueOf(1);
		assertTrue(response.compareTo(expectedResponse) == 0);
	}

	@Test
	void testCalculateTaxesPosibleCases() {
		assertTrue(BigDecimal.valueOf(0.1).compareTo(testProductFF.getTaxes()) == 0);
		assertTrue(BigDecimal.valueOf(0.15).compareTo(testProductTF.getTaxes()) == 0);
		assertTrue(BigDecimal.valueOf(0.0).compareTo(testProductFT.getTaxes()) == 0);
		assertTrue(BigDecimal.valueOf(0.05).compareTo(testProductTT.getTaxes()) == 0);
	}
}
