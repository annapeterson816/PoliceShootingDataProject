package string;

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		LetterRemover sam = new LetterRemover();
		sam.setRemover("I am Sam I am a", 'a');
		System.out.println(sam);
		System.out.print(sam.removeLetters());
											
	}
}
