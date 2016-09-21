import javax.swing.JOptionPane;

/*
 * How to make branching decisions using
 * if
 * elseif
 * else
 */


public class Starthere {
	
	//field or class variables

	public static void main(String[] args) {
		
		//local or method variables
		String ageInput = "";
		int age = 0;
		int grade = 0;
		String gradeWord = "";
		String gradeInput = "";
		
		
		gradeInput = JOptionPane.showInputDialog("What grade are you in");
		grade = Integer.parseInt(gradeInput);
		
		
		ageInput = JOptionPane.showInputDialog("Hello what is your age");
		age = Integer.parseInt(ageInput);
		String msg = "";
		String genderInput = "";
		char gender = ' ';
		
		genderInput = JOptionPane.showInputDialog("What is your gender: M, F");
		genderInput = genderInput.toUpperCase();
		
		gender = genderInput.charAt(0);
		
		/*
		 * This all me
		 * Capture their year in school as grade 9, 10, 11, or 12
		 * 
		 */
		
		
		//msg = "age = " + age + " gender = " + genderInput + " char gender = " + gender;
		//JOptionPane.showMessageDialog(null, msg);
		
		
		/* test minor or adult
		 also test male or female
		 finally catch errors
		 test cases:
		 1. minor F
		 2. minor M
		 3. adult F
		 4. adult M
		 5. error
		*/
		
		// two major Booleans: || is "or"  && is "and"
		
		/*
		 * 
		 * Add feedback using the words
		 * EX: You are a Junior
		 * 
		 */
		
		if (grade == 9){
			gradeWord = "Freshman";
		}else if (grade == 10){
			gradeWord = "Sophmore";
		}else if (grade == 11){
			gradeWord = "Junior";
		}else if (grade == 12){
			gradeWord = "Senior";
		}else {
			msg = "You messed up your age";
			JOptionPane.showMessageDialog(null, msg);
		}
		
		if (age < 18 && gender == 'F'){
			msg = "You are a minor female " + gradeWord;
			JOptionPane.showMessageDialog(null, msg);
		} else if (age < 18 && gender == 'M'){
			msg = "You are a minor male " + gradeWord;
			JOptionPane.showMessageDialog(null, msg);
		} else if (age >= 18 && gender == 'F'){
			msg = "You are an adult female " + gradeWord;
			JOptionPane.showMessageDialog(null, msg);
		} else if (age >= 18 && gender == 'M'){
			msg = "You are an adult Male " + gradeWord;
			JOptionPane.showMessageDialog(null, msg);
		} else{
			msg = "Something went wrong try again";
			JOptionPane.showMessageDialog(null, msg);
		}
	}

}
