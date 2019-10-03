package scannerChopper;

import java.util.Scanner;
import static java.lang.System.*;  

public class LineCounterRunner
{
   public static void main( String args[] )
   {	
	   String line = "9 10 5 20 1 2 3";
	   LineCounter lin = new LineCounter(line);
		
		
		System.out.println(lin);
		
		lin.getCount();
		System.out.println("count = " + lin.getCount() );
	}
}