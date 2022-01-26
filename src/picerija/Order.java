package picerija;

import java.util.ArrayList;

public class Order {
	private double totalOrderPrice;
	
	private final ArrayList<Pizza> pizzas;
	
	public Order(ArrayList<Pizza> pizzas) {
		this.pizzas=pizzas;
	}
	
	public void orderPriceCalculation() {
		final double LargeCost = 9.99;
		final double MediumCost = 7.99;
		final double SmallCost = 5.99;
		final double siers = 2.00;
		final double bekons = 1.50;
		final double ananasi = 0.70;
		final double vistasfileja = 2.50;
		final double maltagala = 2.20;
		final double sampinjoni = 0.80;
		
	}

}
