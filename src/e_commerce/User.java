package e_commerce;

import java.util.ArrayList;

public class User {
	String last_name;
	String address;
	Basket basket = new Basket();
	ArrayList<Command> commands = new ArrayList<Command>();
	
	User(String last_name, String address) {
		this.last_name = last_name;
		this.address = address;
	}
	
	String checkCommand() {
		return "J'ai commandé plein de choses !";
	}
	
}
