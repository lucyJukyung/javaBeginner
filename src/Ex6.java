
public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare 
		double kmPerLiter = 12.5; //did not work with 100/8, displayed 12.0. why?
		double fullTank = 40, rough = 1.15;
		double normalRoad, roughRoad;
		
		//calculate distance
		normalRoad = kmPerLiter * fullTank;
		roughRoad = fullTank * kmPerLiter * rough;
		
		//print result
		System.out.println("normal road distance: " + normalRoad);
		System.out.println("rough road distance: " + roughRoad);

	}

}
