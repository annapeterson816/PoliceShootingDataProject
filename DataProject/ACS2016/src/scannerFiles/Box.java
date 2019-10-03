package scannerFiles;

import static java.lang.System.*;
import java.util.Scanner;

public class Box
{
   private String let;
   private int size;
   String box1;

   
   public Box(){
	   
   }
   
   public Box(String box){
	   Scanner scan = new Scanner(box);
	   let=scan.next();
	   size=scan.nextInt();
	  
   }
	
 //  public void setLet(String box){
//	   let=box;
 //  }
   
   public String makeBox(){
	 box1="";
	   for(int i=0; i<= size; i++){
		   for(int j=0; j<= size; j++){
			   box1+= let;
		   }
		   box1+="\n";
		   
	   }
	   
	   return box1;
   }

	public String toString()
	{
		String output="";



		return makeBox() + "\n";
	}
}