package scannerChopper;

import java.util.Scanner;
import static java.lang.System.*;

public class OddEvenCounterRunner
{
   public static void main(String args[])
   {
	   
	   String line = "9 10 5 20";
	   
	   OddEvenCounter counter = new OddEvenCounter(line);
	   
	   System.out.println(counter);
	   
	   counter.getEvenCount();
	   counter.getOddCount();
	   
	   System.out.println("even count = " +counter.getEvenCount());
	   System.out.println("odd count = " +counter.getOddCount());
	}
}