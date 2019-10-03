package review;

import static java.lang.System.*;
import java.util.Scanner;

public class AirlineReserve {
	Boolean[] seatingchart;
	
	
	public AirlineReserve(){
		seatingchart= new Boolean[9];
	}
	
	public Boolean [] setSeatingChart(){
		
		for(int i=0; i<=9; i++){
			seatingchart[i]=false;
		}
		
		return seatingchart;
	}
	
	public int whatSeat(){
		Scanner scan = new Scanner(System.in);
		
		return 1;
	}
	
	
}
