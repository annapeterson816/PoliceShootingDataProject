package scannerChopper;

import java.util.Scanner;
import static java.lang.System.*;

public class LineBreaker
{
   private String line;
   private int breaker;

   public LineBreaker()
   {
   	this("",0);
   }

   public LineBreaker(String s, int b)
   {
	   line=s;
	   breaker=b;
   }

	public void setLineBreaker(String s, int b)
	{
		line=s;
		breaker=b;
	}

	public String getLine()
	{
		return "";
	}

	public String getLineBreaker()
	{
		String box ="";
		int count=0;
		
		Scanner scan = new Scanner(line);
		while(scan.hasNextLine()){
			if (count!=breaker){
				box+= scan.hasNextLine();
			//System.out.println(scan.nextLine());
		}
			if (count==breaker){
				box+= scan.hasNextLine() + "\n";
				//System.out.println(scan.nextLine());
				count=0;
			}

			count++;
			scan.nextLine();
		}


		return box;
	}

	public String toString()
	{
		return "" + getLineBreaker();
	}
}