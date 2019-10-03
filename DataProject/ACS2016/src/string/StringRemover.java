package string;

import static java.lang.System.*;

class StringRemover
{
   private String sentence;
   private String remove;

	public StringRemover(){
		
	}
	

	public void setRemover(String s, String rem)
	{
		sentence=s;
		remove=rem;
	}

	public String removeStrings()
	{
		String cleaned = sentence;
		
		String regEx =  remove ;
		cleaned = cleaned.replaceAll(regEx,  "");
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - String to remove " + remove + "\n" + removeStrings() + "\n";
	}
}
