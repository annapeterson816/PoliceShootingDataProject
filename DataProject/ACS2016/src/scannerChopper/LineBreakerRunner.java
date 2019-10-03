package scannerChopper;

import java.util.Scanner;
import static java.lang.System.*;

public class LineBreakerRunner
{
   public static void main(String args[])
   {
	   String line = "1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9";
	   int breaker= 4;
	   
	   LineBreaker lineb = new LineBreaker(line, breaker);
	   
	   System.out.println(line);
	   lineb.getLineBreaker();
	   System.out.println(lineb.getLineBreaker());
	   
	   
	}
}