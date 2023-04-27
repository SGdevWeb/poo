package e_commerce;

import java.time.LocalDate;
import java.util.ArrayList;

public class Command {
	ArrayList<Product> products = new ArrayList<Product>();
	LocalDate commandDate;
	LocalDate deliveryDate;
	
	public Command(ArrayList<Product> products) {
		this.commandDate = LocalDate.now();
		this.deliveryDate = LocalDate.now();
		this.products = products;
	}
}
