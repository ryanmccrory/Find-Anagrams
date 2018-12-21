// Ryan McCrory
// rmccrory
// PA3
// due 5/20/18
// Anagram.java

public class Anagram {

	//Anagram components
	int value;
	String word;
	int code;	
	
	//a default constructor
	public Anagram() {
		
		//code initialized as 1 and word as ""
		code = 1;
		word = "";
	}
	
	
	//constructor which uses a String, made up of alphabetic characters eitherupper or lower case as an input argument.
	public Anagram(String str) {
		
		//sets string component of Anagram to input str
		word = str;
		code = 1;
		
		//turn string to char array
		char[] input = str.toCharArray();
		
		//every letter is assigned a prime number
		int a = 2;
		int b = 3;
		int c = 5;
		int d = 7;
		int e = 11;
		int f = 13;
		int g = 17;
		int h = 19;
		int i = 23;
		int j = 29;
		int k = 31;
		int l = 37;
		int m = 41;
		int n = 43;
		int o = 47;
		int p = 53;
		int q = 59;
		int r = 61;
		int s = 67;
		int t = 71;
		int u = 73;
		int v = 79;
		int w = 83;
		int x = 89;
		int y = 97;
		int z = 101;
		
		//loop through array and set code to value of letters 
		for (int counter = 0; counter < str.length(); counter++) {
			
			//each if statement is to set int code to what it should be based on what letter
			//works for both lower and upper case
			// every anagram will have a unique code
			if (input[counter] == 'a' || input[counter] == 'A') {
				code = code * a;
			}
			if (input[counter] == 'b' || input[counter] == 'B') {
				code = code * b;
			}
			if (input[counter] == 'c' || input[counter] == 'C') {
				code = code * c;
			}
			if (input[counter] == 'd' || input[counter] == 'D') {
				code = code * d;
			}
			if (input[counter] == 'e' || input[counter] == 'E') {
				code = code * e;
			}
			if (input[counter] == 'f' || input[counter] == 'F') {
				code = code * f;
			}
			if (input[counter] == 'g' || input[counter] == 'G') {
				code = code * g;
			}
			if (input[counter] == 'h' || input[counter] == 'H') {
				code = code * h;
			}
			if (input[counter] == 'i' || input[counter] == 'I') {
				code = code * i;
			}
			if (input[counter] == 'j' || input[counter] == 'J') {
				code = code * j;
			}
			if (input[counter] == 'k' || input[counter] == 'K') {
				code = code * k;
			}
			if (input[counter] == 'l' || input[counter] == 'L') {
				code = code * l;
			}
			if (input[counter] == 'm' || input[counter] == 'M') {
				code = code * m;
			}
			if (input[counter] == 'n' || input[counter] == 'N') {
				code = code * n;
			}
			if (input[counter] == 'o' || input[counter] == 'O') {
				code = code * o;
			}
			if (input[counter] == 'p' || input[counter] == 'P') {
				code = code * p;
			}
			if (input[counter] == 'q' || input[counter] == 'Q') {
				code = code * q;
			}
			if (input[counter] == 'r' || input[counter] == 'R') {
				code = code * r;
			}
			if (input[counter] == 's' || input[counter] == 'S') {
				code = code * s;
			}
			if (input[counter] == 't' || input[counter] == 'T') {
				code = code * t;
			}
			if (input[counter] == 'u' || input[counter] == 'U') {
				code = code * u;
			}
			if (input[counter] == 'v' || input[counter] == 'V') {
				code = code * v;
			}
			if (input[counter] == 'w' || input[counter] == 'W') {
				code = code * w;
			}
			if (input[counter] == 'x' || input[counter] == 'X') {
				code = code * x;
			}
			if (input[counter] == 'y' || input[counter] == 'Y') {
				code = code * y;
			}
			if (input[counter] == 'z' || input[counter] == 'Z') {
				code = code * z;
			}
		}
	}
	
	
	//constructor which uses a char array, made up of alphabetic characterseither upper or lower case as an input argument
	public Anagram(char[] input) {
		
		//sets string component of Anagram to input str
		String str = new String(input);
		word = str;
		
		//initializes code
		code = 1;
		
		//every letter is assigned a prime number
		int a = 2;
		int b = 3;
		int c = 5;
		int d = 7;
		int e = 11;
		int f = 13;
		int g = 17;
		int h = 19;
		int i = 23;
		int j = 29;
		int k = 31;
		int l = 37;
		int m = 41;
		int n = 43;
		int o = 47;
		int p = 53;
		int q = 59;
		int r = 61;
		int s = 67;
		int t = 71;
		int u = 73;
		int v = 79;
		int w = 83;
		int x = 89;
		int y = 97;
		int z = 101;
		
		//loop through array and set code to value of letters 
		for (int counter = 0; counter < str.length(); counter++) {
			
			//each if statement is to set int code to what it should b based on what letter
			//works with upper and lower case
			// every anagram will have a unique code
			if (input[counter] == 'a' || input[counter] == 'A') {
				code = code * a;
			}
			if (input[counter] == 'b' || input[counter] == 'B') {
				code = code * b;
			}
			if (input[counter] == 'c' || input[counter] == 'C') {
				code = code * c;
			}
			if (input[counter] == 'd' || input[counter] == 'D') {
				code = code * d;
			}
			if (input[counter] == 'e' || input[counter] == 'E') {
				code = code * e;
			}
			if (input[counter] == 'f' || input[counter] == 'F') {
				code = code * f;
			}
			if (input[counter] == 'g' || input[counter] == 'G') {
				code = code * g;
			}
			if (input[counter] == 'h' || input[counter] == 'H') {
				code = code * h;
			}
			if (input[counter] == 'i' || input[counter] == 'I') {
				code = code * i;
			}
			if (input[counter] == 'j' || input[counter] == 'J') {
				code = code * j;
			}
			if (input[counter] == 'k' || input[counter] == 'K') {
				code = code * k;
			}
			if (input[counter] == 'l' || input[counter] == 'L') {
				code = code * l;
			}
			if (input[counter] == 'm' || input[counter] == 'M') {
				code = code * m;
			}
			if (input[counter] == 'n' || input[counter] == 'N') {
				code = code * n;
			}
			if (input[counter] == 'o' || input[counter] == 'O') {
				code = code * o;
			}
			if (input[counter] == 'p' || input[counter] == 'P') {
				code = code * p;
			}
			if (input[counter] == 'q' || input[counter] == 'Q') {
				code = code * q;
			}
			if (input[counter] == 'r' || input[counter] == 'R') {
				code = code * r;
			}
			if (input[counter] == 's' || input[counter] == 'S') {
				code = code * s;
			}
			if (input[counter] == 't' || input[counter] == 'T') {
				code = code * t;
			}
			if (input[counter] == 'u' || input[counter] == 'U') {
				code = code * u;
			}
			if (input[counter] == 'v' || input[counter] == 'V') {
				code = code * v;
			}
			if (input[counter] == 'w' || input[counter] == 'W') {
				code = code * w;
			}
			if (input[counter] == 'x' || input[counter] == 'X') {
				code = code * x;
			}
			if (input[counter] == 'y' || input[counter] == 'Y') {
				code = code * y;
			}
			if (input[counter] == 'z' || input[counter] == 'Z') {
				code = code * z;
			}
		}			
	}
	
	
	//method for printing
	public void print(Anagram in) {
		
		//prints word component of Anagram
		System.out.println(in.word);	
	}
	
	
	//method for comparing two Anagram variables that returns true or false
	public static boolean compare(Anagram x, Anagram y) {
		
		//separate strings for word components, just to make comparison easier
		String xword = x.word.toLowerCase;
		String yword = y.word.toLowerCase;
		int yes;
		
		// 0 is same word, 1 if different
		if (xword.equals(yword)) {
			yes = 0;
		}else {
			yes = 1;
		}
				
		//returns true if they have the same code and different words
		if (x.code == y.code && yes == 1) {
			return true;
		} else {
			return false;
		}
	}
	
	
	//method that returns the word part of an Anagram variable
	public static String returnWord(Anagram in) {
		
		//return word component
		return in.word;
	}
	
}
