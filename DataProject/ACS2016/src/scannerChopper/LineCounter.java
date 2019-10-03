package scannerChopper;


import java.util.Scanner;
import static java.lang.System.*;

public class LineCounter
{
   private String line;

   public LineCounter()
   {
		setLine("");
   }

   public LineCounter(String s)
   {
	   line=s;
   }

	public void setLine(String s)
	{
		line=s;
	}

	public int getCount()
	{
		int number=0;
		int count=0;
		Scanner scan = new Scanner(line);
		while(scan.hasNextInt()){
			number= scan.nextInt();
			count++;
		}
		
		return count;
	}

	public String getLine()
	{
		return line;
	}

	public String toString()
	{
		return getLine();
	}
}
