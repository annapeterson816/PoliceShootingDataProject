package review;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class DriverLicenseRunner {
	
	public static void main( String args[] ) throws FileNotFoundException
	   {
		
		Scanner scan= new Scanner(System.in);
		String myAnswers="a b c c c c c c c c c c a d d d d a a a a a a a";
		int place=0;
		
			
			DriverLicense dl = new DriverLicense();
			System.out.println(dl.makeStudentAnswer());
			System.out.println(dl.checkAnswers());
			System.out.println(dl.didYouPass());
			dl.incorrectLoad();
			//dl.incorrectAnswers();
	   }

}
