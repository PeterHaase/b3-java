
public class Initiate {

	public static void main(String[] args) {
		
		
		/*
		 * Demo of while loop
		 * 
		 * While (boolean condition){
		 *  Code
		 * }
		 * 
		 * Execute this code as long as the boolean condition is TRUE
		 * Note: if the boolean condition starts out as false, this code
		 * will never be run, not even once.
		 * 
		 * operators
		 * increment operator var++
		 * decrement operator var--
		 * var+=2 means var = var + 2
		 * var*2
		 * var/2
		 * mod operator % means remainder
		 */
		
		int counter = 0;
		int remain = 0;
		while (counter < 10){
			
			remain = counter % 3;
			if (remain == 2){
			System.out.println("Counter = " + counter + ", remainder = " + remain);
			}
			counter++;
			
		}
		
		
		/*
		 * do{
		 * 
		 *  Code
		 *  
		 * } while (boolean);
		 * 
		 * 
		 * While might not even run once
		 * Always runs once
		 */
		int base = 2;
		do{
			
			System.out.println("number = " + base);
			base *= 2;
			
		} while (base < 513);

	}

}
