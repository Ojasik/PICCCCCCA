package picerija;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class PizzaProgramm {
	
	public static void welcomeMessage(){
		JOptionPane.showMessageDialog(null, "Sveicinati picu pasutisanas programma!");
	}

	public static void main(String[] args) {
		
		welcomeMessage();
		
		ArrayList<Pizza> pizzas = new ArrayList<>();
		
		int picasDaudzums=Integer.parseInt(JOptionPane.showInputDialog("Cik picas gribi nopirkt?"));
		
		for(int i = 0; i<picasDaudzums; i++) {
			Pizza pizza = new Pizza();
			
			ArrayList<String> toppings = new ArrayList<>();
		}

	}

}
