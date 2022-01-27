package picerija;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Order {
	private double totalOrderPrice;
	private double totalPizza;
	private double totalDzer;
	//public double totalToppings;
	private double totalToppingsPrice;
	
	private final ArrayList<Pizza> pizzas;
	
	private final ArrayList<Dzeriens> dzerieni;
	
	private final ArrayList<Pizza> toppings;
	
	public Order(ArrayList<Pizza> pizzas, ArrayList<Dzeriens> dzerieni, ArrayList<Pizza> toppings) {
		this.pizzas=pizzas;
		this.dzerieni=dzerieni;
		this.toppings=toppings;
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
		
		final double LielsDz = 3.99;
		final double MediumDz = 2.99;
		final double SmallDz = 1.99;
		 
		
		for (Pizza pizza : pizzas){
			switch(pizza.getSize()) {
			case "Liela":
				totalPizza += LargeCost;
				break;
				
			case "Videja":
				totalPizza += MediumCost;
				break;
				
			case "Maza":
				totalPizza += SmallCost;
				break;
				
			default:
				totalPizza += 0.0;
				break;
			}
			
			
			
			}
		for(Dzeriens dzeriens : dzerieni) {
			switch(dzeriens.getTilp()) {
			case "500ml":
				totalDzer += LielsDz;
				break;
				
			case "350ml":
				totalDzer += MediumDz;
				break;
				
			case "250ml":
				totalDzer += SmallDz;
				break;
				
			default:
				totalDzer += 0.0;
				break;
			}
			
			
		}
		
		for(Pizza pizza : toppings) {
			int totalToppings = pizza.getToppings().size();
			switch(pizza.getToppings().size()) {
			case 1:
				totalToppingsPrice += totalToppings * siers;
				break;
				
			}
			
		}
		
		totalOrderPrice=totalPizza+totalDzer+totalToppingsPrice;
		
		
	}
	public double getTotalOrderPrice() {
		return totalOrderPrice;
	}
	
	public void printOrderSummary() {
        for (Pizza pizza : pizzas) {
            JOptionPane.showMessageDialog(null, "Pasutits " + pizza.getSize() + " pica ar " +    pizza.getToppings());
        }
        for(Dzeriens dzeriens : dzerieni) {
        	JOptionPane.showMessageDialog(null, "Pasutits " + dzeriens.getTilp() + " " +dzeriens.getDzeriens());
        }
        JOptionPane.showMessageDialog(null ,"KOPEJA PASUTIJUMA SUMMA: " + getTotalOrderPrice());
    }
	


}
