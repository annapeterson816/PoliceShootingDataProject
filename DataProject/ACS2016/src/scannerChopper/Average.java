package scannerChopper;

import java.util.Scanner;
import static java.lang.System.*;

public class Average
{
   private String line;

   public Average()
   {
   }

   public Average(String s)
   {
	   line=s;
   }

	public void setLine(String s)
	{
		line=s;
	}

	public int getCount()
	{
		int count=0;
		Scanner scan = new Scanner(line);
		while(scan.hasNextInt()){
			count++;
			scan.nextInt();
		}
		return count;
	}


	public int getSum()
	{
		int number=0;
		int sum=0;
		Scanner scan = new Scanner(line);
		while(scan.hasNextInt()){
			number=scan.nextInt();
			sum+= number;
		}

		return sum;
	}

	public double getAverage()
	{
		double average=0.0;

		average = (getSum()/ getCount());

		return average;
	}

	public String getLine()
	{
		return line;
	}

	public String toString()
	{
		return "" + getLine();
	}
}