package string;

import static java.lang.System.*;

public class StringRemoverRunner
{
	public static void main( String args[] )
	{
		StringRemover daddy = new StringRemover();	
		daddy.setRemover("xR-MxR-MHelloxR-M", "xR-M");
		System.out.println(daddy);
		
		daddy.setRemover("sxsssxssxsxssexssxsesss", "sxs");
		System.out.println(daddy);
		
		daddy.setRemover("fuxqwexqwertyxqwexqwertyrtyxqwertyrtyn", "qwerty");
		System.out.println(daddy);
	}
}
