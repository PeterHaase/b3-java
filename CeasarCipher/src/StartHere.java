import javax.swing.JOptionPane;

public class StartHere {
	
	/*
	 * Ceasar cipher - the first known cryptography
	 * To Code:
	 * 
	 * 1. Determine a key -- Offset Ammount
	 * 2. Take each char in the message, add key to get the encoded message
	 * 
	 * Example: key = 2. plain text is "abc", secret message would be "cdf"
	 * To decode the message, just subtract two from the code
	 * 
	 * Q1: How do we deal with spaces? Hint: Might want an if test
	 * Q2: How do we wrap at the end of the alphabet? Hint: Consider an if > 26 something like subtract 26
	 * example z + 2 is 26 + 2 = crash
	 * if ( > 26) do result - 26
	 */
	
	public static void main (String[] args){
		String alpha = " abcdefghijklmnopqrstuvwxyz";
		int key = 2;
		int index;
		
		String plainTxt = "I like Doy";
		String keyString;
		String codedTxt = "";
		char shiftedAlpha = ' ';
		
		plainTxt = JOptionPane.showInputDialog("What do you want to encode?");
		keyString = JOptionPane.showInputDialog("What key do you want to encode it with?");
		
		key = Integer.parseInt(keyString);
		
		plainTxt = plainTxt.toLowerCase();
		
		for(int i = 0; i < plainTxt.length(); i++){
			
		//System.out.println("First letter of message is: " + plainTxt.charAt(i));
		//System.out.println("Index is: " + alpha.indexOf(plainTxt.charAt(i))); // Should be 8
		
		index = alpha.indexOf(plainTxt.charAt(i));
		if(index != 0){
			index = index + key;
		}
		if (index >= 26){
			index = index - 26;
		}
		shiftedAlpha = alpha.charAt(index);
		//System.out.println("Shifted alpha is: " + shiftedAlpha);
		codedTxt = codedTxt + shiftedAlpha;
		}
		System.out.println("The plain text message is: " + plainTxt);
		System.out.println("Using this key: " + key);
		System.out.println("Results in this coded message: " + codedTxt);
	}
	
}
