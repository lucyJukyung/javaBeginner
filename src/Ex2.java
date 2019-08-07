import java.util.*;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double celsius, fahrenheit; //declare celsius and fahrenheit variables
		
		System.out.print("Enter Celsius: ");
		Scanner inputValue = new Scanner(System.in);//declare scanner variable
		celsius = inputValue.nextDouble();//assign celsius value from user

		fahrenheit = celsius * 9/5 + 32; //calculate farenheit
		System.out.println(celsius + "C is " + fahrenheit + "F");//print result
	}

}
