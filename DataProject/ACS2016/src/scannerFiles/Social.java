package scannerFiles;


import static java.lang.System.*;
import java.util.Scanner;

public class Social
{
   private String socialNum;

	public Social()
	{
	}

	public Social(String soc)
	{
		socialNum=soc;
	}

	public void setSocial(String soc)
	{
		socialNum=soc;
	}

	public int getSum()
	{
		int num=0;
		int sum=0;
		Scanner scan = new Scanner(socialNum);
		scan.useDelimiter("-");
		while(scan.hasNextInt()){
			num=scan.nextInt();
			sum+= num;
		}

		return sum;
	}

	public String toString()
	{
		return "SS# " + socialNum + " has a sum of " + getSum(); 
	}
}