package picerija;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class PizzaProgramm {
	
	
	public static void welcomeMessage(){
		JOptionPane.showMessageDialog(null, "Sveicinati picu pasutisanas programma!");
	}

	public static void main(String[] args) {
		String izvele;
		welcomeMessage();

		
		ArrayList<Pizza> pizzas = new ArrayList<>();
		ArrayList<Dzeriens> dzerieni = new ArrayList<>();
			do {
				izvele=JOptionPane.showInputDialog("1 - Veikt pasutijumu | 2 - Nosutit | 3 - Apskatit");
				
				switch(izvele) {
				
				case "1":
					//ArrayList<Pizza> pizzas = new ArrayList<>();
					JOptionPane.showMessageDialog(null, "Picas: \nLiela pica - 9.99\nVideja pica - 7.99\nMaza pica - 5.99\n\nPiedevumi: \nSiers - 2.00\nBekons - 1.50\nAnanasi - 0.70\nVistas fileja - 2.50\nMalta gala - 2.20\nSampinjoni - 0.80\n\nDzerieni: \nCoca-Cola, Sprite, Fanta\n250ml - 1.99\n350ml - 2.99\n500ml - 3.99");
					
					int picasDaudzums=Integer.parseInt(JOptionPane.showInputDialog("Cik picas gribi nopirkt?"));
					for(int i = 0; i < picasDaudzums; i++) {
						Pizza pizza = new Pizza();
						
						ArrayList<String> toppings = new ArrayList<>();
						
						String picasIzmers;
						picasIzmers=JOptionPane.showInputDialog("Izvelies picas izmeru - Liela, Videja, Maza: ");
						
						pizza.setSize(picasIzmers);
						
						int toppingsDaudzums=Integer.parseInt(JOptionPane.showInputDialog("Ievadi piedevu daudzumu: "));
						
						for (int j = 0; j < toppingsDaudzums; j++) {
							String topping = JOptionPane.showInputDialog("Izvelies piedevus -  1 - siers, 2 -bekons, 3 - ananasi, 4 - vistas fileja, 5 - malta gala, 6 - sampinjoni");
							toppings.add(topping);
						}
						
						pizza.setToppings(toppings);
						pizzas.add(pizza);
						
						
						
					}
					
			        //ArrayList<Dzeriens> dzerieni = new ArrayList<>();
					
					int dzerDaudzums=Integer.parseInt(JOptionPane.showInputDialog("Cik dzerienus gribi nopirkt?"));
					
					for(int i = 0; i < dzerDaudzums; i++) {
						Dzeriens dzeriens = new Dzeriens();
						
						ArrayList<String> Veids = new ArrayList<>();
						
						String dzerTilp;
						dzerTilp=JOptionPane.showInputDialog("Izvelies dzeriena izmeru - 250ml, 350ml, 500ml: ");
						
						dzeriens.setTilp(dzerTilp);
						
						
						String dzerVeids = JOptionPane.showInputDialog("Izvelies dzerienu - Coca-Cola, Sprite, Fanta");
						Veids.add(dzerVeids);
						
						dzeriens.setDzeriens(Veids);
						dzerieni.add(dzeriens);
						
						
						
						
					        }
				case "3":
					Order order = new Order(pizzas, dzerieni, pizzas);
					order.orderPriceCalculation();
			        order.printOrderSummary();
			        
			    break;
			    
				case "2":
					
					JOptionPane.showMessageDialog(null, "Pasutijums ir nosutits!");
					
				break;
				
				case "stop":
					JOptionPane.showMessageDialog(null, "Programma aptureta!");
				}
			}while(!izvele.equals("stop"));
		
		
		
		
		//Order order = new Order(pizzas, dzerieni, pizzas);
        //order.orderPriceCalculation();
        //order.printOrderSummary();

	}

}
