package scannerFiles;

import java.io.IOException;
import java.io.File;
import java.util.Scanner;

import static java.lang.System.*;

public class OddOrEvenRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("data/oddoreven.dat"));
		int size = file.nextInt();
		
		file.nextLine();
		for(int i = 0; i < size; i++)
		{
		   int num = file.nextInt();
		   OddorEven oddeven= new OddorEven(num);
		   oddeven.setNum(num);
		   
		   System.out.println(oddeven);
		   
		  
		}
	}
}