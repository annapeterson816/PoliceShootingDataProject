package string;

import java.io.IOException;
import java.util.Scanner;

public class NameGeneratorRunner {
	public static void main( String args[] ) throws IOException
	{

	
	
	Scanner keyboard = new Scanner(System.in);
	System.out.println("What is your first name?");
	String fname="";
	fname= keyboard.next() ;
	
	System.out.println("What is your last name?");
	String lname="";
	lname = keyboard.next();
	
	
	
	NameGenerator gen = new NameGenerator(fname, lname);

	gen.loadFirstName();
	gen.loadLastName();
	gen.makeAdjectiveOptions();
	gen.pickRandomAdjective();
	System.out.println(gen);
	
	
	
	}
	
}
