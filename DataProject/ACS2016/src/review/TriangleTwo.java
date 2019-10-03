package review;

import static java.lang.System.*;

public class TriangleTwo
{
   private int size;
   private String letter;

	public TriangleTwo()
	{
	}

	public TriangleTwo( String let, int sz)
	{
		size=sz;
		letter=let;
	}

	public void setTriangle(int count, String let)
	{
		letter=let;
		size=count;
	}

	public String getLetter()
	{
		String output="";
		for (int i=size; i>0; i--){
			for (int j=i;j>0; j--){
				output= output + letter; 
			}
			output= output + "\n";
		}
		return output;
	}

	public String toString()
	{
		

		return getLetter() +"\n";
	}
}