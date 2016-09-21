package switch_case_003;

public class Executive {
	public static void main(String[] args){
	
		grading('A'); // Call a method named grade, pass it a char to act upon
		grading('B');
		grading('C');
		grading('D');
		grading('F');
		grading('a');
		
	} // End of main
	public static void grading (char grade){
		
		int success;
		switch (grade){
		case 'A':
			System.out.println("You did great");
			success = 1;
			break;
		case 'B':
			System.out.println("You did good");
			success = 1;
			break;
		case 'C':
			System.out.println("You did okay");
			success = 1;
			break;
		case 'D':
		case 'E':
		case 'F':
			System.out.println("Low Grade");
			success = 0;
			break;
		default:
			System.out.println("Invalid grade key");
			success = -1;
			break;
		} // End of switch
		
		passTheCourse(success);
		
		
	} // End of grading
	
	public static void passTheCourse(int succeed){
		switch (succeed){
		case 1:
			System.out.println("You are most likely going to pass the class");
			break;
		case 0:
			System.out.println("Ya'll better try harder");
			break;
		default:
			System.out.println("You messed up when entering your grade");
			break;
		}
	} // End of pass the course
} // End of Class
