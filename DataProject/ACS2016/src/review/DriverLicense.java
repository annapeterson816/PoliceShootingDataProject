package review;

import static java.lang.System.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DriverLicense {
	String [] studanswers, drivekey;;
	
		
		public DriverLicense(){
			
			String [] key = {"b", "d","a","a","c","a","b","a","c","d","b","c","d","a","d","c","c","b","d","a",};
			studanswers = new String[20];
			drivekey = new String [20];
		}
		
//		
		public  String makeStudentAnswer(){
			int i =0;
			
			Scanner scan;
			try {
				scan = new Scanner (new File("data/driveranswers"));
				while(scan.hasNext()){
					String word= scan.next();
					studanswers[i]= word;
					i++;
			}
			}
				
				catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String answers=" ";
			for(int j=0; j< studanswers.length; j++){
				answers+= studanswers[j];
		}
			
			
			return answers;
			
		}
		
		public void makeKeyAnswers() throws FileNotFoundException{
			
			Scanner scan1 =  new Scanner (new File("data/drivekey"));
			
			
			int i=0;
			while(scan1.hasNext()){
				String word= scan1.next();
				drivekey[i]= word;
				i++;
		
		}
	
			
		}
		
		public int checkAnswers() throws FileNotFoundException{
			
			makeKeyAnswers();
			makeStudentAnswer();
			
			int rightanswers=0;
			String fate="";
			String a ="";
			String b="";
			String str="";
			for(int i=0; i<20; i++){
				a=drivekey[i];
				b=studanswers[i];
				if(a.equals(b)){
					rightanswers++;
				}
				else
					str += i;
			}
		
			
			return rightanswers;
		}
		
		public String didYouPass() throws FileNotFoundException{
			if(checkAnswers()>= 15){
				 return "YOU PASSED WOOHOOO";
			}
			else
				return "you suck";
		}
		public String incorrectLoad(){
		int rightanswers=0;
		String fate="";
		String a ="";
		String b="";
		String str="";
		for(int i=0; i<20; i++){
			a=drivekey[i];
			b=studanswers[i];
			if(a.equals(b)){
				rightanswers++;
			}
			else
				str += i;
		}
		
		return str;
		}
		
		
		public void incorrectAnswers() throws FileNotFoundException{
			int amount = 20 - checkAnswers();
			String stri="The questions you got wrong were: ";
			String [] incorrect = new String [amount*2];
			int i=0;
			String str= incorrectLoad();
			
			Scanner scan = new Scanner(str);
			while(scan.hasNextInt()){
			String number= scan.next();
				incorrect[i]=number;
				incorrect[i+1]= " ";
				i= i+2;
			}
			for(int j=0; j<incorrect.length; j++){
				stri+= incorrect[j] + " , ";
			}
			System.out.print(stri);
		}
}
		
		
	

