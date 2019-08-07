import java.util.*;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declare radius and pi variables
		final double pi = 3.1415;
		double radius, area;		
		
		//prompt user input for radius and assign it
		System.out.print("Enter radius number: ");
		Scanner inputRadius = new Scanner (System.in);
		radius = inputRadius.nextDouble();
		
		//calculate area
		area = pi * Math.pow(radius, 2);
		
		//print result
		System.out.println("The area is " + area);
	}

}
