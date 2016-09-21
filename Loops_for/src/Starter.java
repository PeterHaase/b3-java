
public class Starter {

	public static void main(String[] args) {
		
		// for(start-value; end-value; increment){
		//	Your code
		// };
		
		
		/*
		int loopVal;
		int endVal = 11;
		
		for(loopVal=0; loopVal < endVal; loopVal++){
			
			System.out.println("The value of loopVal is: " + loopVal);
			
		}
		*/
		/*
		int start, stop;
		for (int i = 10; i >= 0; i--){
			System.out.println("The value of i is: " + i);
		}
		*/
		
		int loopVal, endVal=101, addition=0;
		
		for(loopVal = 1; loopVal < endVal; loopVal++){
			addition = addition + loopVal;
			System.out.println("LoopVal, addition: " + loopVal + " " + addition);
		}
		
	}

}
