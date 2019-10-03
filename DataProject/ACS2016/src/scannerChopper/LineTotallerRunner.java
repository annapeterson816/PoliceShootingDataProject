package scannerChopper;

import static java.lang.System.*;
import java.util.Scanner;

public class LineTotallerRunner
{
   public static void main( String args[] )
   {
	   
	   String line = "1 2 3 4 5 6";
			   LineTotaller lin= new LineTotaller(line);
			   
			 
				System.out.println(lin);
				
				lin.getSum();
				System.out.println("sum = " + lin.getSum() );
			   
			   
	}
}