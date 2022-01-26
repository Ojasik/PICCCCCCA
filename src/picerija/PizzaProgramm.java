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
		
		for(int i = 0; i < picasDaudzums; i++) {
			Pizza pizza = new Pizza();
			
			ArrayList<String> toppings = new ArrayList<>();
			
			String picasIzmers;
			picasIzmers=JOptionPane.showInputDialog("Izvelies picas izmeru - Liela, Videja, Maza: ");
			
			pizza.setSize(picasIzmers);
			
			int toppingsDaudzums=Integer.parseInt(JOptionPane.showInputDialog("Ievadi piedevu daudzumu: "));
			
			for (int j = 0; j < toppingsDaudzums; j++) {
				String topping = JOptionPane.showInputDialog("Izvelies piedevus - siers, bekons, ananasi, vistas fileja, malta gala, sampinjoni");
				toppings.add(topping);
			}
			
			pizza.setToppings(toppings);
			pizzas.add(pizza);
			
			
			
		}
		
        ArrayList<Dzeriens> dzerieni = new ArrayList<>();
		
		int dzerDaudzums=Integer.parseInt(JOptionPane.showInputDialog("Cik dzerienus gribi nopirkt?"));
		
		for(int i = 0; i < dzerDaudzums; i++) {
			Dzeriens dzeriens = new Dzeriens();
			
			ArrayList<String> Veids = new ArrayList<>();
			
			String dzerTilp;
			dzerTilp=JOptionPane.showInputDialog("Izvelies dzeriena izmeru - 250ml, 350ml, 500ml: ");
			
			dzeriens.setTilp(dzerTilp);
			
			
			String dzerVeids = JOptionPane.showInputDialog("Izvelies dzerienu - Coca-Cola, Sprite, Fanta, Teja");
			Veids.add(dzerVeids);
			
			dzeriens.setDzeriens(Veids);
			dzerieni.add(dzeriens);
			
		}

	}

}
