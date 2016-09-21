
public class Runner {
	
	/*
	 * We must learn these essentials for Strings:
	 * toUpperCase / toLowerCase -- AP exam
	 * compareTo
	 * indexOf -- AP exam
	 * endWith / startWith
	 * substring -- huge, always on the AP exam
	 * equals // must not use math operators! // -- ALWAYS on AP exam
	 * charAt
	 * trim
	 * valueOf
	 * 
	 * also, use heavily in loops and arrays
	 */

	public static void main(String[] args) {
		String name = "Peter";
		// A String is an array or characters
		
		// We can make string arrays
		// [] indicates an array
		// Must be initialized -- new type[size]
		String[] myStringArray = new String[5];
		
		myStringArray[0] = "This";
		myStringArray[1] = "is";
		myStringArray[2] = "a";
		myStringArray[3] = "string";
		myStringArray[4] = "array";
		
		// Indices 0-4, means total of 5 items and length is 5 items
		for (int i = 0; i < myStringArray.length; i++){
			System.out.print(myStringArray[i] + " ");
		}
		
		// Example of toLowerCase/toUpperCase
		System.out.println("\nName is: " + name);
		name = name.toLowerCase();
		System.out.println("Name after is: " + name);
		
		// compareTo
		int result;
		String word01 = "Apz";
		String word02 = "App";
		result = word01.compareTo(word02);
		
		if (result < 0){
			System.out.println("Word 01 is alphabetically before word 02");
		}else if (result > 0){
			System.out.println("Word 01 is alphabetically after 02");
		}else if (result == 0){
			System.out.println("Word 01 is lexigraphically equal to word 02");
		}else{
			System.out.println("Something went wrong");
		}
		
		// equals
		
		String test01 = "hello";
		String test02 = "hello";
		
		if (test01.equals(test02)){
			System.out.println("test01 is the same as test02");
		}else{
			System.out.println("test01 is not the same to test02");
		}
		
		// substring -- ALWAYS on AP exams
		// new String = StringName.subscript(startIndex, stopIndex)
		// start Index inclusive
		// stop Index exclusive
		String fullName = "Taylor Swift";
		String firstNameChars = "";
		
		firstNameChars = fullName.substring(0, 2);
		System.out.println(firstNameChars);
		
		firstNameChars = fullName.substring(2);
		System.out.println(firstNameChars);
		
		// charAt, indexOf, substring
		
		System.out.println();
		
		String myWord = "Java";
		String mySent = "I totally love Java !";
		String letter = "";
		String newResult = "";
		
		for (int i = 0; i < mySent.length(); i++){
			letter = mySent.substring(i, i + 1);
			System.out.println("index = " + i + " character is " + letter);
		}
		
		System.out.println();
		
		for (int i = 0; i < mySent.length(); i++){
			System.out.println("index = " + i + " character is " + mySent.charAt(i));
			newResult = newResult + mySent.charAt(i);
		}
		System.out.println("\nnewResult = " + newResult);
		
	}// End of main

}// End of class
