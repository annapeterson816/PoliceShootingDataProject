package scannerChopper;

import java.util.Scanner;
import static java.lang.System.*;

public class AverageRunner
{
   public static void main( String args[] )
   {
	   
	   String line = "9 10 5 20";
	   Average avg= new Average(line);
	   
	   
	   System.out.println(avg);
	   
	   
		avg.getCount();
		avg.getSum();
		avg.getAverage();
		
		System.out.println("average = " + avg.getAverage() );
	   
	   
	}
}