package string;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Pirate {

	String sentence;
	File file1;
	public Pirate(){
		
	}
	public Pirate(File file) throws FileNotFoundException{
	
		file1=file;
		
		
	}
	
	public String makeString() throws FileNotFoundException{
		Scanner scan = new Scanner(file1);
		
		sentence="";
		while(scan.hasNext()){
			sentence+= scan.next() + " ";
		}
		return sentence;
	}
	
	public String createReplacements(){
		sentence = sentence.replaceAll("Hello", "ahoy");
		sentence =sentence.replaceAll("hi", "yo-yo-yo");
		sentence =sentence.replaceAll("me", "friend");
		sentence =sentence.replaceAll("bucko", "sir");
		sentence =sentence.replaceAll("matey", "miss");
		sentence = sentence.replaceAll("stranger", "scurvy dog");
		sentence =sentence.replaceAll("officer", "foul blaggart");
		sentence =sentence.replaceAll("where", "whar");
		sentence =sentence.replaceAll("is", "be");
		sentence =sentence.replaceAll("the", "th'");
		sentence =sentence.replaceAll("you", "ye");
		
		return sentence;
		
	}
	
	public String toString(){
		
		return createReplacements();
				
	}
	
}
