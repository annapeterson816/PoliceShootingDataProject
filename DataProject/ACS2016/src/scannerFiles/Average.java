package scannerFiles;

import java.util.Scanner;
import static java.lang.System.*;

public class Average
{
   private String line;
   private int num=0;

   public Average(){
	   
   }
   
   
   public Average(String lin){
	   
	 line=lin;  
   }
   
   
   public void setLine(String lin){
	   line=lin;
	  
   }
   
 


	public int getLowest()
	{
		int lowest=Integer.MAX_VALUE;
		 Scanner scan = new Scanner(line);   
		while(scan.hasNextInt()){
			num=scan.nextInt();
			if (num<lowest){
				lowest=num;
			}
		}

		return lowest;
	}

	public double getAverage()
	{
		double sum=0;
		double count=0;
		 Scanner scan = new Scanner(line);   
		double average=0.0;
		while (scan.hasNextInt()){
			num=scan.nextInt();
			if(num!= getLowest()){
				sum+=num;
				count++;
			}
		
		}

		average= sum/count;


		return average;
	}

	//write a getLine method


	public String toString()
	{



		return line + "\n average = " + getAverage();
	}

	//write a toString method




}