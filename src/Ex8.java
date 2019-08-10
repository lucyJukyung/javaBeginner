import java.util.*;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare user input variables
		String input1, input2;
		
		//prompt user input1
		System.out.println("Enter your first word.");
		Scanner userInput1 = new Scanner(System.in);
		input1 = userInput1.nextLine();
		
		//prompt user input2
		System.out.println("Enter your second word.");
		Scanner userInput2 = new Scanner (System.in);
		input2 = userInput2.nextLine();
		
		//compare input1 and input2
		if(input1.equals(input2)) {
			System.out.println("The two given strings are equal.");
			System.out.println("The first character of each string is " + input1.charAt(0) + " and " 
					+ input2.charAt(0));//compare first character of each string
		}
		else {
			System.out.println("The two given strings are NOT equal.");
			System.out.println("The first character of each string is " + input1.charAt(0) + " and " 
					+ input2.charAt(0));//compare first character of each string
		}

	}

}
