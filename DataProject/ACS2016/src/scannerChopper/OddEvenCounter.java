package scannerChopper;

import java.util.Scanner;
import static java.lang.System.*;

public class OddEvenCounter
{
	private String line;

   public OddEvenCounter()
   {
   }

   public OddEvenCounter(String s)
   {
	   line=s;
   }

	public void setLine(String s)
	{
		line=s;
	}

	public int getEvenCount()
	{
		Scanner scan = new Scanner(line);
		
		int number=0;
		int count= 0;
		
		while(scan.hasNextInt()){
			number=scan.nextInt();
			if((number %2) ==0 ){
				count++;
			}
				
		}
		return count;
	}

	public int getOddCount()
	{
		Scanner scan = new Scanner(line);
		int number=0;
		int count= 0;
		while(scan.hasNextInt()){
			number=scan.nextInt();
			
			if((number %2 )==1 ){
				count++;
			}
				
		}
		return count;
	}

	public String toString( )
	{
		return "" + line;
	}
}