package review;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class MadLib
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	public ArrayList<String> story= new ArrayList<String>();;
	private int nouncount =0;
	private int verbcount=0;
	private int adjectivecount=0;
	
	public MadLib()
	{
	 
	 
	}

	public MadLib(String fileName) 
	{
		
		nouns= new ArrayList<String>();
		 verbs= new ArrayList<String>();
		 adjectives = new ArrayList<String>();
		
		//load stuff
		loadNouns();
		loadVerbs();
		loadAdjectives();
	
		
		
		
		
		try{
			Scanner scan=new Scanner(new File(fileName));
			while(scan.hasNext()){
				String s = scan.next();
				
				
				story.add(s);
			}
			
		
			for(int i=0; i<story.size(); i++){
				if(story.get(i).equals("#") ){
					story.set(i, getRandomNoun());
				}
				else if(story.get(i).equals("@")){
					story.set(i, getRandomVerb());
				}
				else if(story.get(i).equals("&")){
					story.set(i, getRandomAdjective());
				}
			}
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
		
	}

	public void loadNouns()
	{
		try{
			Scanner scanN = new Scanner(new File("data/nouns.dat"));
			while(scanN.hasNext()){
				nouns.add(scanN.next());
			}
			
		}
		catch(Exception e)
		{
		}	
		
	}
	
	public void loadVerbs()
	{
		try{
			Scanner scanV = new Scanner(new File("data/verbs.dat"));
			while(scanV.hasNext()){
				verbs.add(scanV.next());
			}
	
		}
		catch(Exception e)
		{
		}
	}

	public void loadAdjectives()
	{
		try{
			Scanner scanA = new Scanner(new File("data/adjectives.dat"));
			while(scanA.hasNext()){
				adjectives.add(scanA.next());
			}
	
			//for(int i=0; i< adj.size();i++){
			//	System.out.println(adj.get(i));
			//}
		}
		catch(Exception e)
		{
		}
		
		
		
	}

	public  String getRandomVerb()
	{
		int num= (int)(Math.random() * (verbs.size()));
		String randomverb= verbs.get(num);
		
		//for(int i =0; i<story.size();i++){
		//	if(story.get(i) == "@"){
		//		story.set(i,verbs.get((int)Math.random() * (verbs.size()) ));
		//	}
			
		//}
	
		return randomverb;
	}
	
	public String getRandomNoun()
	{
		int num= (int)(Math.random() * nouns.size());
		String randomnoun= nouns.get(num);
		
		//for(int i =0; i<story.size();i++){
		//	if(story.get(i) == "#"){
		//		story.set(i,nouns.get((int)Math.random() * (nouns.size()) ));
		//	}
			
		//}
		
		return randomnoun;
	}
	
	public String getRandomAdjective()
	{
		int num= (int)(Math.random() * (adjectives.size()));
		String randomadjective= adjectives.get(num);
		
	//	for(int i =0; i<story.size();i++){
		//	if(story.get(i) == "&"){
		//		story.set(i,adjectives.get((int)Math.random() * (adjectives.size()) ));
		//	}
			
	//	}
		
		return randomadjective;
	}		

	public String toString()
	{
		String str= "";
		
		for(int i=0; i<story.size();i++){
			str+= story.get(i) + " ";
		}
	   return str;
	}
}