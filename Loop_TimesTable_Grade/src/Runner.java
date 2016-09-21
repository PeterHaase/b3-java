import javax.swing.JOptionPane;

/*
 * 1. Write a times table program
 * 2. Ask user to input a number (Syso)
 * 3. If the user enters 10, the 10 times table is desplayed
 * 
 * 1 x 10 = 10
 * 2 x 10 = 20
 * 3 x 10 = 30
 * keep going until
 * 10 x 10
 * If the user entered 5
 * 1x5
 * 2x5
 * 3x5
 * 4x5
 * 5x5
 * 
 * The output display 2 x 5 = 10
 */


public class Runner {

	public static void main(String[] args) {
		
		int loopVal, addition, endValNum, answer;
		String endVal;
		endVal = JOptionPane.showInputDialog("How big do you want the table? ");
		endValNum = Integer.parseInt(endVal);
		addition = endValNum;
		endValNum = endValNum + 1;
		
		for (loopVal = 1; loopVal < endValNum; loopVal++){
			answer = loopVal * addition;
			System.out.println("LoopVal, addition: " + loopVal + "x" + addition + " = " + answer);
		}
	}

}
