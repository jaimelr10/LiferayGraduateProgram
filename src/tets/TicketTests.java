package tets;

import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import main.Product;
import main.Ticket;

class TicketTests {

	List<Product> testProductList = new ArrayList<>();
	private Product testFirstProduct = new Product("Libro", BigDecimal.valueOf(1), false, true);
	private Product testSecondProduct = new Product("Perfume improtado", BigDecimal.valueOf(1), true, false);

	@Test
	void testCalculateCosts() {
		testProductList.add(testFirstProduct);
		testProductList.add(testSecondProduct);
		Ticket ticket = new Ticket(testProductList);
		
		BigDecimal expectedPrice = BigDecimal.valueOf(2.15);
		BigDecimal expectedTaxes = BigDecimal.valueOf(0.15);
		
		assertTrue(ticket.getTotalPrice().compareTo(expectedPrice) == 0);
		assertTrue(ticket.getTotalTaxes().compareTo(expectedTaxes) == 0);
	}

}
