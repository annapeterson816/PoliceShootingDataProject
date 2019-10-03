package string;

public class RipperRunner {
	
	public static void main ( String[] args ){

	StringRipper strip = new StringRipper();
	
	strip.setString("chicken");
	System.out.println(strip.ripString(3,6));
	System.out.println(strip);
	
	
	strip.setString("alligator");
	System.out.println(strip.ripString(3,8));
	System.out.println(strip);
	
	strip.setString("COMPUTER SCIENCE IS THE BEST!");
	System.out.println(strip.ripString(9, 12));
	System.out.println(strip.ripString(0, 12));
	System.out.println(strip.ripString(5,19));
	System.out.println(strip);
	
	strip.setString("I like fried chicken and mashed potatoes!");
	System.out.println(strip.ripString(0, 6));
	System.out.println(strip.ripString(7, 15));
	System.out.println(strip.ripString(15, 26));
	System.out.println(strip.ripString(22, 26));
	System.out.println(strip);
}
}
