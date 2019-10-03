package string;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import scannerFiles.OddorEven;

public class PirateRunner {

	public static void main( String args[] ) throws IOException
	{
		
		Pirate pir = new Pirate(new File("data/pirate"));
		pir.makeString();
		pir.createReplacements();
		System.out.println(pir);
		   
		   
	}

	  
}
