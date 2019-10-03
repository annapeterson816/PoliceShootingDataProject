package review;

public class TwoDeeArrayOperations {


	public static int getTotal(int [] [] array){
		int count =0;
		for (int r=0; r< array.length; r++){
			for (int c=0; c<array[r].length; c++){
				count+=array[r][c];}
		}
		return count;
	}
	
	public static int getAverage(int [] [] array){
		int average=0;
		int total =getTotal(array);
		average = total / (array.length*array[0].length) ;
		
		return average;
	}
	
	public static int getRowTotal(int [] [] array, int rownum){
		int rowtotal=0;
		for (int i=0; i<array[rownum].length; i++){
			rowtotal+= array[rownum][i];
		}
		return rowtotal;
	}
	
	public static int getColumnTotal(int [] [] array, int col ){
		int coltotal=0;
		for (int i=0; i<array.length; i++){
		coltotal+= array[i][col];	
		}
		return coltotal;
	}
	
	public static int getHighestInRow(int [] [] array, int row){
	int highest=0;
	for (int i=0; i<array[row].length; i++){
		if (array[row][i] >highest) {
		highest=array[row][i];}
	}
	return highest;
}
	public static int getLowestInRow(int [] [] array, int row){
		int lowest=10000;
		for (int i=0; i<array[row].length;i++){
			if (array[row][i] < lowest){
				lowest=array[row][i];}
		}
		return lowest;
	}

}
