package review;

import static java.lang.System.*;

public class Word
{
	private String word;
   private static String vowels = "AEIOUaeiou";   //only one

	public Word()
	{

	}

	public Word(String wrd)
	{
		word=wrd;
	}

	public void setWord(String wrd)
	{
		word=wrd;
	}
	
	public int getNumVowels()
	{
		int count=0;

		for(int i=0; i<vowels.length(); i++){
			if(word.indexOf(vowels.charAt(i)) >-1 ){
			//if (word.charAt(i)== 'a' || word.charAt(i)== 'e' || word.charAt(i)== 'i' || word.charAt(i)== 'o' || word.charAt(i)== 'u'
			//		|| word.charAt(i)== 'A' || word.charAt(i)== 'E' || word.charAt(i)== 'I' || word.charAt(i)== 'O' || word.charAt(i)== 'U'){
				count++;}
			}
		



		return count;
	}
	
	public int getLength()
	{
		
		return word.length();
	}

	public String toString()
	{
	   return "" + word;
	}
}