import javax.swing.JOptionPane;

/* Peter Haase
 * 
 * Intro to JDP's - JOptionPanes
 */

public class Runner {

	public static void main(String[] args) {
		
		// Place your field variables here, at the top of the method.
		
		String first_name = "";
		String showMsg = "";
		String showAge = "";
		String showVolume = "";
		String last_name = "";
		String age_string = "";
		int age = 0;
		float volume = 0;
		
		// Convert strings to floats
		String width_string = "";
		float width = 0;
		String height_string = "";
		float height = 0;
		String length_string = "";
		float length = 0;
		
		first_name = JOptionPane.showInputDialog("What is your first name?");
		last_name = JOptionPane.showInputDialog("What is your last name?");
		
		//System.out.println(first_name);
		
		showMsg = "Sup " + first_name + " " + last_name;
		showAge = "So you are" + age + "years";
		showVolume = "The volume of the box is " + volume;
		
		JOptionPane.showMessageDialog(null, showMsg);
		
		
		age_string = JOptionPane.showInputDialog("How old are you");
		//System.out.println("Age string: " + age_string);
		
		age = Integer.parseInt(age_string);
		
		showAge = age_string;
		
		//age = age + 5;
		//System.out.println("Int age: " + age);
		
		width_string = JOptionPane.showInputDialog("What is the width of that box?");
		width = Float.parseFloat(width_string);
		//System.out.println("Length: " + width);
		
		height_string = JOptionPane.showInputDialog("What is the height of that box?");
		height = Float.parseFloat(height_string);
		
		length_string = JOptionPane.showInputDialog("What is the length of that box?");
		length = Float.parseFloat(height_string);
		
		volume = width * height * length;
		
		//System.out.println(volume);
		//showVolume = volume;
		JOptionPane.showMessageDialog(null,"The volume eis: " + volume);
		
		System.exit(0);
		
	}

}
