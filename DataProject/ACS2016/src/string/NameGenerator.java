package string;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;



public class NameGenerator {

	private static final String String = null;
	ArrayList<String> adjectives;
	private Scanner scan;
	public String first, last;
	
	public NameGenerator(String frst, String lst){
		adjectives= new ArrayList<String>();
		first=frst;
		last=lst;
	}
	
	
	public String loadFirstName(){
		//Scanner keyboard = new Scanner(System.in);
		//System.out.println("What is your name?");
		//String name="";
		//name= keyboard.next() ;

		
		//keyboard.close();
		
			return first;
	}
	
	
	public String loadLastName(){
		
			return last;
	}
	
	public ArrayList<String> makeAdjectiveOptions() throws FileNotFoundException{
		String name = loadFirstName();
		char letter = name.charAt(0);
	
		
		Scanner scan = new Scanner(new File("data/nameGenadj"));
		while(scan.hasNext()){
			String adj = scan.nextLine();
			if (adj.charAt(0) == letter){
				adjectives.add(adj);
			}
		}
		
		return adjectives;
	}
	
	
	public String pickRandomAdjective() throws FileNotFoundException{
		int random = (int) (Math.random() * (makeAdjectiveOptions().size() +1));
		
		

		String pickedadj = makeAdjectiveOptions().get(random);
		
		return pickedadj;
		
	}
	
	public String toString(){
		
		try {
			return "Your new name is: " + loadFirstName() + " " + pickRandomAdjective() + loadLastName() ;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "";
	}


}


