package scannerChopper;

import static java.lang.System.*;
import java.util.Scanner;

public class LineTotaller
{
   private String line;

	public LineTotaller()
	{
		setLine("");
	}

	public LineTotaller(String s)
	{		
		line=s;
	}

	public void setLine(String s)
	{
		line=s;
	}

	public int getSum()
	{
		int number=0;
		int total = 0;
		Scanner scan= new Scanner(line);
		while(scan.hasNextInt()){
			number= scan.nextInt();
			total+= number;
		}
		return total;
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
