package e_commerce;


import java.util.ArrayList;

public class Basket {
	
	ArrayList<Product> products = new ArrayList<Product>();
	
	void addProduct(Product product) {
		this.products.add(product);
	}
	
	/*void removeProduct(Product product) {
		for (int i = 0; i < products.size(); i++) {
			if (products.get(i).name == product.name) {
				products.remove(i);
			}
		}
	}
	*/
	
	void removeProduct(int index) {
		if (index >= 0 && index < this.products.size())
			this.products.remove(index);
	}
}
