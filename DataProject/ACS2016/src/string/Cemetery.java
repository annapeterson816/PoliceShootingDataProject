package string;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cemetery {
	public ArrayList<String> people;
	public ArrayList<String> deathday;
	public ArrayList<Integer> deathday2;
	public int calendar [];
	public String s [];
	
	public Cemetery(){
		//ArrayList<String> ;
		 people = new ArrayList<String>();
		 deathday = new ArrayList<String>();
		 deathday2 = new ArrayList<Integer>();
		 calendar = new int[33];
		 
	}
	public ArrayList<String> loadList() throws FileNotFoundException{
		Scanner scan = new Scanner(new File("data/cemetery"));
		
		while(scan.hasNext()){
			String line= scan.nextLine();
			String name = line.substring(0,24);
			people.add(name);
		}
		return people;
	}
	
	public ArrayList<String> loadDeathDay() throws FileNotFoundException{
		Scanner scan = new Scanner(new File("data/cemetery"));
		
		while(scan.hasNextLine()){
			int i=0;
			String line = scan.nextLine();
			String regex = "\\D";
			
				String str = line.replaceAll(regex, "");
				//System.out.println(str);
				//String str2 = line.replaceAll(regex, "");
				deathday.add(str.substring(0, 2));
				i++;
			}
	
			
			//regex \s[0-9][0-9]\s[A-Z]
		
		return deathday;
	}
	
	public ArrayList<String> removeNameSpaces(){
		for(int i=0; i<people.size(); i++){
			String name = people.get(i);
			String newn = name.replaceAll("  ", "");
			people.set(i, newn);
			
		}
		
		return people;
	}
	
	
	public String nameAndDeathDate(){
		String nm = people.get(10);
		String day = deathday.get(10);
		
		return nm+ day; 
	}
	
	public ArrayList<Integer> removeDateSpace(){
		for(int i=0; i<deathday.size(); i++){
			String s = deathday.get(i);
		int num= Integer.parseInt(s);
		deathday2.add(num);
		}
		return deathday2;
		}
	
	
	public void countDays(){
		calendar[0]=0;
		
		for(int i=1; i<deathday2.size();i++){
			int j = deathday2.get(i);
			
			calendar[j+1] = calendar[j+1] +1;
		}
		
		
	}
	
	public String getMostCommonDay(){
		int max=0;
		int maxday =0;
		for(int i=0; i<calendar.length; i++){
			if (calendar[i] > max){
				max=calendar[i];
				maxday=i;
			}
		}
		if(maxday==1){
		return "The most common day of the month to die: the " + maxday + "st"+ "\nthe number of people who died on the " + maxday + " is: " + max+ " people";
		}
		else if(maxday==2){
			return "The most common day of the month to die: the " + maxday + "nd"+ "\nthe number of people who died on the " + maxday + " is: " + max+ " people";
			}
		else if(maxday==3){
			return "The most common day of the month to die: the " + maxday + "rd"+ "\nthe number of people who died on the " + maxday + " is: " + max+ " people";
			}
		else 
			return "The most common day of the month to die: the " + maxday + "th"+ "\nthe number of people who died on the " + maxday + " is: " + max + " people";
			
		
	}

}
