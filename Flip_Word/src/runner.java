import javax.swing.JOptionPane;

public class runner {

	public static void main(String[] args) {
		String myWord = "Java";
		String mySent = "I totally love Java !";
		String letter = "";
		String newResult = "";
		myWord = myWord = JOptionPane.showInputDialog("What is your word");
		for (int i = myWord.length() - 1; i >= 0; i--){
			//System.out.println("index = " + i + " character is " + myWord.charAt(i));
			newResult = newResult + myWord.charAt(i);
		}
		JOptionPane.showMessageDialog(null, "\nnewResult = " + newResult);

	}

}
