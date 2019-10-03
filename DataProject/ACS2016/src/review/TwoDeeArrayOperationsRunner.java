package review;

public class TwoDeeArrayOperationsRunner {
public static void main(String[] args) {
		
		
		int [] [] myArray = {
				{2,3,4,3},
				{1,1,1,1},
				{4,8,10,1}};
		System.out.println(TwoDeeArrayOperations.getTotal(myArray));
		System.out.println(TwoDeeArrayOperations.getAverage(myArray));
		System.out.println(TwoDeeArrayOperations.getRowTotal(myArray,0));
		System.out.println(TwoDeeArrayOperations.getColumnTotal(myArray,1));
		System.out.println(TwoDeeArrayOperations.getHighestInRow(myArray, 2));
		System.out.println(TwoDeeArrayOperations.getLowestInRow(myArray,1));

	}
}
