package scannerFiles;


import static java.lang.System.*;
import java.lang.Math;

public class Prime
{
	private int number;

	public Prime(){
		
	}
	
	

	public void setPrime(int num)
	{
		number=num;

	}
	
	public boolean isPrime(){
		
		boolean prime=true;
		for (int i=0; i<= number/2; i++){
			if(number%1==0){
				prime=false;
				i++;
			}
		}
		if(prime ==true){
		return true;}
		
		else 
			return false;
	}

	//boolean isPrime()   goes here






	public String toString()
	{
		if (isPrime()==false){
			return number + " IS PRIME.";
			}
		
		else
		return number + " IS PRIME.";
		
	}
}