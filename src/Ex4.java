import java.util.*;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//initialise amount, investment(p), r(interest per year), n(years)
		int n = 10;
		double p = 5000.00, r = 1.04, amount;
		
		//find compound interest
		amount = p * Math.pow((1+r), n);
		
		//print result
		System.out.println("The Compound Interest is " + amount);

	}

}
