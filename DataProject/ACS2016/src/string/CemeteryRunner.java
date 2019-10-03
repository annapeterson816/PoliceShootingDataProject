package string;

import java.io.IOException;

public class CemeteryRunner {
	public static void main( String args[] ) throws IOException
	{
	Cemetery cem= new Cemetery();
	cem.loadList();
	System.out.print("The dead, may they rest in peace:  " );
	System.out.println(cem.removeNameSpaces());
	cem.loadDeathDay();
	cem.removeDateSpace();
	//System.out.println(cem.nameAndDeathDate());
	cem.countDays();
	System.out.println(cem.getMostCommonDay());
	}
}
