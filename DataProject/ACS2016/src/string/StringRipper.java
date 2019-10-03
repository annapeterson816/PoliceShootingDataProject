package string;

import static java.lang.System.*;

public class StringRipper
{
	private String word;
	
	public StringRipper()
	{
	}

	public StringRipper(String s)
	{
		word=s;
	}
	
   public void setString(String s)
   {
	   word=s;
   }	

	public String ripString(int x, int y)
	{
		String segment="";
		segment = word.substring(x, y);
		return segment;
	}

 	public String toString()
 	{
 		return word + "\n\n";
	}
}

