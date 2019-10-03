package scannerFiles;

import static java.lang.System.*;

public class OddorEven
{
	private int number;

	public OddorEven()
	{
	}

	public OddorEven(int num)
	{
		number=num;
	}

	public void setNum(int num)
	{
		number=num;
	}

	public boolean isOdd( )
	{
		if(number % 2 != 0){
			return true;
		}



		return false;
	}

	public String toString()
	{


		if (isOdd() == false){
		return number+" is even.\n\n";
		}
		
		else 
			return number+ " is odd. \n\n";
	}
}