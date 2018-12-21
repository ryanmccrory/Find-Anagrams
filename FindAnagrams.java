// Ryan McCrory
// rmccrory
// PA3
// due 5/20/18
// FindAnagrams.java

//necessary imports
//import java.io.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

// extends Anagram which has required constructors/methods
public class FindAnagrams extends Anagram {
	
	public static void main (String args[]) throws FileNotFoundException {
	
		//create a scanner to read user input
		Scanner in = new Scanner(System.in);
		
		//create scanner to read txt file
		Scanner scan = new Scanner(new FileInputStream(args[0]));	
		
		//size of dictionary
		int size = scan.nextInt();
		
		//String array to hold all words in text file
		String[] dictionary = new String[size];
		
		//loop to fill dictionary[]
		for (int i=0; i<size; i++) {
			dictionary[i] = scan.next();
		}
		
		//sets boolean yes to true
		boolean yes = true;
		
		//loops until user enters n for second prompt
		while (yes == true) {
		
			//prompts user to type string
			System.out.println("type a string of letters");
	
			// stores input as Anagram
			Anagram input = new Anagram(in.next());
			
			//initialize check
			Anagram check = new Anagram("dsdf");
			
			//finds all Anagram
			//read wordList.txt and loop through setting each word as an Anagram
			for(int i = 0; i < size; i++) {
				check = new Anagram(dictionary[i]);
			
				//calls ompare and print method
				if(compare(input, check) == true) {
					input.print(check);
				}
			}
		
			// prompts user to either do another anagram or not
			System.out.println("Do another (y/n)?");
	
			//Stores users response as String yesORno
			String yesORno = in.next();
		
			// if n, exit program
			if (yesORno.equals("n")) {
				yes = false;
			}
		}
		
		//closes scanner
		in.close();
		scan.close();
	}
}
