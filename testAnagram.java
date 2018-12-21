// Ryan McCrory
// rmccrory
// PA3
// due 5/20/18
// Anagram.java
// everything works

import java.util.Scanner;

public class testAnagram extends Anagram {

	public static void main (String args[]) {
		
		//create a scanner to read user input
		Scanner in = new Scanner(System.in);
	
		//prompts user to type string
		System.out.println("type a string of letters");

		// stores string as input
		String input = in.next();
		
		//initializes Anagram
		Anagram test = new Anagram(input);
			
		//tests string constructor
		System.out.println("code = " + test.code);
		System.out.println("word = " + test.word);
		
		//tests char[] constructor
		char[] input2 = {'y', 'e', 's', '\0'};
		Anagram test2 = new Anagram(input2);
		System.out.println("For char[] = {'y', 'e', 's' '\0'}");
		System.out.println("code = " + test2.code);
		System.out.println("word = " + test2.word);
		
		//tests print method
		System.out.println("Below should print word user inputed, tests print method");
		test.print(test);
		
		//tests method for comparing two anagram variables
		Anagram test3 = new Anagram("test");
		Anagram test4 = new Anagram("ttse");
		boolean comparetest1 = compare(test3, test4);
		System.out.println("Tests compare method, should print true - " + comparetest1);
		boolean comparetest2 = compare(test3, test2);
		System.out.println("Tests compare method, should print false - " + comparetest2);
		
		//tests method that returns word part of anagram variable
		String returnedWord = returnWord(test2);
		System.out.println("Eests returnWord method, should print yes - " + returnedWord);
		
		//close scanner
		in.close();
	}
	
}
