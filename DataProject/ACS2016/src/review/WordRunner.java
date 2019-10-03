package review;

import static java.lang.System.out;

public class WordRunner {

	public static void main(String[] args) {
		Words test = new Words("one two three four five six seven alligator");
		out.println(test);
		out.println("word with 2 vowels = "+test.countWordsWithXVowels(2));
		out.println("word with 3 vowels = "+test.countWordsWithXVowels(3));
		out.println("word with 4 vowels = "+test.countWordsWithXVowels(4));
		out.println("word with 2 chars = "+test.countWordsWithXChars(2));
		out.println("word with 3 chars = "+test.countWordsWithXChars(3));
		out.println("word with 4 chars = "+test.countWordsWithXChars(4));
		out.println("word with 5 chars = "+test.countWordsWithXChars(5));
		int vowelsRemoved = test.removeWordsWithXChars(3);
		out.println("\nafter removing words with 3 chars \n" + test);
		out.println("\nnumber of vowels in the words removed == " + vowelsRemoved);
		out.println("\n\n");
		
		
		Words test2 = new Words("fun fly four six times ten plus eight");
		out.println(test);
		out.println("word with 2 vowels = "+test2.countWordsWithXVowels(2));
		out.println("word with 3 vowels = "+test2.countWordsWithXVowels(3));
		out.println("word with 4 vowels = "+test2.countWordsWithXVowels(4));
		out.println("word with 2 chars = "+test2.countWordsWithXChars(2));
		out.println("word with 3 chars = "+test2.countWordsWithXChars(3));
		out.println("word with 4 chars = "+test2.countWordsWithXChars(4));
		out.println("word with 5 chars = "+test2.countWordsWithXChars(5));
		int vowelsRemoved2 = test2.removeWordsWithXChars(3);
		out.println("\nafter removing words with 3 chars \n" + test2);
		out.println("\nnumber of vowels in the words removed == " + vowelsRemoved2);
		out.println("\n\n");
	}

}
