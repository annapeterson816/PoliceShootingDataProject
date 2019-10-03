package review;

import static java.lang.System.*;

import java.util.ArrayList;

public class MadLibRunner
{
	public static void main( String args[] )
	{
		//make a new MadLib
		
		String n=" ";
		
		MadLib mad = new MadLib("data/story.dat");
		System.out.println(mad);
		//mad.loadAdjectives();
		//System.outprintln(mad);
		//System.out.println( new File("data/story.dat"));
		//out.println("\n");
	}
}