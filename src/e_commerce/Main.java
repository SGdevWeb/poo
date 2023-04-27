package e_commerce;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Connexion utilisateur : ");
		System.out.print("Entrez votre nom : ");
		String last_name = scan.next();
		System.out.print("Entrez votre adresse : ");
		String address = scan.next();
		
		User u1 = new User(last_name, address);

		ArrayList<Product> catalog = new ArrayList<Product>();
		catalog.add(new Product("Stylo", 1, 1.99f));
		catalog.add(new Product("Crayon", 2, 0.99f));
		
		int choice;
		int productChoice;
		do {
			System.out.println("Que voulez vous faire ?");
			System.out.println("1 : Ajouter un produit au panier");
			System.out.println("2 : Supprimer un produit du panier");
			System.out.println("3 : Consulter votre panier");
			System.out.println("4 : Consulter un produit");
			System.out.println("5 : Valider le panier");
			System.out.println("6 : Quitter");
			choice = scan.nextInt();
			switch (choice) {
				case 1 -> {
					System.out.println("Quel produit voulez-vous ajouter ?");
					for (int i = 0; i < catalog.size(); i++) {
						System.out.println((i + 1) + " - " + catalog.get(i).name);
					}
					productChoice = scan.nextInt();
					u1.basket.addProduct(catalog.get(productChoice - 1));
					System.out.println("Vous avez ajoute " + catalog.get(productChoice - 1).name + " a votre panier");
					System.out.println("Contenu du panier : ");
					for (int i = 0; i < u1.basket.products.size(); i++) {
						System.out.println((i + 1) + " - " + u1.basket.products.get(i).name);
					}
				}
				case 2 -> {
					if (u1.basket.products.size() == 0) {
						System.out.println("Panier vide");
					} else {
						System.out.println("Quel produit voulez-vous supprimer ?");
						System.out.println("Contenu du panier : ");
						for (int i = 0; i < u1.basket.products.size(); i++) {
							System.out.println((i + 1) + " - Nom du produit : " + u1.basket.products.get(i).name);
							System.out.println("Quantite : " + u1.basket.products.get(i).nProduct);
							System.out.println("Prix : " + u1.basket.products.get(i).price);
						}
						productChoice = scan.nextInt();
						u1.basket.removeProduct(productChoice - 1);
					}
				}
				case 3 -> {
					if (u1.basket.products.size() == 0) {
						System.out.println("Panier vide");
					} else {
						System.out.println("Contenu du panier : ");
						for (int i = 0; i < u1.basket.products.size(); i++) {
							System.out.println((i + 1) + " - Nom du produit : " + u1.basket.products.get(i).name);
							System.out.println("Quantite : " + u1.basket.products.get(i).nProduct);
							System.out.println("Prix : " + u1.basket.products.get(i).price);
						}
					}
				}
				case 4 -> {
					System.out.println("Quel produit voulez-vous consulter ?");
					for (int i = 0; i < catalog.size(); i++) {
						System.out.println((i + 1) + " - " + catalog.get(i).name);
					}
					productChoice = scan.nextInt();
					System.out.println(catalog.get(productChoice - 1).name);
					System.out.println("Stock : " + catalog.get(productChoice - 1).nProduct);
					System.out.println("Prix : " + catalog.get(productChoice - 1).price);
				}
				case 5 -> {
					// Affichage panier
					if (u1.basket.products.size() == 0) {
						System.out.println("Panier vide");
					} else {
						System.out.println("Contenu du panier : ");
						for (int i = 0; i < u1.basket.products.size(); i++) {
							System.out.println((i + 1) + " - Nom du produit : " + u1.basket.products.get(i).name);
							System.out.println("Quantite : " + u1.basket.products.get(i).nProduct);
							System.out.println("Prix : " + u1.basket.products.get(i).price);
						}
					}
					String confirmationChoice;
					System.out.println("Voulez vous confirmer cette commande ? y/n");
					confirmationChoice = scan.next();
					if (confirmationChoice.equals("y")) {
						Command command = new Command(u1.basket.products);
						u1.commands.add(command);
						System.out.println("Commande confirmee");
					}
					u1.basket = new Basket();
				}
			}
		} while (choice != 6);
		
		scan.close();
	}

}
