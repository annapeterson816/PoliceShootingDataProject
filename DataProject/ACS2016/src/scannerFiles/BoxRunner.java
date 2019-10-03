package scannerFiles;

import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import static java.lang.System.*;

public class BoxRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("data/box.dat"));
		
		int size = file.nextInt();
		file.nextLine();
	for(int i=0; i<size; i++)
	{
		String s = file.nextLine();
		Box rox = new Box(s);
		
		System.out.println(rox);
	}
	}
}