package main;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LiferayGraduateProgramExercise {

	public static void main(String[] args) {
		System.out.println("******************************************");
		System.out.println("********* Welcome to my solution *********");
		System.out.println("******************************************");

		Scanner sc = new Scanner(System.in);
		boolean closeMenu = false;

		while (!closeMenu) {
			printMenu();
			try {
				byte menuOption = sc.nextByte();

				switch (menuOption) {
				case 1:
					List<Product> productListInputOne = new ArrayList<>();
					Product book = new Product("Libro", BigDecimal.valueOf(12.49), false, true);
					Product musicCD = new Product("CD de música", BigDecimal.valueOf(14.99), false, false);
					Product chocolateBar = new Product("Barrita de chocolate", BigDecimal.valueOf(0.85), false, true);
					productListInputOne.add(book);
					productListInputOne.add(musicCD);
					productListInputOne.add(chocolateBar);
					Ticket ticketInputOne = new Ticket(productListInputOne);

					List<Product> productListInputTwo = new ArrayList<>();
					Product importedChocolateBox = new Product("Caja de bombones importados", BigDecimal.valueOf(10.00),
							true, true);
					Product importedPerfume = new Product("Frasco de perfume importado", BigDecimal.valueOf(47.50),
							true, false);
					productListInputTwo.add(importedChocolateBox);
					productListInputTwo.add(importedPerfume);
					Ticket ticketInputTwo = new Ticket(productListInputTwo);

					List<Product> productListInputThree = new ArrayList<>();
					Product importedPerfumeInput3 = new Product("Frasco de perfume importado",
							BigDecimal.valueOf(27.99), true, false);
					Product perfume = new Product("Frasco de perfume", BigDecimal.valueOf(18.99), false, false);
					Product headachePils = new Product("Caja de pastillas para el dolor de cabeza",
							BigDecimal.valueOf(9.75), false, true);
					Product importedChocolateBoxInput3 = new Product("Caja de bombones importados",
							BigDecimal.valueOf(11.25), true, true);
					productListInputThree.add(importedPerfumeInput3);
					productListInputThree.add(perfume);
					productListInputThree.add(headachePils);
					productListInputThree.add(importedChocolateBoxInput3);
					Ticket ticketInputThree = new Ticket(productListInputThree);		

					System.out.println("\nResultado 1:");
					ticketInputOne.printTicket();
					System.out.println("\nResultado 2:");
					ticketInputTwo.printTicket();
					System.out.println("\nResultado 3:");
					ticketInputThree.printTicket();
					break;

				case 2:
					List<Product> productListInput = new ArrayList<>();

					boolean continueAdding = true;
					System.out.println("*********** Introduce los valores solicitados **************");
					while (continueAdding) {
						System.out.println("Nombre del producto (Ej: Tortilla de patatas):");
						sc.nextLine();
						String name = sc.nextLine();

						System.out.println("Precio (Ej: 1,89):");
						double price = sc.nextDouble();
						if(price<0){
							throw new Exception();
						}

						System.out.println("¿Es importado?(y/n):");
						boolean isImported = checkYesNoInput(sc.next());

						System.out.println("¿Es un libro, alimento o producto médico?(y/n):");
						boolean isBasicTaxFree = checkYesNoInput(sc.next());

						System.out.println("¿Quieres añadir otro producto?(y/n)");
						continueAdding = checkYesNoInput(sc.next());

						Product product = new Product(name, BigDecimal.valueOf(price), isImported, isBasicTaxFree);
						productListInput.add(product);
					}

					Ticket ticket = new Ticket(productListInput);
					System.out.println("\nResultado:");
					ticket.printTicket();
					break;

				case 3:
					System.out.println("¡Adiós!");
					closeMenu = true;
					break;

				default:
					System.out.println("\nPor favor, selecciona una opción válida\n");
					break;
				}
			} catch (Exception e) {
				System.out.println("\nPor favor, selecciona una opción válida\n");
				sc.nextLine();
			}
		}
		sc.close();
	}

	public static boolean checkYesNoInput(String yesNoInput) throws Exception {
		boolean isTrue;
		if(yesNoInput.equalsIgnoreCase("y")) {
			isTrue = true;
		}else if(yesNoInput.equalsIgnoreCase("n")) {
			isTrue = false;
		}else {
			throw new Exception();
		}
		return isTrue;
	}

	private static void printMenu() {
		System.out.println("\n****** Menú ******");
		System.out.println("1. Usar productos del enunciado \n2. Introducir productos manualmente\n3. Salir");
		System.out.println("Please, select the option you want to explore:");
	}

}
