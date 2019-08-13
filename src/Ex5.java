import java.util.*;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declare diameter of sun, earth
		final double sun = 865000, earth = 7600, pi = 3.1415;
		double earthVolume, sunVolume, earthRadius, sunRadius, ratio;
		
		earthRadius = earth/2;
		sunRadius = sun/2;
		
		//calculate the volumne of the Earth
		earthVolume = (4/3) * pi * Math.pow(earthRadius, 3);
		
		//calculate the volume of the Sun
		sunVolume = (4/3) * pi * Math.pow(sunRadius, 3);
		
		//ratio of the sun to the volume of the earth
		ratio = sunVolume/earthVolume;
		
		//print result
		System.out.println("The volume of Earth is " + earthVolume);
		System.out.println("The volume of Sun is " + sunVolume);
		System.out.println("The ratio of sun to Earth is " + ratio);
	}

}
