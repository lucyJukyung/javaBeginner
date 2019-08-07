import java.util.*; //import user type scanner

public class Ex1 {
	
	public static void main(String[] args) {
		
		int input1, input2, difference;//declare user input
		
		//initialise user input1
		System.out.print("Enter first number: ");
		Scanner userInput1 = new Scanner(System.in);
		input1 = userInput1.nextInt();
		
		//initialise user input2
		System.out.print("Enter second number: ");
		Scanner userInput2 = new Scanner(System.in);
		input2 = userInput2.nextInt();
		
		//calculate the different between input1 and input2
		difference = input2 - input1;
		
		//print result
		System.out.println("Difference of user input 1 and 2 is " + difference);
	}
}
