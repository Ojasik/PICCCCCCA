package picerija;

import java.util.ArrayList;

public class Order {
	private double totalOrderPrice;
	
	private final ArrayList<Pizza> pizzas;
	
	public Order(ArrayList<Pizza> pizzas) {
		this.pizzas=pizzas;
	}

}
