package review;


	import java.util.Scanner;
	import java.util.ArrayList;
	import java.util.Collections;
	import static java.lang.System.*;

	public class Words
	{
		private ArrayList<Word> words;
		private int String;

		public Words()
		{
			setWords("");
		}

		public Words(String wordList)
		{
			words = new ArrayList<Word>();
			setWords(wordList);
		}

		public void setWords(String wordList)
		{
			Scanner scan = new Scanner(wordList);
			while(scan.hasNext())
				words.add(new Word(scan.next()));
				
				}
		
		public int countWordsWithXChars(int size)
		{
			int count=0;
			
			for (Word cool : words){
				if (cool.getLength() ==size){
					count ++;
				}
			}
			return count;
		}
		
		
		public int removeWordsWithXChars(int size)
		{
			int sum=0;
			for (int i=0; i<words.size(); i++){
			if ((words.get(i)).getLength() == size){
				sum += (words.get(i)).getNumVowels();
				words.remove(i);
				i=i-1;
				
			}
			}

			return sum;
		}

		public int countWordsWithXVowels(int numVowels)
		{
		int count=0;
			
			for (Word cool : words){
				if (cool.getNumVowels() == numVowels){
					count ++;
				}
			}
			return count;
		}
		
		
		public String toString()
		{
		   return "" + words ;
		}
	}

