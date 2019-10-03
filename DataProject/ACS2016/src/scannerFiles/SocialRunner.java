package scannerFiles;

import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import static java.lang.System.*;

public class SocialRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("data/social.dat"));
		
		int size = file.nextInt();
		file.nextLine();
		for(int i=0; i<size; i++)
		{
			String s = file.nextLine();
			Social soc = new Social(s);
			
			System.out.println(soc);
		}
	}
}