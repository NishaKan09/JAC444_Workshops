package ca.senecacollege.workshop4;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Task2 {
	
	public static void countOccurances() throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		int [][] count = new int[26][2]; 
		char [][] lowerAndUpperCaseLetters = {{'a', 'A'}, {'b', 'B'}, {'c', 'C'}, 
				               				  {'d', 'D'}, {'e', 'E'}, {'f', 'F'}, 
				               				  {'g', 'G'}, {'h', 'H'}, {'i', 'I'}, 
				               				  {'j', 'J'}, {'k', 'K'}, {'l', 'L'}, 
				               				  {'m', 'M'}, {'n', 'N'}, {'o', 'O'}, 
				               				  {'p', 'P'}, {'q', 'Q'}, {'r', 'R'}, 
				               				  {'s', 'S'}, {'t', 'T'}, {'u', 'U'}, 
				               				  {'v', 'V'}, {'w', 'W'}, {'x', 'X'}, 
				               				  {'y', 'Y'}, {'z', 'Z'}};
		
		System.out.println("Enter a filename: ");
		String name = scanner.nextLine();
		File file = new File(name);
		//File file = new File("coronavirus.txt"); // for testing
		
		
		Scanner myFile = new Scanner(file);
		
		
		while(myFile.hasNext()) {
			String data = myFile.nextLine();
			for(int i = 0; i < data.length(); i++) {
				char ch = data.charAt(i);
				
				for(int n = 0; n < lowerAndUpperCaseLetters.length; n++) {
					if(ch == lowerAndUpperCaseLetters[n][0]) {
						count[n][0]++;
					}
					if(ch == lowerAndUpperCaseLetters[n][1]) {
						count[n][1]++;
					}
				}
			}
		}
		
		for(int i = 0; i < lowerAndUpperCaseLetters.length; i++) {
			int index = 0;
			while(index != 2) {
				System.out.println("\nNumber of "+ lowerAndUpperCaseLetters[i][index]+
					               "'s: " + count[i][index++]);
			}
		}
		
	}

}
