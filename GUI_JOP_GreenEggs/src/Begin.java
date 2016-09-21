import javax.swing.JOptionPane;

public class Begin {
	public static void main(String[] args) {
		
		/*
		 * Grade requirements
		 * 1. Order pizza -- Minimum of 5 pizza choices
		 * 2. Order a drink -- Minimum 5 drinks
		 * 3. When ordering is done show what they ordered
		 */

		Object[] possibilities = { "Pepperoni", "Veggie", "Bacon Lover", "Monthly Special", "Dessert Pizza" };
		Object[] drinks = { "Mt. Dew", "Cola", "Pepsi", "Sprite", "Water" };
		String s;
		String t;
		s = (String) JOptionPane.showInputDialog(null, "What kind of pizza do you want?: ",
				"Pizza", JOptionPane.PLAIN_MESSAGE, null, possibilities, "Pepperoni");
		
		t = (String) JOptionPane.showInputDialog(null, "What kind of drink do you want?: ",
				"Drinks", JOptionPane.PLAIN_MESSAGE, null, drinks, "Mt. Dew");

		// If a string was returned, say so.
		if ((s != null) && (s.length() > 0)) {
			setLabel("You want: " + s + " For pizza");
			setLabelDrink("You want: " + t + " For drinks");
			return;
		}
		
		// If you're here, the return value was null/empty.
		setLabel("Come on, order something");
	}
	public static void setLabel(String passString){
		System.out.println(passString);
		
	}
	public static void setLabelDrink(String passStringDrink){
		System.out.println(passStringDrink);
	}
}
