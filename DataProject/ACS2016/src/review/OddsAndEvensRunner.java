package review;


import java.util.Arrays;
public class OddsAndEvensRunner
{
	
		public static void main(String[] args) {
		
			int [] one = {9,8,7,6,5,4,3,2,1};
			System.out.println(Arrays.toString(one));
			System.out.println("EVENS- " + Arrays.toString(OddsAndEvens.getAllEvens(one)));
			System.out.println("ODDS- " + Arrays.toString(OddsAndEvens.getAllOdds(one)));
		}
	}
