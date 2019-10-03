package review;

import static java.lang.System.*; 
import java.util.Scanner;

public class TriangleOne
{
   //this lab is setup with a single static method
   //there are no instance variables or additional methods / constructors

	public static String createTriangle( String let, int size)
	{
		int sz=size;
		String letter =let;
		String output="";
		int length =1;
		
		for(int i=0; i<size; i++){
			
			for(int j=0;j<length; j++){
				output= output + let; 
			}
			output = output + "\n";
			length++;
		}
		return output;
	}
}