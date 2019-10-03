package scannerFiles;

import static java.lang.System.*;
import java.util.Scanner;

public class TheLine
{
   private String line;

   public TheLine()
   {
   }

   public TheLine(String s)
   {
	   line=s;
   }

	public int getLargest()
	{
		int largest = Integer.MIN_VALUE;
		Scanner scan = new Scanner(line);
		while(scan.hasNextInt()){
			int num=scan.nextInt();
			if (num > largest){
				largest=num;
			}
		}
		
		return largest;
	}

	public String toString( )
	{
		return line + " - Largest == " + getLargest() ;
	}
}