package scannerFiles;

import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import static java.lang.System.*;
import java.lang.Math;

public class PrimeRunner
{
	public static void main( String args[] ) throws IOException
	{
		
		Scanner file = new Scanner(new File("data/primes.dat"));
		//int size = file.nextInt();
		//file.nextLine();
		//for(int i=0; i<size; i++)
		//{
		while(file.hasNextInt()){
			int s = file.nextInt();
			//Prime prim = new Prime(s);
		}
			//System.out.println(prim);
		//}
	}
}