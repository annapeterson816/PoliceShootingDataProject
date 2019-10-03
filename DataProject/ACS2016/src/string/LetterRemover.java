package string;


import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;
   

	public LetterRemover()
	{
		//call set
	}

	//add in second constructor
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned=sentence;
		String newsentence ="";
		
		for(int i=0; i<cleaned.length(); i++){
			if(cleaned.indexOf(lookFor) == -1){
				newsentence+= cleaned.charAt(i);
			}
		}
		
		
		return newsentence;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor;
	}
}