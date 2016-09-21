import javax.swing.JOptionPane;

public class GetCounselor {

	public static void main(String[] args) {
		
		String lastName = "";
		char firstLetter = ' ';
		
		
		/*
		 * 1. Use JOP's at least for the final - must be jar'd up for grading
		 * 2. Using JOP ask for last name
		 * 3. Determine first letter of last name - do this part in main
		 * 4. Pass last name to counselorAssign
		 */
		
		lastName = JOptionPane.showInputDialog("What is your last name");
		lastName = lastName.toUpperCase();
		firstLetter = lastName.charAt(0);
		counselorAssign(firstLetter);
		
		
	} // End of main
	
	public static void counselorAssign(char initial){
		
		/*
		 * receive as parm the first letter of the last name
		 * use switch case to determine the counselor
		 * JOP show the assigned counselor
		 * 
		 * Counselor list:
		 * A-D Ms. Joblin
		 * E-K Ms. Hull
		 * L-R Ms. Stafford
		 * S-Z Mr. Langly
		 */
		String msg = "";
		
		String counselor = "";
		
		switch (initial){
		case 'A':
		case 'B':
		case 'C':
		case 'D': counselor = "Ms. Joblin"; break;
		
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K': counselor = "Ms. Hull"; break;
		
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R': counselor = "Ms. Stafford"; break;
		
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z': counselor = "Mr. Langly"; break;
		}
		msg = "Your counselor is " + counselor;
		JOptionPane.showMessageDialog(null, msg);
		
	}

} // End of class
