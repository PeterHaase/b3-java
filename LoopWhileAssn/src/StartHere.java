import javax.swing.JOptionPane;

public class StartHere {

	public static void main(String[] args) {
		boolean yes = true;
		String answer;
		char letter = ' ';
		/*
		 * Graded
		 * JOP and JAR
		 * Using JOP ask the user to enter a number(int)
		 * Test if it is even or odd
		 * tell them "Your number is an even/odd"
		 * Ask them "Do you want to go again Y/N"
		 * If no "Thank you, bye"
		 * If yes loop ask for another input
		 * 
		 * if it is even mod 2 = 0
		 * if it has remainder it is odd
		 */
		while (yes){
			oddeven();
			answer = JOptionPane.showInputDialog("Want to go again? Yes or no");
			answer = answer.toUpperCase();
			letter = answer.charAt(0);
			if(letter == 'Y'){
				yes = true;
			}else if(letter == 'N'){
				yes = false;
			}else{
				JOptionPane.showMessageDialog(null, "That is not a valid answer");
			}
		}

	}
	public static void oddeven(){
		String number;
		int num;
		int remain = 0;
		number = JOptionPane.showInputDialog("Enter a number");
		num = Integer.parseInt(number);
		remain = num % 2;
		if (remain == 0)
		{
			JOptionPane.showMessageDialog(null, "Your number is even");
		}else{
			JOptionPane.showMessageDialog(null, "Your number is odd");
		}

	}
}